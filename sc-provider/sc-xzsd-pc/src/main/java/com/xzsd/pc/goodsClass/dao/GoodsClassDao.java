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
     * @return
     */
    List<GoodsClassList> selectAllMenus();
    /**
     * 统计删除分类下的二级分类
     * @param classId
     * @return
     */
    int countSecond(String classId);

    /**
     * 删除商品分类
     * @param goodsClassInfo
     * @return
     */
    int deleteGoodsClass(GoodsClassInfo goodsClassInfo);
}
