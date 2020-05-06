package com.xzsd.pc.goodsClass.entity;

import java.util.List;

/**
 * 商品列表实体类
 *
 * @author liyuxian
 * @time 2020-03-26
 */
public class GoodsClassList {
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
    /**
     * 商品分类列表子节点
     */
    private List<GoodsClassList> secondGoodsClassList;

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

    public List<GoodsClassList> getSecondGoodsClassList() {
        return secondGoodsClassList;
    }

    public void setSecondGoodsClassList(List<GoodsClassList> secondGoodsClassList) {
        this.secondGoodsClassList = secondGoodsClassList;
    }
}
