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
@Table(name= "OM_MST_SCORE_HOUSE")
@IdClass(OmMstScoreHouseCompKey.class)
public class OmMstScoreHouse {
	
	@Id
    @Column(name = "BUSS_UNIT", nullable = false, length = 15)
    private String omshBussUnit;
	
	@Id
    @Column(name = "HOUSE_STAT", nullable = false, length = 5)
    private String omshHouseStat;
	
	@Id
    @Column(name = "BRANCH_ID", nullable = false, length = 5)
    private String omshBranchId;

    @Column(name = "SCORE")
    private Integer omshScore;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    @CreatedDate
    private String omshCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    private Date omshCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omshUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omshUpdateDate;
    
    @Column(name = "COMP_ID", length = 5)
    private String omshCompId;
}
