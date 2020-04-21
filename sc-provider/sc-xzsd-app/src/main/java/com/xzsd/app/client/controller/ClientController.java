package com.xzsd.app.client.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.client.entity.*;
import com.xzsd.app.client.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 客户端注册，商品查询，个人信息修改以及查询
 * @author liyuxian
 * @time 2020-04-12
 */
@RestController
@RequestMapping("app")
public class ClientController {
    private static final Logger logger = LoggerFactory.getLogger(ClientController.class);
    @Resource
    private ClientService clientService;

    /**
     * 注册
     * @param registerInfo
     * @return
     */
    @PostMapping("register")
    public AppResponse register(RegisterInfo registerInfo) {
        try {
            return clientService.register(registerInfo);
        } catch (Exception e) {
            logger.error("注册失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询轮播图
     * @param slideShowInfo
     * @return
     */
    @PostMapping("listSlideshow")
    public AppResponse listSlideshow(SlideShowInfo slideShowInfo) {
        try {
            return clientService.listSlideshow(slideShowInfo);
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.printf(e.toString());
            throw e;
        }
    }

    /**
     * 查询热门商品
     * @return
     */
    @PostMapping("listGoodsHot")
    public AppResponse listGoodsHot() {
        try {
            return clientService.listGoodsHot();
        } catch (Exception e) {
            logger.error("商品查询失败", e);
            System.out.printf(e.toString());
            throw e;
        }
    }

    /**
     * 查询商品详情
     * @param goodsId
     * @return
     */
    @PostMapping("findGoodsById")
    public AppResponse findGoodsById(String goodsId,String userId) {
        try {
            return clientService.findGoodsById(goodsId,userId);
        } catch (Exception e) {
            logger.error("商品查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询商品一级分类
     * @param goodsFirstClassVO
     * @return
     */
    @PostMapping("firstClassGoodsList")
    public AppResponse firstClassGoodsList(GoodsFirstClassVO goodsFirstClassVO) {
        try {
            return clientService.firstClassGoodsList(goodsFirstClassVO);
        } catch (Exception e) {
            logger.error("查询商品一级分类列表错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询商品二级分类
     * @param goodsSecondClassVO
     * @param parentClassCode
     * @return
     */
    @PostMapping("secondClassGoodsList")
    public AppResponse secondClassGoodsList(GoodsSecondClassVO goodsSecondClassVO, String parentClassCode) {
        try {
            return clientService.secondClassGoodsList(goodsSecondClassVO,parentClassCode);
        } catch (Exception e) {
            logger.error("查询商品二级分类列表错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询登录用户详情
     * @param userId
     * @return
     */
    @PostMapping("loginDetails")
    public AppResponse loginDetails(String userId) {
        try {
            return clientService.loginDetails(userId);
        } catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改密码
     * @return
     */
    @PostMapping("updatePassword")
    public AppResponse updatePassword(UserVO userVO) {
        try {
            return clientService.updatePassword(userVO);
        } catch (Exception e) {
            logger.error("修改错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改店铺邀请码
     * @param userId
     * @param storeInviteCode
     * @return
     */
    @PostMapping("updateStoreInviteCode")
    public AppResponse updateStoreInviteCode(String userId,String storeInviteCode) {
        try {
            return clientService.updateStoreInviteCode(userId,storeInviteCode);
        } catch (Exception e) {
            logger.error("修改错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

}
