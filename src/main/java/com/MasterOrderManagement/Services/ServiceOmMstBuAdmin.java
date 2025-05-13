package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstBuAdmin;
import com.MasterOrderManagement.Repository.IOmMstBuAdminRepository;

@Service
public class ServiceOmMstBuAdmin {
	@Autowired
	IOmMstBuAdminRepository repoOMBA;
	
	public List<OmMstBuAdmin> getOmbaAll(){
		return repoOMBA.findAll();
	}
	
	public Optional<OmMstBuAdmin> getOmbaByBussUnitCU(String bussunit){
		return repoOMBA.findByOmbaBussUnit(bussunit);
	}
}
