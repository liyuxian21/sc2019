package com.xzsd.pc.menu.service;


import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.menu.dao.MenuDao;
import com.xzsd.pc.menu.entity.MenuDetailVO;
import com.xzsd.pc.menu.entity.MenuInfo;
import com.xzsd.pc.menu.entity.MenuListVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class MenuService {
    @Resource
    private MenuDao menuDao;

    /**
     * 新增菜单
     * @param menuInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addMenu(MenuInfo menuInfo){
//                统计菜单名称
        int countMenuName = menuDao.countMenuName(menuInfo);
        if (0 != countMenuName) {
            return AppResponse.success("菜单名称名称已存在，请重新输入！");
        }

//        给菜单id设置随机编码
        menuInfo.setMenuId(StringUtil.getCommonCode(2));
//        新增菜单
        int count=menuDao.addMenu(menuInfo);
        if (0 == count){
            return AppResponse.versionError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！");
    }

    /**
     * 获取菜单详情
     * @param menuId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse findMenuById(String menuId){
//    获取菜单详情
        MenuDetailVO menuDetailVO=menuDao.findMenuById(menuId);
        return AppResponse.success("查询成功",menuDetailVO);
    }

    /**
     * 修改菜单
     * @param menuInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateMenuById(MenuInfo menuInfo) {
//        修改菜单
        int count=menuDao.updateMenuById(menuInfo);
        if (0 == count){
            return AppResponse.versionError("数据有变化，请刷新！");
        }
        return AppResponse.success("修改成功");
    }

    /**
     * 查询菜单列表
     * @param menuListVo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse listMenu(MenuListVo menuListVo){
//        查询菜单列表
        List<MenuListVo> menuListVoList=menuDao.listMenu(menuListVo);
        return AppResponse.success("查询成功！",menuListVoList);
    }

    /**
     * 删除菜单
     * @param menuId
     * @param userId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteMenu(String menuId, String userId) {
//        以逗号分隔开
        List<String> listId= Arrays.asList(menuId.split(","));
//        删除菜单
        int count=menuDao.deleteMenu(listId,userId);
        if (0 == count){
            return AppResponse.versionError("删除失败！");
        }
        return AppResponse.success("删除成功！");
    }
}
