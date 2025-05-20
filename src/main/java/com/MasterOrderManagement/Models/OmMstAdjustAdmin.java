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
@Table(name= "OM_MST_ADJUST_ADMIN")
@IdClass(OmMstAdjustAdminCompKey.class)
public class OmMstAdjustAdmin {
	
	@Id
    @Column(name = "BRANCH_ID", nullable = false, length = 5)
    private String omaaBranchId;
	
	@Id
    @Column(name = "SUPP_CODE", nullable = false, length = 50)
    private String omaaSuppCode;

	@Id
    @Column(name = "BUSS_UNIT", nullable = false, length = 15)
    private String omaaBussUnit;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String omaaCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date omaaCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omaaUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omaaUpdateDate;
}
