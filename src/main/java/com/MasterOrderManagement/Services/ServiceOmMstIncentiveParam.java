package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstIncentiveParam;
import com.MasterOrderManagement.Repository.IOmMstIncentiveParamRepository;

@Service
public class ServiceOmMstIncentiveParam {
	@Autowired
	IOmMstIncentiveParamRepository repoOMIP;
	
	public List<OmMstIncentiveParam> getOmipAll(){
		return repoOMIP.findAll();
	}
	
	public Optional<OmMstIncentiveParam> getOmipByParamCodeCU(String paramcode){
		return repoOMIP.findByOmipParamCode(paramcode);
	}
}
