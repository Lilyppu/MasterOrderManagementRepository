package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstCollType;
import com.MasterOrderManagement.Repository.IOmMstCollTypeRepository;

@Service
public class ServiceOmMstCollType {
	@Autowired
	IOmMstCollTypeRepository repoOMCT;
	
	public List<OmMstCollType> getOmctAll(){
		return repoOMCT.findAll();
	}
	
	public Optional<OmMstCollType> getOmctByCollTypeCU(Integer colltype){
		return repoOMCT.findByOmctCollType(colltype);
	}
}
