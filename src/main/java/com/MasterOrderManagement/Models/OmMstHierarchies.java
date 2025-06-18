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
@Table(name = "OM_MST_HIERARCHIES")
@IdClass(OmMstHierarchiesCompKey.class)
public class OmMstHierarchies {
	@Id
	@Column(name = "OFFICE_CODE", length = 5)
	private String omhOfficeCode;
	
	@Id
	@Column(name = "JOB_LVL")
	private Integer omhJobLvl;
	
	@Id
	@Column(name = "SUB_LVL")
	private Integer omhSubLvl;

	@Column(name = "UP_LVL")
	private Integer omhUpLvl;

	@Column(name = "UP_SUB_LVL")
	private Integer omhUpSubLvl;

	@Column(name = "POSITION_CODE", length = 20)
	private String omhPositionCode;

	@Column(name = "EMPL_CODE", length = 20)
	private String omhEmplCode;

	@Column(name = "PJS_EMPL_CODE", length = 20)
	private String omhPjsEmplCode;

	@Column(name = "PJS_BEGIN_DATE")
	private Date omhPjsBeginDate;

	@Column(name = "PJS_END_DATE")
	private Date omhPjsEndDate;

	@Column(name = "CREATED_BY", nullable = false, length = 12)
	private String omhCreatedBy;

	@Column(name = "CREATED_TIMESTAMP", nullable = false)
	@CreatedDate
	private Date omhCreatedTimestamp;

	@Column(name = "LASTUPDATE_BY", length = 12)
	private String omhLastupdateBy;

	@Column(name = "LASTUPDATE_TIMESTAMP")
	@LastModifiedDate
	private Date omhLastupdateTimestamp;
	
	@Id
	@Column(name = "BUSS_UNIT", length = 50)
	private String omhBussUnit;
	
	@Column(name = "COMP_ID", length = 5)
	private String omhCompId;
}
