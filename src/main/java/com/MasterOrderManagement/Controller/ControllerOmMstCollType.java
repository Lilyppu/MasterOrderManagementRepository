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

import com.MasterOrderManagement.Models.OmMstCollType;
import com.MasterOrderManagement.Services.ServiceOmMstCollType;

@RestController
public class ControllerOmMstCollType {
	@Autowired
	ServiceOmMstCollType servOMCT;
	
	@GetMapping("/MasterOrderManagement/getOmctAll")
	public List<OmMstCollType> getOmctAll(){
		return servOMCT.getOmctAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmctByCollTypeCU")
	public Optional<OmMstCollType> getOmctByCollTypeCU(Integer colltype){
		return servOMCT.getOmctByCollTypeCU(colltype);
	}
}
