package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstMktSchemeCakupanWil;
import com.MasterOrderManagement.Repository.IOmMstMktSchemeCakupanWilRepository;

@Service
public class ServiceOmMstMktSchemeCakupanWil {
	@Autowired
	IOmMstMktSchemeCakupanWilRepository repoOMMSCW;
	
	public List<OmMstMktSchemeCakupanWil> getOmmscwAll(){
		return repoOMMSCW.findAll();
	}
	
	public List<OmMstMktSchemeCakupanWil> getOmmscwByRegionalIdList(String regionalid){
		return repoOMMSCW.findByOmmscwRegionalIdContaining(regionalid);
	}
}
