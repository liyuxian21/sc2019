package com.xzsd.pc.goods.entity;

/**
 * 商品列表实体类
 *
 * @author liyuxian
 * @time 2020-03-29
 */
public class GoodsList {
    /**
     * 页码
     */
    private int pageSize;
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 成本价
     */
    private String costPrice;
    /**
     * 在售价
     */
    private String inPrice;
    /**
     * 商品状态 0 下架，1 在售，2 未发布
     */
    private String goodsStatus;
    /**
     * 广告词
     */
    private String adWords;
    /**
     * 库存
     */
    private String store;
    /**
     * 书号
     */
    private String bookNumber;
    /**
     * 销售数量
     */
    private String saleNumber;
    /**
     * 游览量
     */
    private String lookNumber;
    /**
     * 出版社
     */
    private String press;
    /**
     * 作者
     */
    private String author;
    /**
     * 一级分类名称
     */
    private String classFirstId;
    /**
     * 一级分类名称
     */
    private String classFirstName;
    /**
     * 二级分类名称
     */
    private String classSecondName;
    /**
     * 二级分类名称
     */
    private String classSecondId;
    /**
     * 商品上架时间
     */
    private String upTime;
    /**
     * 版本号
     */
    private String version;

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

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getAdWords() {
        return adWords;
    }

    public void setAdWords(String adWords) {
        this.adWords = adWords;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(String saleNumber) {
        this.saleNumber = saleNumber;
    }

    public String getLookNumber() {
        return lookNumber;
    }

    public void setLookNumber(String lookNumber) {
        this.lookNumber = lookNumber;
    }

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

    public String getUpTime() {
        return upTime;
    }

    public void setUpTime(String upTime) {
        this.upTime = upTime;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
