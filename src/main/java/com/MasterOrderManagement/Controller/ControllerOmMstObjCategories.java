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

import com.MasterOrderManagement.Models.OmMstObjCategories;
import com.MasterOrderManagement.Services.ServiceOmMstObjCategories;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstObjCategories {
	@Autowired
	ServiceOmMstObjCategories servOMOCS;
	
	@GetMapping("/MasterOrderManagement/getOmocsAll")
	public List<OmMstObjCategories> getOmocsAll(){
		return servOMOCS.getOmocsAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmocsByObjCategoryCU")
	public Optional<OmMstObjCategories> getOmocsByObjCategoryCU(String objcategory){
		return servOMOCS.getOmocsByObjCategoryCU(objcategory);
	}
}
