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
@Table(name= "OM_MST_ADMIN_STNK")
@IdClass(OmMstAdminStnkCompKey.class)
public class OmMstAdminStnk {
	
	@Id
	@Column(name = "SUPPL_CODE", nullable = false, length = 20)
    private String omasSupplCode;

    @Column(name = "SUPPLIER_NAME", length = 60)
    private String omasSupplierName;

    @Column(name = "MOU_NO", length = 21)
    private String omasMouNo;

    @Column(name = "DESCR", length = 60)
    private String omasDescr;

    @Column(name = "BEGIN_DATE")
    private Date omasBeginDate;

    @Column(name = "END_DATE")
    private Date omasEndDate;
    
    @Id
    @Column(name = "JENIS_JASA", nullable = false)
    private Integer omasJenisJasa;

    @Column(name = "JENIS_DESCR", nullable = false, length = 40)
    private String omasJenisDescr;

    @Column(name = "ADMIN_ACCTNO", length = 8)
    private String omasAdminAcctno;

    @Column(name = "AMOUNT", precision = 19, scale = 4)
    private BigDecimal omasAmount;

    @Column(name = "CREATED_BY", nullable = false, length = 12)
    private String omasCreatedBy;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreatedDate
    private Date omasCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 12)
    private String omasLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    @LastModifiedDate
    private Date omasLastupdateTimestamp;

    @Column(name = "COMP_ID", nullable = false, length = 5)
    private String omasCompId;
}
