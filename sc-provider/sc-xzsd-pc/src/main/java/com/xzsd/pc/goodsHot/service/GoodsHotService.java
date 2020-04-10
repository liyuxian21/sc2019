package com.xzsd.pc.goodsHot.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.goodsHot.dao.GoodsHotDao;
import com.xzsd.pc.goodsHot.entity.GoodsHotDetailVO;
import com.xzsd.pc.goodsHot.entity.GoodsHotInfo;
import com.xzsd.pc.goodsHot.entity.GoodsHotListVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 热门商品CIUD，热门商品展示数量设置
 * @author liyuxian
 * @time 2020-04-05
 */
@Service
public class GoodsHotService {
    @Resource
    private GoodsHotDao goodsHotDao;

    /**
     * 新增热门商品
     * @param goodsHotInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addGoodsHot(GoodsHotInfo goodsHotInfo){
//        统计商品id
        int countProduct = goodsHotDao.countProduct(goodsHotInfo);
        if (0 != countProduct) {
            return AppResponse.bizError("新增商品已经存在，请重新选择！");
        }
//        给热门商品设置随机编码
        goodsHotInfo.setGoodsHotId(StringUtil.getCommonCode(2));
//        新增热门商品
        int count = goodsHotDao.addGoodsHot(goodsHotInfo);
        if (0 == count){
            return AppResponse.bizError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功");
    }

    /**
     * 查询热门商品详情
     * @param goodsHotId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse findGoodsHotById(String goodsHotId) {
//        查询热门商品
        GoodsHotDetailVO goodsHotDetailVO=goodsHotDao.findGoodsHotById(goodsHotId);
        return AppResponse.success("查询成功",goodsHotDetailVO);
    }

    /**
     * 修改热门商品
     * @param goodsHotInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGoodsHotById(GoodsHotInfo goodsHotInfo) {
//        修改商品
        int count = goodsHotDao.updateGoodsHotById(goodsHotInfo);
        if(0 == count){
            return AppResponse.versionError("数据有变化，请刷新！");
        }
        return AppResponse.success("修改成功！");

    }

    /**
     * 删除热门商品
     * @param goodsHotId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGoodsHot(String goodsHotId,String userId) {
        List<String> listId = Arrays.asList(goodsHotId.split(","));
        AppResponse appResponse = AppResponse.success("删除成功");
        //删除商品
        int count = goodsHotDao.deleteGoodsHot(listId, userId);
        if (0 == count) {
            return appResponse = AppResponse.bizError("删除失败，请重试！");
        }
        return appResponse;
    }

    /**
     * 查询商品列表
     * @param goodsHotListVo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse listGoodsHot(GoodsHotListVo goodsHotListVo) {
        PageHelper.startPage(goodsHotListVo.getPageNum(), goodsHotListVo.getPageSize());
        List<GoodsHotListVo> goodsHotList = goodsHotDao.listGoodsHot(goodsHotListVo);
        //包装对象
        PageInfo<GoodsHotListVo> pageData = new PageInfo<>( goodsHotList );
        return AppResponse.success("查询成功", pageData);
    }

    /**
     * 商品展示数量设置
     * @param number
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse setGoodsHot(String number) {
        //        修改商品展示数量
        int count = goodsHotDao.setGoodsHot(number);
        if(0 == count){
            return AppResponse.bizError("修改失败！");
        }
        return AppResponse.success("修改成功！");

    }
}
