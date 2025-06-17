package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstAddMinDp;
import com.MasterOrderManagement.Models.OmMstAddMinDpCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstAddMinDpRepository extends JpaRepository<OmMstAddMinDp,OmMstAddMinDpCompKey>{
	
	public List<OmMstAddMinDp> findByOmamdBussUnit(String bussunit);

}
