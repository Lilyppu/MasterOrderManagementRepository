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

import com.MasterOrderManagement.Models.OmMstMktSchemeCakupanWil;
import com.MasterOrderManagement.Services.ServiceOmMstMktSchemeCakupanWil;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstMktSchemeCakupanWil {
	@Autowired
	ServiceOmMstMktSchemeCakupanWil servOMMSCW;
	
	@GetMapping("/MasterOrderManagement/getOmmscwAll")
	public List<OmMstMktSchemeCakupanWil> getOmmscwAll(){
		return servOMMSCW.getOmmscwAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmmscwByRegionalIdList")
	public List<OmMstMktSchemeCakupanWil> getOmmscwByRegionalIdList(String regionalid){
		return servOMMSCW.getOmmscwByRegionalIdList(regionalid);
	}
}
