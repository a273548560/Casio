package com.accp.mapper;

import com.accp.domain.RoleJurisdiction;
import com.accp.domain.RoleJurisdictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleJurisdictionMapper {
    int countByExample(RoleJurisdictionExample example);

    int deleteByExample(RoleJurisdictionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleJurisdiction record);

    int insertSelective(RoleJurisdiction record);

    List<RoleJurisdiction> selectByExample(RoleJurisdictionExample example);

    RoleJurisdiction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleJurisdiction record, @Param("example") RoleJurisdictionExample example);

    int updateByExample(@Param("record") RoleJurisdiction record, @Param("example") RoleJurisdictionExample example);

    int updateByPrimaryKeySelective(RoleJurisdiction record);

    int updateByPrimaryKey(RoleJurisdiction record);
}