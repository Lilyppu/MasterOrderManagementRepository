package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstKoorSurveyor;
import com.MasterOrderManagement.Repository.IOmMstKoorSurveyorRepository;

@Service
public class ServiceOmMstKoorSurveyor {
	@Autowired
	IOmMstKoorSurveyorRepository repoOMKS;
	
	public List<OmMstKoorSurveyor> getOmksAll(){
		return repoOMKS.findAll();
	}
	
	public Optional<OmMstKoorSurveyor> getOmksByKoorSurvIdCU(String koorsurvid){
		return repoOMKS.findByOmksKoorSurvId(koorsurvid);
	}
}
