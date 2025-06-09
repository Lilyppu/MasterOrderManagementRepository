package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstHierarchies;
import com.MasterOrderManagement.Models.OmMstHierarchiesCompKey;

import jakarta.transaction.Transactional;

public interface IOmMstHierarchiesRepository extends JpaRepository<OmMstHierarchies, OmMstHierarchiesCompKey> {
	public List<OmMstHierarchies> findByOmhOfficeCodeContaining(String officecode);
}
