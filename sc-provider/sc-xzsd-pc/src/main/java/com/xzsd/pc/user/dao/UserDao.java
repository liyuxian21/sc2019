package com.xzsd.pc.user.dao;

import com.xzsd.pc.user.entity.LoginUserVo;
import com.xzsd.pc.user.entity.UserDetail;
import com.xzsd.pc.user.entity.UserInfo;
import com.xzsd.pc.user.entity.UserList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * UserDAo
 *
 * @author liyuxian
 * @time 020-03-25
 */
@Mapper
public interface UserDao {
    /**
     * 统计用户账户
     *
     * @return
     */
    int countUserAccount(UserInfo userInfo);

    /**
     * 统计手机号
     *
     * @return
     */
    int countUserPhone(UserInfo userInfo);

    /**
     * 新增用户
     *
     * @return
     */
    int addUser(UserInfo userInfo);

    /**
     * 修改用户
     *
     * @return
     */
    int updateUserById(UserInfo userInfo);

    /**
     * 删除用户
     *
     * @return
     */
    int deleteUser(@Param("listId") List<String> listId, @Param("userId1") String userId1);

    /**
     * 查询用户详情
     *
     * @return
     */
    UserDetail findUserById(String userId);

    /**
     * 查询用户列表
     *
     * @return
     */
    List<UserList> listUserByPage(UserList userList);

    /**
     * 获取登录用户详情
     * @return
     */
    LoginUserVo loginDetails(String currentUserId);
}
