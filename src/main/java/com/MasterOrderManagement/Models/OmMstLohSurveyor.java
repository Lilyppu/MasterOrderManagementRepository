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
@Table(name= "OM_MST_LOH_SURVEYOR")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstLohSurveyor {
	
	 	@Id
	    @Column(name = "LOH_ID", length = 12)
	    private String omlsLohId;

	    @Column(name = "LOH_DESC", length = 30)
	    private String omlsLohDesc;

	    @Column(name = "BRANCH_ID", length = 5)
	    private String omlsBranchId;

	    @Column(name = "CREATE_BY", length = 12)
	    private String omlsCreatedBy;

	    @Column(name = "CREATE_DATE")
	    private Date omlsCreateDate;

	    @Column(name = "UPDATE_BY", length = 12)
	    private String omlsUpdateBy;

	    @Column(name = "UPDATE_DATE")
	    private Date omlsUpdateDate;

	    @Column(name = "VISIBLE", length = 1)
	    private String omlsVisible;

	    @Column(name = "BLOCKED_DATE")
	    private Date omlsBlockedDate;

	    @Column(name = "BLOCKED_DESCR", length = 30)
	    private String omlsBlockedDescr;
}
