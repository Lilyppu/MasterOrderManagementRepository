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

import com.MasterOrderManagement.Models.OmMstAdjustAdmin;
import com.MasterOrderManagement.Services.ServiceOmMstAdjustAdmin;

@RestController
public class ControllerOmMstAdjustAdmin {
	@Autowired
	ServiceOmMstAdjustAdmin servOMAA;
	
	@GetMapping("/MasterOrderManagement/getOmaaAll")
	public List<OmMstAdjustAdmin> getOmaaAll(){
		return servOMAA.getOmaaAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmaaByBranchIdCU")
	public Optional<OmMstAdjustAdmin> getOmaaByBranchIdCU(String branchid){
		return servOMAA.getOmaaByBranchIdCU(branchid);
	}
}
