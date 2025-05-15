package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstBussUnitProduct;
import com.MasterOrderManagement.Repository.IOmMstBussUnitProductRepository;

@Service
public class ServiceOmMstBussUnitProduct {
	@Autowired
	IOmMstBussUnitProductRepository repoOMBUP;
	
	public List<OmMstBussUnitProduct> getOmbupAll(){
		return repoOMBUP.findAll();
	}
	
	public Optional<OmMstBussUnitProduct> getOmbupByBussUnitCU(String bussunit){
		return repoOMBUP.findByOmbupBussUnit(bussunit);
	}
}
