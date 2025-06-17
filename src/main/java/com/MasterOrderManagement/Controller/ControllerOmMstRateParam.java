package com.MasterOrderManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MasterOrderManagement.Models.OmMstRateParam;
import com.MasterOrderManagement.Services.ServiceOmMstRateParam;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstRateParam {
	@Autowired
	ServiceOmMstRateParam servOMRP;
	
	@GetMapping("/MasterOrderManagement/getOmrpAll")
	public List<OmMstRateParam> getOmrpAll(){
		return servOMRP.getOmrpAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmrpByBussUnitList")
	public List<OmMstRateParam> getOmrpByBussUnitList(String bussunit){
		return servOMRP.getOmrpByBussUnitList(bussunit);
	}
}
