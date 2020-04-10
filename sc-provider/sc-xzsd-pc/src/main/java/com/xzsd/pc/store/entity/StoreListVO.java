package com.xzsd.pc.store.entity;

public class StoreListVO {
    /**
     * 每页显示多少条
     */
    private int pageSize;
    /**
     * 当前页是第几页
     */
    private int pageNum;
    /**
     * 门店编号
     */
    private String storeCode;
    /**
     * 门店名称
     */
    private String storeName;
    /**
     * 店长名称
     */
    private String managerName;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 门店联系电话
     */
    private String phone;
    /**
     * 邀请码
     */
    private String inviteCode;
    /**
     * 门店账户
     * @return
     */
    private String storeAccount;
    /**
     *门店id
     */
    private String storeId;
    /**
     * 省份id
     */
    private String provienceId;
    /**
     * 市id
     */
    private String cityId;
    /**
     * 区id
     */
    private String areaId;
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

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getStoreAccount() {
        return storeAccount;
    }

    public void setStoreAccount(String storeAccount) {
        this.storeAccount = storeAccount;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getProvienceId() {
        return provienceId;
    }

    public void setProvienceId(String provienceId) {
        this.provienceId = provienceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }
}
