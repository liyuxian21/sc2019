package com.xzsd.pc.goodsHot.entity;

/**
 * 热门商品详情实体类
 *
 * @author liyuxian
 * @time 2020-04-05
 */
public class GoodsHotDetailVO {
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 排序
     */
    private String sort;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
