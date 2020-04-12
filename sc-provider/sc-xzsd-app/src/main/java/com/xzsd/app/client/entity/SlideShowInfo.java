package com.xzsd.app.client.entity;

/**
 * 查询轮播图实体类
 *
 * @author liyuxian
 * @time 2020-04-12
 */
public class SlideShowInfo {
    /**
     * 每页显示多少条
     */
    private int pageSize;
    /**
     * 当前页是第几页
     */
    private int pageNum;
    /**
     * 轮播图id
     */
    private String slideshowId;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 轮播图路径
     */
    private String slideshowUrl;

    public String getSlideshowId() {
        return slideshowId;
    }

    public void setSlideshowId(String slideshowId) {
        this.slideshowId = slideshowId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getSlideshowUrl() {
        return slideshowUrl;
    }

    public void setSlideshowUrl(String slideshowUrl) {
        this.slideshowUrl = slideshowUrl;
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
}
