package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstScoreValue;
import com.MasterOrderManagement.Models.OmMstScoreValueCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstScoreValueRepository extends JpaRepository<OmMstScoreValue,OmMstScoreValueCompKey>{
	
	public List<OmMstScoreValue> findByOmsvScoreCodeContaining(String scorecode);

}
