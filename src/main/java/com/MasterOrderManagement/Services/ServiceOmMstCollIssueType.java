package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstCollIssueType;
import com.MasterOrderManagement.Repository.IOmMstCollIssueTypeRepository;

@Service
public class ServiceOmMstCollIssueType {
	@Autowired
	IOmMstCollIssueTypeRepository repoOMCIT;
	
	public List<OmMstCollIssueType> getOmcitAll(){
		return repoOMCIT.findAll();
	}
	
	public Optional<OmMstCollIssueType> getOmcitByIssueTypeCU(String issuetype){
		return repoOMCIT.findByOmcitIssueType(issuetype);
	}
}
