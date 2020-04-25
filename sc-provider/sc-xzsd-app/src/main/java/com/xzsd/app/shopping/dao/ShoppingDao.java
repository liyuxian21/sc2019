package com.xzsd.app.shopping.dao;

import com.xzsd.app.shopping.entity.ShoppingInfo;
import com.xzsd.app.shopping.entity.ShoppingListVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoppingDao {
    /**
     * 新增购物车
     * @param shoppingInfo
     * @return
     */
    int addShopping(ShoppingInfo shoppingInfo);

    /**
     * 查询购物车列表
     * @param shoppingListVO
     * @return
     */
    List<ShoppingListVO> listShoppingByPage(ShoppingListVO shoppingListVO);

    /**
     * 设置购买数量
     * @param shoppingInfo
     * @return
     */
    int set(ShoppingInfo shoppingInfo);

    /**
     * 删除购物商品
     * @param listId
     * @param currentUserId
     * @return
     */
    int deleteShopping(@Param("listId") List<String> listId, @Param("currentUserId") String currentUserId);
}
