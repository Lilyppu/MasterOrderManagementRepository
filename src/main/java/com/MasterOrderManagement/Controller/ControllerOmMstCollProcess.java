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

import com.MasterOrderManagement.Models.OmMstCollProcess;
import com.MasterOrderManagement.Services.ServiceOmMstCollProcess;

@RestController
public class ControllerOmMstCollProcess {
	@Autowired
	ServiceOmMstCollProcess servOMCP;
	
	@GetMapping("/MasterOrderManagement/getOmcpAll")
	public List<OmMstCollProcess> getOmcpAll(){
		return servOMCP.getOmcpAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmcpBySuplCodeCU")
	public Optional<OmMstCollProcess> getOmcpBySuplCodeCU(String suplcode){
		return servOMCP.getOmcpBySuplCodeCU(suplcode);
	}
}
