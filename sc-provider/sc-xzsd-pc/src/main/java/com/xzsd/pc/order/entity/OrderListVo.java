package com.xzsd.pc.order.entity;

/**
 * 查询订单列表实体类
 * @author liyuxian
 * @time 2020-04-09
 */
public class OrderListVo {
    /**
     * 每页大小
     */
    private int pageSize;
    /**
     * 第几页
     */
    private int pageNum;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 订单状态 ： 0 已下单，1 已到货， 2 已取货，3 已完成未评，4 已完成已评，5已取消
     */
    private String orderStatus;
    /**
     * 门店编码
     */
    private String storeCode;
    /**
     * 订单编码
     */
    private String orderCode;
    /**
     * 订单总金额
     */
    private String countPrice;
    /**
     * 确认付款时间
     */
    private String paidTime;
    /**
     * 下单人姓名
     */
    private String orderName;
    /**
     * 下单人手机号
     */
    private String phone;
    /**
     * 角色
     */
    private int role;
    /**
     * 当前登录店长用户id
     */
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

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

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
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

    public String getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(String paidTime) {
        this.paidTime = paidTime;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

}
