package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstProvisi;
import com.MasterOrderManagement.Models.OmMstProvisiCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstProvisiRepository extends JpaRepository<OmMstProvisi,OmMstProvisiCompKey>{
	
	public List<OmMstProvisi> findByOmpBussUnit(String bussunit);

}
