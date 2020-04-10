package com.xzsd.pc.user.entity;

import java.util.Date;

/**
 * 用户实体类
 *
 * @author liyuxian
 * @time 2020-03-25
 */
public class UserInfo {
    /**
     * 每页显示多少条
     */
    private int pageSize;
    /**
     * 当前页是第几页
     */
    private int pageNum;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户头像
     */
    private String userPhoto;
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
     * 用户密码
     */
    private String password;
    /**
     * 用户角色（0管理员，1店长,2司机，3客户）
     */
    private String role;
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
    private Date createTime;
    /**
     * 修改者
     */
    private String updatePeople;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 版本号
     */
    private String version;

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdatePeople() {
        return updatePeople;
    }

    public void setUpdatePeople(String updatePeople) {
        this.updatePeople = updatePeople;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
