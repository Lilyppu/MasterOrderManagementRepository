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
@Table(name= "OM_MST_DEVIASI")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstDeviasi {
	@Id
    @Column(name = "NUM")
    private Integer omdeNum;

    @Column(name = "SEQ")
    private Integer omdeSeq;

    @Column(name = "DEV_ID", length = 10)
    private String omdeDevId;

    @Column(name = "DEV_DESC", length = 500)
    private String omdeDevDesc;

    @Column(name = "OFFICE_CODE", length = 5)
    private String omdeOfficeCode;

    @Column(name = "ACTIVE", length = 1)
    private String omdeActive;

    @Column(name = "BUS_UNIT", length = 100)
    private String omdeBusUnit;

    @Column(name = "DEV_LEVEL", length = 1)
    private String omdeDevLevel;

    @Column(name = "CREATED_BY", length = 12)
    private String omdeCreatedBy;

    @Column(name = "CREATED_TIMESTAMP")
    @CreatedDate
    private Date omdeCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 12)
    private String omdeLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    @LastModifiedDate
    private Date omdeLastupdateTimestamp;

    @Column(name = "SOURCE_VALUES", length = 500)
    private String omdeSourceValues;

    @Column(name = "STORE_PROCS", length = 500)
    private String omdeStoreProcs;

    @Column(name = "DEV_HIDE_BU", length = 100)
    private String omdeDevHideBu;
    
    @Column(name = "COMP_ID", length = 5)
    private String omdeCompId;
}
