package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstHierarchies;
import com.MasterOrderManagement.Repository.IOmMstHierarchiesRepository;

@Service
public class ServiceOmMstHierarchies {
	@Autowired
	IOmMstHierarchiesRepository repoOMH;
	
	public List<OmMstHierarchies> getOmhAll(){
		return repoOMH.findAll();
	}
	
	public List<OmMstHierarchies> getOmhByOfficeCodeList(String officecode){
		return repoOMH.findByOmhOfficeCodeContaining(officecode);
	}
}
