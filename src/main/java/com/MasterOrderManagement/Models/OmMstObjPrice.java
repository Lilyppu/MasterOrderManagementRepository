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
@Table(name= "OM_MST_OBJ_PRICE")
@IdClass(OmMstObjPriceCompKey.class)
public class OmMstObjPrice {
	 	@Id
	    @Column(name = "BRANCH_ID", nullable = false, length = 5)
	    private String omopBranchId;
	 	
	 	@Id
	    @Column(name = "REGION_ID", nullable = false, length = 5)
	    private String omopRegionId;
	 	
	 	@Id
	    @Column(name = "OBJ_YEAR", nullable = false)
	    private Integer omopObjYear;

	    @Column(name = "OBJ_PRICE",precision = 19, scale = 4)
	    private BigDecimal omopObjPrice;

	    @Column(name = "CREATE_BY", nullable = false, length = 12)
	    private String omopCreatedBy;

	    @Column(name = "CREATE_DATE", nullable = false)
	    @CreatedDate
	    private Date omopCreateDate;

	    @Column(name = "UPDATE_BY", length = 12)
	    private String omopUpdateBy;

	    @Column(name = "UPDATE_DATE")
	    @LastModifiedDate
	    private Date omopUpdateDate;
	    
	    @Id
	    @Column(name = "OBJ_CODE", nullable = false, length = 10)
	    private String omopObjCode;
	    
	    @Id
	    @Column(name = "OBJ_GRP", nullable = false, length = 10)
	    private String omopObjGrp;

	    @Column(name = "OBJ_SEQ_DESC", length = 25, columnDefinition = "VARCHAR2(25 BYTE) DEFAULT 'STD_PRICE'")
	    private String omopObjSeqDesc;
	    
	    @Id
	    @Column(name = "OBJ_SEQ", columnDefinition = "NUMBER DEFAULT 1")
	    private Integer omopObjSeq;

	    @Column(name = "OBJ_PRICE_REAL",precision = 19, scale = 4)
	    private BigDecimal omopObjPriceReal;

	    @Column(name = "PENDAPATAN",precision = 19, scale = 4)
	    private BigDecimal omopPendapatan;
	    
	    @Column(name = "COMP_ID", length = 5)
	    private String omopCompId;
}
