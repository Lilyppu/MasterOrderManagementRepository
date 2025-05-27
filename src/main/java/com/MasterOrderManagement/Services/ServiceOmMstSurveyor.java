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
	IOmMstSurveyorRepository repoOMSVY;
	
	public List<OmMstSurveyor> getOmsvyAll(){
		return repoOMSVY.findAll();
	}
	
	public Optional<OmMstSurveyor> getOmsvyBySurvIdCU(String survid){
		return repoOMSVY.findByOmsvySurvId(survid);
	}
}
