package com.xzsd.app.client.entity;

/**
 * 登录用户实体类
 * @author liyuxian
 * @time 2020-04-13
 */
public class LoginUserVO {
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户头像路径
     */
    private String userPhoto;
    /**
     * 登录用户id
     */
    private String userId;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
