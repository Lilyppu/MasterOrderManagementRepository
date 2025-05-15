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

import com.MasterOrderManagement.Models.OmMstApprovalBuss;
import com.MasterOrderManagement.Services.ServiceOmMstApprovalBuss;

@RestController
public class ControllerOmMstApprovalBuss {
	@Autowired
	ServiceOmMstApprovalBuss servOMAB;
	
	@GetMapping("/MasterOrderManagement/getOmabAll")
	public List<OmMstApprovalBuss> getOmabAll(){
		return servOMAB.getOmabAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmabByBussUnitCU")
	public Optional<OmMstApprovalBuss> getOmabByBussUnitCU(String bussunit){
		return servOMAB.getOmabByBussUnitCU(bussunit);
	}
}
