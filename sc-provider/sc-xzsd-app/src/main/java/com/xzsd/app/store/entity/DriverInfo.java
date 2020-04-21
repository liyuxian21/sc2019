package com.xzsd.app.store.entity;
/**
 * 司机信息实体类
 *
 * @author liyuxian
 * @time 2020-04-17
 */
public class DriverInfo{
    /**
     * 司机姓名
     */
    private String driveName;
    /**
     * 司机电话
     */
    private String driverPhone;

    public String getDriveName() {
        return driveName;
    }

    public void setDriveName(String driveName) {
        this.driveName = driveName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }
}
