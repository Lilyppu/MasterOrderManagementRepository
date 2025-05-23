package com.MasterOrderManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MasterOrderManagement.Models.OmMstObjPriceDtls;
import com.MasterOrderManagement.Services.ServiceOmMstObjPriceDtls;

@RestController
public class ControllerOmMstObjPriceDtls {
	@Autowired
	ServiceOmMstObjPriceDtls servOMOPD;
	
	@GetMapping("/MasterOrderManagement/getOmopdAll")
	public List<OmMstObjPriceDtls> getOmopdAll(){
		return servOMOPD.getOmopdAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmopdByObjCodeList")
	public List<OmMstObjPriceDtls> getOmopdByObjCodeList(String objcode){
		return servOMOPD.getOmopdByObjCodeList(objcode);
	}
}
