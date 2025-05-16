package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstObjBrand;
import com.MasterOrderManagement.Repository.IOmMstObjBrandRepository;

@Service
public class ServiceOmMstObjBrand {
	@Autowired
	IOmMstObjBrandRepository repoOMOB;
	
	public List<OmMstObjBrand> getOmobAll(){
		return repoOMOB.findAll();
	}
	
	public Optional<OmMstObjBrand> getOmobByObjBrandCU(String objbrand){
		return repoOMOB.findByOmobObjBrand(objbrand);
	}
}
