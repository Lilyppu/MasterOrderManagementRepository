package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstScore;
import com.MasterOrderManagement.Repository.IOmMstScoreRepository;

@Service
public class ServiceOmMstScore {
	@Autowired
	IOmMstScoreRepository repoOMS;
	
	public List<OmMstScore> getOmsAll(){
		return repoOMS.findAll();
	}
	
	public Optional<OmMstScore> getOmsByScoreCodeCU(String scorecode){
		return repoOMS.findByOmsScoreCode(scorecode);
	}
}
