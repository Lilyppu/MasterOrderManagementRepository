package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstBuObjGroup;
import com.MasterOrderManagement.Repository.IOmMstBuObjGroupRepository;

@Service
public class ServiceOmMstBuObjGroup {
	@Autowired
	IOmMstBuObjGroupRepository repoOMBOG;
	
	public List<OmMstBuObjGroup> getOmbogAll(){
		return repoOMBOG.findAll();
	}
	
	public List<OmMstBuObjGroup> getOmbogBussUnitList(String bussunit){
		return repoOMBOG.findByOmbogBussUnitContaining(bussunit);
	}
}
