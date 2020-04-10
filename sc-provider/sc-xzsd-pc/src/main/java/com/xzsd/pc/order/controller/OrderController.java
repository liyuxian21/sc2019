package com.xzsd.pc.order.controller;


import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.order.entity.OrderListVo;
import com.xzsd.pc.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("order")
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
    @Resource
    private OrderService orderService;

    /**
     * 获取订单详情
     * @param orderId
     * @return
     */
    @PostMapping("findOrderDetailsById")
    public AppResponse findOrderDetailsById(String orderId) {
        try {
            return orderService.findOrderDetailsById(orderId);
        } catch (Exception e) {
            logger.error("获取订单详情失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询订单列表
     * @param orderListVo
     * @return
     */
    @PostMapping("findOrderList")
    public AppResponse findOrderList(OrderListVo orderListVo) {
        try {
            return orderService.findOrderList(orderListVo);
        } catch (Exception e) {
            logger.error("获取订单列表失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 订单状态修改
     * @param orderId
     * @param orderStatus
     * @return
     */
    @PostMapping("updateOrderStatus")
    public AppResponse updateOrderStatus(String orderId,String orderStatus) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            AppResponse appResponse = orderService.updateOrderStatus(orderId, userId, orderStatus);
            return appResponse;
        } catch (Exception e) {
            logger.error("订单状态修改失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

}
