package com.xzsd.pc.driver.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.driver.dao.DriverDao;
import com.xzsd.pc.driver.entity.DriverDetailVo;
import com.xzsd.pc.driver.entity.DriverInfo;
import com.xzsd.pc.driver.entity.DriverListVo;
import com.xzsd.pc.utils.PasswordUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class DriverService {
    @Resource
    private DriverDao driverDao;

    /**
     * 新增司机
     *
     * @param driverInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addDriver(DriverInfo driverInfo) {
        //判断用户账户和手机号是否存在
        int countUserAccount = driverDao.countUserAccount(driverInfo);
        int countUserPhone = driverDao.countUserPhone(driverInfo);
        if (0 != countUserAccount) {
            return AppResponse.versionError("用户账户已存在，请重新输入！");
        } else if (0 != countUserPhone) {
            return AppResponse.versionError("手机号已存在，请重新输入！");
        }
        //给司机id和司机编码和司机用户id设置随机数
        driverInfo.setDriverId(StringUtil.getCommonCode(2));
        driverInfo.setDriverCode(StringUtil.getCommonCode(2));
        driverInfo.setUserId(StringUtil.getCommonCode(2));
        //密码加密
        driverInfo.setPassword(PasswordUtils.generatePassword(driverInfo.getPassword()));
        //新增司机
        int count = driverDao.addDriver(driverInfo);
        int countUser = driverDao.addDriverUser(driverInfo);
        if (0 == count) {
            return AppResponse.versionError("新增失败，请重试！");
        } else if (0 == countUser) {
            return AppResponse.versionError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！");
    }

    /**
     * 查询司机详情
     *
     * @param driverId
     * @return
     */
    public AppResponse findDriverDetailsById(String driverId) {
        //查询司机详情
        DriverDetailVo driverDetailVo = driverDao.findDriverDetailsById(driverId);
        return AppResponse.success("查询成功", driverDetailVo);

    }

    /**
     * 修改司机信息
     *
     * @param driverInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateDriverById(DriverInfo driverInfo) {
        //修改密码
        driverInfo.setPassword(PasswordUtils.generatePassword(driverInfo.getPassword()));
        //修改司机
        int count = driverDao.updateDriverById(driverInfo);
        int countUser = driverDao.updateDriverByIdUser(driverInfo);
        if (0 == count) {
            return AppResponse.versionError("数据有变化，请刷新！");
        } else if (0 == countUser) {
            return AppResponse.versionError("数据有变化，请刷新！");
        }
        return AppResponse.success("修改成功");
    }

    /**
     * 查询司机列表
     *
     * @param driverListVo
     * @return
     */
    public AppResponse listDriver(DriverListVo driverListVo) {
        PageHelper.startPage(driverListVo.getPageNum(), driverListVo.getPageSize());
        List<DriverListVo> driverListVOList = driverDao.listDriver(driverListVo);
        //包装对象
        PageInfo<DriverListVo> pageData = new PageInfo<>(driverListVOList);
        return AppResponse.success("查询成功", pageData);
    }

    /**
     * 删除司机
     *
     * @param userId 司机用户id
     * @param userIdPeople 更新人
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteDriver(String userId, String userIdPeople) {
        List<String> listId = Arrays.asList(userId.split(","));
        List<String> listIdUser = Arrays.asList(userId.split(","));
        //删除司机
        int count = driverDao.deleteDriver(listId, userIdPeople);
        int countUser = driverDao.deleteUser(listIdUser, userIdPeople);
        if (0 == count) {
            return AppResponse.versionError("删除失败，请重试！");
        } else if (0 == countUser) {
            return AppResponse.versionError("删除失败，请重试！");
        }
        return AppResponse.success("删除成功！");
    }
}
