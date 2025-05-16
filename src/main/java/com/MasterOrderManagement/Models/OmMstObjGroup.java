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
@Table(name= "OM_MST_OBJ_GROUP")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstObjGroup {
	
	@Id
    @Column(name = "OBJ_GRP", nullable = false, length = 10)
    private String omogObjGrp;

    @Column(name = "OBJ_DESCR", length = 30)
    private String omogObjDescr;

    @Column(name = "COLL_TYPE")
    private Integer omogCollType;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String omogCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    private Date omogCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omogUpdateBy;

    @Column(name = "UPDATE_DATE")
    private Date omogUpdateDate;

    @Column(name = "NEED_ADD_COLL_LIMIT")
    private Integer omogNeedAddCollLimit;

    @Column(name = "HJM_PROCEDURE", length = 200)
    private String omogHjmProcedure;

    @Column(name = "VISIBLE", nullable = false, length = 1)
    private String omogVisible;
}
