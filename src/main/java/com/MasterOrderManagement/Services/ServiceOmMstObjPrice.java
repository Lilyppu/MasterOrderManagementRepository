package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstObjPrice;
import com.MasterOrderManagement.Repository.IOmMstObjPriceRepository;

@Service
public class ServiceOmMstObjPrice {
	@Autowired
	IOmMstObjPriceRepository repoOMOP;
	
	public List<OmMstObjPrice> getOmopAll(){
		return repoOMOP.findAll();
	}
	
	public List<OmMstObjPrice> getOmopByObjCodeList(String objcode){
		return repoOMOP.findByOmopObjCodeContaining(objcode);
	}
}
