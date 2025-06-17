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

import com.MasterOrderManagement.Models.OmMstHierarchies;
import com.MasterOrderManagement.Services.ServiceOmMstHierarchies;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstHierarchies {
	@Autowired
	ServiceOmMstHierarchies servOMH;

	@GetMapping("/MasterOrderManagement/getOmhAll")
	public List<OmMstHierarchies> getOmhAll() {
		return servOMH.getOmhAll();
	}

	@GetMapping("/MasterOrderManagement/getOmhByOfficeCodeList")
	public List<OmMstHierarchies> getOmhByOfficeCodeList(String officecode) {
		return servOMH.getOmhByOfficeCodeList(officecode);
	}
}
