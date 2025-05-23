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
@Table(name= "OM_MST_OBJ_PRICE_DTLS_BU")
@IdClass(OmMstObjPriceDtlsCompKey.class)
public class OmMstObjPriceDtls {
	@Id
    @Column(name = "BRANCH_ID", nullable = false, length = 5)
    private String omopdBranchId;
	
	@Id
    @Column(name = "REGION_ID", nullable = false, length = 5)
    private String omopdRegionId;
	
	@Id
    @Column(name = "OBJ_YEAR", nullable = false)
    private Integer omopdObjYear;

	@Id
    @Column(name = "OBJ_CODE", nullable = false, length = 10)
    private String omopdObjCode;
	
	@Id
    @Column(name = "TENOR", nullable = false)
    private Integer omopdTenor;

    @Column(name = "RATE",precision = 19, scale = 4)
    private BigDecimal omopdRate;

    @Column(name = "TOTAL_RATE",precision = 19, scale = 4)
    private BigDecimal omopdTotalRate;

    @Column(name = "GRS_RATE_PREMI",precision = 19, scale = 4)
    private BigDecimal omopdGrsRatePremi;

    @Column(name = "ADMIN",precision = 19, scale = 4)
    private BigDecimal omopdAdmin;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String omopdCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date omopdCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omopdUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omopdUpdateDate;

    @Column(name = "MIN_DP",precision = 19, scale = 4)
    private BigDecimal omopdMinDp;
    
    @Id
    @Column(name = "BUSS_UNIT", nullable = false, length = 15)
    private String omopdBussUnit;

    @Column(name = "MIN_RATE",precision = 19, scale = 4)
    private BigDecimal omopdMinRate;
}
