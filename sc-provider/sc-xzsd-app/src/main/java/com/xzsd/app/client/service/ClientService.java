package com.xzsd.app.client.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
//             判断用户账户和手机号是否存在
        int countUserAccount = clientDao.countUserAccount(registerInfo);
        int countUserPhone = clientDao.countUserPhone(registerInfo);
        if (0 != countUserAccount) {
            return AppResponse.bizError("用户账户已存在，请重新输入！");
        } else if (0 != countUserPhone) {
            return AppResponse.bizError("手机号已存在，请重新输入！");
        }
//        判断门店邀请码是否存在
        int countInviteCode = clientDao.countInciteCode(registerInfo);
        if (0 == countInviteCode) {
            return AppResponse.success("你输入的门店邀请码不存在，请重新输入！");
        }
//        给用户编码和司机id设置随机编号
        registerInfo.setUserId(StringUtil.getCommonCode(2));
        registerInfo.setClientId(StringUtil.getCommonCode(2));
//         密码加密 默认为123456
        String pwd = PasswordUtils.generatePassword("123456");
        registerInfo.setUserPassword(pwd);
//        新增用户
        int count = clientDao.register(registerInfo);
        int count2 = clientDao.register2(registerInfo);
        if (0 == count) {
            return AppResponse.bizError("注册失败，请重试！");
        } else if (0 == count2) {
            return AppResponse.bizError("注册失败，请重试！");
        }
        return AppResponse.success("注册成功！");
    }

    /**
     * 查询轮播图
     *
     * @param slideShowInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse listSlideshow(SlideShowInfo slideShowInfo) {
        PageHelper.startPage(slideShowInfo.getPageNum(), slideShowInfo.getPageSize());
        List<SlideShowInfo> slideShowInfoList = clientDao.listSlideshow(slideShowInfo);
//        包装对象
        PageInfo<SlideShowInfo> pageData = new PageInfo<>(slideShowInfoList);
        return AppResponse.success("查询成功！", pageData);
    }

    /**
     * 查询热门商品
     *
     * @param goodsHotVO
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse listGoodsHot(GoodsHotVO goodsHotVO) {
        PageHelper.startPage(goodsHotVO.getPageNum(), goodsHotVO.getPageSize());
        List<GoodsHotVO> goodsHotList = clientDao.listGoodsHot(goodsHotVO);
        //包装对象
        PageInfo<GoodsHotVO> pageData = new PageInfo<>(goodsHotList);
        return AppResponse.success("查询成功", pageData);
    }

    /**
     * 查询商品详情
     *
     * @param goodsId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse findGoodsById(String goodsId, String userId) {
        GoodsDetialVo goodsDetialVo = clientDao.findGoodsById(goodsId, userId);
        return AppResponse.success("查询成功", goodsDetialVo);
    }

    /**
     * 查询商品一级分类
     *
     * @param goodsFirstClassVO
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse firstClassGoodsList(GoodsFirstClassVO goodsFirstClassVO) {
        List<GoodsFirstClassVO> goodsFirstClassList = clientDao.firstClassGoodsList(goodsFirstClassVO);
        return AppResponse.success("查询成功！", goodsFirstClassList);
    }

    /**
     * 查询商品二级分类
     *
     * @param goodsSecondClassVO
     * @param parentClassCode
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse secondClassGoodsList(GoodsSecondClassVO goodsSecondClassVO, String parentClassCode) {
//          判断是否有父类编码
        if (parentClassCode == null) {
            return AppResponse.bizError("查询为空");
        }
        List<GoodsSecondClassVO> goodsList = clientDao.secondClassGoodsList(goodsSecondClassVO, parentClassCode);
        return AppResponse.success("查询成功！", goodsList);
    }

    /**
     * 查询登录用户详情
     *
     * @param userId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse loginDetails(String userId) {
//        获取用户详情
        LoginUserVO loginUserVO = clientDao.loginDetails(userId);
        return AppResponse.success("查询成功!", loginUserVO);
    }

    /**
     * 修改密码
     *
     * @param userVO
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updatePassword(UserVO userVO) {
//        校验原密码是否正确
        if (null != userVO.getUserPassword() && !"".equals(userVO.getUserPassword())) {
            String startPassword = PasswordUtils.generatePassword(userVO.getUserPassword());
//            获取用户密码信息
            UserVO userDetail = clientDao.findUserById(userVO.getUserId());
            if (!startPassword.equals(userDetail.getUserPassword())) {
                return AppResponse.bizError("原密码不匹配，请重新输入！");
            }
        }
//        修改密码
        userVO.setUserPassword(PasswordUtils.generatePassword(userVO.getUserPassword()));
        int count = clientDao.updatePassword(userVO);
        if (0 == count) {
            return AppResponse.bizError("修改失败！");
        }
        return AppResponse.success("修改成功！");
    }
}
