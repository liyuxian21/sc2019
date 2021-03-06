package com.xzsd.pc.slideshow.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.slideshow.dao.SlideshowDao;
import com.xzsd.pc.slideshow.entity.GoodsListVO;
import com.xzsd.pc.slideshow.entity.SlideshowInfo;
import com.xzsd.pc.slideshow.entity.SlideshowVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 轮播图CIRD
 * @author liyuxian
 * @time 2020-04-04
 */
@Service
public class SlideshowService {
    @Resource
    private SlideshowDao slideshowDao;

    /**
     * 新增轮播图
     *
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addSlideshow(SlideshowInfo slideshowInfo) {
        //统计商品id和序号
        int countProduct = slideshowDao.countProduct(slideshowInfo);
        int countSort = slideshowDao.countSort(slideshowInfo);
        if (0 != countProduct) {
            return AppResponse.versionError("新增商品已经存在，请重新输入！");
        } else if (0 != countSort) {
            return AppResponse.versionError("新增序号已经存在，请重新输入！");
        }
        slideshowInfo.setSlideshowId(StringUtil.getCommonCode(2));
        //新增轮播图
        int count = slideshowDao.addSlideshow(slideshowInfo);
        if (0 == count) {
            return AppResponse.versionError("新增失败，请重试");
        }
        return AppResponse.success("新增成功");
    }

    /**
     * 轮播图启用、禁用修改 0禁用 1启用
     *
     * @param slideshowId 轮播图id
     * @param slideshowStatus 轮播图状态 0禁用 1启用
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse enableDisable(String slideshowId, String slideshowStatus) {
        //以逗号分隔开，批量选择
        List<String> listId = Arrays.asList(slideshowId.split(","));
        AppResponse appResponse = AppResponse.success("修改成功！");
        //修改状态
        int count = slideshowDao.enableDisable(listId, slideshowId, slideshowStatus);
        if (0 == count) {
            return AppResponse.versionError("修改失败，请重试");
        }
        return appResponse;
    }

    /**
     * 查询轮播图列表
     *
     * @param slideshowVO
     * @return
     */
    public AppResponse listSlideshow(SlideshowVO slideshowVO) {
        PageHelper.startPage(slideshowVO.getPageNum(), slideshowVO.getPageSize());
        List<SlideshowVO> slideshowVOList = slideshowDao.listSlideshowByPage(slideshowVO);
        PageInfo<SlideshowVO> pageData = new PageInfo<>(slideshowVOList);
        return AppResponse.success("查询成功！", pageData);
    }

    /**
     * 删除轮播图
     *
     * @param slideshowId 轮播图id
     * @param userId 更新人
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteSlideshow(String slideshowId, String userId) {
        //将轮播图id以逗号分隔开
        List<String> listId = Arrays.asList(slideshowId.split(","));
        AppResponse appResponse = AppResponse.success("删除成功！");
        //删除轮播图
        int count = slideshowDao.deleteSlideshow(listId, userId);
        if (0 == count) {
            return AppResponse.versionError("删除失败，请重试！");
        }
        return appResponse;
    }

    /**
     * 查询商品
     *
     * @param goodsListVO
     * @return
     */
    public AppResponse listSlideshowGoods(GoodsListVO goodsListVO) {
        PageHelper.startPage(goodsListVO.getPageNum(), goodsListVO.getPageSize());
        List<SlideshowVO> goodsListVoList = slideshowDao.goodsListVOyPage(goodsListVO);
        PageInfo<SlideshowVO> pageData = new PageInfo<>(goodsListVoList);
        return AppResponse.success("查询成功！", pageData);
    }
}
