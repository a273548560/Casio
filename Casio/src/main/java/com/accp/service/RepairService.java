package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Working;
import com.accp.mapper.RepairMapper;

@Service
@Transactional
public class RepairService {
	
	@Autowired
	RepairMapper repairMapper;
	
	public List<Working> queryWorkingCar(String carNumber,String phone,String clname,String column){
		return repairMapper.queryWorkingCar(carNumber, phone, clname, column);
	}
	
}
