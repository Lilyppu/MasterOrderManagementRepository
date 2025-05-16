package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstDocOccutype;
import com.MasterOrderManagement.Repository.IOmMstDocOccutypeRepository;

@Service
public class ServiceOmMstDocOccutype {
	@Autowired
	IOmMstDocOccutypeRepository repoOMDO;
	
	public List<OmMstDocOccutype> getOmdoAll(){
		return repoOMDO.findAll();
	}
	
	public List<OmMstDocOccutype> getOmdoByOcptTypeCU(String ocpttype){
		return repoOMDO.findByOmdoOcptTypeContaining(ocpttype);
	}
}
