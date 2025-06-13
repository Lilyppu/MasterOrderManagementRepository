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
	private String ommfDescription;

	@Id
	@Column(name = "TABEL_NAME", nullable = false, length = 200)
	private String ommfTabelName;

	@Id
	@Column(name = "FIELD_NAME", nullable = false, length = 200)
	private String ommfFieldName;

	@Column(name = "VISIBLE", length = 1)
	private String ommfVisible;

	@Column(name = "VALIDATION_FLAG", length = 1)
	private String ommfValidationFlag;

	@Column(name = "LOV_STAT", length = 500)
	private String ommfLovStat;

	@Column(name = "CUST_TABLE_NAME", length = 200)
	private String ommfCustTableName;

	@Column(name = "CUST_FIELD_NAME", length = 200)
	private String ommfCustFieldName;
}
