package com.xzsd.pc.driver.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.driver.entity.DriverInfo;
import com.xzsd.pc.driver.entity.DriverListVo;
import com.xzsd.pc.driver.service.DriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 司机CIRD
 * @author liyuxian
 * @time 2020-04-06
 */
@RestController
@RequestMapping("driver")
public class DriverController {
    private static final Logger logger = LoggerFactory.getLogger(DriverController.class);
    @Resource
    private DriverService driverService;

    /**
     * 司机新增
     * @param driverInfo
     * @return
     */
    @PostMapping("addDriver")
    public AppResponse addDriver(DriverInfo driverInfo){
        try{
            return driverService.addDriver(driverInfo);
        }catch(Exception e){
            logger.error("新增失败",e);
            System.out.printf(e.toString());
            throw e;
        }
    }

    /**
     * 查询司机详情
     * @param driverId
     * @return
     */
    @PostMapping("findDriverDetailsById")
    public AppResponse findDriverDetailsById(String driverId){
        try{
            return driverService.findDriverDetailsById(driverId);
        }catch(Exception e){
            logger.error("查询司机详情失败",e);
            System.out.printf(e.toString());
            throw e;
        }
    }

    /**
     * 修改司机信息
     * @param driverInfo
     * @return
     */
    @PostMapping("updateDriverById")
    public AppResponse updateDriverById(DriverInfo driverInfo){
        try{
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            driverInfo.setUpdatePeople(userId);
            return driverService.updateDriverById(driverInfo);
        }catch(Exception e){
            logger.error("修改失败",e);
            System.out.printf(e.toString());
            throw e;
        }
    }

    /**
     * 查询司机列表
     * @param driverListVo
     * @return
     */
    @PostMapping("listDriver")
    public AppResponse listDriver(DriverListVo driverListVo){
        try{
            return driverService.listDriver(driverListVo);
        }catch(Exception e){
            logger.error("查询失败",e);
            System.out.printf(e.toString());
            throw e;
        }
    }

    /**
     * 删除司机
     * @return
     */
    @PostMapping("deleteDriver")
    public AppResponse deleteDriver(String userId){
        try{
            //获取用户id
            String userId1 = SecurityUtils.getCurrentUserId();
            return driverService.deleteDriver(userId,userId1);
        }catch(Exception e){
            logger.error("删除失败",e);
            System.out.printf(e.toString());
            throw e;
        }
    }

}
