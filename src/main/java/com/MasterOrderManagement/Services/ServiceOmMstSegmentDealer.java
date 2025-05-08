package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstSegmentDealer;
import com.MasterOrderManagement.Repository.IOmMstSegmentDealerRepository;

@Service
public class ServiceOmMstSegmentDealer {
	@Autowired
	IOmMstSegmentDealerRepository repoOMSD;
	
	public List<OmMstSegmentDealer> getOmsdAll(){
		return repoOMSD.findAll();
	}
	
	public Optional<OmMstSegmentDealer> getOmsdBydSegmentDealerCU(String segmentdealer){
		return repoOMSD.findByOmsdSegmentDealer(segmentdealer);
	}
}
