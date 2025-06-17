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

import com.MasterOrderManagement.Models.OmMstDocOccutype;
import com.MasterOrderManagement.Services.ServiceOmMstDocOccutype;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstDocOccutype {
	@Autowired
	ServiceOmMstDocOccutype servOMDO;
	
	@GetMapping("/MasterOrderManagement/getOmdoAll")
	public List<OmMstDocOccutype> getOmdoAll(){
		return servOMDO.getOmdoAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmdoByOcptTypeCU")
	public List<OmMstDocOccutype> getOmdoByOcptTypeCU(String ocpttype){
		return servOMDO.getOmdoByOcptTypeCU(ocpttype);
	}
}
