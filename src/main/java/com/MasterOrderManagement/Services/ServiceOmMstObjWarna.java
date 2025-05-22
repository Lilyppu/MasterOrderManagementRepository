package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstObjWarna;
import com.MasterOrderManagement.Repository.IOmMstObjWarnaRepository;

@Service
public class ServiceOmMstObjWarna {
	@Autowired
	IOmMstObjWarnaRepository repoOMOW;
	
	public List<OmMstObjWarna> getOmowAll(){
		return repoOMOW.findAll();
	}
	
	public Optional<OmMstObjWarna> getOmowByObjWarnaCU(String objwarna){
		return repoOMOW.findByOmowObjWarna(objwarna);
	}
}
