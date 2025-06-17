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
@Table(name= "OM_MST_MKT_SCHEME_CAKUPAN_WIL")
@IdClass(OmMstMktSchemeCakupanWilCompKey.class)
public class OmMstMktSchemeCakupanWil {
	@Id
	@Column(name = "REGIONAL_ID", nullable = false, length = 5)
    private String ommscwRegionalId;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String ommscwCreateBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date ommscwCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String ommscwUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date ommscwUpdateDate;
    
    @Id
    @Column(name = "MS_CODE", nullable = false, length = 9)
    private String ommscwMsCode;
    
    @Column(name = "COMP_ID", length = 5)
    private String ommscwCompId;
}
