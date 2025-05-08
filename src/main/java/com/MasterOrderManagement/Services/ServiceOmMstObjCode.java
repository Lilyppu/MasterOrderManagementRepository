package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstObjCode;
import com.MasterOrderManagement.Repository.IOmMstObjCodeRepository;

@Service
public class ServiceOmMstObjCode {
	@Autowired
	IOmMstObjCodeRepository repoOMOC;
	
	public List<OmMstObjCode> getOmocAll(){
		return repoOMOC.findAll();
	}
	
	public Optional<OmMstObjCode> getOmocByObjCodeCU(String objcode){
		return repoOMOC.findByOmocObjCode(objcode);
	}
}
