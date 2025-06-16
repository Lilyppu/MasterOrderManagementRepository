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
@Table(name= "OM_MST_COLL_ISSUE_TYPE")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstCollIssueType {
	@Id
    @Column(name = "ISSUE_TYPE", nullable = false, length = 5)
    private String omcitIssueType;

    @Column(name = "ISSUE_DESC", nullable = false, length = 50)
    private String omcitIssueDesc;

    @Column(name = "COLL_STATUS", length = 3)
    private String omcitCollStatus;

    @Column(name = "COLL_SUB_LOCATION", length = 20)
    private String omcitCollSubLocation;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    @CreatedDate
    private String omcitCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    private Date omcitCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omcitUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omcitUpdateDate;

    @Column(name = "CHANGE_LOCATION", length = 1)
    private String omcitChangeLocation;

    @Column(name = "RETURN_PERIOD")
    private Integer omcitReturnPeriod;

    @Column(name = "VISIBLE", length = 1, columnDefinition = "VARCHAR2(1 BYTE) DEFAULT 'Y'")
    private String omcitVisible;
    
    @Column(name = "COMP_ID", length = 5)
    private String omcitCompId;
}
