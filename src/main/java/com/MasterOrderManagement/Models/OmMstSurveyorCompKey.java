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
public class OmMstSurveyorCompKey implements Serializable {
	private String omsvSurvId;
	private String omsvKoorSurvId;
	private String omsvBranchId;
	private String omsvVisible;
}
