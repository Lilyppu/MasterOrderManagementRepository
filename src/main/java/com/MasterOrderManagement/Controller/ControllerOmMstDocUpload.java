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

import com.MasterOrderManagement.Models.OmMstDocUpload;
import com.MasterOrderManagement.Services.ServiceOmMstDocUpload;

@RestController
public class ControllerOmMstDocUpload {
	@Autowired
	ServiceOmMstDocUpload servOMDU;
	
	@GetMapping("/MasterOrderManagement/getOmduAll")
	public List<OmMstDocUpload> getOmduAll(){
		return servOMDU.getOmduAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmduByDocCodeList")
	public List<OmMstDocUpload> getOmduByDocCodeList(String doccode){
		return servOMDU.getOmduByDocCodeList(doccode);
	}
}
