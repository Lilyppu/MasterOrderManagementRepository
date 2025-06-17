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
@Table(name= "OM_MST_OBJ_ADMIN")
@IdClass(OmMstObjAdminCompKey.class)
public class OmMstObjAdmin {
	@Id
    @Column(name = "TOP_ID")
    private Integer omoaTopId;
	
	@Id
    @Column(name = "FEE_ID", nullable = false, length = 15)
    private String omoaFeeId;

    @Column(name = "FEE_DESCRIPTION", length = 50)
    private String omoaFeeDescription;

    @Column(name = "FEE_AMOUNT", precision = 19, scale = 4)
    private BigDecimal omoaFeeAmount;

    @Column(name = "CREATED_BY", nullable = false, length = 15)
    private String omoaCreatedBy;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreatedDate
    private Date omoaCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String omoaLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    @LastModifiedDate
    private Date omoaLastupdateTimestamp;
    
    @Id
    @Column(name = "BUSS_UNIT", length = 20)
    private String omoaBussUnit;

    @Column(name = "COMP_ID", length = 5)
    private String omoaCompId;
}
