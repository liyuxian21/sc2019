package com.xzsd.pc.goods.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.RandomUtil;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.goods.dao.GoodsDao;
import com.xzsd.pc.goods.entity.GoodsClass;
import com.xzsd.pc.goods.entity.GoodsDetail;
import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.goods.entity.GoodsList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 实现类
 *
 * @author liyuxian
 * @time 020-03-24
 */

@Service
public class GoodsService {

    @Resource
    private GoodsDao goodsDao;

    /**
     * 新增商品
     *
     * @param goodsInfo
     * @return
     * @Author liyuxian
     * @Date 2020-03-24
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addGoods(GoodsInfo goodsInfo) {
//        统计书号是否存在
        int countIsbn = goodsDao.countIsbn(goodsInfo);
        if (0 != countIsbn) {
            return AppResponse.success("书号已存在，请重新输入！");
        }
//       给商品编码和商品id设置随机数
        goodsInfo.setGoodsCode(StringUtil.getCommonCode(2));
        goodsInfo.setGoodsId(StringUtil.getCommonCode(2));
        goodsInfo.setSaleNum("0");
        // 新增商品
        int count = goodsDao.addGoods(goodsInfo);
        if (0 == count) {
            return AppResponse.versionError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！");
    }

    /**
     * 修改商品
     *
     * @param goodsInfo
     * @return
     * @auhtor liyuxian
     * @time 2020-03-25
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGoodsById(GoodsInfo goodsInfo) {
        //        统计书号是否存在
        int countIsbn = goodsDao.countIsbn(goodsInfo);
        if (0 != countIsbn) {
            return AppResponse.success("书号已存在，请重新输入！");
        }
        AppResponse appResponse = AppResponse.success("修改成功");
        // 商品修改
        int count = goodsDao.updateGoodsById(goodsInfo);
        if (0 == count) {
            return AppResponse.versionError("数据有变化，请刷新！");
        }
        return appResponse;
    }

    /**
     * 删除商品
     *
     * @param goodsId 商品id
     * @param userId  操作人id
     * @return
     * @auhtor liyuxian
     * @time 2020-03-25
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGoods(String goodsId, String userId) {
        List<String> listId = Arrays.asList(goodsId.split(","));
        //统计轮播图和热门商品图的商品id
        int countSlideshow = goodsDao.countSlideshow(listId);
        int countHot = goodsDao.countHot(listId);
        if (countSlideshow != 0) {
            return AppResponse.success("所删除商品存在轮播图或者热门商品图，不能删除！");
        } else if (countHot != 0) {
            return AppResponse.success("所删除商品存在轮播图或者热门商品图，不能删除！");
        }
        //删除商品
        int count = goodsDao.deleteGoods(listId, userId);
        if (0 == count) {
            return AppResponse.versionError("删除失败，请重试！");
        }
        return AppResponse.success("删除成功");
    }

    /**
     * 查询商品详情
     *
     * @param goodsId
     * @return
     * @auhtor liyuxian
     * @time 2020-03-25
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse findGoodsById(String goodsId) {
        //查询商品
        GoodsDetail goodsDetail = goodsDao.findGoodsById(goodsId);

        return AppResponse.success("查询成功", goodsDetail);
    }

    /**
     * 查询商品列表（分页）
     *
     * @author liyuxian
     * @time 020-03-24
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse listGoods(GoodsList goodsList) {
        PageHelper.startPage(goodsList.getPageNum(), goodsList.getPageSize());
        List<GoodsList> goodsListList = goodsDao.listGoodsByPage(goodsList);
        //包装对象
        PageInfo<GoodsList> pageData = new PageInfo<>(goodsListList);
        return AppResponse.success("查询成功", pageData);

    }

    /**
     * 设置商品 1上架、0下架
     *
     * @author liyuxian
     * @time 020-03-26
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse status(String goodsId, String userId, String goodsStatus) {
        List<String> listId1 = Arrays.asList(goodsId.split(","));
        AppResponse appResponse = AppResponse.success("修改成功");
        //修改商品状态
        int count = goodsDao.status(listId1, userId, goodsStatus);
        if (0 == count) {
            return AppResponse.versionError("修改失败，请重试！");
        }
        return appResponse;
    }

    /**
     * 商品一级分类查询
     *
     * @author liyuxian
     * @time 020-03-26
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse firstClassGoodsList(GoodsClass goodsClass) {
        List<GoodsClass> goodsClassList = goodsDao.firstClassGoodsList(goodsClass);
        return AppResponse.success("查询成功！", goodsClassList);
    }

    /**
     * 商品二级分类查询
     *
     * @author liyuxian
     * @time 020-03-26
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse secondClassGoodsList(GoodsClass goodsClass, String parentClassCode) {
//          判断是否有父类编码
        if (parentClassCode == null) {
            return AppResponse.notFound("查询为空");
        }
        List<GoodsClass> goodsClassList = goodsDao.secondClassGoodsList(goodsClass, parentClassCode);
        return AppResponse.success("查询成功！", goodsClassList);
    }
}

