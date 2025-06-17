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
@Table(name= "OM_MST_PROVISI")
@IdClass(OmMstProvisiCompKey.class)
public class OmMstProvisi {
	@Id
	@Column(name = "BUSS_UNIT", length = 15)
    private String ompBussUnit;
	
	@Id
    @Column(name = "PH_START",precision = 19, scale = 4)
    private BigDecimal ompPhStart;
	
	@Id
    @Column(name = "PH_END",precision = 19, scale = 4)
    private BigDecimal ompPhEnd;
	
	@Id
    @Column(name = "TENOR_START")
    private Integer ompTenorStart;
	
	@Id
    @Column(name = "TENOR_END")
    private Integer ompTenorEnd;
	
	@Id
    @Column(name = "FLAG_SO_AGEN", length = 1)
    private String ompFlagSoAgen;
	
	@Id
    @Column(name = "FLAG_RO", length = 1)
    private String ompFlagRo;

    @Column(name = "MAX_PCT_PROVISI",precision = 19, scale = 4)
    private BigDecimal ompMaxPctProvisi;

    @Column(name = "PCT_PROVISI_TO_DEAL",precision = 19, scale = 4)
    private BigDecimal ompPctProvisiToDeal;

    @Column(name = "CREATE_BY", length = 12)
    private String ompCreatedBy;

    @Column(name = "CREATE_DATE")
    @CreatedDate
    private Date ompCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String ompUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date ompUpdateDate;

    @Column(name = "MIN_PCT_PROVISI",precision = 19, scale = 4)
    private BigDecimal ompMinPctProvisi;

    @Column(name = "PCT_BUNGA",precision = 19, scale = 4)
    private BigDecimal ompPctBunga;

    @Column(name = "PCT_DP",precision = 19, scale = 4)
    private BigDecimal ompPctDp;
    
    @Column(name = "COMP_ID", length = 5)
    private String ompCompId;
}
