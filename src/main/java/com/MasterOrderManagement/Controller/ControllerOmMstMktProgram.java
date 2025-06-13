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

import com.MasterOrderManagement.Models.OmMstMktProgram;
import com.MasterOrderManagement.Services.ServiceOmMstMktProgram;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstMktProgram {
	@Autowired
	ServiceOmMstMktProgram servOMMP;
	
	@GetMapping("/MasterOrderManagement/getOmmpAll")
	public List<OmMstMktProgram> getOmmpAll(){
		return servOMMP.getOmmpAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmmpByProgCodeCU")
	public Optional<OmMstMktProgram> getOmmpByProgCodeCU(String progcode){
		return servOMMP.getOmmpByProgCodeCU(progcode);
	}
}
