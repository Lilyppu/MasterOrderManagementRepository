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

import com.MasterOrderManagement.Models.OmMstKoorSurveyor;
import com.MasterOrderManagement.Services.ServiceOmMstKoorSurveyor;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstKoorSurveyor {
	@Autowired
	ServiceOmMstKoorSurveyor servOMKS;
	
	@GetMapping("/MasterOrderManagement/getOmksAll")
	public List<OmMstKoorSurveyor> getOmksAll(){
		return servOMKS.getOmksAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmksByKoorSurvIdCU")
	public Optional<OmMstKoorSurveyor> getOmksByKoorSurvIdCU(String koorsurvid){
		return servOMKS.getOmksByKoorSurvIdCU(koorsurvid);
	}
}
