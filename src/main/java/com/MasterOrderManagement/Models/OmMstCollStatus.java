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
@Table(name= "OM_MST_COLL_STATUS")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstCollStatus {
	@Id
    @Column(name = "COLL_STATUS", nullable = false, length = 3)
    private String omcsCollStatus;

    @Column(name = "COLL_DESCR", nullable = false, length = 30)
    private String omcsCollDescr;

    @Column(name = "CREATED_BY", nullable = false, length = 15)
    @CreatedDate
    private String omcsCreatedBy;

    @Column(name = "CREATED_DATE", nullable = false)
    private Date omcsCreatedDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omcsUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omcsUpdateDate;
}
