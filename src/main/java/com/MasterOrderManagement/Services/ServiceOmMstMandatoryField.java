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
	IOmMstMandatoryFieldRepository repoOMMF;
	
	public List<OmMstMandatoryField> getOmmfAll(){
		return repoOMMF.findAll();
	}
	
	public List<OmMstMandatoryField> getOmmfByTabelNameList(String tabelname){
		return repoOMMF.findByOmmfTabelNameContaining(tabelname);
	}
}
