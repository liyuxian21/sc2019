package com.xzsd.app.shopping.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.app.shopping.dao.ShoppingDao;
import com.xzsd.app.shopping.entity.ShoppingInfo;
import com.xzsd.app.shopping.entity.ShoppingListVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * 购物车操作
 * @author liyuxian
 * @time 2020-04-13
 */
@Service
public class ShoppingService {
    @Resource
    private ShoppingDao shoppingDao;

    /**
     * 新增购物车
     * @param shoppingInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addShopping(ShoppingInfo shoppingInfo) {
//        给购物车id设置随机编号
        shoppingInfo.setShoppingId(StringUtil.getCommonCode(2));
//        新增购物车
        int count = shoppingDao.addShopping(shoppingInfo);
        if (0 == count){
            return AppResponse.versionError("新增失败！");
        }
        return AppResponse.success("新增成功！");
    }

    /**
     * 查询购物车列表
     * @param shoppingListVO
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse listShopping(ShoppingListVO shoppingListVO){
        List<ShoppingListVO> shoppingList = shoppingDao.listShoppingByPage(shoppingListVO);
        return AppResponse.success("查询成功",getPageInfo(shoppingList));
    }

    /**
     * 商品购买数量设置
     * @param shoppingInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse setShoppingNumber(ShoppingInfo shoppingInfo) {
//        设置购买数量
        int count = shoppingDao.set(shoppingInfo);
        if (0 == count){
            return AppResponse.versionError("设置失败！");
        }
        return AppResponse.success("设置成功！");
    }

    /**
     * 删除购物车商品
     * @param goodsId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteShopping(String goodsId,String userId) {
//        逗号分隔
        List<String> listId= Arrays.asList(goodsId.split(","));
//        删除购物车商品
        int count = shoppingDao.deleteShopping(listId,userId);
        if (0 == count){
            return AppResponse.versionError("设删除失败！");
        }
        return AppResponse.success("删除成功！");
    }

}
