package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstCollProcess;
import com.MasterOrderManagement.Repository.IOmMstCollProcessRepository;

@Service
public class ServiceOmMstCollProcess {
	@Autowired
	IOmMstCollProcessRepository repoOMCP;
	
	public List<OmMstCollProcess> getOmcpAll(){
		return repoOMCP.findAll();
	}
	
	public Optional<OmMstCollProcess> getOmcpBySuplCodeCU(String suplcode){
		return repoOMCP.findByOmcpSuplCode(suplcode);
	}
}
