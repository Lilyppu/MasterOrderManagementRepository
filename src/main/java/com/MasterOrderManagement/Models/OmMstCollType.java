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
@Table(name= "OM_MST_COLL_TYPE")
//IdClass(OmMstBuAdminCompKey.class)
public class OmMstCollType {
	
	@Id
    @Column(name = "COLL_TYPE", nullable = false)
    private Integer omctCollType;

    @Column(name = "COLL_DESC", length = 30)
    private String omctCollDesc;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    @CreatedDate
    private String omctCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    private Date omctCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omctUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omctUpdateDate;

    @Column(name = "IS_COLLATERAL", length = 1)
    private String omctIsCollateral;
    
    @Column(name = "COMP_ID", length = 5)
    private String omctCompId;
}
