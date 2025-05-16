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

import com.MasterOrderManagement.Models.OmMstObjModel;
import com.MasterOrderManagement.Services.ServiceOmMstObjModel;

@RestController
public class ControllerOmMstObjModel {
	@Autowired
	ServiceOmMstObjModel servOMOM;
	
	@GetMapping("/MasterOrderManagement/getOmomAll")
	public List<OmMstObjModel> getOmomAll(){
		return servOMOM.getOmomAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmomByModelNoCU")
	public Optional<OmMstObjModel> getOmomByModelNoCU(String modelno){
		return servOMOM.getOmomByModelNoCU(modelno);
	}
}
