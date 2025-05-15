package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstApprovalId;
import com.MasterOrderManagement.Repository.IOmMstApprovalIdRepository;

@Service
public class ServiceOmMstApprovalId {
	@Autowired
	IOmMstApprovalIdRepository repoOMAI;
	
	public List<OmMstApprovalId> getOmaiAll(){
		return repoOMAI.findAll();
	}
	
	public Optional<OmMstApprovalId> getOmaiByApprIdCU(String apprid){
		return repoOMAI.findByOmaiApprId(apprid);
	}
}
