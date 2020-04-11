package com.xzsd.pc.goodsHot.entity;

/**
 * 热门商品实体类
 *
 * @author liyuxian
 * @time 2020-04-05
 */
public class GoodsHotInfo {
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 热门商品id
     */
    private String goodsHotId;
    /**
     * 排序
     */
    private String sort;
    /**
     * 展示数量
     */
    private String number;
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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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
