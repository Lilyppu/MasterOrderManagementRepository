package com.MasterOrderManagement.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstSourceOrder;
import com.MasterOrderManagement.Repository.IOmMstSourceOrderRepository;

@Service
public class ServiceOmMstSourceOrder {
	@Autowired
	IOmMstSourceOrderRepository repoOMSO;
	
	public List<OmMstSourceOrder> getOmsoAll(){
		return repoOMSO.findAll();
	}
	
	public Optional<OmMstSourceOrder> getOmsoBySoCodeCU(String socode){
		return repoOMSO.findByOmsoSoCode(socode);
	}
}
