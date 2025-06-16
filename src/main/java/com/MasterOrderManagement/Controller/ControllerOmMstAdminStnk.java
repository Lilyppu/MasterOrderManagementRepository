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

import com.MasterOrderManagement.Models.OmMstAdminStnk;
import com.MasterOrderManagement.Services.ServiceOmMstAdminStnk;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstAdminStnk {
	@Autowired
	ServiceOmMstAdminStnk servOMAS;
	
	@GetMapping("/MasterOrderManagement/getOmasAll")
	public List<OmMstAdminStnk> getOmasAll(){
		return servOMAS.getOmasAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmasBySupplCodeCU")
	public Optional<OmMstAdminStnk> getOmasBySupplCodeCU(String supplcode){
		return servOMAS.getOmasBySupplCodeCU(supplcode);
	}
}
