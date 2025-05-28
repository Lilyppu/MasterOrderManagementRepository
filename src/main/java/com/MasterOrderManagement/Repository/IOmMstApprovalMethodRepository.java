package com.MasterOrderManagement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstApprovalMethod;
//import com.MasterOrderManagement.Models.OmMstBuAdminCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstApprovalMethodRepository extends JpaRepository<OmMstApprovalMethod,String>{
	
	public Optional<OmMstApprovalMethod> findByOmamMethodId(String methodid);

}
