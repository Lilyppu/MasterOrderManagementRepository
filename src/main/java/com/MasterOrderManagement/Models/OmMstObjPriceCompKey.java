package com.MasterOrderManagement.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OmMstObjPriceCompKey implements Serializable {
	private String omopBranchId;
	private String omopRegionId;
	private Integer omopObjYear;
	private String omopObjCode;
	private String omopObjGrp;
	private Integer omopObjSeq;
}
