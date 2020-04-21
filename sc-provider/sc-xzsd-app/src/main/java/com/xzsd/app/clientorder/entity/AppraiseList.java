package com.xzsd.app.clientorder.entity;

import org.springframework.security.access.method.P;

import java.util.List;

/**
 * 查询商品评价列表
 *
 * @author liyuxian
 * @time 2020-04-14
 */
public class AppraiseList {
    /**
     * 评价id
     */
    private String appraiseId;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 用户账户
     */
    private String userAccount;
    /**
     * 评价内容
     */
    private String appraiseComment;
    /**
     * 评价星级（1-5星级）
     */
    private String level;
    /**
     * 评价时间
     */
    private String appraiseTime;
    /**
     * 评价标志 0差评(1-2星)； 1中评（3-4星）； 2 好评（5星）
     */
    private String appraiseGoodsLevel;
    /**
     * 评价图片集合
     */
    private List<AppraiseImage> appraisePhotoList;

    public String getAppraiseId() {
        return appraiseId;
    }

    public void setAppraiseId(String appraiseId) {
        this.appraiseId = appraiseId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getAppraiseComment() {
        return appraiseComment;
    }

    public void setAppraiseComment(String appraiseComment) {
        this.appraiseComment = appraiseComment;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAppraiseTime() {
        return appraiseTime;
    }

    public void setAppraiseTime(String appraiseTime) {
        this.appraiseTime = appraiseTime;
    }

    public String getAppraiseGoodsLevel() {
        return appraiseGoodsLevel;
    }

    public void setAppraiseGoodsLevel(String appraiseGoodsLevel) {
        this.appraiseGoodsLevel = appraiseGoodsLevel;
    }

    public List<AppraiseImage> getAppraisePhotoList() {
        return appraisePhotoList;
    }

    public void setAppraisePhotoList(List<AppraiseImage> appraisePhotoList) {
        this.appraisePhotoList = appraisePhotoList;
    }
}
