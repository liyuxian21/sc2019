package com.xzsd.app.clientorder.dao;

import com.xzsd.app.clientorder.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {
    /**
     * 新增订单
     *
     * @param orderInfo
     * @return
     */
    int addOrder(OrderInfo orderInfo);

    /**
     * 查询订单列表
     * @param orderListVO
     * @return
     */
    List<OrderListVO> listOrderByPage(OrderListVO orderListVO);

    /**
     * 获取订单详情
     * @param orderId
     * @return
     */
    OrderStoreVO findOrderById(String orderId);

    /**
     *客户确认收货或者取消订单
     * @param orderInfo
     * @return
     */
    int updateOrder(OrderInfo orderInfo);

    /**
     * 新增订单详情
     * @param orderDetailVOList
     * @return
     */
    int addOrderDetail(@Param("orderDetailVOList") List<OrderDetailVO> orderDetailVOList);

    /**
     * 查询商品详情
     * @param goodsId
     * @return
     */
    GoodsVO getGoods(@Param("goodsId") String goodsId);

    /**
     * 更新商品库存和数量
     * @param orderDetailVOList
     * @return
     */
    int update(@Param("orderDetailVOList") List<OrderDetailVO> orderDetailVOList);

    /**
     * 将商品从购物车移除
     * @param goodsIdList
     * @return
     */
    int deleteGoods(@Param("goodsIdList") List<String> goodsIdList);

    /**
     * 新增评价信息
     * @param orderAppraise
     * @return
     */
    int addAppraise(OrderAppraise orderAppraise);

    /**
     * 新增评价图片集合
     * @param appraiseImageList
     * @return
     */
    int addAppraiseImage(@Param("appraiseImageList") List<AppraiseImage> appraiseImageList);

    /**
     * 查询商品评价列表
     * @param appraiseList
     * @return
     */
    List<AppraiseList> listAppraiseByPage(AppraiseList appraiseList);

    /**
     * 更新商品评价等级
     * @param appraiseList
     * @return
     */
    int updateGoodsLevel(@Param("appraiseList") List<AppraiseInfo> appraiseList);

    /**
     * 判断登陆用户是否绑定了邀请码
     * @param userId
     * @return
     */
    StoreVO getStoreById(String userId);
}
