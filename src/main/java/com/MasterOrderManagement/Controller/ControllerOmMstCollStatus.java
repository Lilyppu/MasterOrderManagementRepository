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

import com.MasterOrderManagement.Models.OmMstCollStatus;
import com.MasterOrderManagement.Services.ServiceOmMstCollStatus;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstCollStatus {
	@Autowired
	ServiceOmMstCollStatus servOMCS;
	
	@GetMapping("/MasterOrderManagement/getOmcsAll")
	public List<OmMstCollStatus> getOmcsAll(){
		return servOMCS.getOmcsAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmcsByBussUnitCU")
	public Optional<OmMstCollStatus> getOmcsByBussUnitCU(String bussunit){
		return servOMCS.getOmcsByBussUnitCU(bussunit);
	}
}
