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
public class OmMstAddMinDpCompKey implements Serializable {
	private String omamdBussUnit;
	private String omamdBpkbRelation;
	private String omamdObjCategory;
	private Double omamdPctF6pdo31rwStart;
	private Double omamdPctF6pdo31rwEnd;
}
