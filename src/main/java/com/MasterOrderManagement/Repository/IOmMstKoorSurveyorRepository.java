package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstKoorSurveyor;
//import com.MasterOrderManagement.Models.OmMstBuAdminCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstKoorSurveyorRepository extends JpaRepository<OmMstKoorSurveyor,String>{
	
	public Optional<OmMstKoorSurveyor> findByOmksKoorSurvId(String koorsurvid);

}
