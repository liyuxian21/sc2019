package com.xzsd.app.shopping.entity;

/**
 * 查询购物车的实体类
 *
 * @author liyuxian
 * @time 2020-04-13
 */
public class ShoppingListVO {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 购物车编号
     */
    private String shoppingId;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品价格（在售价）
     */
    private String inPrice;
    /**
     * 商品图片路径
     */
    private String photoUrl;
    /**
     * 购买商品数量
     */
    private String goodsShoppingNumber;
    /**
     * 购买商品的总价
     */
    private String total;

    public String getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(String shoppingId) {
        this.shoppingId = shoppingId;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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

    public String getGoodsShoppingNumber() {
        return goodsShoppingNumber;
    }

    public void setGoodsShoppingNumber(String goodsShoppingNumber) {
        this.goodsShoppingNumber = goodsShoppingNumber;
    }
}
