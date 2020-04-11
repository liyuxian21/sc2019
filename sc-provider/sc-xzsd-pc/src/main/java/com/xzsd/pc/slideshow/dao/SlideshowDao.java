package com.xzsd.pc.slideshow.dao;

import com.xzsd.pc.slideshow.entity.GoodsListVO;
import com.xzsd.pc.slideshow.entity.SlideshowInfo;
import com.xzsd.pc.slideshow.entity.SlideshowVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SlideshowDao {
    /**
     * 新增轮播图
     * @param slideshowInfo
     * @return
     */
    int addSlideshow(SlideshowInfo slideshowInfo);

    /**
     * 统计商品id数量
     * @param slideshowInfo
     * @return
     */
    int countProduct(SlideshowInfo slideshowInfo);

    /**
     * 修改轮播图状态
     * @param listId
     * @param slideshowId
     * @param slideshowStatus
     * @return
     */
    int enableDisable(@Param("listId") List<String> listId, @Param("slideshowId") String slideshowId, @Param("slideshowStatus") String slideshowStatus);

    /**
     * 查询轮播图列表
     * @param slideshowVO
     * @return
     */
    List<SlideshowVO> listSlideshowByPage(SlideshowVO slideshowVO);

    /**
     * 删除轮播图
     * @param listId
     * @param userId
     * @return
     */
    int deleteSlideshow(@Param("listId") List<String> listId, @Param("userId") String userId);

    /**
     * 查询商品
     * @param goodsListVO
     * @return
     */
    List<SlideshowVO> goodsListVOyPage(GoodsListVO goodsListVO);

    /**
     * 统计新增序号
     * @param slideshowInfo
     * @return
     */
    int countSort(SlideshowInfo slideshowInfo);
}
