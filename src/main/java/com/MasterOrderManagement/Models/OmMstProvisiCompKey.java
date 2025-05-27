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
public class OmMstProvisiCompKey implements Serializable {
	private String ompBussUnit;
	private BigDecimal ompPhStart;
	private BigDecimal ompPhEnd;
	private Integer ompTenorStart;
	private Integer ompTenorEnd;
	private String ompFlagSoAgen;
	private String ompFlagRo;
}
