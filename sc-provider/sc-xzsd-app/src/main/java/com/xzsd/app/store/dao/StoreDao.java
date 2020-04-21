package com.xzsd.app.store.dao;

import com.xzsd.app.store.entity.DriverInfo;
import com.xzsd.app.store.entity.OrderStoreDetailVO;
import com.xzsd.app.store.entity.OrderVO;
import com.xzsd.app.store.entity.StoreInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoreDao {
    /**
     * 查询店长个人信息
     * @param storeInfo
     * @return
     */
    StoreInfo storeByUserId(StoreInfo storeInfo);

    /**
     * 查询司机信息
     * @param driverInfo
     * @return
     */
    List<DriverInfo> findDriver(DriverInfo driverInfo);

    /**
     * 查询本店订单列表
     * @param orderVO
     * @return
     */
    List<OrderVO> listStoreOrderByPage(OrderVO orderVO);

    /**
     * 获取店长端订单详情
     * @param orderId
     * @return
     */
    OrderStoreDetailVO findOrderStore(String orderId);

    /**
     * 店长修改订单状态
     * @param orderId
     * @param orderStatus
     * @param userId
     * @return
     */
    int updateShopStatus(@Param("orderId") String orderId,@Param("orderStatus")  String orderStatus, @Param("userId") String userId);
}
