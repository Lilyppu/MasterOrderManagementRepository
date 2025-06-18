package com.MasterOrderManagement.Models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
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
	    private String omsvySurvId;

	    @Column(name = "SURV_DESCR", nullable = false, length = 30)
	    private String omsvSurvyDescr;
	    
	    @Id
	    @Column(name = "KOOR_SURV_ID", nullable = false, length = 12)
	    private String omsvyKoorSurvId;
	    
	    @Id
	    @Column(name = "BRANCH_ID", nullable = false, length = 5)
	    private String omsvyBranchId;

	    @Column(name = "NIK", length = 12)
	    private String omsvyNIK;

	    @Column(name = "MAX_APPL", nullable = false)
	    private Integer omsvyMaxAppl;
	    
	    @Id
	    @Column(name = "VISIBLE", length = 1)
	    private String omsvyVisible;

	    @Column(name = "CREATE_BY", nullable = false, length = 12)
	    private String omsvyCreatedBy;

	    @Column(name = "CREATE_DATE", nullable = false)
	    @CreatedDate
	    private Date omsvyCreateDate;

	    @Column(name = "UPDATE_BY", length = 12)
	    private String omsvyUpdateBy;

	    @Column(name = "UPDATE_DATE")
	    @LastModifiedDate
	    private Date omsvyUpdateDate;

	    @Column(name = "DIST_APPL")
	    private Integer omsvyDistAppl;

	    @Column(name = "ZONE_ID", length = 10)
	    private String omsvyZoneId;

	    @Column(name = "IS_BLOCKED", length = 1)
	    private String omsvyIsBlocked;

	    @Column(name = "BLOCKED_BY", length = 20)
	    private String omsvyBlockedBy;

	    @Column(name = "BLOCKED_DATE")
	    private Date omsvyBlockedDate;

	    @Column(name = "BUSS_UNIT", length = 5)
	    private String omsvyBussUnit;

	    @Column(name = "MAX_DATE")
	    private Date omsvyMaxDate;
	    
	    @Column(name = "COMP_ID", length = 5)
	    private String omsvyCompId;
}
