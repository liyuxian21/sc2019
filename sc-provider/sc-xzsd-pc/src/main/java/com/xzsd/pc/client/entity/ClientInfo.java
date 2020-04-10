package com.xzsd.pc.client.entity;

/**
 * 客户实体类
 * @author liyuxian
 * @time 2020-03-29
 */
public class ClientInfo {
    /**
     * 每页显示多少条
     */
    private int pageSize;
    /**
     * 当前页是第几页
     */
    private int pageNum;
    /**
     * 客户用户id
     */
    private String userId;
    /**
     * 客户姓名
     */
    private String clientName;
    /**
     * 客户账户
     */
    private String clientAccount;
    /**
     * 性别 0女 1男
     */
    private String sex;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 用户邮箱
     */
    private String clientEmail;
    /**
     * 身份证
     */
    private String idCard;


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

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAccount() {
        return clientAccount;
    }

    public void setClientAccount(String clientAccount) {
        this.clientAccount = clientAccount;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
