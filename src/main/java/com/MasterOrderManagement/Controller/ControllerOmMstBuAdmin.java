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

import com.MasterOrderManagement.Models.OmMstBuAdmin;
import com.MasterOrderManagement.Services.ServiceOmMstBuAdmin;

@RestController
public class ControllerOmMstBuAdmin {
	@Autowired
	ServiceOmMstBuAdmin servOMBA;
	
	@GetMapping("/MasterOrderManagement/getOmbaAll")
	public List<OmMstBuAdmin> getOmbaAll(){
		return servOMBA.getOmbaAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmbaByBussUnitCU")
	public Optional<OmMstBuAdmin> getOmbaByBussUnitCU(String bussunit){
		return servOMBA.getOmbaByBussUnitCU(bussunit);
	}
}
