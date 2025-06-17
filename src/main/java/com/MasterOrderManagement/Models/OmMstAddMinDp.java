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
@Table(name= "OM_MST_ADD_MIN_DP")
@IdClass(OmMstAddMinDpCompKey.class)
public class OmMstAddMinDp {
	@Id
	@Column(name = "BUSS_UNIT", length = 5)
    private String omamdBussUnit;
	
	@Id
    @Column(name = "BPKB_RELATION", length = 50)
    private String omamdBpkbRelation;
	
	@Id
    @Column(name = "OBJ_CATEGORY", length = 15)
    private String omamdObjCategory;
	
	@Id
    @Column(name = "PCT_F6PDO31RW_START", precision = 19, scale = 4)
    private BigDecimal omamdPctF6pdo31rwStart;
    
    @Id
    @Column(name = "PCT_F6PDO31RW_END", precision = 19, scale = 4)
    private BigDecimal omamdPctF6pdo31rwEnd;

    @Column(name = "PCT_ADD_DP", precision = 19, scale = 4)
    private BigDecimal omamdPctAddDp;

    @Column(name = "CREATED_BY", nullable = false, length = 15)
    private String omamdCreatedBy;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreatedDate
    private Date omamdCreatedTimestamp;

    @Column(name = "UPDATED_BY", length = 15)
    private String omamdUpdatedBy;

    @Column(name = "UPDATED_TIMESTAMP")
    @LastModifiedDate
    private Date omamdUpdatedTimestamp;

    @Column(name = "COMP_ID", length = 15)
    private String omamdCompId;
}
