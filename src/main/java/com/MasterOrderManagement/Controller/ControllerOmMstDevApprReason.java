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

import com.MasterOrderManagement.Models.OmMstDevApprReason;
import com.MasterOrderManagement.Services.ServiceOmMstDevApprReason;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstDevApprReason {
	@Autowired
	ServiceOmMstDevApprReason servOMDAR;
	
	@GetMapping("/MasterOrderManagement/getOmdarAll")
	public List<OmMstDevApprReason> getOmdarAll(){
		return servOMDAR.getOmdarAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmdaByNumCU")
	public Optional<OmMstDevApprReason> getOmdaByNumCU(Integer num){
		return servOMDAR.getOmdaByNumCU(num);
	}
}
