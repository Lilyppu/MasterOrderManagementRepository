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
public class OmMstObjPriceDtlsCompKey implements Serializable {
	private String omopdBranchId;
	private String omopdRegionId;
	private Integer omopdObjYear;
	private String omopdObjCode;
	private Integer omopdTenor;
	private String omopdBussUnit;
}
