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
import org.springframework.web.bind.annotation.CrossOrigin;

import com.MasterOrderManagement.Models.OmMstAddMinDp;
import com.MasterOrderManagement.Services.ServiceOmMstAddMinDp;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstAddMinDp {
	@Autowired
	ServiceOmMstAddMinDp servOMAMD;
	
	@GetMapping("/MasterOrderManagement/getOmamdAll")
	public List<OmMstAddMinDp> getOmamdAll(){
		return servOMAMD.getOmamdAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmamdByBussUnitList")
	public List<OmMstAddMinDp> getOmamdByBussUnitList(String bussunit){
		return servOMAMD.getOmamdByBussUnitList(bussunit);
	}
}
