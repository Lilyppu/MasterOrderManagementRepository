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
@Table(name= "OM_MST_OBJ_BRAND")
@IdClass(OmMstObjBrandCompKey.class)
public class OmMstObjBrand {
	@Id
    @Column(name = "OBJ_BRAND", nullable = false, length = 50)
    private String omobObjBrand;

    @Column(name = "BRAND_DESCR", length = 50)
    private String omobBrandDescr;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    @CreatedDate
    private String omobCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    private Date omobCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omobUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omobUpdateDate;
    
    @Id
    @Column(name = "OBJ_GRP", nullable = false, length = 10)
    private String omobObjGrp;

    @Column(name = "OBJ_MAKE", length = 20)
    private String omobObjMake;
    
    @Column(name = "COMP_ID", length = 5)
    private String omobCompId;
}
