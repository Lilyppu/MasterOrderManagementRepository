package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstApprovalId;
import com.MasterOrderManagement.Models.OmMstApprovalIdCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstApprovalIdRepository extends JpaRepository<OmMstApprovalId,OmMstApprovalIdCompKey>{
	
	public Optional<OmMstApprovalId> findByOmaiApprId(String apprid);
}
