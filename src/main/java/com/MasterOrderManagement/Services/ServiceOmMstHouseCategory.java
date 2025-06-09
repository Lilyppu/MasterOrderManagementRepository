package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstHouseCategory;
import com.MasterOrderManagement.Repository.IOmMstHouseCategoryRepository;

@Service
public class ServiceOmMstHouseCategory {
	@Autowired
	IOmMstHouseCategoryRepository repoOMHCA;
	
	public List<OmMstHouseCategory> getOmhcaAll(){
		return repoOMHCA.findAll();
	}
	
	public Optional<OmMstHouseCategory> getOmhcaByHouseCateIdCU(String housecateid){
		return repoOMHCA.findByOmhcaHouseCateId(housecateid);
	}
}
