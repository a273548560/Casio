package com.accp.mapper;

import com.accp.domain.Repair;
import com.accp.domain.RepairExample;
import com.accp.domain.Working;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairMapper {
	
	List<Working> queryWorkingCar(String carNumber,String phone,String clname,String column);
	
    int countByExample(RepairExample example);

    int deleteByExample(RepairExample example);

    int deleteByPrimaryKey(String number);

    int insert(Repair record);

    int insertSelective(Repair record);

    List<Repair> selectByExample(RepairExample example);

    Repair selectByPrimaryKey(String number);

    int updateByExampleSelective(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByExample(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);
}