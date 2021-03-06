package com.xzsd.pc.driver.entity;

/**
 * 司机详情实体类
 *
 * @author liyuxian
 * @time 2020-03-29
 */
public class DriverDetailVo {
    /**
     * 司机编号
     */
    private String driverCode;
    /**
     * 司机账户
     */
    private String driverAccount;
    /**
     * 司机姓名
     */
    private String driverName;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 省份名称
     */
    private String provienceName;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 市名称
     */
    private String cityName;
    /**
     * 区名称
     */
    private String areaName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverCode() {
        return driverCode;
    }

    public void setDriverCode(String driverCode) {
        this.driverCode = driverCode;
    }

    public String getDriverAccount() {
        return driverAccount;
    }

    public void setDriverAccount(String driverAccount) {
        this.driverAccount = driverAccount;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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
}
