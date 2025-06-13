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
@Table(name= "OM_MST_MKT_PROGRAM")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstMktProgram {
	@Id
    @Column(name = "PROG_CODE", nullable = false, length = 5)
    private String ommpProgCode;

    @Column(name = "PROG_DESC", nullable = false, length = 30)
    private String ommpProgDesc;

    @Column(name = "PROG_OBJT_GROUP", length = 10)
    private String ommpProgObjtGroup;

    @Column(name = "PROG_VALID_DATE")
    private Date ommpProgValidDate;

    @Column(name = "PROG_INVALID_DATE")
    private Date ommpProgInvalidDate;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String ommpCreateBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date ommpCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String ommpUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date ommpUpdateDate;

    @Column(name = "PLATFORM_ID", length = 15)
    private String ommpPlatformId;

    @Column(name = "COY_ID", length = 5)
    private String ommpCoyId;

    @Column(name = "POT_MONTH_INST")
    private Integer ommpPotMonthInst;
}
