package com.xzsd.pc.store.entity;
/**
 * 门店详情实体类
 *
 * @author liyuxian
 * @time 2020-04-08
 */
public class StoreDetialVO {
    /**
     *门店id
     */
    private String storeId;
    /**
     * 省份名称
     */
    private String provienceName;
    /**
     * 市名称
     */
    private String cityName;
    /**
     * 区名称
     */
    private String areaName;
    /**
     * 门店名称
     */
    private String storeName;
    /**
     * 门店联系电话
     */
    private String phone;
    /**
     * 店长用户id
     */
    private String userId;
    /**
     * 营业执照编码
     */
    private String liceseCode;
    /**
     * 详细地址
     */
    private String address;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getProvienceName() {
        return provienceName;
    }

    public void setProvienceName(String provienceName) {
        this.provienceName = provienceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLiceseCode() {
        return liceseCode;
    }

    public void setLiceseCode(String liceseCode) {
        this.liceseCode = liceseCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
