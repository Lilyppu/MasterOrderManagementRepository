package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstLohSurveyor;
import com.MasterOrderManagement.Repository.IOmMstLohSurveyorRepository;

@Service
public class ServiceOmMstLohSurveyor {
	@Autowired
	IOmMstLohSurveyorRepository repoOMLS;
	
	public List<OmMstLohSurveyor> getOmlsAll(){
		return repoOMLS.findAll();
	}
	
	public Optional<OmMstLohSurveyor> getOmlsByLohIdCU(String lohid){
		return repoOMLS.findByOmlsLohId(lohid);
	}
}
