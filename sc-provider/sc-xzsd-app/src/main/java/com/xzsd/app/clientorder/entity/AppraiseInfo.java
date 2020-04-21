package com.xzsd.app.clientorder.entity;
import java.io.Serializable;
import java.util.List;

/**
 * 订单评价信息实体类
 *
 * @author liyuxian
 * @time 2020-04-14
 */
public class AppraiseInfo implements Serializable {
    /**
     * 评价id
     */
    private String appraiseId;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 评价星级（1-5星级）
     */
    private String level;
    /**
     * 评价内容
     */
    private String appraiseComment;
    /**
     * 评价图片集合
     */
    private List<AppraiseImage> appraisePhotoList;
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

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setAppraiseId(String appraiseId) {
        this.appraiseId = appraiseId;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAppraiseComment() {
        return appraiseComment;
    }

    public void setAppraiseComment(String appraiseComment) {
        this.appraiseComment = appraiseComment;
    }

    public List<AppraiseImage> getAppraisePhotoList() {
        return appraisePhotoList;
    }

    public void setAppraisePhotoList(List<AppraiseImage> appraisePhotoList) {
        this.appraisePhotoList = appraisePhotoList;
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

    public String getAppraiseId() {
        return appraiseId;
    }
}
