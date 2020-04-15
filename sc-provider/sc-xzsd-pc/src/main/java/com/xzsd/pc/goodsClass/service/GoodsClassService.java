package com.xzsd.pc.goodsClass.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.goodsClass.dao.GoodsClassDao;
import com.xzsd.pc.goodsClass.entity.GoodsClassDetail;
import com.xzsd.pc.goodsClass.entity.GoodsClassInfo;
import com.xzsd.pc.goodsClass.entity.GoodsClassList;
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
public class GoodsClassService {
    @Resource
    private GoodsClassDao goodsClassDao;

    /**
     * 新增商品
     *
     * @Author liyuxian
     * @Date 2020-03-26
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addGoodsClass(GoodsClassInfo goodsClassInfo, String parentClassCode) {

//        统计分类名称
        int countClassName = goodsClassDao.countClassName(goodsClassInfo);
        if (0 != countClassName) {
            return AppResponse.success("商品分类名称已存在，请重新输入！");
        }

//判断父类编码是否存在，存在isParent设置为1，代表二级分类；若不存在设置为0，代表一级分类
        if (parentClassCode == null) {
            goodsClassInfo.setIsParent("0");
        } else {
            goodsClassInfo.setIsParent("1");
        }

//       给商品分类id设置随机数
        goodsClassInfo.setClassId(StringUtil.getCommonCode(2));
        // 新增商品分类
        int count = goodsClassDao.addGoodsClass(goodsClassInfo);
        if (0 == count) {
            return AppResponse.versionError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！");
    }

    /**
     * 查询商品分类详情
     *
     * @param classId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse findGoodsClassById(String classId) {
//        查询商品
        GoodsClassDetail goodsClassDetail = goodsClassDao.findGoodsClassById(classId);
        return AppResponse.success("查询成功", goodsClassDetail);

    }

    /**
     * 修改商品分类
     *
     * @param goodsClassInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGoodsClassById(GoodsClassInfo goodsClassInfo) {
//              统计分类名称
        int countClassName = goodsClassDao.countClassName(goodsClassInfo);
        if (0 != countClassName) {
            return AppResponse.success("商品分类名称已存在，请重新输入！");
        }
//        修改商品分类
        int count = goodsClassDao.updateGoodsClassById(goodsClassInfo);
        if (0 == count) {
            return AppResponse.versionError("数据有变化，请刷新");
        }
        return AppResponse.success("商品分类修改成功！");
    }

    /**
     * 查询商品分类
     * @param goodsClassList
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse selectAllMenus(GoodsClassList goodsClassList){
        List<GoodsClassList> goodsClassListList=goodsClassDao.selectAllMenus(goodsClassList);
        return AppResponse.success("查询成功",goodsClassListList);
    }
    /**
     * 删除商品分类
     *
     * @param classId
     * @param userId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGoodsClass(String classId, String userId) {
        List<String> listId = Arrays.asList(classId.split(","));
//        删除商品
        int count = goodsClassDao.deleteGoodsClass(listId, userId);
        if (0 == count) {
            return AppResponse.versionError("删除失败，请重试！");
        }
        return AppResponse.success("删除成功！");


    }


}
