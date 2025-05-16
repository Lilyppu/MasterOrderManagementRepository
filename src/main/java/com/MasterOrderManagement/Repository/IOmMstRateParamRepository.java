package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstRateParam;
import com.MasterOrderManagement.Models.OmMstRateParamCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstRateParamRepository extends JpaRepository<OmMstRateParam,OmMstRateParamCompKey>{
	
	public List<OmMstRateParam> findByOmrpBussUnit(String bussunit);

}
