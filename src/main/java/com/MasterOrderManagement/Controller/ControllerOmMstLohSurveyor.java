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

import com.MasterOrderManagement.Models.OmMstLohSurveyor;
import com.MasterOrderManagement.Services.ServiceOmMstLohSurveyor;

@RestController
public class ControllerOmMstLohSurveyor {
	@Autowired
	ServiceOmMstLohSurveyor servOMLS;
	
	@GetMapping("/MasterOrderManagement/getOmlsAll")
	public List<OmMstLohSurveyor> getOmlsAll(){
		return servOMLS.getOmlsAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmlsByLohIdCU")
	public Optional<OmMstLohSurveyor> getOmbaByBusgetOmlsByLohIdCUsUnitCU(String lohid){
		return servOMLS.getOmlsByLohIdCU(lohid);
	}
}
