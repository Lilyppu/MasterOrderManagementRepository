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
@Table(name= "OM_MST_CATEGORY_DEALER")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstCategoryDealer {
	@Id
    @Column(name = "CATEGORY", nullable = false, length = 30)
    private String omcdCategory;

    @Column(name = "OMSET_START",precision = 19, scale = 4)
    private BigDecimal omcdOmsetStart;

    @Column(name = "OMSET_END",precision = 19, scale = 4)
    private BigDecimal omcdOmsetEnd;

    @Column(name = "F6PD_START",precision = 19, scale = 4)
    private BigDecimal omcdF6pdStart;

    @Column(name = "F6PD_END",precision = 19, scale = 4)
    private BigDecimal omcdF6pdEnd;

    @Column(name = "FLAG_BY_PASS", length = 1, columnDefinition = "VARCHAR2(1 BYTE) DEFAULT 'N'")
    private String omcdFlagByPass;

    @Column(name = "PRIORITAS", nullable = false)
    private Integer omcdPrioritas;

    @Column(name = "CREATED_BY", nullable = false, length = 12)
    private String omcdCreatedBy;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreatedDate
    private Date omcdCreatedTimestamp;

    @Column(name = "UPDATED_BY", length = 12)
    private String omcdUpdatedBy;

    @Column(name = "UPDATED_TIMESTAMP")
    @LastModifiedDate
    private Date omcdUpdatedTimestamp;
    
    @Column(name = "COMP_ID", length = 5)
    private String omcdCompId;
}
