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
@Table(name= "OM_MST_SOURCE_ORDER")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstSourceOrder {
	@Id
    @Column(name = "SO_CODE", nullable = false, length = 5)
    private String omsoSoCode;

    @Column(name = "DESCRIPTION", length = 30)
    private String omsoDescription;

    @Column(name = "CREATED_BY", nullable = false, length = 15)
    private String omsoCreatedBy;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreatedDate
    private Date omsoCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String omsoLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    @LastModifiedDate
    private Date omsoLastupdateTimestamp;

    @Column(name = "BUSS_UNIT", length = 20)
    private String omsoBussUnit;

    @Column(name = "MS_TYPE")
    private Integer omsoMsType;

    @Column(name = "LOV_SUPL_SUB_TYPE", length = 2)
    private String omsoLovSuplSubType;

    @Column(name = "VISIBLE", length = 5)
    private String omsoVisible;

    @Column(name = "WITH_AGENT", length = 5)
    private String omsoWithAgent;
}
