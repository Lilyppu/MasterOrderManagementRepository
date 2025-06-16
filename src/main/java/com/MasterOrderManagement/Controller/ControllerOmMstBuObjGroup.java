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

import com.MasterOrderManagement.Models.OmMstBuObjGroup;
import com.MasterOrderManagement.Services.ServiceOmMstBuObjGroup;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstBuObjGroup {
	@Autowired
	ServiceOmMstBuObjGroup servOMBOG;
	
	@GetMapping("/MasterOrderManagement/getOmbogAll")
	public List<OmMstBuObjGroup> getOmbogAll(){
		return servOMBOG.getOmbogAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmbogBussUnitList")
	public List<OmMstBuObjGroup> getOmbogBussUnitList(String bussunit){
		return servOMBOG.getOmbogBussUnitList(bussunit);
	}
}
