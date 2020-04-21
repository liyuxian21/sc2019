package com.xzsd.app.driver.dao;

import com.xzsd.app.driver.entity.DriverPersonVO;
import com.xzsd.app.driver.entity.DriverStoreVO;

public interface DriverDao {
    /**
     * 查询司机个人信息
     * @param userId
     * @return
     */
    DriverPersonVO findDriverById(String userId);

    /**
     * 查询司机负责门店信息
     * @param driverStoreVO
     * @return
     */
    DriverStoreVO findDriverStoreById(DriverStoreVO driverStoreVO);
}
