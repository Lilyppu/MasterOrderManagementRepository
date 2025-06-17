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
@Table(name= "OM_MST_KLASIFIKASI_SIPP")
@IdClass(OmMstKlasifikasiSippCompKey.class)
public class OmMstKlasifikasiSipp {
	@Id
	@Column(name = "TIPE_PEMBIAYAAN", length = 20)
    private String omksiTipePembiayaan;
	
	@Id
    @Column(name = "KODE_SIPP", length = 10)
    private String omksiKodeSipp;

	@Id
    @Column(name = "KODE_REASON", length = 10)
    private String omksiKodeReason;

    @Column(name = "VISIBLE", length = 1)
    private String omksiVisible;

    @Column(name = "CREATED_BY", length = 20)
    private String omksiCreatedBy;

    @Column(name = "CREATED_TIMESTAMP")
    @CreatedDate
    private Date omksiCreatedTimestamp;

    @Column(name = "LASTUPDATED_BY", length = 20)
    private String omksiLastupdatedBy;

    @Column(name = "LASTUPDATED_TIMESTAMP")
    @LastModifiedDate
    private Date omksiLastupdatedTimestamp;

    @Column(name = "MIN_TENOR")
    private Integer omksiMinTenor;

    @Column(name = "MAX_TENOR")
    private Integer omksiMaxTenor;
    
    @Column(name = "COMP_ID", length = 15)
    private String omksiCompId;
}
