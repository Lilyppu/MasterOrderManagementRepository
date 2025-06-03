package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstDeviasiDetail;
//import com.MasterOrderManagement.Models.OmMstBuAdminCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstDeviasiDetailRepository extends JpaRepository<OmMstDeviasiDetail,Integer>{
	
	public Optional<OmMstDeviasiDetail> findByOmddNum(Integer num);

}
