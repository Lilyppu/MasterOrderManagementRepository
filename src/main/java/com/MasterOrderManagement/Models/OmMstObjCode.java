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
@Table(name= "OM_MST_OBJ_CODE")
@IdClass(OmMstObjCodeCompKey.class)
public class OmMstObjCode {
	 	@Id
	    @Column(name = "OBJ_CODE", nullable = false, length = 10)
	    private String omocObjCode;
	 	
	 	@Id
	    @Column(name = "OBJ_GRP", nullable = false, length = 10)
	    private String omocObjGrp;
	 	
	 	@Id
	    @Column(name = "OBJ_DESCR", length = 100)
	    private String omocObjDescr;

	    @Column(name = "BRANCH_ID", length = 5)
	    private String omocBranchId;
	    
	    @Id
	    @Column(name = "OBJ_BRAND", length = 50)
	    private String omocObjBrand;

	    @Column(name = "OBJ_MODEL", length = 50)
	    private String omocObjModel;
	    
	    @Id
	    @Column(name = "OBJ_TYPE", length = 100)
	    private String omocObjType;

	    @Column(name = "OBJ_SIZE")
	    private Integer omocObjSize;

	    @Column(name = "CREATE_BY", nullable = false, length = 12)
	    @CreatedDate
	    private String omocCreatedBy;

	    @Column(name = "CREATE_DATE", nullable = false)
	    private Date omocCreateDate;

	    @Column(name = "UPDATE_BY", length = 12)
	    private String omocUpdateBy;

	    @Column(name = "UPDATE_DATE")
	    @LastModifiedDate
	    private Date omocUpdateDate;

	    @Column(name = "NEED_ADD_COLL", length = 1)
	    private String omocNeedAddColl;

	    @Column(name = "NEW_USED", length = 1)
	    private String omocNewUsed;

	    @Column(name = "VISIBLE", length = 1)
	    private String omocVisible;

	    @Column(name = "IS_VEHICLE", nullable = false, length = 1)
	    private String omocIsVehicle;

	    @Column(name = "OBJ_MAKE", length = 20)
	    private String omocObjMake;

	    @Column(name = "CATEGORY", length = 30)
	    private String omocCategory;

	    @Column(name = "TRANSMISI", length = 1)
	    private String omocTransmisi;

	    @Column(name = "BHN_BAKAR", length = 1)
	    private String omocBhnBakar;

	    @Column(name = "SPORT_TYPE", length = 1)
	    private String omocSportType;

	    @Column(name = "JENIS", length = 1)
	    private String omocJenis;

	    @Column(name = "RAKITAN", length = 1)
	    private String omocRakit;
}
