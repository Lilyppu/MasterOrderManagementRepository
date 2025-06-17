package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstObjAdmin;
import com.MasterOrderManagement.Models.OmMstObjAdminCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstObjAdminRepository extends JpaRepository<OmMstObjAdmin,OmMstObjAdminCompKey>{
	
	public Optional<OmMstObjAdmin> findByOmoaFeeId(String feeid);

}
