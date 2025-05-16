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
@Table(name= "OM_MST_OBJ_CATEGORIES")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstObjCategories {
	
	@Id
    @Column(name = "OBJ_CATEGORY", nullable = false, length = 15)
    private String omocsObjCategory;

    @Column(name = "CATEGORY_DESCR", length = 50)
    private String omocsCategoryDescr;

    @Column(name = "CREATED_BY", nullable = false, length = 12)
    private String omocsCreatedBy;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    private Date omocsCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 12)
    private String omocsLastUpdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    private Date omocsLastUpdateTimestamp;

    @Column(name = "MIN_YEAR")
    private Integer omocsMinYear;
}
