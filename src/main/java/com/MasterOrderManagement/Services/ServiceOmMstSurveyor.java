package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstSurveyor;
import com.MasterOrderManagement.Repository.IOmMstSurveyorRepository;

@Service
public class ServiceOmMstSurveyor {
	@Autowired
	IOmMstSurveyorRepository repoOMSV;
	
	public List<OmMstSurveyor> getOmsvAll(){
		return repoOMSV.findAll();
	}
	
	public Optional<OmMstSurveyor> getOmsvBySurvIdtCU(String survid){
		return repoOMSV.findByOmsvSurvId(survid);
	}
}
