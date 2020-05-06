package com.xzsd.pc.goods.entity;

/**
 * 商品详情实体类
 *
 * @author liyuxian
 * @time 2020-03-29
 */
public class GoodsDetail {
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 一级分类名称
     */
    private String classFirstName;
    /**
     * 一级分类名称
     */
    private String classFirstId;
    /**
     * 二级分类名称
     */
    private String classSecondId;
    /**
     * 二级分类名称
     */
    private String classSecondName;
    /**
     * 书号
     */
    private String bookNumber;
    /**
     * 广告词
     */
    private String adWords;
    /**
     * 商品介绍
     */
    private String goodsIntroduction;
    /**
     * 作者
     */
    private String author;
    /**
     * 出版社
     */
    private String press;
    /**
     * 库存
     */
    private String store;
    /**
     * 成本价
     */
    private String costPrice;
    /**
     * 在售价
     */
    private String inPrice;
    /**
     * 商品图片路径
     */
    private String photoUrl;
    /**
     * 版本号
     */
    private String version;

    public String getClassFirstId() {
        return classFirstId;
    }

    public void setClassFirstId(String classFirstId) {
        this.classFirstId = classFirstId;
    }

    public String getClassSecondId() {
        return classSecondId;
    }

    public void setClassSecondId(String classSecondId) {
        this.classSecondId = classSecondId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getAdWords() {
        return adWords;
    }

    public void setAdWords(String adWords) {
        this.adWords = adWords;
    }

    public String getGoodsIntroduction() {
        return goodsIntroduction;
    }

    public void setGoodsIntroduction(String goodsIntroduction) {
        this.goodsIntroduction = goodsIntroduction;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getInPrice() {
        return inPrice;
    }

    public void setInPrice(String inPrice) {
        this.inPrice = inPrice;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getClassFirstName() {
        return classFirstName;
    }

    public void setClassFirstName(String classFirstName) {
        this.classFirstName = classFirstName;
    }

    public String getClassSecondName() {
        return classSecondName;
    }

    public void setClassSecondName(String classSecondName) {
        this.classSecondName = classSecondName;
    }


}
