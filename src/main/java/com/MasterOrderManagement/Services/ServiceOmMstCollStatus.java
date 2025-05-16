package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstCollStatus;
import com.MasterOrderManagement.Repository.IOmMstCollStatusRepository;

@Service
public class ServiceOmMstCollStatus {
	@Autowired
	IOmMstCollStatusRepository repoOMCS;
	
	public List<OmMstCollStatus> getOmcsAll(){
		return repoOMCS.findAll();
	}
	
	public Optional<OmMstCollStatus> getOmcsByBussUnitCU(String collstatus){
		return repoOMCS.findByOmcsCollStatus(collstatus);
	}
}
