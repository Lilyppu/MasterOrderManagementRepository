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

import com.MasterOrderManagement.Models.OmMstHierPerLvl;
import com.MasterOrderManagement.Services.ServiceOmMstHierPerLvl;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstHierPerLvl {
	@Autowired
	ServiceOmMstHierPerLvl servOMBA;
	
	@GetMapping("/MasterOrderManagement/getOmhplAll")
	public List<OmMstHierPerLvl> getOmhplAll(){
		return servOMBA.getOmhplAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmhplByOfficeCodeList")
	public List<OmMstHierPerLvl> getOmhplByOfficeCodeList(String officecode){
		return servOMBA.getOmhplByOfficeCodeList(officecode);
	}
}
