package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstAdjustAdmin;
import com.MasterOrderManagement.Models.OmMstAdjustAdminCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstAdjustAdminRepository extends JpaRepository<OmMstAdjustAdmin,OmMstAdjustAdminCompKey>{
	
	public Optional<OmMstAdjustAdmin> findByOmaaBranchId(String branchid);

}
