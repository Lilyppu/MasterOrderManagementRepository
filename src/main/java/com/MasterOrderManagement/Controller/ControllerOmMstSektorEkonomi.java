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

import com.MasterOrderManagement.Models.OmMstSektorEkonomi;
import com.MasterOrderManagement.Services.ServiceOmMstSektorEkonomi;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstSektorEkonomi {
	@Autowired
	ServiceOmMstSektorEkonomi servOMSE;
	
	@GetMapping("/MasterOrderManagement/getOmseAll")
	public List<OmMstSektorEkonomi> getOmseAll(){
		return servOMSE.getOmseAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmseBySecEcoIdCU")
	public Optional<OmMstSektorEkonomi> getOmseBySecEcoIdCU(String sececoid){
		return servOMSE.getOmseBySecEcoIdCU(sececoid);
	}
}
