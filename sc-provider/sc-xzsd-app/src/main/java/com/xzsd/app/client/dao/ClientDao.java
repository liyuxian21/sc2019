package com.xzsd.app.client.dao;

import com.xzsd.app.client.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClientDao {
    /**
     * 统计账户
     *
     * @param registerInfo
     * @return
     */
    int countUserAccount(RegisterInfo registerInfo);

    /**
     * 统计号码
     *
     * @param registerInfo
     * @return
     */
    int countUserPhone(RegisterInfo registerInfo);

    /**
     * 注册用户
     *
     * @param registerInfo
     * @return
     */
    int register(RegisterInfo registerInfo);

    /**
     * 注册用户
     *
     * @param registerInfo
     * @return
     */
    int register2(RegisterInfo registerInfo);

    /**
     * 统计门店邀请码
     *
     * @param registerInfo
     * @return
     */
    int countInciteCode(RegisterInfo registerInfo);

    /**
     * 查询轮播图列表
     *
     * @param slideShowInfo
     * @return
     */
    List<SlideShowInfo> listSlideshow(SlideShowInfo slideShowInfo);
    /**
     * 查询商品详情
     *
     * @return
     */
    GoodsDetialVo findGoodsById(GoodsDetialVo goodsDetialVo);

    /**
     * 查询商品一级分类
     *
     * @param goodsFirstClassVO
     * @return
     */
    List<GoodsFirstClassVO> firstClassGoodsList(GoodsFirstClassVO goodsFirstClassVO);

    /**
     * 查询商品二级分类
     *
     * @param goodsSecondClassVO
     * @param parentClassCode
     * @return
     */
    List<GoodsSecondClassVO> secondClassGoodsList(GoodsSecondClassVO goodsSecondClassVO, @Param("parentClassCode") String parentClassCode);

    /**
     * 获取登录用户详情
     *
     * @param currentUserId
     * @return
     */
    LoginUserVO loginDetails(String currentUserId);

    /**
     * 统计店铺邀请码
     * @param storeInviteCode
     * @return
     */
    int countInviteCode(String storeInviteCode);

    /**
     * 修改店铺邀请码
     * @param currentUserId
     * @param storeInviteCode
     * @return
     */
    int updateStoreInviteCode(@Param("currentUserId") String currentUserId, @Param("storeInviteCode") String storeInviteCode);

    /**
     * 获取用户原密码密文
     * @param userId
     * @return
     */
    UserVO findUserById(String userId);

    /**
     * 修改密码
     * @return
     */
    int updatePassword(UserVO userVO);

    /**
     * 查询热门商品展示数量
     * @return
     */
    int getNumber();

    /**
     * 查询热门商品
     * @param number
     * @return
     */
    List<GoodsHotVO> listGoodsHot(int number);

    /**
     * 查询登录角色
     * @param roleInfo
     * @return
     */
    RoleInfo roleById(RoleInfo roleInfo);
}
