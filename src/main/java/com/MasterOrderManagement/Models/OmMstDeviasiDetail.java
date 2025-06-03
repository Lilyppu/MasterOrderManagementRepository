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
@Table(name= "OM_MST_DEVIASI_DETAIL")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstDeviasiDetail {
	@Id
    @Column(name = "NUM")
    private Integer omddNum;

    @Column(name = "BUS_UNIT", length = 100)
    private String omddBusUnit;

    @Column(name = "DEV_ID", length = 10)
    private String omddDevId;

    @Column(name = "DEVDET_ID", length = 4)
    private String omddDevdetId;

    @Column(name = "DEVDET_DESC", length = 300)
    private String omddDevdetDesc;

    @Column(name = "DEVDET_LEVEL")
    private Integer omddDevdetLevel;

    @Column(name = "JOB_CODE", length = 128)
    private String omddJobCode;

    @Column(name = "IS_ACTIVE", length = 1)
    private String omddIsActive;

    @Column(name = "SOURCE_VALUES", length = 500)
    private String omddSourceValues;

    @Column(name = "STORE_PROCS", length = 500)
    private String omddStoreProcs;

    @Column(name = "CREATED_BY", length = 12)
    private String omddCreatedBy;

    @Column(name = "CREATED_TIMESTAMP")
    @CreatedDate
    private Date omddCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 12)
    private String omddLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    @LastModifiedDate
    private Date omddLastupdateTimestamp;

    @Column(name = "DEV_NUM")
    private Integer omddDevNum;

    @Column(name = "JOB_CODE_LVL3", length = 128)
    private String omddJobCodeLvl3;

    @Column(name = "JOB_CODE_LVL4", length = 128)
    private String omddJobCodeLvl4;

    @Column(name = "DEV_HIDE_BU", length = 100)
    private String omddDevHideBu;
}
