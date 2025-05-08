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
public class OmMstScoreHouseCompKey implements Serializable {
	private String omshBussUnit;
	private String omshHouseStat;
	private String omshBranchId;

}
