package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstProvisi;
import com.MasterOrderManagement.Repository.IOmMstProvisiRepository;

@Service
public class ServiceOmMstProvisi {
	@Autowired
	IOmMstProvisiRepository repoOMP;
	
	public List<OmMstProvisi> getOmpAll(){
		return repoOMP.findAll();
	}
	
	public List<OmMstProvisi> getOmpByBussUnitList(String bussunit){
		return repoOMP.findByOmpBussUnit(bussunit);
	}
}
