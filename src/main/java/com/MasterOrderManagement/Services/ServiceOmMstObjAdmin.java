package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstObjAdmin;
import com.MasterOrderManagement.Repository.IOmMstObjAdminRepository;

@Service
public class ServiceOmMstObjAdmin {
	@Autowired
	IOmMstObjAdminRepository repoOMOA;
	
	public List<OmMstObjAdmin> getOmoaAll(){
		return repoOMOA.findAll();
	}
	
	public Optional<OmMstObjAdmin> getOmoaByFeeIdCU(String feeid){
		return repoOMOA.findByOmoaFeeId(feeid);
	}
}
