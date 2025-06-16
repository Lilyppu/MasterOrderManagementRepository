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
@Table(name= "OM_MST_DOC_UPLOAD")
@IdClass(OmMstDocUploadCompKey.class)
public class OmMstDocUpload {
	@Id
    @Column(name = "UPLOAD_TYPE", nullable = false, length = 30)
    private String omduUploadType;
	
	@Id
    @Column(name = "DOC_CODE", nullable = false, length = 15)
    private String omduDocCode;
	
	@Id
    @Column(name = "TAMPAK", nullable = false, length = 30)
    private String omduTampak;

    @Column(name = "REQUIRED", nullable = false, length = 1)
    private String omduRequired;

    @Column(name = "CREATED_BY", length = 12)
    private String omduCreatedBy;

    @Column(name = "CREATED_DATE")
    @CreatedDate
    private Date omduCreatedDate;

    @Column(name = "UPDATED_BY", length = 12)
    private String omduUpdatedBy;

    @Column(name = "UPDATED_DATE")
    @LastModifiedDate
    private Date omduUpdatedDate;
    
    @Column(name = "COMP_ID", length = 5)
    private String omduCompId;
}
