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
@Table(name= "OM_MST_SCORE_VALUE")
@IdClass(OmMstScoreValueCompKey.class)
public class OmMstScoreValue {
	@Id
	@Column(name = "SCORE_CODE", length = 10)
    private String omsvScoreCode;
	
	@Id
    @Column(name = "BUSS_UNIT", length = 15)
    private String omsvBussUnit;
	
	@Id
    @Column(name = "BRANCH_ID", length = 5)
    private String omsvBranchId;

    @Column(name = "FIELD_VALUE", length = 20)
    private String omsvFieldValue;

    @Column(name = "MIN_VALUE")
    private Integer omsvMinValue;

    @Column(name = "MAX_VALUE")
    private Integer omsvMaxValue;

    @Column(name = "SCORE")
    private Integer omsvScore;

    @Column(name = "CREATE_BY", length = 12)
    private String omsvCreatedBy;

    @Column(name = "CREATE_DATE")
    @CreatedDate
    private Date omsvCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omsvUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omsvUpdateDate;
    
    @Id
    @Column(name = "SEQ_NO")
    private Integer omsvSeqNo;
    
    @Id
    @Column(name = "PLATFORM_ID", length = 1, columnDefinition = "VARCHAR2(1 BYTE) DEFAULT 'K'")
    private String omsvPlatformId;
    
    @Column(name = "COMP_ID", length = 5)
    private String omsvCompId;
}
