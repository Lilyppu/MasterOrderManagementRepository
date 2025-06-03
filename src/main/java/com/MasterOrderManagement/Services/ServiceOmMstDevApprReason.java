package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstDevApprReason;
import com.MasterOrderManagement.Repository.IOmMstDevApprReasonRepository;

@Service
public class ServiceOmMstDevApprReason {
	@Autowired
	IOmMstDevApprReasonRepository repoOMDAR;
	
	public List<OmMstDevApprReason> getOmdarAll(){
		return repoOMDAR.findAll();
	}
	
	public Optional<OmMstDevApprReason> getOmdaByNumCU(Integer num){
		return repoOMDAR.findByOmdarNum(num);
	}
}
