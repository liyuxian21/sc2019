package com.xzsd.pc.user.entity;
/**
 * 用户详情实体类
 *
 * @author liyuxian
 * @time 2020-03-026
 */
public class UserDetail {
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户账户
     */
    private String userAccount;
    /**
     * 用户性别 0女 1男
     */
    private String userSex;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 身份证
     */
    private String idCard;
    /**
     * 用户角色（0管理员，1店长,2司机，3客户）
     */
    private String role;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户头像
     */
    private String userPhoto;
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

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
