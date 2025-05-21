package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstSektorEkonomi;
//import com.MasterOrderManagement.Models.OmMstBuAdminCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstSektorEkonomiRepository extends JpaRepository<OmMstSektorEkonomi,String>{
	
	public Optional<OmMstSektorEkonomi> findByOmseSecEcoId(String sececoid);

}
