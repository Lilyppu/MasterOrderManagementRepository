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

import com.MasterOrderManagement.Models.OmMstDescMoubr;
import com.MasterOrderManagement.Services.ServiceOmMstDescMoubr;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstDescMoubr {
	@Autowired
	ServiceOmMstDescMoubr servOMBA;
	
	@GetMapping("/MasterOrderManagement/getOmdmAll")
	public List<OmMstDescMoubr> getOmdmAll(){
		return servOMBA.getOmdmAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmdmByValueCU")
	public Optional<OmMstDescMoubr> getOmdmByValueCU(Integer value){
		return servOMBA.getOmdmByValueCU(value);
	}
}
