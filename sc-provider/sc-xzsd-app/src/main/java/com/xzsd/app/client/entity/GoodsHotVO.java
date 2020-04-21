package com.xzsd.app.client.entity;

/**
 * 查询热门商品实体类
 *
 * @author liyuxian
 * @time 2020-04-12
 */
public class GoodsHotVO {
    /**
     * 热门商品id
     */
    private String goodsHotId;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 成本价
     */
    private String costPrice;
    /**
     * 在售价
     */
    private String inPrice;
    /**
     * 商品图片路径
     */
    private String photoUrl;
    /**
     * 热门商品展示数量
     */
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGoodsHotId() {
        return goodsHotId;
    }

    public void setGoodsHotId(String goodsHotId) {
        this.goodsHotId = goodsHotId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
