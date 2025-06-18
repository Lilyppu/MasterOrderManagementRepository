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
@Table(name= "OM_MST_MKT_SCHEME")
//@IdClass(OmMstBuAdminCompKey.class)
public class OmMstMktScheme {
	@Id
    @Column(name = "MS_CODE", nullable = false, length = 9)
    private String ommsMsCode;

    @Column(name = "MS_DESC", length = 100)
    private String ommsMsDesc;

    @Column(name = "MS_VALID")
    private Date ommsMsValid;

    @Column(name = "MS_UNTIL")
    private Date ommsMsUntil;

    @Column(name = "SCHEME_TYPE", length = 15)
    private String ommsSchemeType;

    @Column(name = "MIN_TOP")
    private Integer ommsMinTop;

    @Column(name = "MAX_TOP")
    private Integer ommsMaxTop;

    @Column(name = "MS_LEVEL", length = 1)
    private String ommsMsLevel;

    @Column(name = "MS_AMT", precision = 19, scale = 4)
    private BigDecimal ommsMsAmt;

    @Column(name = "MS_ACCOUNT", length = 8)
    private String ommsMsAccount;

    @Column(name = "MS_COST_CENTER", length = 5)
    private String ommsMsCostCenter;

    @Column(name = "MS_CUST_DP_RECV_DLR", length = 1)
    private String ommsMsCustDpRecvDlr;

    @Column(name = "MS_SUBSIDI_DP_DLR", length = 1)
    private String ommsMsSubsidiDpDlr;

    @Column(name = "MS_SUBSIDI_DP_MN_DLR", length = 1)
    private String ommsMsSubsidiDpMnDlr;

    @Column(name = "MS_ADMIN", length = 1)
    private String ommsMsAdmin;

    @Column(name = "MS_UPPING_FIF", length = 1)
    private String ommsMsUppingFif;

    @Column(name = "MS_UPPING_DLR", length = 1)
    private String ommsMsUppingDlr;

    @Column(name = "MS_SUBSIDI_DP_FIF", length = 1)
    private String ommsMsSubsidiDpFif;

    @Column(name = "MS_TITIPAN", length = 1)
    private String ommsMsTitipan;

    @Column(name = "MS_INTEREST", length = 1)
    private String ommsMsInterest;

    @Column(name = "MS_DEALER_SUBSIDI_FIF", length = 1)
    private String ommsMsDealerSubsidiFif;

    @Column(name = "MS_PROMO_FEE", length = 1)
    private String ommsMsPromoFee;

    @Column(name = "MS_TITIPAN_PROMO", length = 1)
    private String ommsMsTitipanPromo;

    @Column(name = "MS_SPLIT_ANGSURAN", length = 1)
    private String ommsMsSplitAngsuran;

    @Column(name = "MS_RESERVE_1", length = 1)
    private String ommsMsReserve1;

    @Column(name = "MS_RESERVE_2", length = 1)
    private String ommsMsReserve2;

    @Column(name = "MS_RESERVE_3", length = 1)
    private String ommsMsReserve3;

    @Column(name = "MS_RESERVE_4", length = 1)
    private String ommsMsReserve4;

    @Column(name = "MS_RSRV_TEXT_1", length = 20)
    private String ommsMsRsrText1;

    @Column(name = "MS_RSRV_TEXT_2", length = 20)
    private String ommsMsRsrText2;

    @Column(name = "MS_RSRV_TEXT_3", length = 20)
    private String ommsMsRsrText3;

    @Column(name = "MS_RSRV_TEXT_4", length = 20)
    private String ommsMsRsrText4;

    @Column(name = "MS_CHOICE_GP_DISC")
    private Integer ommsMsChoiceGpDisc;

    @Column(name = "MS_PERIODE_TOPGP")
    private Integer ommsMsPeriodeTopgp;

    @Column(name = "MS_TOPGP")
    private Integer ommsMsTopgp;

    @Column(name = "MS_DISC_ANGS", precision = 19, scale = 4)
    private BigDecimal ommsMsDiscAngs;

    @Column(name = "MS_FROM_SUBSIDI_DLR", length = 1)
    private String ommsMsFromSubsidiDlr;

    @Column(name = "MS_ACCOUNT_SUBSIDI", length = 8)
    private String ommsMsAccountSubsidi;

    @Column(name = "MS_COST_CENTER_SUBSIDI", length = 5)
    private String ommsMsCostCenterSubsidi;

    @Column(name = "MS_VISIBLE", length = 1)
    private String ommsMsVisible;

    @Column(name = "CREATE_BY", nullable = false, length = 12)
    private String ommsCreateBy;

    @Column(name = "CREATE_DATE", nullable = false)
    @CreatedDate
    private Date ommsCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String ommsUpdateBy;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private Date ommsUpdateDate;

    @Column(name = "MS_PRODUCT", length = 5)
    private String ommsMsProduct;

    @Column(name = "MS_PRODUCT_SUBSIDI", length = 5)
    private String ommsMsProductSubsidi;

    @Column(name = "AMORTISASI_FLAG", length = 1)
    private String ommsAmortisasiFlag;

    @Column(name = "TRANS_TYPE", length = 15)
    private String ommsTransType;

    @Column(name = "MULTI_FLAG", length = 2, columnDefinition = "VARCHAR2(2 BYTE) DEFAULT 'Y'")
    private String ommsMultiFlag;

    @Column(name = "DP_TYPE", length = 1, columnDefinition = "CHAR(1 BYTE) DEFAULT 'N' NOT NULL")
    private String ommsDpType;

    @Column(name = "MS_MIN_DP", precision = 19, scale = 4)
    private BigDecimal ommsMsMinDp;

    @Column(name = "MS_MAX_DP", precision = 19, scale = 4)
    private BigDecimal ommsMsMaxDp;

    @Column(name = "MS_MIN_DP_PERC", precision = 4, scale = 2)
    private BigDecimal ommsMsMinDpPerc;

    @Column(name = "MS_MAX_DP_PERC", precision = 4, scale = 2)
    private BigDecimal ommsMsMaxDpPerc;

    @Column(name = "BUSS_UNIT_INCL", length = 50, columnDefinition = "VARCHAR2(50 BYTE) DEFAULT '''ALL''' NOT NULL")
    private String ommsBussUnitIncl;

    @Column(name = "MS_AGENT", length = 1)
    private String ommsMsAgent;

    @Column(name = "MS_PIC_DEALER", length = 1)
    private String ommsMsPicDealer;

    @Column(name = "MS_TYPE")
    private Integer ommsMsType;

    @Column(name = "PACK_ID", length = 20)
    private String ommsPackId;

    @Column(name = "MS_LB_EXT", length = 1)
    private String ommsMsLbExt;

    @Column(name = "COMP_ID", length = 5)
    private String ommsCompId;
}
