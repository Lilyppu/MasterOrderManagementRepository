package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstBussUnitProduct;
//import com.MasterOrderManagement.Models.OmMstBuAdminCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstBussUnitProductRepository extends JpaRepository<OmMstBussUnitProduct,String>{
	
	public Optional<OmMstBussUnitProduct> findByOmbupBussUnit(String bussunit);

}
