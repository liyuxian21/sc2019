package com.xzsd.app.shopping.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.shopping.entity.ShoppingInfo;
import com.xzsd.app.shopping.entity.ShoppingListVO;
import com.xzsd.app.shopping.service.ShoppingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 购物车操作
 *
 * @author liyuxian
 * @time 2020-04-13
 */
@RestController
@RequestMapping("app")
public class ShoppingController {
    private static final Logger logger = LoggerFactory.getLogger(ShoppingController.class);
    @Resource
    private ShoppingService shoppingService;

    /**
     * 新增购物车
     *
     * @param shoppingInfo
     * @return
     */
    @PostMapping("addShopping")
    public AppResponse addShopping(ShoppingInfo shoppingInfo) {
        try {
            return shoppingService.addShopping(shoppingInfo);
        } catch (Exception e) {
            logger.error("新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询购物车列表
     *
     * @param shoppingListVO
     * @return
     */
    @PostMapping("listShopping")
    public AppResponse listShopping(ShoppingListVO shoppingListVO) {
        try {
            return shoppingService.listShopping(shoppingListVO);
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 购买商品数量设置
     *
     * @param shoppingInfo
     * @return
     */
    @PostMapping("setShoppingNumber")
    public AppResponse setShoppingNumber(ShoppingInfo shoppingInfo) {
        try {
            return shoppingService.setShoppingNumber(shoppingInfo);
        } catch (Exception e) {
            logger.error("设置失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 删除购物车里的商品
     *
     * @param goodsId
     * @param userId
     * @return
     */
    @PostMapping("deleteShopping")
    public AppResponse deleteShopping(String goodsId, String userId) {
        try {
            return shoppingService.deleteShopping(goodsId, userId);
        } catch (Exception e) {
            logger.error("删除失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
