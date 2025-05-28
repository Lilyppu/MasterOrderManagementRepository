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

import com.MasterOrderManagement.Models.OmMstCategoryDealer;
import com.MasterOrderManagement.Services.ServiceOmMstCategoryDealer;

@RestController
public class ControllerOmMstCategoryDealer {
	@Autowired
	ServiceOmMstCategoryDealer servOMCD;
	
	@GetMapping("/MasterOrderManagement/getOmcdAll")
	public List<OmMstCategoryDealer> getOmcdAll(){
		return servOMCD.getOmcdAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmcdByCategoryCU")
	public Optional<OmMstCategoryDealer> getOmcdByCategoryCU(String category){
		return servOMCD.getOmcdByCategoryCU(category);
	}
}
