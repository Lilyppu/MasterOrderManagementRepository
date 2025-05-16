package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstRateParam;
import com.MasterOrderManagement.Repository.IOmMstRateParamRepository;


@Service
public class ServiceOmMstRateParam {
	@Autowired
	IOmMstRateParamRepository repoOMRP;
	
	public List<OmMstRateParam> getOmrpAll(){
		return repoOMRP.findAll();
	}
	
	public List<OmMstRateParam> getOmrpByBussUnitList(String bussunit){
		return repoOMRP.findByOmrpBussUnit(bussunit);
	}
}
