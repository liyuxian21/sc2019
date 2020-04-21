package com.xzsd.app.clientorder.entity;
import java.io.Serializable;
/**
 * 评价图片集合
 *
 * @author liyuxian
 * @time 2020-04-14
 */
public class AppraiseImage implements Serializable{
    /**
     * 评价图片id
     */
    private String appraiseImageId;
    /**
     * 评价id
     */
    private String appraiseId;
    /**
     * 评价图片
     */
    private String photoUrl;
    /**
     * 评价图片排序序号
     */
    private String sort;
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

    public String getAppraiseImageId() {
        return appraiseImageId;
    }

    public void setAppraiseImageId(String appraiseImageId) {
        this.appraiseImageId = appraiseImageId;
    }

    public String getAppraiseId() {
        return appraiseId;
    }

    public void setAppraiseId(String appraiseId) {
        this.appraiseId = appraiseId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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
