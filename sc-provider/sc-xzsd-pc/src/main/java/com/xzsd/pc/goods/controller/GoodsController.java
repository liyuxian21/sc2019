package com.xzsd.pc.goods.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.goods.entity.GoodsClass;
import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.goods.entity.GoodsList;
import com.xzsd.pc.goods.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 增删改查商品,商品一级分类、二级分类查询、商品状态修改
 *
 * @author liyuxian
 * @time 2020-03-24
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Resource
    private GoodsService goodsService;

    /**
     * 新增商品
     *
     * @author liyuxia
     * @time 2020-03-24
     */
    @PostMapping("addGoods")
    public AppResponse addGoods(GoodsInfo goodsInfo) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            goodsInfo.setCreateBy(userId);
            AppResponse appResponse = goodsService.addGoods(goodsInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("商品新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改商品
     *
     * @author liyuxian
     * @time 2020-03-25
     */
    @PostMapping("updateGoodsById")
    public AppResponse updateGoodsById(GoodsInfo goodsInfo) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            goodsInfo.setCreateBy(userId);
            goodsInfo.setLastModifiedBy(userId);
            AppResponse appResponse = goodsService.updateGoodsById(goodsInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("商品修改失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 删除商品
     *
     * @author liyuxian
     * @time 2020-03-25
     */
    @PostMapping("deleteGoods")
    public AppResponse deleteGoods(String goodsId) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            AppResponse appResponse = goodsService.deleteGoods(goodsId, userId);
            return appResponse;
        } catch (Exception e) {
            logger.error("商品删除失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询商品详情
     *
     * @author liyuxian
     * @time 2020-03-25
     */
    @PostMapping("findGoodsById")
    public AppResponse findGoodsById(String goodsId) {
        try {
            return goodsService.findGoodsById(goodsId);
        } catch (Exception e) {
            logger.error("商品查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 商品分页列表查询
     *
     * @author liyuxian
     * @time 2020-03-25
     */
    @PostMapping("listGoods")
    public AppResponse listGoods(GoodsList goodsList) {
        try {
            return goodsService.listGoods(goodsList);
        } catch (Exception e) {
            logger.error("查询商品列表错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 商品 1上架，下架 0修改
     *
     * @author liyuxian
     * @time 2020-03-26
     */
    @PostMapping("status")
    public AppResponse status(String goodsId,String goodsStatus) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            AppResponse appResponse = goodsService.status(goodsId, userId, goodsStatus);
            return appResponse;
        } catch (Exception e) {
            logger.error("商品状态修改失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 商品一级分类查询
     *
     * @author liyuxian
     * @time 2020-03-26
     */
    @PostMapping("firstClassGoodsList")
    public AppResponse firstClassGoodsList() {
        try {
            return goodsService.firstClassGoodsList();
        } catch (Exception e) {
            logger.error("查询商品一级分类列表错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 商品二级分类查询
     *
     * @author liyuxian
     * @time 2020-03-26
     */
    @PostMapping("secondClassGoodsList")
    public AppResponse secondClassGoodsList(GoodsClass goodsClass,String parentClassCode) {
        try {
            return goodsService.secondClassGoodsList(goodsClass,parentClassCode);
        } catch (Exception e) {
            logger.error("查询商品二级分类列表错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

}
