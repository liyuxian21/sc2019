package com.xzsd.pc.order.dao;

import com.xzsd.pc.order.entity.OrderAllVO;
import com.xzsd.pc.order.entity.OrderListVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDao {
    /**
     * 获取订单详情
     * @param orderId
     * @return
     */
    OrderAllVO findOrderDetailsById(String orderId);

    /**
     * 查询订单列表
     * @param orderListVo
     * @return
     */
    List<OrderListVo> findOrderList(OrderListVo orderListVo);

    /**
     * 修改订单状态
     * @param listId
     * @param userId
     * @param orderStatus
     * @return
     */
    int updateOrderStatus(@Param("listId") List<String> listId, @Param("userId") String userId, @Param("orderStatus") String orderStatus);
}
