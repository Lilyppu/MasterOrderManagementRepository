package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstDeviasiDetail;
import com.MasterOrderManagement.Repository.IOmMstDeviasiDetailRepository;

@Service
public class ServiceOmMstDeviasiDetail {
	@Autowired
	IOmMstDeviasiDetailRepository repoOMDD;
	
	public List<OmMstDeviasiDetail> getOmddAll(){
		return repoOMDD.findAll();
	}
	
	public Optional<OmMstDeviasiDetail> getOmddByNumCU(Integer num){
		return repoOMDD.findByOmddNum(num);
	}
}
