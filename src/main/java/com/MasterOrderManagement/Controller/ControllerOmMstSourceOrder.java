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

import com.MasterOrderManagement.Models.OmMstSourceOrder;
import com.MasterOrderManagement.Services.ServiceOmMstSourceOrder;

@RestController
public class ControllerOmMstSourceOrder {
	@Autowired
	ServiceOmMstSourceOrder servOMSO;
	
	@GetMapping("/MasterOrderManagement/getOmsoAll")
	public List<OmMstSourceOrder> getOmsoAll(){
		return servOMSO.getOmsoAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmsoBySoCodeCU")
	public Optional<OmMstSourceOrder> getOmsoBySoCodeCU(String socode){
		return servOMSO.getOmsoBySoCodeCU(socode);
	}
}
