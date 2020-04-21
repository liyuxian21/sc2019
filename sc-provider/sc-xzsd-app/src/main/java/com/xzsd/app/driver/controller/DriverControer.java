package com.xzsd.app.driver.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.driver.entity.DriverStoreVO;
import com.xzsd.app.driver.service.DriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 司机端个人信息查询以及负责门店查询
 *
 * @author liyuxian
 * @time 2020-04-18
 */
@RestController
@RequestMapping("app")
public class DriverControer {
    private static final Logger logger = LoggerFactory.getLogger(DriverControer.class);
    @Resource
    private DriverService driverService;

    /**
     * 查询司机个人信息
     *
     * @param userId
     * @return
     */
    @PostMapping("driverShopPerson")
    public AppResponse driverShopPerson(String userId) {
        try {
            return driverService.driverShopPerson(userId);
        } catch (Exception e) {
            logger.error("查询个人信息失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询司机负责门店信息
     * @param driverStoreVO
     * @return
     */
    @PostMapping("findDriverStoreById")
    public AppResponse findDriverStoreById(DriverStoreVO driverStoreVO) {
        try {
            return driverService.findDriverStoreById(driverStoreVO);
        } catch (Exception e) {
            logger.error("查询负责门店信息失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
