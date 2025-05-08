package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstScoreHouse;
import com.MasterOrderManagement.Repository.IOmMstScoreHouseRepository;

@Service
public class ServiceOmMstScoreHouse {
	@Autowired
	IOmMstScoreHouseRepository repoOMSH;
	
	public List<OmMstScoreHouse> getOmshAll(){
		return repoOMSH.findAll();
	}
	
	public Optional<OmMstScoreHouse> getOmshByBussUnitCU(String bussunit){
		return repoOMSH.findByOmshBussUnit(bussunit);
	}
}
