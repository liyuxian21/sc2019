package com.xzsd.app.store.entity;

import com.xzsd.app.clientorder.entity.OrderDetailVO;

import java.util.List;

/**
 * 店长端订单详情实体类
 *
 * @author liyuxian
 * @time 2020-0417
 */
public class OrderStoreDetailVO {
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 订单编码
     */
    private String orderCode;
    /**
     * 订单总价价格
     */
    private String countPrice;
    /**
     * 订单状态 0 已下单， 1 待取货， 3 （已完成and 待评价），4已完成已评价，5已取消
     */
    private String orderStatus;
    /**
     * 购买商品总数量
     */
    private String goodsNumber;
    /**
     * 订单创建时间
     */
    private String createTime;
    /**
     * 详细地址(省市区后台拼接好)
     */
    private String address;
    /**
     * 绑定门店名称
     */
    private String storeName;
    /**
     * 下单用户姓名
     */
    private String userName;
    /**
     * 下单人手机号
     */
    private String userPhone;
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

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getCountPrice() {
        return countPrice;
    }

    public void setCountPrice(String countPrice) {
        this.countPrice = countPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
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
