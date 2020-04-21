package com.xzsd.app.clientorder.entity;
/**
 * 订单详情和商品信息实体类
 *
 * @author liyuxian
 * @time 2020-04-17
 */
public class OrderDetailVO {
    /**
     * 订单明细id
     */
    private String orderClearId;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     *购买商品数量
     */
    private int goodsShoppingNumber;
    /**
     * 商品单价
     */
    private float price;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品图片路径
     */
    private String photoUrl;
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

    public OrderDetailVO(){

    }
    public OrderDetailVO(String orderClearId,String goodsId, int goodsShoppingNumber,float price){
        this.orderClearId=orderClearId;
        this.goodsId=goodsId;
        this.goodsShoppingNumber=goodsShoppingNumber;
        this.price=price;
    }

    public String getOrderClearId() {
        return orderClearId;
    }

    public void setOrderClearId(String orderClearId) {
        this.orderClearId = orderClearId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getGoodsShoppingNumber() {
        return goodsShoppingNumber;
    }

    public void setGoodsShoppingNumber(int goodsShoppingNumber) {
        this.goodsShoppingNumber = goodsShoppingNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
