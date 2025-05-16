package com.MasterOrderManagement.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "OM_MST_RATE_PARAM")
@IdClass(OmMstRateParamCompKey.class)
public class OmMstRateParam {
	 	@Id
		@Column(name = "BUSS_UNIT", length = 100)
	    private String omrpBussUnit;
	 	
	 	@Id
	    @Column(name = "BEGIN_YEAR")
	    private Integer omrpBeginYear;

	 	@Id
	    @Column(name = "END_YEAR")
	    private Integer omrpEndYear;

	 	@Id
	    @Column(name = "ARR_ADV", length = 2)
	    private String omrpArrAdv;

	 	@Id
	    @Column(name = "TENOR")
	    private Integer omrpTenor;

	 	@Id
	    @Column(name = "OBJ_MAKE", length = 20)
	    private String omrpObjMake;

	 	@Id
	    @Column(name = "OBJ_CATEGORY", length = 100)
	    private String omrpObjCategory;
	 	
	    @Column(name = "RATE_PARAMETER",precision = 19, scale = 4)
	    private BigDecimal omrpRateParameter;
}
