package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstMandatoryField;
import com.MasterOrderManagement.Repository.IOmMstMandatoryFieldRepository;

@Service
public class ServiceOmMstMandatoryField {
	@Autowired
	IOmMstMandatoryFieldRepository repoOMMFD;
	
	public List<OmMstMandatoryField> getOmmfdAll(){
		return repoOMMFD.findAll();
	}
	
	public List<OmMstMandatoryField> getOmmfdByTabelNameList(String tabelname){
		return repoOMMFD.findByOmmfdTabelNameContaining(tabelname);
	}
}
