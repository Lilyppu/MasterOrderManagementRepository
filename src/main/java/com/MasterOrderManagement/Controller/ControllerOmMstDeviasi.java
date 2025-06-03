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

import com.MasterOrderManagement.Models.OmMstDeviasi;
import com.MasterOrderManagement.Services.ServiceOmMstDeviasi;

@RestController
public class ControllerOmMstDeviasi {
	@Autowired
	ServiceOmMstDeviasi servOMDE;
	
	@GetMapping("/MasterOrderManagement/getOmdeAll")
	public List<OmMstDeviasi> getOmdeAll(){
		return servOMDE.getOmdeAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmdeByNumCU")
	public Optional<OmMstDeviasi> getOmdeByNumCU(Integer num){
		return servOMDE.getOmdeByNumCU(num);
	}
}
