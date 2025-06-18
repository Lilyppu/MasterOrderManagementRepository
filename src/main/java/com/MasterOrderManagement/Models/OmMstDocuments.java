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
@Table(name= "OM_MST_DOCUMENTS")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstDocuments {
	@Id
    @Column(name = "DOC_CODE", nullable = false, length = 5)
    private String omdDocCode;

    @Column(name = "DESCRIPTION", length = 100)
    private String omdDescription;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String omdCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date omdCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omdUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omdUpdateDate;
    
    @Column(name = "COMP_ID", length = 5)
    private String omdCompId;
}
