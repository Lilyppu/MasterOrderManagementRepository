package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstAdjustAdmin;
import com.MasterOrderManagement.Repository.IOmMstAdjustAdminRepository;

@Service
public class ServiceOmMstAdjustAdmin {
	@Autowired
	IOmMstAdjustAdminRepository repoOMAA;
	
	public List<OmMstAdjustAdmin> getOmaaAll(){
		return repoOMAA.findAll();
	}
	
	public Optional<OmMstAdjustAdmin> getOmaaByBranchIdCU(String branchid){
		return repoOMAA.findByOmaaBranchId(branchid);
	}
}