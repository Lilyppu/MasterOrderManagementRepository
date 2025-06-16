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

import com.MasterOrderManagement.Models.OmMstApprovalMethod;
import com.MasterOrderManagement.Services.ServiceOmMstApprovalMethod;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstApprovalMethod {
	@Autowired
	ServiceOmMstApprovalMethod servOMBA;
	
	@GetMapping("/MasterOrderManagement/getOmamAll")
	public List<OmMstApprovalMethod> getOmamAll(){
		return servOMBA.getOmamAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmamByMethodIdCU")
	public Optional<OmMstApprovalMethod> getOmamByMethodIdCU(String methodid){
		return servOMBA.getOmamByMethodIdCU(methodid);
	}
}
