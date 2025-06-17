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

import com.MasterOrderManagement.Models.OmMstMktScheme;
import com.MasterOrderManagement.Services.ServiceOmMstMktScheme;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstMktScheme {
	@Autowired
	ServiceOmMstMktScheme servOMMS;
	
	@GetMapping("/MasterOrderManagement/getOmmsAll")
	public List<OmMstMktScheme> getOmmsAll(){
		return servOMMS.getOmmsAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmmsByMsCodeCU")
	public Optional<OmMstMktScheme> getOmmsByMsCodeCU(String mscode){
		return servOMMS.getOmmsByMsCodeCU(mscode);
	}
}
