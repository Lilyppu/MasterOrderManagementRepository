package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstApprovalBuss;
import com.MasterOrderManagement.Models.OmMstApprovalBussCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstApprovalBussRepository extends JpaRepository<OmMstApprovalBuss,OmMstApprovalBussCompKey>{
	
	public Optional<OmMstApprovalBuss> findByOmabBussUnit(String bussunit);
}
