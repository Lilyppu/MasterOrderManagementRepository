package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstScoreHouse;
import com.MasterOrderManagement.Models.OmMstScoreHouseCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstScoreHouseRepository extends JpaRepository<OmMstScoreHouse,OmMstScoreHouseCompKey>{
	
	public Optional<OmMstScoreHouse> findByOmshBussUnit(String bussunit);

}
