package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstObjGroup;
import com.MasterOrderManagement.Repository.IOmMstObjGroupRepository;

@Service
public class ServiceOmMstObjGroup {
	@Autowired
	IOmMstObjGroupRepository repoOMOG;
	
	public List<OmMstObjGroup> getOmogAll(){
		return repoOMOG.findAll();
	}
	
	public Optional<OmMstObjGroup> getOmogByObjGrpCU(String objgrp){
		return repoOMOG.findByOmogObjGrp(objgrp);
	}
}
