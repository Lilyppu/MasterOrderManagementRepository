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

import com.MasterOrderManagement.Models.OmMstCollIssueType;
import com.MasterOrderManagement.Services.ServiceOmMstCollIssueType;

@RestController
public class ControllerOmMstCollIssueType {
	@Autowired
	ServiceOmMstCollIssueType servOMCIT;
	
	@GetMapping("/MasterOrderManagement/getOmcitAll")
	public List<OmMstCollIssueType> getOmcitAll(){
		return servOMCIT.getOmcitAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmcitByIssueTypeCU")
	public Optional<OmMstCollIssueType> getOmcitByIssueTypeCU(String issuetype){
		return servOMCIT.getOmcitByIssueTypeCU(issuetype);
	}
}
