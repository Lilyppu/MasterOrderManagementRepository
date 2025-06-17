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

import com.MasterOrderManagement.Models.OmMstMicroFinance;
import com.MasterOrderManagement.Services.ServiceOmMstMicroFinance;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstMicroFinance {
	@Autowired
	ServiceOmMstMicroFinance servOMMF;
	
	@GetMapping("/MasterOrderManagement/getOmmfAll")
	public List<OmMstMicroFinance> getOmmfAll(){
		return servOMMF.getOmmfAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmmfBySeqNoCU")
	public Optional<OmMstMicroFinance> getOmmfBySeqNoCU(Integer seqno){
		return servOMMF.getOmmfBySeqNoCU(seqno);
	}
}
