package com.xzsd.pc.menu.controller;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.menu.entity.MenuInfo;
import com.xzsd.pc.menu.entity.MenuListVo;
import com.xzsd.pc.menu.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 菜单CIRD
 * @author liyuxian
 * @time 2020-04-08
 */
@RestController
@RequestMapping("menu")
public class MenuController {
    private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
    @Resource
    private MenuService menuService;

    /**
     * 新增菜单
     * @param menuInfo
     * @return
     */
    @PostMapping("addMenu")
    public AppResponse addMenu(MenuInfo menuInfo) {
        try {
            AppResponse appResponse = menuService.addMenu(menuInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 获取菜单详情
     * @param menuId
     * @return
     */
    @PostMapping("findMenuById")
    public AppResponse findMenuById(String menuId) {
        try {
            AppResponse appResponse = menuService.findMenuById(menuId);
            return appResponse;
        } catch (Exception e) {
            logger.error("获取失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改菜单
     * @param menuInfo
     * @return
     */
    @PostMapping("updateMenuById")
    public AppResponse updateMenuById(MenuInfo menuInfo){
        //获取用户id
        String userId = SecurityUtils.getCurrentUserId();
        menuInfo.setUpdatePeople(userId);
        try {
            return menuService.updateMenuById(menuInfo);
        } catch (Exception e) {
            logger.error("修改失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询菜单列表
     * @param menuListVo
     * @return
     */
    @PostMapping("listMenu")
    public AppResponse listMenu(MenuListVo menuListVo){
        try {
            return menuService.listMenu(menuListVo);
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 删除菜单
     * @param menuId
     * @return
     */
    @PostMapping("deleteMenu")
    public AppResponse deleteMenu(String menuId){
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            return menuService.deleteMenu(menuId,userId);
        } catch (Exception e) {
            logger.error("删除失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
