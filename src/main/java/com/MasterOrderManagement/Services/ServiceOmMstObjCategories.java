package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstObjCategories;
import com.MasterOrderManagement.Repository.IOmMstObjCategoriesRepository;

@Service
public class ServiceOmMstObjCategories {
	@Autowired
	IOmMstObjCategoriesRepository repoOMOCS;
	
	public List<OmMstObjCategories> getOmocsAll(){
		return repoOMOCS.findAll();
	}
	
	public Optional<OmMstObjCategories> getOmocsByObjCategoryCU(String objcategory){
		return repoOMOCS.findByOmocsObjCategory(objcategory);
	}
}
