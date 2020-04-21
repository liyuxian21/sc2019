package com.xzsd.app.clientorder.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.clientorder.entity.AppraiseList;
import com.xzsd.app.clientorder.entity.OrderAppraise;
import com.xzsd.app.clientorder.entity.OrderInfo;
import com.xzsd.app.clientorder.entity.OrderListVO;
import com.xzsd.app.clientorder.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 客户端订单操作以及商品评价
 *
 * @author liyuxian
 * @time 2020-04-14
 */
@RestController
@RequestMapping("app")
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
    @Resource
    private OrderService orderService;

    /**
     * 新增订单（下单结算）
     *
     * @param orderInfo
     * @return
     */
    @PostMapping("addOrder")
    public AppResponse addOrder(OrderInfo orderInfo) {
        try {
//            获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            orderInfo.setCreatePeople(userId);
            orderInfo.setUpdatePeople(userId);
            return orderService.addOrder(orderInfo);
        } catch (Exception e) {
            logger.error("新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询订单列表
     * @param orderListVO
     * @return
     */
    @PostMapping("listOrderList")
    public AppResponse listOrderList(OrderListVO orderListVO) {
        try {
            return orderService.listOrderList(orderListVO);
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 获取订单详情
     * @param orderId
     * @return
     */
    @PostMapping("findOrderById")
    public AppResponse findOrderById(String orderId) {
        try {
            return orderService.findOrderById(orderId);
        } catch (Exception e) {
            logger.error("获取失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 订单状态修改，客户点击确认收货和取消订单
     * @param orderId
     * @param orderStatus
     * @return
     */
    @PostMapping("deleteConfirmOrder")
    public AppResponse deleteConfirmOrder(String orderId,String orderStatus) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            return orderService.deleteConfirmOrder(orderId,orderStatus,userId);
        } catch (Exception e) {
            logger.error("修改失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 新增订单评价
     * @param orderAppraise
     * @return
     */
    @PostMapping("addOrderAppraise")
    public AppResponse addOrderAppraise(@RequestBody OrderAppraise orderAppraise) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            orderAppraise.setCreatePeople(userId);
            orderAppraise.setUpdatePeople(userId);
            return orderService.addOrderAppraise(orderAppraise);
        } catch (Exception e) {
            logger.error("新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询商品评价列表
     * @param appraiseList
     * @return
     */
    @PostMapping("listAppraiseGoods")
    public AppResponse listAppraiseGoods(AppraiseList appraiseList) {
        try {
            return orderService.listAppraiseGoods(appraiseList);
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
