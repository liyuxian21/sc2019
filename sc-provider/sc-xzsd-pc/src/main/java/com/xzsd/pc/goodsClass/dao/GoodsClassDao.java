package com.xzsd.pc.goodsClass.dao;

import com.xzsd.pc.goodsClass.entity.GoodsClassDetail;
import com.xzsd.pc.goodsClass.entity.GoodsClassInfo;
import com.xzsd.pc.goodsClass.entity.GoodsClassList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName GoodsClassDao
 * @Author liyuxian
 * @Date 2020-03-24
 */
@Mapper
public interface GoodsClassDao {
    /**
     * 新增商品分类
     *
     * @return
     */
    int addGoodsClass(GoodsClassInfo goodsClassInfo);

    /**
     * 统计商品分类名称
     *
     * @param goodsClassInfo
     * @return
     */
    int countClassName(GoodsClassInfo goodsClassInfo);

    /**
     * 查询商品详情
     *
     * @param classId
     * @return
     */
    GoodsClassDetail findGoodsClassById(String classId);

    /**
     * 修改商品分类
     *
     * @param goodsClassInfo
     * @return
     */
    int updateGoodsClassById(GoodsClassInfo goodsClassInfo);

    /**
     * 查询商品列表
     * @param goodsClassList
     * @return
     */
    List<GoodsClassList> selectAllMenus(GoodsClassList goodsClassList);

    /**
     * 删除商品分类
     *
     * @param listId
     * @param userId
     * @return
     */
    int deleteGoodsClass(@Param("listId") List<String> listId, @Param("userId") String userId);

}
