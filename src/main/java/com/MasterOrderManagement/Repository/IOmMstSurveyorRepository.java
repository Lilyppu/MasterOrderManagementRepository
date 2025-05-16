package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstSurveyor;
import com.MasterOrderManagement.Models.OmMstSurveyorCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstSurveyorRepository extends JpaRepository<OmMstSurveyor,OmMstSurveyorCompKey>{
	
	public Optional<OmMstSurveyor> findByOmsvSurvId(String survid);

}
