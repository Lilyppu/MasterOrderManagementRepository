package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstDocuments;
import com.MasterOrderManagement.Repository.IOmMstDocumentsRepository;

@Service
public class ServiceOmMstDocuments {
	@Autowired
	IOmMstDocumentsRepository repoOMD;
	
	public List<OmMstDocuments> getOmdAll(){
		return repoOMD.findAll();
	}
	
	public Optional<OmMstDocuments> getOmdByDocCodeCU(String doccode){
		return repoOMD.findByOmdDocCode(doccode);
	}
}
