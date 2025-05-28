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

import com.MasterOrderManagement.Models.OmMstCollSublocDetail;
import com.MasterOrderManagement.Services.ServiceOmMstCollSublocDetail;

@RestController
public class ControllerOmMstCollSublocDetail {
	@Autowired
	ServiceOmMstCollSublocDetail servOMCSD;
	
	@GetMapping("/MasterOrderManagement/getOmcsdAll")
	public List<OmMstCollSublocDetail> getOmcsdAll(){
		return servOMCSD.getOmcsdAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmcsdByCollSublocDetailCU")
	public Optional<OmMstCollSublocDetail> getOmcsdByCollSublocDetailCU(String collsublocdetail){
		return servOMCSD.getOmcsdByCollSublocDetailCU(collsublocdetail);
	}
}
