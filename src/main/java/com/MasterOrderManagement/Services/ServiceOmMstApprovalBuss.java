package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstApprovalBuss;
import com.MasterOrderManagement.Repository.IOmMstApprovalBussRepository;

@Service
public class ServiceOmMstApprovalBuss {
	@Autowired
	IOmMstApprovalBussRepository repoOMAB;
	
	public List<OmMstApprovalBuss> getOmabAll(){
		return repoOMAB.findAll();
	}
	
	public Optional<OmMstApprovalBuss> getOmabByBussUnitCU(String bussunit){
		return repoOMAB.findByOmabBussUnit(bussunit);
	}
}
