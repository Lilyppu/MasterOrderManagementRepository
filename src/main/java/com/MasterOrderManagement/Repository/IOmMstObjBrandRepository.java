package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstObjBrand;
import com.MasterOrderManagement.Models.OmMstObjBrandCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstObjBrandRepository extends JpaRepository<OmMstObjBrand,OmMstObjBrandCompKey>{
	
	public Optional<OmMstObjBrand> findByOmobObjBrand(String objbrand);

}
