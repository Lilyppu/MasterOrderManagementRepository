package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstHierPerLvl;
import com.MasterOrderManagement.Models.OmMstHierPerLvlCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstHierPerLvlRepository extends JpaRepository<OmMstHierPerLvl,OmMstHierPerLvlCompKey>{
	
	public List<OmMstHierPerLvl> findByOmhplOfficeCodeContaining(String officecode);

}
