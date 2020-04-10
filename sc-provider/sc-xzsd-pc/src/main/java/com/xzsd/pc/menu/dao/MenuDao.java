package com.xzsd.pc.menu.dao;

import com.xzsd.pc.menu.entity.MenuDetailVO;
import com.xzsd.pc.menu.entity.MenuInfo;
import com.xzsd.pc.menu.entity.MenuListVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuDao {
    /**
     * 新增菜单
     * @param menuInfo
     * @return
     */
    int addMenu(MenuInfo menuInfo);

    /**
     * 统计菜单名称
     * @param menuInfo
     * @return
     */
    int countMenuName(MenuInfo menuInfo);

    /**
     * 获取菜单详情
     * @param menuId
     * @return
     */
    MenuDetailVO findMenuById(String menuId);

    /**
     * 修改菜单
     * @param menuInfo
     * @return
     */
    int updateMenuById(MenuInfo menuInfo);

    /**
     * 查询菜单列表
     * @param menuListVo
     * @return
     */
    List<MenuListVo> listMenu(MenuListVo menuListVo);

    /**
     * 删除菜单
     * @param listId
     * @param userId
     * @return
     */
    int deleteMenu(@Param("listId") List<String> listId, @Param("userId") String userId);
}
