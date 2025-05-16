package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstObjModel;
import com.MasterOrderManagement.Models.OmMstObjModelCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstObjModelRepository extends JpaRepository<OmMstObjModel,OmMstObjModelCompKey>{
	
	public Optional<OmMstObjModel> findByOmomModelNo(String modelno);

}
