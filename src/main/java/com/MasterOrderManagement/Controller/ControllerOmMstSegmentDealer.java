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

import com.MasterOrderManagement.Models.OmMstSegmentDealer;
import com.MasterOrderManagement.Services.ServiceOmMstSegmentDealer;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstSegmentDealer {
	@Autowired
	ServiceOmMstSegmentDealer servOMSD;
	
	@GetMapping("/MasterOrderManagement/getOmsdAll")
	public List<OmMstSegmentDealer> getOmsdAll(){
		return servOMSD.getOmsdAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmsdBydSegmentDealerCU")
	public Optional<OmMstSegmentDealer> getOmsdBydSegmentDealerCU(String segmentdealer){
		return servOMSD.getOmsdBydSegmentDealerCU(segmentdealer);
	}
}
