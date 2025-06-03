package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstDocUpload;
import com.MasterOrderManagement.Repository.IOmMstDocUploadRepository;

@Service
public class ServiceOmMstDocUpload {
	@Autowired
	IOmMstDocUploadRepository repoOMDU;
	
	public List<OmMstDocUpload> getOmduAll(){
		return repoOMDU.findAll();
	}
	
	public List<OmMstDocUpload> getOmduByDocCodeList(String doccode){
		return repoOMDU.findByOmduDocCodeContaining(doccode);
	}
}
