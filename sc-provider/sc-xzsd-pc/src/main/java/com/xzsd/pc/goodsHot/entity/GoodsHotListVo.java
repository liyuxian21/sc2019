package com.xzsd.pc.goodsHot.entity;

/**
 * 查询热门商品列表实体类
 *
 * @author liyuxian
 * @time2020-04-05
 */
public class GoodsHotListVo {
    /**
     * 页码
     */
    private int pageSize;
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 热门商品id
     */
    private String goodsHotId;
    /**
     * 排序
     */
    private String sort;
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
     * 商品介绍
     */
    private String goodsIntroduction;
    /**
     * 版本号
     */
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGoodsHotId() {
        return goodsHotId;
    }

    public void setGoodsHotId(String goodsHotId) {
        this.goodsHotId = goodsHotId;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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

    public String getGoodsIntroduction() {
        return goodsIntroduction;
    }

    public void setGoodsIntroduction(String goodsIntroduction) {
        this.goodsIntroduction = goodsIntroduction;
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
