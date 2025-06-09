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

import com.MasterOrderManagement.Models.OmMstHouseCategory;
import com.MasterOrderManagement.Services.ServiceOmMstHouseCategory;

@RestController
public class ControllerOmMstHouseCategory {
	@Autowired
	ServiceOmMstHouseCategory servOMHCA;
	
	@GetMapping("/MasterOrderManagement/getOmhcaAll")
	public List<OmMstHouseCategory> getOmhcaAll(){
		return servOMHCA.getOmhcaAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmhcaByHouseCateIdCU")
	public Optional<OmMstHouseCategory> getOmhcaByHouseCateIdCU(String housecateid){
		return servOMHCA.getOmhcaByHouseCateIdCU(housecateid);
	}
}
