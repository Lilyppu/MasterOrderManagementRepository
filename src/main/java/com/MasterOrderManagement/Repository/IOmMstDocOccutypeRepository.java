package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstDocOccutype;
import com.MasterOrderManagement.Models.OmMstDocOccutypeCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstDocOccutypeRepository extends JpaRepository<OmMstDocOccutype,OmMstDocOccutypeCompKey>{
	
	public List<OmMstDocOccutype> findByOmdoOcptTypeContaining(String ocpttype);

}
