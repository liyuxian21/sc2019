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
     * 查询热门商品
     *
     * @param goodsHotVO
     * @return
     */
    List<GoodsHotVO> listGoodsHot(GoodsHotVO goodsHotVO);

    /**
     * 查询商品详情
     *
     * @param goodsId
     * @param userId
     * @return
     */
    GoodsDetialVo findGoodsById(@Param("goodsId") String goodsId, @Param("userId") String userId);

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
     * @param userId
     * @return
     */
    LoginUserVO loginDetails(String userId);

    /**
     * 获取用户详情
     * @param userId
     * @return
     */
    UserVO findUserById(String userId);

    /**
     * 修改用户密码
     * @param userVO
     * @return
     */
    int updatePassword(UserVO userVO);
}
