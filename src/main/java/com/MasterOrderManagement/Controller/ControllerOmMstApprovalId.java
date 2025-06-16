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

import com.MasterOrderManagement.Models.OmMstApprovalId;
import com.MasterOrderManagement.Services.ServiceOmMstApprovalId;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstApprovalId {
	@Autowired
	ServiceOmMstApprovalId servOMAI;
	
	@GetMapping("/MasterOrderManagement/getOmaiAll")
	public List<OmMstApprovalId> getOmaiAll(){
		return servOMAI.getOmaiAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmaiByApprIdCU")
	public Optional<OmMstApprovalId> getOmaiByApprIdCU(String apprid){
		return servOMAI.getOmaiByApprIdCU(apprid);
	}
}
