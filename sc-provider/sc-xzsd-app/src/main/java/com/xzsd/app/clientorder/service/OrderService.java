package com.xzsd.app.clientorder.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.app.clientorder.dao.OrderDao;
import com.xzsd.app.clientorder.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * 客户端订单操作以及商品评价
 *
 * @author liyuxian
 * @time 2020-04-14
 */
@Service
public class OrderService {
    @Resource
    private OrderDao orderDao;

    /**
     * 新增订单
     *
     * @param orderInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addOrder(OrderInfo orderInfo) {
        //判断客户是否绑定了店铺
        StoreVO storeVO = orderDao.getStoreById(orderInfo.getUserId());
        if (storeVO == null) {
            return AppResponse.versionError("对不起，您还没绑定店铺邀请码，无法购买！");
        }
        List<String> goodsList = Arrays.asList(orderInfo.getGoodsId().split(","));
        List<String> countList = Arrays.asList(orderInfo.getGoodsShoppingNumber().split(","));
        //生成订单信息
        orderInfo.setOrderId(StringUtil.getCommonCode(2));
        orderInfo.setOrderCode(StringUtil.getCommonCode(2));
        orderInfo.setCountPrice(0);
        orderInfo.setGoodsNumber(0);
        //构建订单详情列表
        List<OrderDetailVO> orderDetailVOList = new ArrayList<>();
        String createPeople = orderInfo.getCreatePeople();
        //生成订单详情
        for (int i = 0; i < goodsList.size(); i++) {
            String orderClearId = StringUtil.getCommonCode(2);
            float price = orderDao.getGoods(goodsList.get(i)).getPrice();
            OrderDetailVO orderDetailVO = new OrderDetailVO(orderClearId, goodsList.get(i), Integer.parseInt(countList.get(i)), price);
            orderDetailVO.setOrderId(orderInfo.getOrderId());
            orderDetailVO.setCreatePeople(createPeople);
            //计算总价
            orderInfo.setCountPrice(orderInfo.getCountPrice() + price * Integer.parseInt(countList.get(i)));
            //统计一个订单内购买商品总数量
            orderInfo.setGoodsNumber(Integer.parseInt(countList.get(i)) + orderInfo.getGoodsNumber());
            //添加到list
            orderDetailVOList.add(orderDetailVO);
        }
        //如果是在购物车结算，将商品移除购物车
        if (orderInfo.getShoppingId() != null && !"".equals(orderInfo.getShoppingId())) {
            //将下单对应的商品id移除购物车
            List<String> goodsIdList = Arrays.asList(orderInfo.getShoppingId().split(","));
            int shopDelete = orderDao.deleteGoods(goodsIdList);
            if (0 == shopDelete) {
                return AppResponse.versionError("移除购物车失败！");
            }
        }
        //修改商品库存和销售量
        int update = orderDao.update(orderDetailVOList);
        if (0 == update) {
            return AppResponse.versionError("购买失败");
        }
        //新增订单
        int countOrder = orderDao.addOrder(orderInfo);
        if (0 == countOrder) {
            return AppResponse.versionError("购买失败");
        }
        //新增订单详情
        int countOrderDetail = orderDao.addOrderDetail(orderDetailVOList);
        if (countOrderDetail != goodsList.size()) {
            return AppResponse.versionError("购买失败！");
        }
        return AppResponse.success("购买成功！");
    }

    /**
     * 查询订单列表
     *
     * @param orderListVO
     * @return
     */
    public AppResponse listOrderList(OrderListVO orderListVO) {
        //查询订单列表
        List<OrderListVO> orderList = orderDao.listOrderByPage(orderListVO);
        return AppResponse.success("查询成功", getPageInfo(orderList));
    }

    /**
     * 获取订单详情
     *
     * @param orderId
     * @return
     */
    public AppResponse findOrderById(String orderId) {
        OrderStoreVO orderStoreVO = orderDao.findOrderById(orderId);
        return AppResponse.success("查询成功", orderStoreVO);
    }

