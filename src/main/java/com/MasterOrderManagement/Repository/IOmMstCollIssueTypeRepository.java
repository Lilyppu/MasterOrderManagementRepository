package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstCollIssueType;
//import com.MasterOrderManagement.Models.OmMstBuAdminCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstCollIssueTypeRepository extends JpaRepository<OmMstCollIssueType,String>{
	
	public Optional<OmMstCollIssueType> findByOmcitIssueType(String issuetype);
}
