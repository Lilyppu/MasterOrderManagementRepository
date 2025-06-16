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

import com.MasterOrderManagement.Models.OmMstCollSubLocation;
import com.MasterOrderManagement.Services.ServiceOmMstCollSubLocation;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstCollSubLocation {
	@Autowired
	ServiceOmMstCollSubLocation servOMCSL;
	
	@GetMapping("/MasterOrderManagement/getOmcslAll")
	public List<OmMstCollSubLocation> getOmcslAll(){
		return servOMCSL.getOmcslAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmcslByCollSubLocationCU")
	public Optional<OmMstCollSubLocation> getOmcslByCollSubLocationCU(String collsublocation){
		return servOMCSL.getOmcslByCollSubLocationCU(collsublocation);
	}
}
