package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstMktScheme;
import com.MasterOrderManagement.Repository.IOmMstMktSchemeRepository;

@Service
public class ServiceOmMstMktScheme {
	@Autowired
	IOmMstMktSchemeRepository repoOMMS;
	
	public List<OmMstMktScheme> getOmmsAll(){
		return repoOMMS.findAll();
	}
	
	public Optional<OmMstMktScheme> getOmmsByMsCodeCU(String mscode){
		return repoOMMS.findByOmmsMsCode(mscode);
	}
}
