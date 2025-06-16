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
@Table(name = "OM_MST_COLL_SUB_LOCATION")
@IdClass(OmMstCollSubLocationCompKey.class)
public class OmMstCollSubLocation {
	@Id
	@Column(name = "COLL_SUB_LOCATION", nullable = false, length = 20)
	private String omcslCollSubLocation;

	@Column(name = "COLL_DESCR", nullable = false, length = 200)
	private String omcslCollDescr;

	@Column(name = "CREATED_BY", nullable = false, length = 15)
	private String omcslCreatedBy;

	@Column(name = "CREATED_DATE", nullable = false)
	@CreatedDate
	private Date omcslCreatedDate;

	@Column(name = "UPDATE_BY", length = 12)
	private String omcslUpdateBy;

	@Column(name = "UPDATE_DATE")
	@LastModifiedDate
	private Date omcslUpdateDate;

	@Column(name = "IN_COY", length = 1)
	private String omcslInCoy;
	
	@Id
	@Column(name = "SUB_LOC_BRANCH", length = 5)
	private String omcslSubLocBranch;
	
	@Column(name = "COMP_ID", length = 5)
	private String omcslCompId;
}
