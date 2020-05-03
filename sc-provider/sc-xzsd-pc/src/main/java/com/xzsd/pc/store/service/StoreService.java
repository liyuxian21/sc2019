package com.xzsd.pc.store.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.RandomUtil;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.store.dao.StoreDao;
import com.xzsd.pc.store.entity.ChinaVo;
import com.xzsd.pc.store.entity.StoreDetialVO;
import com.xzsd.pc.store.entity.StoreInfo;
import com.xzsd.pc.store.entity.StoreListVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class StoreService {
    @Resource
    private StoreDao storeDao;

    /**
     * 新增门店
     *
     * @param storeInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addStore(StoreInfo storeInfo) {
        //统计店长用户id
        int countUserId = storeDao.countUserId(storeInfo);
        //统计门店电话
        int countPhone = storeDao.countPhone(storeInfo);
        if (0 != countUserId) {
            return AppResponse.versionError("新增店长用户已经存在，请重新选择！");
        } else if (0 != countPhone) {
            return AppResponse.versionError("新增联系电话已经存在，请重新选择！");
        }
        //给门店id和门店编号设置随机编号
        storeInfo.setStoreId(StringUtil.getCommonCode(2));
        storeInfo.setStoreCode(StringUtil.getCommonCode(2));
        //给门店邀请码设置6位随机数
        storeInfo.setInviteCode(RandomUtil.radmonkey(6));
        //新增门店
        int count = storeDao.addStore(storeInfo);
        if (0 == count) {
            return AppResponse.versionError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功");
    }

    /**
     * 省份下拉查询
     *
     * @return
     */
    public AppResponse provinceStoreList() {
        List<ChinaVo> chinaVoList = storeDao.provinceStoreList();
        return AppResponse.success("查询成功！", chinaVoList);
    }

    /**
     * 城市下拉查询
     *
     * @param chinaVo
     * @param parentCode 一级分类id
     * @return
     */
    public AppResponse cityStoreList(ChinaVo chinaVo, String parentCode) {
        if (parentCode == null) {
            return AppResponse.notFound("查询为空");
        }
        List<ChinaVo> chinaVoList = storeDao.cityStoreList(chinaVo, parentCode);
        return AppResponse.success("查询成功！", chinaVoList);
    }

    /**
     * 区下拉查询
     *
     * @param chinaVo
     * @param parentCode 一级分类id
     * @return
     */
    public AppResponse areaStoreList(ChinaVo chinaVo, String parentCode) {
        if (parentCode == null) {
            return AppResponse.notFound("查询为空");
        }
        List<ChinaVo> chinaVoList = storeDao.areaStoreList(chinaVo, parentCode);
        return AppResponse.success("查询成功！", chinaVoList);
    }

    /**
     * 查询门店详情
     *
     * @param storeId
     * @return
     */
    public AppResponse findStoreDetailsById(String storeId) {
        //查询门店详情
        StoreDetialVO storeDetialVO = storeDao.findStoreDetailsById(storeId);
        return AppResponse.success("查询成功", storeDetialVO);

    }

    /**
     * 修改门店
     *
     * @param storeInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateStoreById(StoreInfo storeInfo) {
        //统计门店电话
        int countPhone = storeDao.countPhone(storeInfo);
        if (0 != countPhone) {
            return AppResponse.versionError("修改电话已经存在，请重新选择！");
        }
        //修改门店
        int count = storeDao.updateStoreById(storeInfo);
        if (0 == count) {
            return AppResponse.versionError("数据有变化，请刷新！");
        }
        return AppResponse.success("修改成功");
    }

    /**
     * 查询门店列表
     *
     * @param storeListVO
     * @return
     */
    public AppResponse listStore(StoreListVO storeListVO) {
        PageHelper.startPage(storeListVO.getPageNum(), storeListVO.getPageSize());
        List<StoreListVO> storeListVOList = storeDao.listStore(storeListVO);
        //包装对象
        PageInfo<StoreListVO> pageData = new PageInfo<>(storeListVOList);
        return AppResponse.success("查询成功", pageData);
    }

    /**
     * 删除门店
     *
     * @param storeId 门店id
     * @param userId 更新人
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteStore(String storeId, String userId) {
        //以逗号分隔开
        List<String> listId = Arrays.asList(storeId.split(","));
        //删除门店
        int count = storeDao.deleteStore(listId, userId);
        if (0 == count) {
            return AppResponse.versionError("删除失败，请重试！");
        }
        return AppResponse.success("删除成功！");
    }
}
