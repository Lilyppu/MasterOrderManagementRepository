package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstMicroFinance;
import com.MasterOrderManagement.Repository.IOmMstMicroFinanceRepository;

@Service
public class ServiceOmMstMicroFinance {
	@Autowired
	IOmMstMicroFinanceRepository repoOMMF;
	
	public List<OmMstMicroFinance> getOmmfAll(){
		return repoOMMF.findAll();
	}
	
	public Optional<OmMstMicroFinance> getOmmfBySeqNoCU(Integer seqno){
		return repoOMMF.findByOmmfSeqNo(seqno);
	}
}
