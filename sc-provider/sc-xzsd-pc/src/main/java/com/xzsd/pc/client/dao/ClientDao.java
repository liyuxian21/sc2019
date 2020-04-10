package com.xzsd.pc.client.dao;

import com.xzsd.pc.client.entity.ClientInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientDao {
    /**
     * 查询客户列表
     * @param clientInfo
     * @return
     */
    List<ClientInfo> listClient(ClientInfo clientInfo);
}
