package com.xzsd.app.clientorder.entity;
import java.io.Serializable;
import java.util.List;

/**
 * 订单评价实体类
 *
 * @author liyuxian
 * @time 2020-04-14
 */
public class OrderAppraise implements Serializable {
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 评价信息集合
     */
    private List<AppraiseInfo> appraiseInfoList;
    /**
     * 创建人
     */
    private String createPeople;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改者
     */
    private String updatePeople;
    /**
     * 修改时间
     */
    private String updateTime;
    /**
     * 版本号
     */
    private String version;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<AppraiseInfo> getAppraiseInfoList() {
        return appraiseInfoList;
    }

    public void setAppraiseInfoList(List<AppraiseInfo> appraiseInfoList) {
        this.appraiseInfoList = appraiseInfoList;
    }

    public String getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(String createPeople) {
        this.createPeople = createPeople;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdatePeople() {
        return updatePeople;
    }

    public void setUpdatePeople(String updatePeople) {
        this.updatePeople = updatePeople;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
