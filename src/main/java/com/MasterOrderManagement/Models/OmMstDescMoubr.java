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
@Table(name= "OM_MST_DESC_MOUBR")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstDescMoubr {
    @Column(name = "JENIS_BIRO_JASA", nullable = false, length = 1000)
    private String omdmJenisBiroJasa;
    
    @Id
    @Column(name = "VALUE", nullable = false)
    private Integer omdmValue;
}
