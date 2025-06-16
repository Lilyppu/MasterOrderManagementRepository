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
@Table(name = "OM_MST_COLL_SUBLOC_DETAIL")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstCollSublocDetail {

	@Id
	@Column(name = "COLL_SUBLOC_DETAIL", nullable = false, length = 15)
	private String omcsdCollSublocDetail;

	@Column(name = "COLL_DESCR", nullable = false, length = 200)
	private String omcsdCollDescr;

	@Column(name = "COLL_SUB_LOCATION", length = 20)
	private String omcsdCollSubLocation;

	@Column(name = "CREATED_BY", length = 15)
	private String omcsdCreatedBy;

	@Column(name = "CREATED_DATE")
	@CreatedDate
	private Date omcsdCreatedDate;

	@Column(name = "UPDATE_BY", length = 12)
	private String omcsdUpdateBy;

	@Column(name = "UPDATE_DATE")
	@LastModifiedDate
	private Date omcsdUpdateDate;

	@Column(name = "VISIBLE", length = 1)
	private String omcsdVisible;
	
	@Column(name = "COMP_ID", length = 5)
	private String omcsdCompId;
}
