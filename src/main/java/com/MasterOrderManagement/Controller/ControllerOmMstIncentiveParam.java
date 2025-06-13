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

import com.MasterOrderManagement.Models.OmMstIncentiveParam;
import com.MasterOrderManagement.Services.ServiceOmMstIncentiveParam;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstIncentiveParam {
	@Autowired
	ServiceOmMstIncentiveParam servOMIP;
	
	@GetMapping("/MasterOrderManagement/getOmipAll")
	public List<OmMstIncentiveParam> getOmipAll(){
		return servOMIP.getOmipAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmipByParamCodeCU")
	public Optional<OmMstIncentiveParam> getOmipByParamCodeCU(String paramcode){
		return servOMIP.getOmipByParamCodeCU(paramcode);
	}
}
