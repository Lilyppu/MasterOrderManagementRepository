package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstAdminStnk;
import com.MasterOrderManagement.Models.OmMstAdminStnkCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstAdminStnkRepository extends JpaRepository<OmMstAdminStnk,OmMstAdminStnkCompKey>{
	
	public Optional<OmMstAdminStnk> findByOmasSupplCode(String supplcode);

}
