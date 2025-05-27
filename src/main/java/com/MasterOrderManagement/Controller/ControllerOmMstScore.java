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

import com.MasterOrderManagement.Models.OmMstScore;
import com.MasterOrderManagement.Services.ServiceOmMstScore;

@RestController
public class ControllerOmMstScore {
	@Autowired
	ServiceOmMstScore servOMS;
	
	@GetMapping("/MasterOrderManagement/getOmsAll")
	public List<OmMstScore> getOmsAll(){
		return servOMS.getOmsAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmsByScoreCodeCU")
	public Optional<OmMstScore> getOmsByScoreCodeCU(String scorecode){
		return servOMS.getOmsByScoreCodeCU(scorecode);
	}
}
