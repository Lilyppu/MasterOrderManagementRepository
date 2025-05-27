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
public class OmMstScoreValueCompKey implements Serializable {
	private String omsvScoreCode;
	private String omsvBussUnit;
	private String omsvBranchId;
	private Integer omsvSeqNo;
	private String omsvPlatformId;
}
