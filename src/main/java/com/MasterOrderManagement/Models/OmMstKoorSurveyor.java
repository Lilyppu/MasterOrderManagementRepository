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
@Table(name= "OM_MST_KOOR_SURVEYOR")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstKoorSurveyor {
	@Id
    @Column(name = "KOOR_SURV_ID", nullable = false, length = 12)
    private String omksKoorSurvId;

    @Column(name = "KOOR_SURV_DESCR", nullable = false, length = 30)
    private String omksKoorSurvDescr;

    @Column(name = "BRANCH_ID", nullable = false, length = 5)
    private String omksBranchId;

    @Column(name = "NIK", nullable = false, length = 12)
    private String omksNik;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String omksCreateBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date omksCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omksUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omksUpdateDate;

    @Column(name = "VISIBLE", length = 1)
    private String omksVisible;

    @Column(name = "BLOCKED_DATE")
    private Date omksBlockedDate;

    @Column(name = "BLOCKED_DESCR", length = 30)
    private String omksBlockedDescr;

    @Column(name = "LOH_ID", length = 12)
    private String omksLohId;
}
