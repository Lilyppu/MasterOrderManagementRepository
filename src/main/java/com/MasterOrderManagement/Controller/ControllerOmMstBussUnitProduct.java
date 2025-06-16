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

import com.MasterOrderManagement.Models.OmMstBussUnitProduct;
import com.MasterOrderManagement.Services.ServiceOmMstBussUnitProduct;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstBussUnitProduct {
	@Autowired
	ServiceOmMstBussUnitProduct servOMBUP;
	
	@GetMapping("/MasterOrderManagement/getOmbupAll")
	public List<OmMstBussUnitProduct> getOmbupAll(){
		return servOMBUP.getOmbupAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmbupByBussUnitCU")
	public Optional<OmMstBussUnitProduct> getOmbupByBussUnitCU(String bussunit){
		return servOMBUP.getOmbupByBussUnitCU(bussunit);
	}
}
