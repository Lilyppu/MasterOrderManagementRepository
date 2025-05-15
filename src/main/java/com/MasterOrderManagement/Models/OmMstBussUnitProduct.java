package com.MasterOrderManagement.Models;

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
@Table(name= "OM_MST_BUSS_UNIT_PRODUCT")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstBussUnitProduct {
	@Id
    @Column(name = "BUSS_UNIT", nullable = false, length = 15)
    private String ombupBussUnit;

    @Column(name = "PROD_ID")
    private Integer ombupProdId;

    @Column(name = "BUSS_UNIT_DESCR", length = 30)
    private String ombupBussUnitDescr;

    @Column(name = "CATEGORY", length = 100)
    private String ombupCategory;
}
