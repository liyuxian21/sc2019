package com.xzsd.pc.order.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.order.dao.OrderDao;
import com.xzsd.pc.order.entity.OrderAllVO;
import com.xzsd.pc.order.entity.OrderListVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {
    @Resource
    private OrderDao orderDao;

    /**
     * 获取订单详情
     * @param orderId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse findOrderDetailsById(String orderId) {
//        获取订单详情
        OrderAllVO orderAllVO=orderDao.findOrderDetailsById(orderId);
        return AppResponse.success("查询成功",orderAllVO);
    }

    /**
     * 查询订单列表
     * @param orderListVo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse findOrderList(OrderListVo orderListVo){
        PageHelper.startPage(orderListVo.getPageNum(), orderListVo.getPageSize());
        List<OrderListVo> orderListVoList = orderDao.findOrderList(orderListVo);
        //包装对象
        PageInfo<OrderListVo> pageData = new PageInfo<>(orderListVoList);
        return AppResponse.success("查询成功", pageData);
    }

    /**
     * 订单状态修改
     * @param orderId
     * @param userId
     * @param orderStatus
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateOrderStatus(String orderId,String userId,String orderStatus){
//        逗号分开
        List<String> listId= Arrays.asList(orderId.split(","));
//        修改订单状态
        int count = orderDao.updateOrderStatus(listId,userId,orderStatus);
        if (0 == count){
            return AppResponse.versionError("修改失败，请重试！");
        }
        return AppResponse.success("修改成功");
    }
}
