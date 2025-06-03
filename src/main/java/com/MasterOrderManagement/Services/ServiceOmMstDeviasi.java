package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstDeviasi;
import com.MasterOrderManagement.Repository.IOmMstDeviasiRepository;

@Service
public class ServiceOmMstDeviasi {
	@Autowired
	IOmMstDeviasiRepository repoOMDE;
	
	public List<OmMstDeviasi> getOmdeAll(){
		return repoOMDE.findAll();
	}
	
	public Optional<OmMstDeviasi> getOmdeByNumCU(Integer num){
		return repoOMDE.findByOmdeNum(num);
	}
}
