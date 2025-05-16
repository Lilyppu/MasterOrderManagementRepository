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

import com.MasterOrderManagement.Models.OmMstSurveyor;
import com.MasterOrderManagement.Services.ServiceOmMstSurveyor;

@RestController
public class ControllerOmMstSurveyor {
	@Autowired
	ServiceOmMstSurveyor servOMSV;
	
	@GetMapping("/MasterOrderManagement/getOmsvAll")
	public List<OmMstSurveyor> getOmsvAll(){
		return servOMSV.getOmsvAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmsvBySurvIdtCU")
	public Optional<OmMstSurveyor> getOmsvBySurvIdtCU(String bussunit){
		return servOMSV.getOmsvBySurvIdtCU(bussunit);
	}
}
