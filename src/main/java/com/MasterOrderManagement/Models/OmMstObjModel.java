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
@Table(name= "OM_MST_OBJ_MODEL")
@IdClass(OmMstObjModelCompKey.class)
public class OmMstObjModel {

	 	@Id
	    @Column(name = "MODEL_NO", length = 25)
	    private String omomModelNo;

	    @Column(name = "MODEL_NAME", length = 25)
	    private String omomModelName;

	    @Column(name = "CREATED_BY", length = 100)
	    private String omomCreatedBy;

	    @Column(name = "CREATED_TIME")
	    @CreatedDate
	    private Date omomCreatedTime;

	    @Column(name = "UPDATED_BY", length = 100)
	    private String omomUpdatedBy;

	    @Column(name = "UPDATED_TIME")
	    @LastModifiedDate
	    private Date omomUpdatedTime;
	    
	    @Id
	    @Column(name = "OBJ_GRP", length = 10)
	    private String omomObjGrp;

	    @Column(name = "TYPE_ID", length = 10)
	    private String omomTypeId;
	    
	    @Column(name = "COMP_ID", length = 5)
	    private String omomCompId;
}
