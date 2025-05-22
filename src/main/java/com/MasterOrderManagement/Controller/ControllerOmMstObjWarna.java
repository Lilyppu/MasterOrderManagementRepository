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

import com.MasterOrderManagement.Models.OmMstObjWarna;
import com.MasterOrderManagement.Services.ServiceOmMstObjWarna;

@RestController
public class ControllerOmMstObjWarna {
	@Autowired
	ServiceOmMstObjWarna servOMOW;
	
	@GetMapping("/MasterOrderManagement/getOmowAll")
	public List<OmMstObjWarna> getOmowAll(){
		return servOMOW.getOmowAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmowByObjWarnaCU")
	public Optional<OmMstObjWarna> getOmowByObjWarnaCU(String objwarna){
		return servOMOW.getOmowByObjWarnaCU(objwarna);
	}
}
