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

import com.MasterOrderManagement.Models.OmMstCollTypeFields;
import com.MasterOrderManagement.Services.ServiceOmMstCollTypeFields;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstCollTypeFields {
	@Autowired
	ServiceOmMstCollTypeFields servOMCTF;
	
	@GetMapping("/MasterOrderManagement/getOmctfAll")
	public List<OmMstCollTypeFields> getOmctfAll(){
		return servOMCTF.getOmctfAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmctfByCollTypeList")
	public List<OmMstCollTypeFields> getOmctfByCollTypeList(Integer colltype){
		return servOMCTF.getOmctfByCollTypeList(colltype);
	}
}
