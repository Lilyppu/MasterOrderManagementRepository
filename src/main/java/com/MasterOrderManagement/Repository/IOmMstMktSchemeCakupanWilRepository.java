package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstMktSchemeCakupanWil;
import com.MasterOrderManagement.Models.OmMstMktSchemeCakupanWilCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstMktSchemeCakupanWilRepository extends JpaRepository<OmMstMktSchemeCakupanWil,OmMstMktSchemeCakupanWilCompKey>{
	
	public List<OmMstMktSchemeCakupanWil> findByOmmscwRegionalIdContaining(String regionalid);

}
