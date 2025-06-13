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

import com.MasterOrderManagement.Models.OmMstKlasifikasiSipp;
import com.MasterOrderManagement.Services.ServiceOmMstKlasifikasiSipp;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ControllerOmMstKlasifikasiSipp {
	@Autowired
	ServiceOmMstKlasifikasiSipp servOMKSI;
	
	@GetMapping("/MasterOrderManagement/getOmksiAll")
	public List<OmMstKlasifikasiSipp> getOmksiAll(){
		return servOMKSI.getOmksiAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmksiByTipePembiayaanList")
	public List<OmMstKlasifikasiSipp> getOmksiByTipePembiayaanList(String tipepembiayaan){
		return servOMKSI.getOmksiByTipePembiayaanList(tipepembiayaan);
	}
}
