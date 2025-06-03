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

import com.MasterOrderManagement.Models.OmMstDeviasiDetail;
import com.MasterOrderManagement.Services.ServiceOmMstDeviasiDetail;

@RestController
public class ControllerOmMstDeviasiDetail {
	@Autowired
	ServiceOmMstDeviasiDetail servOMDD;
	
	@GetMapping("/MasterOrderManagement/getOmddAll")
	public List<OmMstDeviasiDetail> getOmddAll(){
		return servOMDD.getOmddAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmddByNumCU")
	public Optional<OmMstDeviasiDetail> getOmddByNumCU(Integer num){
		return servOMDD.getOmddByNumCU(num);
	}
}
