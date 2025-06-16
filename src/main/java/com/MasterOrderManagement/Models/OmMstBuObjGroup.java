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
@Table(name= "OM_MST_BU_OBJ_GROUP")
@IdClass(OmMstBuObjGroupCompKey.class)
public class OmMstBuObjGroup {
	@Id
    @Column(name = "BUSS_UNIT", nullable = false, length = 5)
    private String ombogBussUnit;
	
	@Id
    @Column(name = "OBJ_GRP", nullable = false, length = 10)
    private String ombogObjGrp;
	
	@Id
    @Column(name = "NEW_USED", nullable = false, length = 1)
    private String ombogNewUsed;

    @Column(name = "SEGMENT_PROD", length = 3)
    private String ombogSegmentProd;

    @Column(name = "SEGMENT_NO")
    private Integer ombogSegmentNo;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String ombogCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date ombogCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String ombogUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date ombogUpdateDate;
    
    @Column(name = "COMP_ID", length = 5)
    private String ombogCompId;
}
