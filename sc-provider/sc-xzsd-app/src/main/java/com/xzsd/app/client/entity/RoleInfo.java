package com.xzsd.app.client.entity;

/**
 * 登录用角色实体类
 *
 * @author liyuxian
 * @time 2020-04-20
 */
public class RoleInfo {
    /**
     * 登录用户id
     */
    private String userId;
    /**
     * 登录用户角色
     */
    private int role;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
