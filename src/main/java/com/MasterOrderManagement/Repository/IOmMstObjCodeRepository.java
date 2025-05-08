package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstObjCode;
import com.MasterOrderManagement.Models.OmMstObjCodeCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstObjCodeRepository extends JpaRepository<OmMstObjCode,OmMstObjCodeCompKey>{
	
	public Optional<OmMstObjCode> findByOmocObjCode(String objcode);

}
