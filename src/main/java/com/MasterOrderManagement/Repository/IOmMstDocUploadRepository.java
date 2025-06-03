package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstDocUpload;
import com.MasterOrderManagement.Models.OmMstDocUploadCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstDocUploadRepository extends JpaRepository<OmMstDocUpload,OmMstDocUploadCompKey>{
	
	public List<OmMstDocUpload> findByOmduDocCodeContaining(String doccode);

}
