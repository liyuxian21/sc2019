package com.xzsd.app.store.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.store.entity.DriverInfo;
import com.xzsd.app.store.entity.OrderStoreDetailVO;
import com.xzsd.app.store.entity.OrderVO;
import com.xzsd.app.store.entity.StoreInfo;
import com.xzsd.app.store.service.StoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 店长端个人信息查询和订单管理操作
 * @author liyuxian
 * @time 2020-04-17
 */
@RestController
@RequestMapping("app")
public class StoreController {
    private static final Logger logger = LoggerFactory.getLogger(StoreController.class);
    @Resource
    private StoreService storeService;

    /**
     * 查询店长个人信息
     * @param storeInfo
     * @return
     */
    @PostMapping("StoreShopPerson")
    public AppResponse StoreShopPerson(StoreInfo storeInfo) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            storeInfo.setUserId(userId);
            return storeService.StoreShopPerson(storeInfo);
        } catch (Exception e) {
            logger.error("查询店长个人信息失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询司机信息
     * @param driverInfo
     * @return
     */
    @PostMapping("driverPerson")
    public AppResponse driverPerson(DriverInfo driverInfo) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            driverInfo.setUserId(userId);
            return storeService.driverPerson(driverInfo);
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询本店订单列表
     * @param orderVO
     * @return
     */
    @PostMapping("listStoreOrder")
    public AppResponse listStoreOrder(OrderVO orderVO) {
        try {
            return storeService.listStoreOrder(orderVO);
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 店长端获取订单详情
     * @param orderId
     * @return
     */
    @PostMapping("findOrderShopDetailsById")
    public AppResponse findOrderShopDetailsById(String orderId) {
        try {
            return storeService.findOrderShopDetailsById(orderId);
        } catch (Exception e) {
            logger.error("获取详情失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 店长修改订单状态
     * @param orderId
     * @param orderStatus
     * @return
     */
    @PostMapping("updateShopStatus")
    public AppResponse updateShopStatus(String orderId,String orderStatus) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            return storeService.updateShopStatus(orderId,orderStatus,userId);
        } catch (Exception e) {
            logger.error("修改失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
