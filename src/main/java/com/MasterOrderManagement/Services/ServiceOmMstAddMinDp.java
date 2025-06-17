package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstAddMinDp;
import com.MasterOrderManagement.Repository.IOmMstAddMinDpRepository;

@Service
public class ServiceOmMstAddMinDp {
	@Autowired
	IOmMstAddMinDpRepository repoOMAMD;
	
	public List<OmMstAddMinDp> getOmamdAll(){
		return repoOMAMD.findAll();
	}
	
	public List<OmMstAddMinDp> getOmamdByBussUnitList(String bussunit){
		return repoOMAMD.findByOmamdBussUnit(bussunit);
	}
}
