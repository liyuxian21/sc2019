package com.xzsd.app.clientorder.entity;

import java.util.List;

/**
 * 订单列表实体类
 *
 * @author liyuxian
 * @time 2020-04-17
 */
public class OrderListVO {
    /**
     * 登录用户id
     */
    private String userId;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 订单编码
     */
    private String orderCode;
    /**
     * 订单状态 0 已下单， 1 待取货， 3 （已完成and 待评价），4已完成已评价，5已取消
     */
    private String orderStatus;
    /**
     * 订单总价价格
     */
    private String countPrice;
    /**
     * 购买商品总数量
     */
    private String goodsNumber;
    /**
     * 订单明细集合
     */
    private List<OrderDetailVO> goodsList;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderDetailVO> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<OrderDetailVO> goodsList) {
        this.goodsList = goodsList;
    }

    public String getCountPrice() {
        return countPrice;
    }

    public void setCountPrice(String countPrice) {
        this.countPrice = countPrice;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
