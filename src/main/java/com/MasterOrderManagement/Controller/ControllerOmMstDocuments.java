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

import com.MasterOrderManagement.Models.OmMstDocuments;
import com.MasterOrderManagement.Services.ServiceOmMstDocuments;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstDocuments {
	@Autowired
	ServiceOmMstDocuments servOMD;
	
	@GetMapping("/MasterOrderManagement/getOmdAll")
	public List<OmMstDocuments> getOmdAll(){
		return servOMD.getOmdAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmdByDocCodeCU")
	public Optional<OmMstDocuments> getOmdByDocCodeCU(String doccode){
		return servOMD.getOmdByDocCodeCU(doccode);
	}
}
