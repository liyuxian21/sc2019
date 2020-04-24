package com.xzsd.pc.order.entity;

/**
 * 设计详情的所有实体类
 *
 * @author liyuxian
 * @time 2020-04-08
 */
public class OrderAllVO {
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 订单编码
     */
    private String orderCode;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品编码
     */
    private String goodsCode;
    /**
     * 成本价
     */
    private String costPrice;
    /**
     * 在售价
     */
    private String inPrice;
    /**
     * 订单总价
     */
    private String countPrice;
    /**
     * 购买数量
     */
    private String buyNumber;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getInPrice() {
        return inPrice;
    }

    public void setInPrice(String inPrice) {
        this.inPrice = inPrice;
    }

    public String getCountPrice() {
        return countPrice;
    }

    public void setCountPrice(String countPrice) {
        this.countPrice = countPrice;
    }

    public String getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(String buyNumber) {
        this.buyNumber = buyNumber;
    }
}
