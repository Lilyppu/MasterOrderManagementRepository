package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstObjPrice;
import com.MasterOrderManagement.Models.OmMstObjPriceCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstObjPriceRepository extends JpaRepository<OmMstObjPrice,OmMstObjPriceCompKey>{
	
	public List<OmMstObjPrice> findByOmopObjCodeContaining(String objcode);

}
