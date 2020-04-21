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
     * @param orderId
     * @param orderStatus
     * @param userId
     * @return
     */
    int updateOrder(@Param("orderId") String orderId,@Param("orderStatus") String orderStatus, @Param("userId")String userId);

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
}
