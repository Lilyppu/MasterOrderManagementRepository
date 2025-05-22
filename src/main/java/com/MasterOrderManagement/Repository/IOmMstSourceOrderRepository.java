package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstSourceOrder;
//import com.MasterOrderManagement.Models.OmMstBuAdminCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstSourceOrderRepository extends JpaRepository<OmMstSourceOrder,String>{
	
	public Optional<OmMstSourceOrder> findByOmsoSoCode(String socode);

}
