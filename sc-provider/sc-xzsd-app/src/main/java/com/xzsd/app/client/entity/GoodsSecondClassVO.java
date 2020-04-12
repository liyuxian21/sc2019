package com.xzsd.app.client.entity;

import java.util.List;

/**
 * 商品二级分类实体类
 *
 * @author liyuxian
 * @time 2020-04-12
 */
public class GoodsSecondClassVO {
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
     * 分类下商品信息集合
     */
    private List<GoodsVO> goodsList;

    public String getParentClassCode() {
        return parentClassCode;
    }

    public void setParentClassCode(String parentClassCode) {
        this.parentClassCode = parentClassCode;
    }

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

    public List<GoodsVO> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsVO> goodsList) {
        this.goodsList = goodsList;
    }
}
