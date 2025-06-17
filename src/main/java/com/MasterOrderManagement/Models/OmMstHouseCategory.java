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
@Table(name= "OM_MST_HOUSE_CATEGORY")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstHouseCategory {
	@Id
    @Column(name = "HOUSE_CATE_ID", nullable = false, length = 20)
    private String omhcaHouseCateId;

    @Column(name = "HOUSE_CATE_DESC", nullable = false, length = 200)
    private String omhcaHouseCateDesc;

    @Column(name = "VISIBLE", length = 1)
    private String omhcaVisible;

    @Column(name = "CREATED_BY", nullable = false, length = 12)
    private String omhcaCreatedBy;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreatedDate
    private Date omhcaCreatedTimestamp;

    @Column(name = "UPDATED_BY", length = 12)
    private String omhcaUpdatedBy;

    @Column(name = "UPDATED_TIMESTAMP")
    @LastModifiedDate
    private Date omhcaUpdatedTimestamp;
    
    @Column(name = "COMP_ID", length = 15)
    private String omhcaCompId;
}
