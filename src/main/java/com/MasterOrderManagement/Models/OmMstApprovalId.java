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
@Table(name= "OM_MST_APPROVAL_ID")
@IdClass(OmMstApprovalIdCompKey.class)
public class OmMstApprovalId {
	
	@Id
    @Column(name = "APPR_ID", nullable = false, length = 4)
    private String omaiApprId;

    @Column(name = "APPR_DESC", nullable = false, length = 30)
    private String omaiApprDesc;

    @Column(name = "APPR_VALID_DATE")
    private Date omaiApprValidDate;

    @Column(name = "APPR_INVALID_DATE")
    private Date omaiApprInvalidDate;

    @Column(name = "VISIBLE", length = 1)
    private String omaiVisible;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String omaiCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date omaiCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omaiUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omaiUpdateDate;
    
    @Id
    @Column(name = "METHOD_ID", length = 5)
    private String omaiMethodId;
}
