package com.xzsd.pc.goodsHot.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.goodsHot.entity.GoodsHotInfo;
import com.xzsd.pc.goodsHot.entity.GoodsHotListVo;
import com.xzsd.pc.goodsHot.service.GoodsHotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 热门商品CIUD，热门商品展示数量设置
 * @author liyuxian
 * @time 2020-04-05
 */
@RestController
@RequestMapping("goodsHot")
public class GoodsHotController {
    private static final Logger logger = LoggerFactory.getLogger(GoodsHotController.class);
    @Resource
    private GoodsHotService goodsHotService;

    /**
     * 热门商品新增
     * @param goodsHotInfo
     * @return
     */
    @PostMapping("addGoodsHot")
    public AppResponse addGoodsHot(GoodsHotInfo goodsHotInfo){
        try{
            return goodsHotService.addGoodsHot(goodsHotInfo);
        }catch(Exception e){
            logger.error("新增失败",e);
            System.out.printf(e.toString());
            throw e;
        }
    }

    /**
     * 查询热门商品详情
     * @param goodsHotId
     * @return
     */
    @PostMapping("findGoodsHotById")
    public AppResponse findGoodsHotById(String goodsHotId){
        try{
            return goodsHotService.findGoodsHotById(goodsHotId);
        }catch(Exception e){
            logger.error("查询详情失败",e);
            System.out.printf(e.toString());
            throw e;
        }
    }

    /**
     * 修改热门商品
     * @param goodsHotInfo
     * @return
     */
    @PostMapping("updateGoodsHotById")
    public AppResponse updateGoodsHotById(GoodsHotInfo goodsHotInfo){
        try{
            return goodsHotService.updateGoodsHotById(goodsHotInfo);
        }catch(Exception e){
            logger.error("商品修改失败",e);
            System.out.printf(e.toString());
            throw e;
        }
    }

    /**
     * 热门商品删除
     * @param goodsHotId
     * @return
     */
    @PostMapping("deleteGoodsHot")
    public AppResponse deleteGoodsHot(String goodsHotId){
        try{
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            return goodsHotService.deleteGoodsHot(goodsHotId,userId);
        }catch(Exception e){
            logger.error("商品删除失败",e);
            System.out.printf(e.toString());
            throw e;
        }
    }

    /**
     * 查询热门商品列表
     * @param goodsHotListVo
     * @return
     */
    @PostMapping("listGoodsHot")
    public AppResponse listGoodsHot(GoodsHotListVo goodsHotListVo){
        try{
            return goodsHotService.listGoodsHot(goodsHotListVo);
        }catch(Exception e){
            logger.error("商品列表查询失败",e);
            System.out.printf(e.toString());
            throw e;
        }
    }

    /**
     * 热门商品展示数量设置
     * @param number
     * @return
     */
    @PostMapping("setGoodsHot")
    public AppResponse setGoodsHot (String number){
        try{
            return goodsHotService.setGoodsHot(number);
        }catch(Exception e){
            logger.error("商品展示数量失败",e);
            System.out.printf(e.toString());
            throw e;
        }
    }

}
