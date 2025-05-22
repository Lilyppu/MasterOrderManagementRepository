package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstObjWarna;
import com.MasterOrderManagement.Models.OmMstObjWarnaCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstObjWarnaRepository extends JpaRepository<OmMstObjWarna,OmMstObjWarnaCompKey>{
	
	public Optional<OmMstObjWarna> findByOmowObjWarna(String objwarna);

}
