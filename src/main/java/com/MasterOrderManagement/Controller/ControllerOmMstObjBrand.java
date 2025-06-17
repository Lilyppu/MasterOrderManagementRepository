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

import com.MasterOrderManagement.Models.OmMstObjBrand;
import com.MasterOrderManagement.Services.ServiceOmMstObjBrand;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstObjBrand {
	@Autowired
	ServiceOmMstObjBrand servOMOB;
	
	@GetMapping("/MasterOrderManagement/getOmobAll")
	public List<OmMstObjBrand> getOmobAll(){
		return servOMOB.getOmobAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmobByObjBrandCU")
	public Optional<OmMstObjBrand> getOmobByObjBrandCU(String objbrand){
		return servOMOB.getOmobByObjBrandCU(objbrand);
	}
}
