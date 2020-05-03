package com.xzsd.app.driver.dao;

import com.xzsd.app.driver.entity.DriverPersonVO;
import com.xzsd.app.driver.entity.DriverStoreVO;

import java.util.List;

public interface DriverDao {
    /**
     * 查询司机个人信息
     * @param currentUserId
     * @return
     */
    DriverPersonVO findDriverById(String currentUserId);

    /**
     * 查询司机负责门店信息
     * @param driverStoreVO
     * @return
     */
    List<DriverStoreVO> findDriverStoreById(DriverStoreVO driverStoreVO);
}
