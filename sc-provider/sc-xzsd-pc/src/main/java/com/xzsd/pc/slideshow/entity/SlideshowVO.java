package com.xzsd.pc.slideshow.entity;

/**
 * 数据传输实体类
 * @author liyuxian
 * @time 2020-04-04
 */
public class SlideshowVO {
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
     * 有效期起
     */
    private String startTime;
    /**
     * 有效期止
     */
    private String endTime;
    /**
     * 轮播图状态
     */
    private String slideshowStatus;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSlideshowStatus() {
        return slideshowStatus;
    }

    public void setSlideshowStatus(String slideshowStatus) {
        this.slideshowStatus = slideshowStatus;
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
