package com.xzsd.pc.goodsClass.entity;

public class GoodsClassDetail {
    /**
     * 商品分类名称
     */
    private String className;
    /**
     * 备注
     */
    private String comment;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
