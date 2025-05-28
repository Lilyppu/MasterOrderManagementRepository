package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstCollTypeFields;
import com.MasterOrderManagement.Repository.IOmMstCollTypeFieldsRepository;

@Service
public class ServiceOmMstCollTypeFields {
	@Autowired
	IOmMstCollTypeFieldsRepository repoOMCTF;
	
	public List<OmMstCollTypeFields> getOmctfAll(){
		return repoOMCTF.findAll();
	}
	
	public List<OmMstCollTypeFields> getOmctfByCollTypeList(Integer colltype){
		return repoOMCTF.findByOmctfCollType(colltype);
	}
}
