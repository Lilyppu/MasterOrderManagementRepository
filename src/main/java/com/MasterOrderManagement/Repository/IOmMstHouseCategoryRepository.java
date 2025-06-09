package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstHouseCategory;
//import com.MasterOrderManagement.Models.OmMstBuAdminCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstHouseCategoryRepository extends JpaRepository<OmMstHouseCategory,String>{
	
	public Optional<OmMstHouseCategory> findByOmhcaHouseCateId(String housecateid);

}
