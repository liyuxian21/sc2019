package com.xzsd.pc.goods.entity;

/**
 * 商品一二级分类实体类
 *
 * @author liyuxian
 * @time 2020-03-29
 */
public class GoodsClass {
    /**
     * 商品分类id
     */
    private String classId;
    /**
     * 商品分类名称
     */
    private String className;
    /**
     * 上级分类编码
     */
    private String parentClassCode;

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

    public String getParentClassCode() {
        return parentClassCode;
    }

    public void setParentClassCode(String parentClassCode) {
        this.parentClassCode = parentClassCode;
    }
}
