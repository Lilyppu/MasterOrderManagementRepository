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
@Table(name= "OM_MST_MKT_SCHEME_CAKUPAN_CAB")
@IdClass(OmMstMktSchemeCakupanCabCompKey.class)
public class OmMstMktSchemeCakupanCab {
	@Id
	@Column(name = "BRANCH_ID", nullable = false, length = 5)
    private String ommsccBranchId;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String ommsccCreateBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date ommsccCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String ommsccUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date ommsccUpdateDate;
    
    @Id
    @Column(name = "MS_CODE", nullable = false, length = 9)
    private String ommsccMsCode;

    @Column(name = "REGIONAL_ID", nullable = false, length = 5)
    private String ommsccRegionalId;
}
