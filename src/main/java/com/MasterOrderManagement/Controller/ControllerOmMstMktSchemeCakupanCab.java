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
import org.springframework.web.bind.annotation.CrossOrigin;

import com.MasterOrderManagement.Models.OmMstMktSchemeCakupanCab;
import com.MasterOrderManagement.Services.ServiceOmMstMktSchemeCakupanCab;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstMktSchemeCakupanCab {
	@Autowired
	ServiceOmMstMktSchemeCakupanCab servOMMSCC;
	
	@GetMapping("/MasterOrderManagement/getOmmsccAll")
	public List<OmMstMktSchemeCakupanCab> getOmmsccAll(){
		return servOMMSCC.getOmmsccAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmmsccByBranchIdList")
	public List<OmMstMktSchemeCakupanCab> getOmmsccByBranchIdList(String branchid){
		return servOMMSCC.getOmmsccByBranchIdList(branchid);
	}
}
