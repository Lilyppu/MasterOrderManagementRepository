package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstCollProcess;
import com.MasterOrderManagement.Models.OmMstCollProcessCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstCollProcessRepository extends JpaRepository<OmMstCollProcess,OmMstCollProcessCompKey>{
	
	public Optional<OmMstCollProcess> findByOmcpSuplCode(String suplcode);

}
