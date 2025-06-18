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
@Table(name= "OM_MST_DEV_APPR_REASON")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstDevApprReason {
	@Id
    @Column(name = "NUM")
    private Integer omdarNum;

    @Column(name = "GRP", length = 10)
    private String omdarGrp;

    @Column(name = "DESCR", length = 100)
    private String omdarDescr;

    @Column(name = "IS_ACTIVE", length = 1)
    private String omdarIsActive;
    
    @Column(name = "COMP_ID", length = 5)
    private String omdarCompId;
}
