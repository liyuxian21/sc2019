package com.xzsd.app.store.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.store.dao.StoreDao;
import com.xzsd.app.store.entity.DriverInfo;
import com.xzsd.app.store.entity.OrderStoreDetailVO;
import com.xzsd.app.store.entity.OrderVO;
import com.xzsd.app.store.entity.StoreInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

@Service
public class StoreService {
    @Resource
    private StoreDao storeDao;

    /**
     * 查询店长个人信息详情
     * @param storeInfo
     * @return
     */
    public AppResponse StoreShopPerson(StoreInfo storeInfo) {
        StoreInfo detail=storeDao.storeByUserId(storeInfo);
        return AppResponse.success("查询成功！",detail);
    }

    /**
     * 查询司机信息
     * @param driverInfo
     * @return
     */
    public AppResponse driverPerson(DriverInfo driverInfo){
        List<DriverInfo> driverInfoList=storeDao.findDriver(driverInfo);
        return AppResponse.success("查询成功！",driverInfoList);
    }

    /**
     * 查询本店订单列表
     * @param orderVO
     * @return
     */
    public AppResponse listStoreOrder(OrderVO orderVO) {
//        查询订单列表
        List<OrderVO> orderVOList = storeDao.listStoreOrderByPage(orderVO);
        return AppResponse.success("查询成功",getPageInfo(orderVOList));
    }

    /**
     * 店长端获取订单详情
     * @param orderId
     * @return
     */
    public AppResponse findOrderShopDetailsById(String orderId){
        OrderStoreDetailVO orderStoreDetailVO=storeDao.findOrderStore(orderId);
        return AppResponse.success("查询成功",orderStoreDetailVO);
    }

    /**
     * 店长修改订单状态
     * @param orderId
     * @param orderStatus
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateShopStatus(String orderId,String orderStatus,String userId){
        // 订单状态修改
        int count=storeDao.updateShopStatus(orderId,orderStatus,userId);
        if (0 == count){
            return AppResponse.versionError("修改失败！");
        }
        return AppResponse.success("修改成功！");
    }

}


