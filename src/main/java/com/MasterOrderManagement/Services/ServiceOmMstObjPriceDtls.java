package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstObjPriceDtls;
import com.MasterOrderManagement.Repository.IOmMstObjPriceDtlsRepository;

@Service
public class ServiceOmMstObjPriceDtls {
	@Autowired
	IOmMstObjPriceDtlsRepository repoOMOPD;
	
	public List<OmMstObjPriceDtls> getOmopdAll(){
		return repoOMOPD.findAll();
	}
	
	public List<OmMstObjPriceDtls> getOmopdByObjCodeList(String objcode){
		return repoOMOPD.findByOmopdObjCodeContaining(objcode);
	}
}
