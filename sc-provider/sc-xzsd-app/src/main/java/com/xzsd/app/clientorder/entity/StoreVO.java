package com.xzsd.app.clientorder.entity;

/**
 * 校验登陆用户是否绑定了门店实体类
 */
public class StoreVO {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 店铺邀请码
     */
    private String storeInviteCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStoreInviteCode() {
        return storeInviteCode;
    }

    public void setStoreInviteCode(String storeInviteCode) {
        this.storeInviteCode = storeInviteCode;
    }
}
