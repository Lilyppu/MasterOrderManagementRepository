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

import com.MasterOrderManagement.Models.OmMstMandatoryField;
import com.MasterOrderManagement.Services.ServiceOmMstMandatoryField;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstMandatoryField {
	@Autowired
	ServiceOmMstMandatoryField servOMMFD;
	
	@GetMapping("/MasterOrderManagement/getOmmfdAll")
	public List<OmMstMandatoryField> getOmmfdAll(){
		return servOMMFD.getOmmfdAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmmfdByTabelNameList")
	public List<OmMstMandatoryField> getOmmfdByTabelNameList(String tabelname){
		return servOMMFD.getOmmfdByTabelNameList(tabelname);
	}
}
