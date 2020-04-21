package com.xzsd.app.clientorder.entity;
import java.io.Serializable;
/**
 * 订单评价信息实体类
 *
 * @author liyuxian
 * @time 2020-04-14
 */
public class AppraiseInfo implements Serializable {
    /**
     * 评价id
     */
    private String appraiseId;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 评价星级（1-5星级）
     */
    private String level;
    /**
     * 评价内容
     */
    private String appraiseComment;
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
}
