package com.MasterOrderManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MasterOrderManagement.Models.OmMstKlasifikasiSipp;
import com.MasterOrderManagement.Models.OmMstKlasifikasiSippCompKey;

import jakarta.transaction.Transactional;
public interface IOmMstKlasifikasiSippRepository  extends JpaRepository<OmMstKlasifikasiSipp,OmMstKlasifikasiSippCompKey>{
	
	public List<OmMstKlasifikasiSipp> findByOmksiTipePembiayaanContaining(String tipepembiayaan);

}
