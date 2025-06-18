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
@Table(name= "OM_MST_INCENTIVE_PARAM")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstIncentiveParam {
	@Id
    @Column(name = "PARAM_CODE", nullable = false, length = 10)
    private String omipParamCode;

    @Column(name = "PARAM_DESC", nullable = false, length = 100)
    private String omipParamDesc;

    @Column(name = "PARAMETER", nullable = false, length = 500)
    private String omipParameter;

    @Column(name = "FIELD_TYPE", nullable = false, length = 1)
    private String omipFieldType;

    @Column(name = "VISIBLE", nullable = false, length = 1)
    private String omipVisible;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String omipCreateBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date omipCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omipUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omipUpdateDate;

    @Column(name = "LOV_PARAMETER", length = 500)
    private String omipLovParameter;

    @Column(name = "IS_BY_BRANCH", length = 1)
    private String omipIsByBranch;

    @Column(name = "CUST_TYPE", length = 1)
    private String omipCustType;
    
    @Column(name = "COMP_ID", length = 5)
    private String omipCompId;
}
