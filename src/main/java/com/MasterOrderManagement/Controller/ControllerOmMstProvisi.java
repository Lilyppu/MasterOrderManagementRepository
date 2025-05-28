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

import com.MasterOrderManagement.Models.OmMstProvisi;
import com.MasterOrderManagement.Services.ServiceOmMstProvisi;

@RestController
public class ControllerOmMstProvisi {
	@Autowired
	ServiceOmMstProvisi servOMP;
	
	@GetMapping("/MasterOrderManagement/getOmpAll")
	public List<OmMstProvisi> getOmpAll(){
		return servOMP.getOmpAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmpByBussUnitList")
	public List<OmMstProvisi> getOmpByBussUnitList(String bussunit){
		return servOMP.getOmpByBussUnitList(bussunit);
	}
}
