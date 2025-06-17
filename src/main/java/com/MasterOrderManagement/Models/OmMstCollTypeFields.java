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
@Table(name = "OM_MST_COLL_TYPE_FIELDS")
@IdClass(OmMstCollTypeFieldsCompKey.class)
public class OmMstCollTypeFields {
	@Id
	@Column(name = "COLL_TYPE", nullable = false)
	private Integer omctfCollType;
	
	@Id
	@Column(name = "SEQ_NO", nullable = false)
	private Integer omctfSeqNo;

	@Column(name = "FIELD_LABEL", nullable = false, length = 100)
	private String omctfFieldLabel;

	@Column(name = "FIELD_TYPE", nullable = false, length = 1)
	private String omctfFieldType;

	@Column(name = "FIELD_NAME", nullable = false, length = 100)
	private String omctfFieldName;

	@Column(name = "FIELD_NAME_OBJECT", length = 100)
	private String omctfFieldNameObject;

	@Column(name = "CREATED_BY", nullable = false, length = 15)
	private String omctfCreatedBy;

	@Column(name = "CREATED_DATE", nullable = false)
	@CreatedDate
	private Date omctfCreatedDate;

	@Column(name = "UPDATE_BY", length = 12)
	private String omctfUpdateBy;

	@Column(name = "UPDATE_DATE")
	@LastModifiedDate
	private Date omctfUpdateDate;

	@Column(name = "IS_REQUIRED")
	private Integer omctfIsRequired;

	@Column(name = "IS_UPDATEABLE", columnDefinition = "NUMBER DEFAULT 0")
	private Integer omctfIsUpdateable;

	@Column(name = "IS_PRINTED", columnDefinition = "NUMBER DEFAULT 0")
	private Integer omctfIsPrinted;

	@Column(name = "IS_VISIBLE")
	private Integer omctfIsVisible;
	
	@Column(name = "COMP_ID", length = 12)
	private String omctfCompId;
}
