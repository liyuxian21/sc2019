package com.xzsd.app.client.entity;

/**
 * 用户详情实体类
 *
 * @author liyuxian
 * @time 2020-04-13
 */
public class UserVO {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户原密码
     */
    private String startPassword;
    /**
     * 用户新密码
     */
    private String newPassword;
    /**
     * 店铺新邀请码
     */
    private String storeInviteCode;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getStartPassword() {
        return startPassword;
    }

    public void setStartPassword(String startPassword) {
        this.startPassword = startPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getStoreInviteCode() {
        return storeInviteCode;
    }

    public void setStoreInviteCode(String storeInviteCode) {
        this.storeInviteCode = storeInviteCode;
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
