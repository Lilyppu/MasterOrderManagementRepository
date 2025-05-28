package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstCollSubLocation;
import com.MasterOrderManagement.Models.OmMstCollSubLocationCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstCollSubLocationRepository extends JpaRepository<OmMstCollSubLocation,OmMstCollSubLocationCompKey>{
	
	public Optional<OmMstCollSubLocation> findByOmcslCollSubLocation(String collsublocation);

}
