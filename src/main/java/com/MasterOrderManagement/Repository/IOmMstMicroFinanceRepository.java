package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstMicroFinance;
//import com.MasterOrderManagement.Models.OmMstAdjustAdminCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstMicroFinanceRepository extends JpaRepository<OmMstMicroFinance,Integer>{
	
	public Optional<OmMstMicroFinance> findByOmmfSeqNo(Integer seqno);

}
