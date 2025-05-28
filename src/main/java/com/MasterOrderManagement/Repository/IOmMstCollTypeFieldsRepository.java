package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstCollTypeFields;
import com.MasterOrderManagement.Models.OmMstCollTypeFieldsCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstCollTypeFieldsRepository extends JpaRepository<OmMstCollTypeFields,OmMstCollTypeFieldsCompKey>{
	
	public List<OmMstCollTypeFields> findByOmctfCollType(Integer colltype);

}
