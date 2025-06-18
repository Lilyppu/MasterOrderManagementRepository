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
@Table(name= "OM_MST_DOC_OCCUTYPE")
@IdClass(OmMstDocOccutypeCompKey.class)
public class OmMstDocOccutype {
	@Id
    @Column(name = "OCPT_TYPE", nullable = false, length = 5)
    private String omdoOcptType;
	
	@Id
    @Column(name = "REQUIRED", nullable = false, length = 1)
    private String omdoRequired;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    @CreatedDate
    private String omdoCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    private Date omdoCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omdoUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omdoUpdateDate;
    
    @Id
    @Column(name = "DOC_CODE", nullable = false, length = 5)
    private String omdoDocCode;

    @Column(name = "MARITAL", length = 2, columnDefinition = "VARCHAR2(2 BYTE) DEFAULT 'N'")
    private String omdoMarital;

    @Column(name = "DEVIASI", length = 1)
    private String omdoDeviasi;

    @Column(name = "PENDING", length = 1)
    private String omdoPending;
    
    @Column(name = "COMP_ID", length = 5)
    private String omdoCompId;
}
