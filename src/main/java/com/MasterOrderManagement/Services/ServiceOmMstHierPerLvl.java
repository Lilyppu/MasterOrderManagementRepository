package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstHierPerLvl;
import com.MasterOrderManagement.Repository.IOmMstHierPerLvlRepository;

@Service
public class ServiceOmMstHierPerLvl {
	@Autowired
	IOmMstHierPerLvlRepository repoOMHPL;
	
	public List<OmMstHierPerLvl> getOmhplAll(){
		return repoOMHPL.findAll();
	}
	
	public List<OmMstHierPerLvl> getOmhplByOfficeCodeList(String officecode){
		return repoOMHPL.findByOmhplOfficeCodeContaining(officecode);
	}
}
