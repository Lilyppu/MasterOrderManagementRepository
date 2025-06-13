package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstMktSchemeCakupanCab;
import com.MasterOrderManagement.Repository.IOmMstMktSchemeCakupanCabRepository;

@Service
public class ServiceOmMstMktSchemeCakupanCab {
	@Autowired
	IOmMstMktSchemeCakupanCabRepository repoOMMSCC;
	
	public List<OmMstMktSchemeCakupanCab> getOmmsccAll(){
		return repoOMMSCC.findAll();
	}
	
	public List<OmMstMktSchemeCakupanCab> getOmmsccByBranchIdList(String branchid){
		return repoOMMSCC.findByOmmsccBranchIdContaining(branchid);
	}
}
