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
public class OmMstBuAdminCompKey implements Serializable {
	private String ombaBussUnit;
	private BigDecimal ombaPrincipalStart;
	private BigDecimal ombaPrincipalEnd;
}
