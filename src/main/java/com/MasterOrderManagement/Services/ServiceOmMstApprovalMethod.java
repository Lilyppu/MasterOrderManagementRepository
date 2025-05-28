package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstApprovalMethod;
import com.MasterOrderManagement.Repository.IOmMstApprovalMethodRepository;

@Service
public class ServiceOmMstApprovalMethod {
	@Autowired
	IOmMstApprovalMethodRepository repoOMAM;
	
	public List<OmMstApprovalMethod> getOmamAll(){
		return repoOMAM.findAll();
	}
	
	public Optional<OmMstApprovalMethod> getOmamByMethodIdCU(String methodid){
		return repoOMAM.findByOmamMethodId(methodid);
	}
}
