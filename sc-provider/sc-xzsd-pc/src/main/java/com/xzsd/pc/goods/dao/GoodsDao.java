package com.xzsd.pc.goods.dao;

import com.xzsd.pc.goods.entity.GoodsClass;
import com.xzsd.pc.goods.entity.GoodsDetail;
import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.goods.entity.GoodsList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName GoodsDao
 * @Description goods
 * @Author liyuxian
 * @Date 2020-03-24
 */
@Mapper
public interface GoodsDao {
    /**
     * 新增商品
     *
     * @param goodsInfo 商品信息
     * @return
     */
    int addGoods(GoodsInfo goodsInfo);

    /**
     * 修改商品
     *
     * @param goodsInfo
     * @return
     */
    int updateGoodsById(GoodsInfo goodsInfo);

    /**
     * 删除商品
     *
     * @param userId
     * @return
     */
    int deleteGoods(@Param("listId") List<String> listId, @Param("userId") String userId);

    /**
     * 查询商品详情
     *
     * @param goodsId
     * @return
     */
    GoodsDetail findGoodsById(String goodsId);

    /**
     * 获取商品所有信息
     *
     * @param goodsList
     * @return
     */
    List<GoodsList> listGoodsByPage(GoodsList goodsList);

    /**
     * 商品状态修改 0下架 1 上架
     *
     * @param userId
     * @param goodsStatus
     * @return
     */
    int status(@Param("listId1") List<String> listId1, @Param("userId") String userId, @Param("goodsStatus") String goodsStatus);

    /**
     * 查询所有商品一级分类
     */
    List<GoodsClass> firstClassGoodsList();

    /**
     * 查询所有商品二级分类
     */
    List<GoodsClass> secondClassGoodsList(GoodsClass goodsClass, @Param("parentClassCode") String parentClassCode);

    /**
     * 统计isbn书号
     *
     * @param goodsInfo
     * @return
     */
    int countIsbn(GoodsInfo goodsInfo);

    /**
     * 统计轮播图id
     *
     * @param listId
     * @return
     */
    int countSlideshow(@Param("listId") List<String> listId);

    /**
     * 统计热门商品id
     *
     * @param listId
     * @return
     */
    int countHot(@Param("listId") List<String> listId);
}
