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

import com.MasterOrderManagement.Models.OmMstScoreValue;
import com.MasterOrderManagement.Services.ServiceOmMstScoreValue;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstScoreValue {
	@Autowired
	ServiceOmMstScoreValue servOMSV;
	
	@GetMapping("/MasterOrderManagement/getOmsvAll")
	public List<OmMstScoreValue> getOmsvAll(){
		return servOMSV.getOmsvAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmsvByScoreCodeList")
	public List<OmMstScoreValue> getOmsvByScoreCodeList(String scorecode){
		return servOMSV.getOmsvByScoreCodeList(scorecode);
	}
}
