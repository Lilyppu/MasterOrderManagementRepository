package com.MasterOrderManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MasterOrderManagement.Models.OmMstKlasifikasiSipp;
import com.MasterOrderManagement.Repository.IOmMstKlasifikasiSippRepository;

@Service
public class ServiceOmMstKlasifikasiSipp {
	@Autowired
	IOmMstKlasifikasiSippRepository repoOMKSI;
	
	public List<OmMstKlasifikasiSipp> getOmksiAll(){
		return repoOMKSI.findAll();
	}
	
	public List<OmMstKlasifikasiSipp> getOmksiByTipePembiayaanList(String tipepembiayaan){
		return repoOMKSI.findByOmksiTipePembiayaanContaining(tipepembiayaan);
	}
}
