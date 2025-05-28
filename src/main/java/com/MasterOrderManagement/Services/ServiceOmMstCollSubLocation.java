package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstCollSubLocation;
import com.MasterOrderManagement.Repository.IOmMstCollSubLocationRepository;

@Service
public class ServiceOmMstCollSubLocation {
	@Autowired
	IOmMstCollSubLocationRepository repoOMCSL;
	
	public List<OmMstCollSubLocation> getOmcslAll(){
		return repoOMCSL.findAll();
	}
	
	public Optional<OmMstCollSubLocation> getOmcslByCollSubLocationCU(String collsublocation){
		return repoOMCSL.findByOmcslCollSubLocation(collsublocation);
	}
}
