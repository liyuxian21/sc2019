package com.xzsd.app.clientorder.entity;

/**
 * 客户端订单实体类
 * @author liyuxian
 * @time 2020-04-14
 */
public class OrderInfo {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 购物车编号
     */
    private String shoppingId;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 订单编码
     */
    private String orderCode;
    /**
     * 订单总价
     */
    private float countPrice;
    /**
     * 订单状态
     */
    private String orderStatus;
    /**
     * 支付时间
     */
    private String paidTime;
    /**
     * 门店id
     */
    private String storeId;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     *购买商品数量
     */
    private String goodsShoppingNumber;
    /**
     * 一个订单购买商品总数量
     */
    private int goodsNumber;
    /**
     * 删除标记 0未删 1 已删
     */
    private String isDeleted;
    /**
     * 创建人
     */
    private String createPeople;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改者
     */
    private String updatePeople;
    /**
     * 修改时间
     */
    private String updateTime;
    /**
     * 版本号
     */
    private String version;
    public OrderInfo() {
    }
    public OrderInfo(String orderId, String userId){
        this.orderId=orderId;
        this.userId=userId;
    }
    public String getShoppingId() {
        return shoppingId;
    }
    public void setShoppingId(String shoppingId) {
        this.shoppingId = shoppingId;
    }

    public int getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(int goodsNumber) {
        this.goodsNumber = goodsNumber;
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

    public float getCountPrice() {
        return countPrice;
    }

    public void setCountPrice(float countPrice) {
        this.countPrice = countPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(String paidTime) {
        this.paidTime = paidTime;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsShoppingNumber() {
        return goodsShoppingNumber;
    }

    public void setGoodsShoppingNumber(String goodsShoppingNumber) {
        this.goodsShoppingNumber = goodsShoppingNumber;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(String createPeople) {
        this.createPeople = createPeople;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdatePeople() {
        return updatePeople;
    }

    public void setUpdatePeople(String updatePeople) {
        this.updatePeople = updatePeople;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
