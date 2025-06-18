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
@Table(name= "OM_MST_SEGMENT_DEALER")
//@IdClass(InscMstCauseOfClaimCompKey.class)
public class OmMstSegmentDealer {
	@Id
    @Column(name = "SEGMENT_DEALER", nullable = false, length = 10)
    private String omsdSegmentDealer;

    @Column(name = "DESCR", length = 100)
    private String omsdDescription;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String omsdCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date omsdCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String omsdUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date omsdUpdateDate;
    
    @Column(name = "COMP_ID", length = 5)
    private String omsdCompId;
}
