package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstAdminStnk;
import com.MasterOrderManagement.Repository.IOmMstAdminStnkRepository;

@Service
public class ServiceOmMstAdminStnk {
	@Autowired
	IOmMstAdminStnkRepository repoOMAS;
	
	public List<OmMstAdminStnk> getOmasAll(){
		return repoOMAS.findAll();
	}
	
	public Optional<OmMstAdminStnk> getOmasBySupplCodeCU(String supplcode){
		return repoOMAS.findByOmasSupplCode(supplcode);
	}
}
