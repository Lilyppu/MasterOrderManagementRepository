package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstObjModel;
import com.MasterOrderManagement.Repository.IOmMstObjModelRepository;

@Service
public class ServiceOmMstObjModel {
	@Autowired
	IOmMstObjModelRepository repoOMOM;
	
	public List<OmMstObjModel> getOmomAll(){
		return repoOMOM.findAll();
	}
	
	public Optional<OmMstObjModel> getOmomByModelNoCU(String modelno){
		return repoOMOM.findByOmomModelNo(modelno);
	}
}
