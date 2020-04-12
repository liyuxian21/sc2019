package com.xzsd.app.client.entity;

/**
 * 商品一级分类实体类
 *
 * @author liyuxian
 * @time 2020-04-12
 */
public class GoodsFirstClassVO {
    /**
     * 商品分类id
     */
    private String classId;
    /**
     * 商品分类名称
     */
    private String className;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
