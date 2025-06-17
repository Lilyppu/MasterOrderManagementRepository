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
@Table(name= "OM_MST_HIER_PER_LVL")
@IdClass(OmMstHierPerLvlCompKey.class)
public class OmMstHierPerLvl {
	@Id
	@Column(name = "OFFICE_CODE", length = 5)
    private String omhplOfficeCode;
	
	@Id
    @Column(name = "JOB_LVL")
    private Integer omhplJobLvl;

    @Column(name = "DESCRIPTION", length = 100)
    private String omhplDescription;

    @Column(name = "IS_APPROVE", length = 2)
    private String omhplIsApprove;

    @Column(name = "IS_RETURN", length = 2)
    private String omhplIsReturn;

    @Column(name = "IS_CANCEL", length = 2)
    private String omhplIsCancel;

    @Column(name = "IS_REJECT", length = 2)
    private String omhplIsReject;

    @Column(name = "AMT_BEGIN",precision = 19, scale = 4)
    private BigDecimal omhplAmtBegin;

    @Column(name = "AMT_END",precision = 19, scale = 4)
    private BigDecimal omhplAmtEnd;

    @Column(name = "UNIT_BEGIN")
    private Integer omhplUnitBegin;

    @Column(name = "UNIT_END")
    private Integer omhplUnitEnd;

    @Column(name = "NETT_RATE_BEGIN")
    private Integer omhplNettRateBegin;

    @Column(name = "NETT_RATE_END")
    private Integer omhplNettRateEnd;

    @Column(name = "IS_FINAL_APPROVER", length = 2)
    private String omhplIsFinalApprover;

    @Column(name = "CREATED_BY", nullable = false, length = 12)
    private String omhplCreatedBy;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreatedDate
    private Date omhplCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 12)
    private String omhplLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    @LastModifiedDate
    private Date omhplLastupdateTimestamp;

    @Column(name = "SCORE_MEAN", length = 20)
    private String omhplScoreMean;
    
    @Id
    @Column(name = "BUSS_UNIT", length = 100)
    private String omhplBussUnit;

    @Column(name = "IS_STOPPER", length = 2, columnDefinition = "VARCHAR2(2 BYTE) DEFAULT 'N'")
    private String omhplIsStopper;
    
    @Column(name = "COMP_ID", length = 15)
    private String omhplCompId;
}
