package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstCollSublocDetail;
import com.MasterOrderManagement.Repository.IOmMstCollSublocDetailRepository;

@Service
public class ServiceOmMstCollSublocDetail {
	@Autowired
	IOmMstCollSublocDetailRepository repoOMCSD;
	
	public List<OmMstCollSublocDetail> getOmcsdAll(){
		return repoOMCSD.findAll();
	}
	
	public Optional<OmMstCollSublocDetail> getOmcsdByCollSublocDetailCU(String collsublocdetail){
		return repoOMCSD.findByOmcsdCollSublocDetail(collsublocdetail);
	}
}
