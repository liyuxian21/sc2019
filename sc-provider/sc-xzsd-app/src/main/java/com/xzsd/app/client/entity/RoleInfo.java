package com.xzsd.app.client.entity;

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
