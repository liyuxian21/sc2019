package com.xzsd.pc.user.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.user.entity.UserInfo;
import com.xzsd.pc.user.entity.UserList;
import com.xzsd.pc.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 增删改查用户
 *
 * @author liyuxian
 * @time 2020-03-25
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    /**
     * 查询顶部栏登录用户详情接口
     * @return
     */
    @PostMapping("loginDetails")
    public AppResponse loginDetails() {
        try {
            AppResponse appResponse = userService.loginDetails(SecurityUtils.getCurrentUserId());
            return appResponse;
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 新增用户
     *
     * @author liyuxian
     * @time 2020-03-25
     */
    @PostMapping("addUser")
    public AppResponse addUser(UserInfo userInfo) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            userInfo.setCreatePeople(userId);
            AppResponse appResponse = userService.addUser(userInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("用户新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改用户
     *
     * @author liyuxian
     * @time 2020-03-25
     */
    @PostMapping("updateUserById")
    public AppResponse updateUserById(UserInfo userInfo) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            userInfo.setCreatePeople(userId);
            userInfo.setUpdatePeople(userId);
            AppResponse appResponse = userService.updateUserById(userInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("用户修改失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 删除用户
     *
     * @author liyuxian
     * @time 2020-03-25
     */
    @PostMapping("deleteUser")
    public AppResponse deleteUser(String userId) {
        try {
            //获取用户id
            String userId1 = SecurityUtils.getCurrentUserId();
            AppResponse appResponse = userService.deleteUser(userId, userId1);
            return appResponse;
        } catch (Exception e) {
            logger.error("用户删除失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询用户详情
     *
     * @author liyuxian
     * @time 2020-03-26
     */
    @PostMapping("findUserById")
    public AppResponse findUserById(String userId) {
        try {
            return userService.findUserById(userId);
        } catch (Exception e) {
            logger.error("查询用户失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询用户列表（分页）
     *
     * @author liyuxian
     * @time 2020-03-26
     */
    @PostMapping("listUser")
    public AppResponse listGoods(UserList userList) {
        try {
            return userService.listUser(userList);
        } catch (Exception e) {
            logger.error("查询用户列表错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
