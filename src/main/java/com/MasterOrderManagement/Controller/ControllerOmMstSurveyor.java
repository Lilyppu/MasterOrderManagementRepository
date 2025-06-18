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

import com.MasterOrderManagement.Models.OmMstSurveyor;
import com.MasterOrderManagement.Services.ServiceOmMstSurveyor;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstSurveyor {
	@Autowired
	ServiceOmMstSurveyor servOMSV;
	
	@GetMapping("/MasterOrderManagement/getOmsvyAll")
	public List<OmMstSurveyor> getOmsvyAll(){
		return servOMSV.getOmsvyAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmsvyBySurvIdCU")
	public Optional<OmMstSurveyor> getOmsvyBySurvIdCU(String survid){
		return servOMSV.getOmsvyBySurvIdCU(survid);
	}
}
