package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstDescMoubr;
import com.MasterOrderManagement.Repository.IOmMstDescMoubrRepository;

@Service
public class ServiceOmMstDescMoubr {
	@Autowired
	IOmMstDescMoubrRepository repoOMDM;
	
	public List<OmMstDescMoubr> getOmdmAll(){
		return repoOMDM.findAll();
	}
	
	public Optional<OmMstDescMoubr> getOmdmByValueCU(Integer value){
		return repoOMDM.findByOmdmValue(value);
	}
}
