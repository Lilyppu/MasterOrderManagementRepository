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
public class OmMstRateParamCompKey implements Serializable {
	private String omrpBussUnit;
	private Integer omrpBeginYear;
	private Integer omrpEndYear;
	private String omrpArrAdv;
	private Integer omrpTenor;
	private String omrpObjMake;
	private String omrpObjCategory;
}
