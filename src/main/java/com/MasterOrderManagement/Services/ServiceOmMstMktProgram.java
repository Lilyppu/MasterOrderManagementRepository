package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstMktProgram;
import com.MasterOrderManagement.Repository.IOmMstMktProgramRepository;

@Service
public class ServiceOmMstMktProgram {
	@Autowired
	IOmMstMktProgramRepository repoOMMP;
	
	public List<OmMstMktProgram> getOmmpAll(){
		return repoOMMP.findAll();
	}
	
	public Optional<OmMstMktProgram> getOmmpByProgCodeCU(String progcode){
		return repoOMMP.findByOmmpProgCode(progcode);
	}
}
