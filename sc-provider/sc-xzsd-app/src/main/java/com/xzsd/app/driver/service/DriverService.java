package com.xzsd.app.driver.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.driver.dao.DriverDao;
import com.xzsd.app.driver.entity.DriverPersonVO;
import com.xzsd.app.driver.entity.DriverStoreVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DriverService {
    @Resource
    private DriverDao driverDao;

    /**
     * 查询司机个人信息详情
     *
     * @param currentUserId
     * @return
     */
    public AppResponse driverShopPerson(String currentUserId) {
        DriverPersonVO driverPersonVO = driverDao.findDriverById(currentUserId);
        return AppResponse.success("查询成功！", driverPersonVO);
    }

    /**
     * 查询司机所负责门店信息
     *
     * @param driverStoreVO
     * @return
     */
    public AppResponse findDriverStoreById(DriverStoreVO driverStoreVO) {
        DriverStoreVO driver = driverDao.findDriverStoreById(driverStoreVO);
        return AppResponse.success("查询成功！", driver);
    }
}
