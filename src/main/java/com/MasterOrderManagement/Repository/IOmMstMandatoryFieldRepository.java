package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstMandatoryField;
import com.MasterOrderManagement.Models.OmMstMandatoryFieldCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstMandatoryFieldRepository extends JpaRepository<OmMstMandatoryField,OmMstMandatoryFieldCompKey>{
	
	public List<OmMstMandatoryField> findByOmmfTabelNameContaining(String tabelname);

}
