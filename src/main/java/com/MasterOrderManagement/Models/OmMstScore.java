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
@Table(name= "OM_MST_SCORE")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstScore {
	@Id
    @Column(name = "SCORE_CODE", nullable = false, length = 10)
    private String omsScoreCode;

    @Column(name = "SCORE_DESC", nullable = false, length = 100)
    private String omsScoreDesc;

    @Column(name = "PARAMETER", nullable = false, length = 500)
    private String omsParameter;

    @Column(name = "FIELD_TYPE", nullable = false, length = 1)
    private String omsFieldType;

    @Column(name = "VISIBLE", nullable = false, length = 1)
    private String omsVisible;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String omsCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date omsCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omsUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omsUpdateDate;

    @Column(name = "LOV_PARAMETER", length = 500)
    private String omsLovParameter;

    @Column(name = "IS_BY_BRANCH", length = 1)
    private String omsIsByBranch;

    @Column(name = "CUST_TYPE", length = 1)
    private String omsCustType;

    @Column(name = "PARAMETER2", length = 500)
    private String omsParameter2;
}
