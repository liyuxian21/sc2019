package com.xzsd.pc.user.entity;

/**
 * 登录用户详情实体类
 *
 * @author liyuxian
 * @time 2020-04-09
 */
public class LoginUserVo {
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户角色（0管理员，1店长）
     */
    private String role;
    /**
     * 用户头像路径
     */
    private String userPhoto;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }
}
