package com.xzsd.pc.driver.dao;

import com.xzsd.pc.driver.entity.DriverDetailVo;
import com.xzsd.pc.driver.entity.DriverInfo;
import com.xzsd.pc.driver.entity.DriverListVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DriverDao {
    /**
     * 新增司机
     * @param driverInfo
     * @return
     */
    int addDriver(DriverInfo driverInfo);

    /**
     * 查询司机详情
     * @param driverId
     * @return
     */
    DriverDetailVo findDriverDetailsById(String driverId);

    /**
     * 新增司机
     * @param driverInfo
     * @return
     */
    int addDriver2(DriverInfo driverInfo);

    /**
     * 修改司机
     * @param driverInfo
     * @return
     */
    int updateDriverById(DriverInfo driverInfo);

    /**
     * 修改司机
     * @param driverInfo
     * @return
     */
    int updateDriverById2(DriverInfo driverInfo);

    /**
     * 查询司机列表
     * @param driverListVo
     * @return
     */
    List<DriverListVo> listDriver(DriverListVo driverListVo);

    /**
     * 删除司机
     * @param listId
     * @param userId1
     * @return
     */
    int deleteDriver(@Param("listId") List<String> listId, @Param("userId1") String userId1);

    /**
     * 删除司机
     * @param listId2
     * @param userId1
     * @return
     */
    int delete(@Param("listId2") List<String> listId2, @Param("userId1") String userId1);

    /**
     * 统计司机用户账户
     * @param driverInfo
     * @return
     */
    int countUserAccount(DriverInfo driverInfo);

    /**
     * 统计司机用户手机号
     * @param driverInfo
     * @return
     */
    int countUserPhone(DriverInfo driverInfo);


}
