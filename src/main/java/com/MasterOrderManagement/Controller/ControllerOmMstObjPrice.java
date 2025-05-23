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

import com.MasterOrderManagement.Models.OmMstObjPrice;
import com.MasterOrderManagement.Services.ServiceOmMstObjPrice;

@RestController
public class ControllerOmMstObjPrice {
	@Autowired
	ServiceOmMstObjPrice servOMOP;
	
	@GetMapping("/MasterOrderManagement/getOmopAll")
	public List<OmMstObjPrice> getOmopAll(){
		return servOMOP.getOmopAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmopByObjCodeList")
	public List<OmMstObjPrice> getOmopByObjCodeList(String objcode){
		return servOMOP.getOmopByObjCodeList(objcode);
	}
}
