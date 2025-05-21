package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstSektorEkonomi;
import com.MasterOrderManagement.Repository.IOmMstSektorEkonomiRepository;

@Service
public class ServiceOmMstSektorEkonomi {
	@Autowired
	IOmMstSektorEkonomiRepository repoOMSE;
	
	public List<OmMstSektorEkonomi> getOmseAll(){
		return repoOMSE.findAll();
	}
	
	public Optional<OmMstSektorEkonomi> getOmseBySecEcoIdCU(String sececoid){
		return repoOMSE.findByOmseSecEcoId(sececoid);
	}
}
