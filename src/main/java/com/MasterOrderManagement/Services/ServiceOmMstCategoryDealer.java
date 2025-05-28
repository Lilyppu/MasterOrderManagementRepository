package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstCategoryDealer;
import com.MasterOrderManagement.Repository.IOmMstCategoryDealerRepository;

@Service
public class ServiceOmMstCategoryDealer {
	@Autowired
	IOmMstCategoryDealerRepository repoOMCD;
	
	public List<OmMstCategoryDealer> getOmcdAll(){
		return repoOMCD.findAll();
	}
	
	public Optional<OmMstCategoryDealer> getOmcdByCategoryCU(String category){
		return repoOMCD.findByOmcdCategory(category);
	}
}
