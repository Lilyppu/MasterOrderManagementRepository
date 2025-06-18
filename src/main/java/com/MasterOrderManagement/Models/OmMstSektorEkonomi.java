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
@Table(name= "OM_MST_SEKTOR_EKONOMI")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstSektorEkonomi {
	@Id
    @Column(name = "SEC_ECO_ID", length = 20)
    private String omseSecEcoId;

    @Column(name = "SEC_ECO_NAME", length = 200)
    private String omseSecEcoName;

    @Column(name = "VISIBLE", length = 1, columnDefinition = "VARCHAR2(1 BYTE) DEFAULT 'N'")
    private String omseVisible;

    @Column(name = "CREATE_DATE")
    @CreatedDate
    private Date omseCreateDate;

    @Column(name = "CREATE_BY", length = 12)
    private String omseCreatedBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omseUpdateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omseUpdateBy;

    @Column(name = "OJK_CODE", length = 30)
    private String omseOjkCode;
    
    @Column(name = "COMP_ID", length = 5)
    private String omseCompId;
}
