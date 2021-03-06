package com.xzsd.app.client.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.app.client.dao.ClientDao;
import com.xzsd.app.client.entity.*;
import com.xzsd.app.utils.PasswordUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户端注册，商品查询，个人信息修改以及查询
 *
 * @author liyuxian
 * @time 2020-04-12
 */
@Service
public class ClientService {
    @Resource
    private ClientDao clientDao;

    /**
     * 注册
     *
     * @param registerInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse register(RegisterInfo registerInfo) {
        //判断用户账户和手机号是否存在
        int countUserAccount = clientDao.countUserAccount(registerInfo);
        int countUserPhone = clientDao.countUserPhone(registerInfo);
        //判断门店邀请码是否存在
        if (registerInfo.getStoreInviteCode() != null) {
            int countInviteCode = clientDao.countInciteCode(registerInfo);
            if (0 == countInviteCode) {
                return AppResponse.versionError("你输入的门店邀请码不存在，请重新输入！");
            }
        }
        if (0 != countUserAccount) {
            return AppResponse.versionError("用户账户已存在，请重新输入！");
        } else if (0 != countUserPhone) {
            return AppResponse.versionError("手机号已存在，请重新输入！");
        }
        //给用户编码和司机id设置随机编号
        registerInfo.setUserId(StringUtil.getCommonCode(2));
        registerInfo.setClientId(StringUtil.getCommonCode(2));
        //密码加密
        registerInfo.setUserPassword(PasswordUtils.generatePassword(registerInfo.getUserPassword()));
        // 新增用户
        int countUser = clientDao.register(registerInfo);
        int countClient = clientDao.registerClient(registerInfo);
        if (0 == countUser) {
            return AppResponse.versionError("注册失败，请重试！");
        } else if (0 == countClient) {
            return AppResponse.versionError("注册失败，请重试！");
        }
        return AppResponse.success("注册成功！");
    }

    /**
     * 查询轮播图
     *
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse listSlideshow() {
        List<SlideShowInfo> slideShowInfoList = clientDao.listSlideshow();
        return AppResponse.success("查询成功！", slideShowInfoList);
    }

    /**
     * 查询热门商品
     *
     * @return
     */
    public AppResponse listGoodsHot() {
        //查询热门商品展示数量
        int number = Integer.valueOf(clientDao.getNumber());
        List<GoodsHotVO> goodsHotList = clientDao.listGoodsHot(number);
        return AppResponse.success("查询成功", goodsHotList);
    }

    /**
     * 查询商品详情
     *
     * @param goodsDetialVo
     * @return
     */
    public AppResponse findGoodsById(GoodsDetialVo goodsDetialVo) {
        GoodsDetialVo goodsDetailVoList = clientDao.findGoodsById(goodsDetialVo);
        return AppResponse.success("查询成功", goodsDetailVoList);
    }

    /**
     * 查询商品一级分类
     *
     * @return
     */
    public AppResponse firstClassGoodsList() {
        List<GoodsFirstClassVO> goodsFirstClassList = clientDao.firstClassGoodsList();
        return AppResponse.success("查询成功！", goodsFirstClassList);
    }

    /**
     * 查询商品二级分类
     *
     * @param goodsSecondClassVO
     * @param parentClassCode
     * @return
     */
    public AppResponse secondClassGoodsList(GoodsSecondClassVO goodsSecondClassVO, String parentClassCode) {
        //判断是否有父类编码
        if (parentClassCode == null) {
            return AppResponse.notFound("查询为空");
        }
        List<GoodsSecondClassVO> goodsList = clientDao.secondClassGoodsList(goodsSecondClassVO, parentClassCode);
        return AppResponse.success("查询成功！", goodsList);
    }

    /**
     * 查询登录用户详情
     *
     * @param currentUserId
     * @return
     */
    public AppResponse loginDetails(String currentUserId) {
        //获取用户详情
        LoginUserVO loginUserVO = clientDao.loginDetails(currentUserId);
        return AppResponse.success("查询成功!", loginUserVO);
    }

    /**
     * 修改密码
     *
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updatePassword(UserVO userVO) {
        //校验原密码是否正确
        if (null != userVO.getStartPassword() && !"".equals(userVO.getNewPassword())) {
            //获取用户原密码加密密文
            UserVO userDetail = clientDao.findUserById(userVO.getUserId());
            //判断原密码是否相同
            boolean password = PasswordUtils.Password(userVO.getStartPassword(), userDetail.getUserPassword());
            if (!password) {
                return AppResponse.versionError("原密码不匹配，请重新输入！");
            }
        }
        //修改密码并且加密
        userVO.setNewPassword(PasswordUtils.generatePassword(userVO.getNewPassword()));
        int count = clientDao.updatePassword(userVO);
        if (0 == count) {
            return AppResponse.versionError("修改失败！");
        }
        return AppResponse.success("修改成功！");
    }

    /**
     * 修改店铺邀请码
     *
     * @param currentUserId
     * @param storeInviteCode
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateStoreInviteCode(String currentUserId, String storeInviteCode) {
        //统计门店邀请码
        int countInviteCode = clientDao.countInviteCode(storeInviteCode);
        if (0 == countInviteCode) {
            return AppResponse.versionError("修改店铺邀请码不存在，请重新输入！");
        }
        //修改店铺邀请码
        int count = clientDao.updateStoreInviteCode(currentUserId, storeInviteCode);
        if (0 == count) {
            return AppResponse.versionError("修改失败请重试！");
        }
        return AppResponse.success("修改成功！");
    }

    /**
     * 查询登录角色
     *
     * @param roleInfo
     * @return
     */
    public AppResponse role(RoleInfo roleInfo) {
        RoleInfo role = clientDao.roleById(roleInfo);
        return AppResponse.success("查询成功", role);
    }
}
