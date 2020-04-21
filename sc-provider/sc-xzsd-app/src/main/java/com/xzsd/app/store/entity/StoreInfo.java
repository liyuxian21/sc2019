package com.xzsd.app.store.entity;

/**
 * 店长端实体类
 *
 * @author liyuxian
 * @time 2020-04-17
 */
public class StoreInfo {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     *用户头像
     */
    private String userPhoto;
    /**
     * 绑定门店名称
     */
    private String storeName;
    /**
     * 门店邀请码
     */
    private String inviteCode;
    /**
     * 详细地址(省市区后台拼接好)
     */
    private String address;
    /**
     * 门店id
     */
    private String storeId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
}
