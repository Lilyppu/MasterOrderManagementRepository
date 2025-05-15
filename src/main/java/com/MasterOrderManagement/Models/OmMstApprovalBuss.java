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
@Table(name= "OM_MST_APPROVAL_BUSS")
@IdClass(OmMstApprovalBussCompKey.class)
public class OmMstApprovalBuss {
	
	@Id
    @Column(name = "BUSS_UNIT", nullable = false, length = 15)
    private String omabBussUnit;
	
	@Id
    @Column(name = "APPR_ID", nullable = false, length = 4)
    private String omabApprId;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String omabCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    private Date omabCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omabUpdateBy;

    @Column(name = "UPDATE_DATE")
    private Date omabUpdateDate;
}
