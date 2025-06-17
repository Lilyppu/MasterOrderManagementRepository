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
@Table(name = "OM_MST_MANDATORY_FIELD")
@IdClass(OmMstMandatoryFieldCompKey.class)
public class OmMstMandatoryField {

	@Column(name = "DESCRIPTION", length = 200)
	private String ommfdDescription;

	@Id
	@Column(name = "TABEL_NAME", nullable = false, length = 200)
	private String ommfdTabelName;

	@Id
	@Column(name = "FIELD_NAME", nullable = false, length = 200)
	private String ommfdFieldName;

	@Column(name = "VISIBLE", length = 1)
	private String ommfdVisible;

	@Column(name = "VALIDATION_FLAG", length = 1)
	private String ommfdValidationFlag;

	@Column(name = "LOV_STAT", length = 500)
	private String ommfdLovStat;

	@Column(name = "CUST_TABLE_NAME", length = 200)
	private String ommfdCustTableName;

	@Column(name = "CUST_FIELD_NAME", length = 200)
	private String ommfdCustFieldName;
	
	@Column(name = "COMP_ID", length = 15)
	private String ommfdCompId;
}
