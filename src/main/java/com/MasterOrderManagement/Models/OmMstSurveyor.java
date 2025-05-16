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
@Table(name= "OM_MST_SURVEYOR")
@IdClass(OmMstSurveyorCompKey.class)
public class OmMstSurveyor {
	 	@Id
	    @Column(name = "SURV_ID", nullable = false, length = 12)
	    private String omsvSurvId;

	    @Column(name = "SURV_DESCR", nullable = false, length = 30)
	    private String omsvSurvDescr;
	    
	    @Id
	    @Column(name = "KOOR_SURV_ID", nullable = false, length = 12)
	    private String omsvKoorSurvId;
	    
	    @Id
	    @Column(name = "BRANCH_ID", nullable = false, length = 5)
	    private String omsvBranchId;

	    @Column(name = "NIK", length = 12)
	    private String omsvNIK;

	    @Column(name = "MAX_APPL", nullable = false)
	    private Integer omsvMaxAppl;
	    
	    @Id
	    @Column(name = "VISIBLE", length = 1)
	    private String omsvVisible;

	    @Column(name = "CREATE_BY", nullable = false, length = 12)
	    private String omsvCreatedBy;

	    @Column(name = "CREATE_DATE", nullable = false)
	    private Date omsvCreateDate;

	    @Column(name = "UPDATE_BY", length = 12)
	    private String omsvUpdateBy;

	    @Column(name = "UPDATE_DATE")
	    private Date omsvUpdateDate;

	    @Column(name = "DIST_APPL")
	    private Integer omsvDistAppl;

	    @Column(name = "ZONE_ID", length = 10)
	    private String omsvZoneId;

	    @Column(name = "IS_BLOCKED", length = 1)
	    private String omsvIsBlocked;

	    @Column(name = "BLOCKED_BY", length = 20)
	    private String omsvBlockedBy;

	    @Column(name = "BLOCKED_DATE")
	    private Date omsvBlockedDate;

	    @Column(name = "BUSS_UNIT", length = 5)
	    private String omsvBussUnit;

	    @Column(name = "MAX_DATE")
	    private Date omsvMaxDate;
}
