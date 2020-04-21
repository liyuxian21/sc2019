package com.xzsd.app.clientorder.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.app.clientorder.dao.OrderDao;
import com.xzsd.app.clientorder.entity.OrderDetailVO;
import com.xzsd.app.clientorder.entity.OrderInfo;
import com.xzsd.app.clientorder.entity.OrderListVO;
import com.xzsd.app.clientorder.entity.OrderStoreVO;
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
            orderInfo.setGoodsNumber(Integer.parseInt(countList.get(i))+orderInfo.getGoodsNumber());
            //添加到list
            orderDetailVOList.add(orderDetailVO);
        }
        //将下单对应的商品id移除购物车
        List<String> goodsIdList = Arrays.asList(orderInfo.getGoodsId().split(","));
        int shopDelete = orderDao.deleteGoods(goodsIdList);
        if (0 == shopDelete) {
            return AppResponse.versionError("移除购物车失败！");
        }
        //修改商品库存和销售量
        int update= orderDao.update(orderDetailVOList);
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
//        查询订单列表
        List<OrderListVO> orderList = orderDao.listOrderByPage(orderListVO);
        return AppResponse.success("查询成功", getPageInfo(orderList));
    }

    /**
     * 获取订单详情
     *
     * @param orderId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse findOrderById(String orderId) {
        OrderStoreVO orderStoreVO = orderDao.findOrderById(orderId);
        return AppResponse.success("查询成功", orderStoreVO);
    }

    /**
     * 订单状态修改，客户点击确认收货和取消订单
     *
     * @param orderId
     * @param orderStatus
     * @param userId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteConfirmOrder(String orderId, String orderStatus, String userId) {
        // 订单状态修改，客户点击确认收货或者取消订单
        int count = orderDao.updateOrder(orderId, orderStatus, userId);
        if (0 == count) {
            return AppResponse.versionError("修改失败！");
        }
        return AppResponse.success("修改成功！");
    }

}
