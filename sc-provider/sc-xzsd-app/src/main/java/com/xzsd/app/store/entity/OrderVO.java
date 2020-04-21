package com.xzsd.app.store.entity;

import com.xzsd.app.clientorder.entity.OrderDetailVO;

import java.util.List;

/**
 * 店长端 订单实体类
 * @author liyuxian
 * @time 2020-04-17
 */
public class OrderVO {
    /**
     * 登录用户id
     */
    private String userId;
    /**
     * 门店id
     */
    private String storeId;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 订单编码
     */
    private String orderCode;
    /**
     * 订单状态 0 已下单，1 待取货， 2 已取货，3 已完成未评（客户点了确认收货按钮）
     * ，4 已完成已评（客户点击了评价），5已取消
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
     * 下单用户姓名
     */
    private String userName;
    /**
     * 下单人手机号
     */
    private String userPhone;
    /**
     * 订单明细和商品信息集合
     */
    /**
     * 订单明细集合
     */
    private List<OrderDetailVO> goodsList;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public List<OrderDetailVO> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<OrderDetailVO> goodsList) {
        this.goodsList = goodsList;
    }
}
