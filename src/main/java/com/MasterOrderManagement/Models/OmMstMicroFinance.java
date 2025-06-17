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
@Table(name = "OM_MST_MICRO_FINANCE")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstMicroFinance {

	@Id
	@Column(name = "SEQ_NO", nullable = false)
	private Integer ommfSeqNo;

	@Column(name = "BUSS_UNIT", length = 5)
	private String ommfBussUnit;

	@Column(name = "PRNC_AMT_FROM", precision = 19, scale = 4)
	private BigDecimal ommfPrncAmtFrom;

	@Column(name = "PRNC_AMT_TO", precision = 19, scale = 4)
	private BigDecimal ommfPrncAmtTo;

	@Column(name = "TOP")
	private Integer ommfTop;

	@Column(name = "ADM_FIX", precision = 19, scale = 4)
	private BigDecimal ommfAdmFix;

	@Column(name = "PCT_ADM", precision = 19, scale = 4)
	private BigDecimal ommfPctAdm;

	@Column(name = "PCT_PROVISI", precision = 19, scale = 4)
	private BigDecimal ommfPctProvisi;

	@Column(name = "PCT_INSC", precision = 19, scale = 4)
	private BigDecimal ommfPctInsc;

	@Column(name = "RATE_EFF", precision = 19, scale = 4)
	private BigDecimal ommfRateEff;

	@Column(name = "RATE_FLAT", precision = 19, scale = 4)
	private BigDecimal ommfRateFlat;

	@Column(name = "PERIOD_TYPE", length = 10)
	private String ommfPeriodType;

	@Column(name = "GRACE_PERIOD", precision = 19, scale = 4)
	private BigDecimal ommfGracePeriod;

	@Column(name = "PCT_DENDA", precision = 19, scale = 4)
	private BigDecimal ommfPctDenda;

	@Column(name = "PCT_PENALTY", precision = 19, scale = 4)
	private BigDecimal ommfPctPenalty;

	@Column(name = "PCT_REFUND_FEE", precision = 19, scale = 4)
	private BigDecimal ommfPctRefundFee;

	@Column(name = "CREATED_BY", length = 20)
	private String ommfCreatedBy;

	@Column(name = "CREATED_DATE")
	@CreatedDate
	private Date ommfCreatedDate;

	@Column(name = "UPDATED_BY", length = 20)
	private String ommfUpdatedBy;

	@Column(name = "UPDATED_DATE")
	@LastModifiedDate
	private Date ommfUpdatedDate;

	@Column(name = "PCT_PROVISI_RO", precision = 19, scale = 4, columnDefinition = "NUMBER(19,4) DEFAULT 0.5")
	private BigDecimal ommfPctProvisiRo;

	@Column(name = "COMP_ID", length = 5)
	private String ommfCompId;
}
