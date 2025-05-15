package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstBuObjGroup;
import com.MasterOrderManagement.Models.OmMstBuObjGroupCompKey;

import jakarta.transaction.Transactional;

public interface IOmMstBuObjGroupRepository extends JpaRepository<OmMstBuObjGroup,OmMstBuObjGroupCompKey>{
	
	public List<OmMstBuObjGroup> findByOmbogBussUnitContaining(String bussunit);

}
