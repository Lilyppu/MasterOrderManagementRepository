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

import com.MasterOrderManagement.Models.OmMstObjAdmin;
import com.MasterOrderManagement.Services.ServiceOmMstObjAdmin;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstObjAdmin {
	@Autowired
	ServiceOmMstObjAdmin servOMOA;
	
	@GetMapping("/MasterOrderManagement/getOmoaAll")
	public List<OmMstObjAdmin> getOmoaAll(){
		return servOMOA.getOmoaAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmoaByFeeIdCU")
	public Optional<OmMstObjAdmin> getOmoaByFeeIdCU(String feeid){
		return servOMOA.getOmoaByFeeIdCU(feeid);
	}
}
