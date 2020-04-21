package com.xzsd.app.clientorder.entity;

/**
 * 商品详情实体类
 * @author liyuxian
 * @time 04-20
 */
public class GoodsVO {
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 商品价格
     */
    private float price;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
