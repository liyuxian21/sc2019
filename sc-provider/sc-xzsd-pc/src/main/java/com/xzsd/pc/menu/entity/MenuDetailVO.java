package com.xzsd.pc.menu.entity;

/**
 * 菜单详情实体类
 *
 * @author liyuxian
 * @time 2020-04-08
 */
public class MenuDetailVO {
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 菜单路径
     */
    private String menuRouter;
    /**
     * 菜单备注
     */
    private String menuComment;
    /**
     * 版本号
     */
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuRouter() {
        return menuRouter;
    }

    public void setMenuRouter(String menuRouter) {
        this.menuRouter = menuRouter;
    }

    public String getMenuComment() {
        return menuComment;
    }

    public void setMenuComment(String menuComment) {
        this.menuComment = menuComment;
    }

}
