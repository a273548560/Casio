package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Working;
import com.accp.service.RepairService;

@RestController
public class RepairController {
	
	@Autowired
	RepairService repairService;

	@PostMapping("repair/queryWorkingCar")
	public List<Working> queryWorkingCar(String carNumber,String phone,String clname,String column){
		return repairService.queryWorkingCar(carNumber, phone, clname, column);
	}
	
}
