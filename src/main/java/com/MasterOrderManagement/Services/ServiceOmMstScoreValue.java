package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstScoreValue;
import com.MasterOrderManagement.Repository.IOmMstScoreValueRepository;

@Service
public class ServiceOmMstScoreValue {
	@Autowired
	IOmMstScoreValueRepository repoOMSV;
	
	public List<OmMstScoreValue> getOmsvAll(){
		return repoOMSV.findAll();
	}
	
	public List<OmMstScoreValue> getOmsvByScoreCodeList(String scorecode){
		return repoOMSV.findByOmsvScoreCodeContaining(scorecode);
	}
}
