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
@Table(name= "OM_MST_COLL_PROCESS")
@IdClass(OmMstCollProcessCompKey.class)
public class OmMstCollProcess {
	@Id
    @Column(name = "SUPL_CODE", nullable = false, length = 12)
    private String omcpSuplCode;
	
	@Id
    @Column(name = "NEW_USED", nullable = false, length = 1)
    private String omcpNewUsed;

    @Column(name = "PROCESS_DAY")
    private Integer omcpProcessDay;

    @Column(name = "CREATED_BY", nullable = false, length = 15)
    private String omcpCreatedBy;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreatedDate
    private Date omcpCreatedTimestamp;

    @Column(name = "LASTUPDATE_BY", length = 15)
    private String omcpLastupdateBy;

    @Column(name = "LASTUPDATE_TIMESTAMP")
    @LastModifiedDate
    private Date omcpLastupdateTimestamp;
    
    @Id
    @Column(name = "OBJ_GRP", nullable = false, length = 10)
    private String omcpObjGrp;
}
