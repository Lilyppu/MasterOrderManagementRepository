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

import com.MasterOrderManagement.Models.OmMstObjCode;
import com.MasterOrderManagement.Services.ServiceOmMstObjCode;

@RestController
public class ControllerOmMstObjCode {
	@Autowired
	ServiceOmMstObjCode servOMOC;
	
	@GetMapping("/MasterOrderManagement/getOmocAll")
	public List<OmMstObjCode> getOmocAll(){
		return servOMOC.getOmocAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmocByObjCodeCU")
	public Optional<OmMstObjCode> getOmocByObjCodeCU(String objcode){
		return servOMOC.getOmocByObjCodeCU(objcode);
	}
}
