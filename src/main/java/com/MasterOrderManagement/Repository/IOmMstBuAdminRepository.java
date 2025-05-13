package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstBuAdmin;
import com.MasterOrderManagement.Models.OmMstBuAdminCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstBuAdminRepository extends JpaRepository<OmMstBuAdmin,OmMstBuAdminCompKey>{
	
	public Optional<OmMstBuAdmin> findByOmbaBussUnit(String bussunit);
}
