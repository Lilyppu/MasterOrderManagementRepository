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
@Table(name= "OM_MST_OBJ_WARNA")
@IdClass(OmMstObjWarnaCompKey.class)
public class OmMstObjWarna {
	@Id
    @Column(name = "OBJ_WARNA", nullable = false, length = 50)
    private String omowObjWarna;

    @Column(name = "CREATED_BY", nullable = false, length = 15)
    private String omowCreatedBy;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreatedDate
    private Date omowCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String omowLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    @LastModifiedDate
    private Date omowLastupdateTimestamp;
    
    @Id
    @Column(name = "OBJ_GRP", nullable = false, length = 10)
    private String omowObjGrp;
}
