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

import com.MasterOrderManagement.Models.OmMstObjGroup;
import com.MasterOrderManagement.Services.ServiceOmMstObjGroup;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstObjGroup {
	@Autowired
	ServiceOmMstObjGroup servOMOG;
	
	@GetMapping("/MasterOrderManagement/getOmogAll")
	public List<OmMstObjGroup> getOmogAll(){
		return servOMOG.getOmogAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmogByObjGrpCU")
	public Optional<OmMstObjGroup> getOmogByObjGrpCU(String objgrp){
		return servOMOG.getOmogByObjGrpCU(objgrp);
	}
}
