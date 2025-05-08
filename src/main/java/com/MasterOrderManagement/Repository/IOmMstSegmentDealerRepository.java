package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstSegmentDealer;

import jakarta.transaction.Transactional;
public interface IOmMstSegmentDealerRepository extends JpaRepository<OmMstSegmentDealer,String>{
	
	public Optional<OmMstSegmentDealer> findByOmsdSegmentDealer(String segmentdealer);

}
