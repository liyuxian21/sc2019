package com.xzsd.pc.goodsHot.dao;

import com.xzsd.pc.goodsHot.entity.GoodsHotDetailVO;
import com.xzsd.pc.goodsHot.entity.GoodsHotInfo;
import com.xzsd.pc.goodsHot.entity.GoodsHotListVo;
import com.xzsd.pc.goodsHot.entity.GoodsHotNumberVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsHotDao {
    /**
     * 统计商品id
     *
     * @param goodsHotInfo
     * @return
     */
    int countProduct(GoodsHotInfo goodsHotInfo);

    /**
     * 新增热门商品
     *
     * @param goodsHotInfo
     * @return
     */
    int addGoodsHot(GoodsHotInfo goodsHotInfo);

    /**
     * 查询热门商品详情
     *
     * @param goodsHotId
     * @return
     */
    GoodsHotDetailVO findGoodsHotById(String goodsHotId);

    /**
     * 修改热门商品
     *
     * @param goodsHotInfo
     * @return
     */
    int updateGoodsHotById(GoodsHotInfo goodsHotInfo);

    /**
     * 删除热门商品
     *
     * @param listId
     * @param userId
     * @return
     */
    int deleteGoodsHot(@Param("listId") List<String> listId, @Param("userId") String userId);

    /**
     * 查询热门商品列表
     *
     * @param goodsHotListVo
     * @return
     */
    List<GoodsHotListVo> listGoodsHot(GoodsHotListVo goodsHotListVo);

    /**
     * 展示商品数量设置
     *
     * @param number
     * @return
     */
    int setGoodsHot(String number);

    /**
     * 统计新增序号
     *
     * @param goodsHotInfo
     * @return
     */
    int countSort(GoodsHotInfo goodsHotInfo);

    /**
     * 查询热门商品展示数量
     * @return
     */
    GoodsHotNumberVO getGoodsHotNumber();
}