    /**
     * 查询订单评价商品信息
     * @param orderId
     * @return
     */
    public AppResponse findOrderGoodsById(String orderId){
        OrderStoreVO orderStoreVO = orderDao.findOrderGoodsById(orderId);
        return AppResponse.success("查询成功", orderStoreVO);
    }
    /**
     * 订单状态修改，客户点击确认收货和取消订单
     *
     * @param orderInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteConfirmOrder(OrderInfo orderInfo) {
        // 订单状态修改，客户点击确认收货或者取消订单
        int count = orderDao.updateOrder(orderInfo);
        if (0 == count) {
            return AppResponse.versionError("修改失败！");
        }
        if (orderInfo.getOrderStatus().equals("5")) {
            //获取订单详情信息
            OrderStoreVO orderStoreVO = orderDao.findOrderById(orderInfo.getOrderId());
            List<OrderDetailVO> goodsIdList = orderStoreVO.getGoodsList();
            List<OrderDetailVO> orderDetailVOList = new ArrayList<>();
            for (int i = 0; i < goodsIdList.size(); i++) {
                OrderDetailVO orderDetailVOs = new OrderDetailVO();
                orderDetailVOs.setGoodsId(goodsIdList.get(i).getGoodsId());
                orderDetailVOs.setGoodsShoppingNumber(-goodsIdList.get(i).getGoodsShoppingNumber());
                orderDetailVOList.add(orderDetailVOs);
            }
            //修改商品库存和销售量
            int update = orderDao.update(orderDetailVOList);
            if (0 == update) {
                return AppResponse.versionError("修改失败");
            }
        }
        return AppResponse.success("修改成功！");
    }

    /**
     * 新增订单评价
     *
     * @param orderAppraise
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addOrderAppraise(OrderAppraise orderAppraise) {
        //构建评价图片列表
        List<AppraiseImage> appraiseImageList = new ArrayList<>();
        for (int i = 0; i < orderAppraise.getAppraiseList().size(); i++) {
            //设置评价信息集合
            orderAppraise.getAppraiseList().get(i).setAppraiseId(StringUtil.getCommonCode(2));
            //获取评价信息
            AppraiseInfo appraiseInfo = orderAppraise.getAppraiseList().get(i);
            //设置图片信息集合
            for (int j = 0; j < appraiseInfo.getAppraisePhotoList().size(); j++) {
                //获取图片信息
                AppraiseImage appraiseImage = appraiseInfo.getAppraisePhotoList().get(j);
                //设置评价图片信息
                appraiseImage.setAppraiseImageId(StringUtil.getCommonCode(2));
                appraiseImage.setAppraiseId(appraiseInfo.getAppraiseId());
                //添加到图片list里
                appraiseImageList.add(appraiseImage);
            }
        }
        //新增评价信息集合
        int addAppraiseCount = orderDao.addAppraise(orderAppraise);
        if (addAppraiseCount != orderAppraise.getAppraiseList().size()) {
            return AppResponse.versionError("评价失败");
        }
        //新增评价图片信息集合
        int addAppraiseImageCount = orderDao.addAppraiseImage(appraiseImageList);
        if (addAppraiseImageCount != appraiseImageList.size()) {
            return AppResponse.versionError("评价失败");
        }
        //将订单状态修改为已经完成已经评价
        OrderInfo orderInfo=new OrderInfo(orderAppraise.getOrderId(),orderAppraise.getUserId());
        // 订单状态修改
        int count = orderDao.updateOrderStatus(orderInfo);
        if (0 == count) {
            return AppResponse.versionError("修改失败！");
        }
      /*  //修改商品评价等级
        int updateGoodsLevel = orderDao.updateGoodsLevel(orderAppraise.getAppraiseList());
        if (0 == updateGoodsLevel) {
            return AppResponse.versionError("更新商品等级失败，评价失败");
        }*/
        return AppResponse.success("评价成功！");
    }

    /**
     * 查询商品评价列表
     *
     * @param appraiseList
     * @return
     */
    public AppResponse listAppraiseGoods(AppraiseList appraiseList) {
        // 查询商品评价列表
        List<AppraiseList> appraiseListList = orderDao.listAppraiseByPage(appraiseList);
        return AppResponse.success("查询成功", getPageInfo(appraiseListList));
    }
}
