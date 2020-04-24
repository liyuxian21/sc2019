package com.xzsd.pc.store.dao;

import com.xzsd.pc.store.entity.ChinaVo;
import com.xzsd.pc.store.entity.StoreDetialVO;
import com.xzsd.pc.store.entity.StoreInfo;
import com.xzsd.pc.store.entity.StoreListVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StoreDao {
    /**
     * 新增门店
     * @param storeInfo
     * @return
     */
    int addStore(StoreInfo storeInfo);

    /**
     * 统计店长用户id
     * @param storeInfo
     * @return
     */
    int countUserId(StoreInfo storeInfo);

    /**
     * 统计门店联系电话
     * @param storeInfo
     * @return
     */
    int countPhone(StoreInfo storeInfo);

    /**
     * 省份下拉查询
     * @param chinaVo
     * @return
     */
    List<ChinaVo> provinceStoreList(ChinaVo chinaVo);

    /**
     * 城市下拉查询
     * @param chinaVo
     * @return
     */
    List<ChinaVo> cityStoreList(ChinaVo chinaVo,@Param("parentCode") String parentCode);

    /**
     * 区下拉查询
     * @param chinaVo
     * @return
     */
    List<ChinaVo> areaStoreList(ChinaVo chinaVo,@Param("parentCode")String parentCode);

    /**
     * 查询门店详情
     * @param storeId
     * @return
     */
    StoreDetialVO findStoreDetailsById(String storeId);
    /**
     * 修改门店
     * @param storeInfo
     * @return
     */
    int updateStoreById(StoreInfo storeInfo);

    /**
     * 统计电话
     * @param storeInfo
     * @return
     */
    int countPhone2(StoreInfo storeInfo);

    /**
     * 查询门店列表
     * @param storeListVO
     * @return
     */
    List<StoreListVO> listStore(StoreListVO storeListVO);

    /**
     * 删除门店
     * @param listId
     * @param userId
     * @return
     */
    int deleteStore(@Param("listId") List<String> listId, @Param("userId") String userId);


}
