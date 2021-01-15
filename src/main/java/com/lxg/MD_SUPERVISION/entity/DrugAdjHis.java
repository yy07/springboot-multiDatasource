package com.lxg.MD_SUPERVISION.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 2.8.5. 药品调价历史
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DRUG_ADJ_HIS")
public class DrugAdjHis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;

    /**
     * 医疗机构代码
     */
    @TableField("CLINIC_ORGAN_CODE")
    private String clinicOrganCode;

    /**
     * 医疗机构名称
     */
    @TableField("CLINIC_ORGAN_NAME")
    private String clinicOrganName;

    /**
     * 调价序号
     */
    @TableField("DETAIL_LOCAL_ID")
    private String detailLocalId;

    /**
     * 药品代码
     */
    @TableField("DRUG_CODE")
    private String drugCode;

    /**
     * 药品采购码
     */
    @TableField("DRUG_PROCUREMENT_CODE")
    private String drugProcurementCode;

    /**
     * 本位码
     */
    @TableField("OWN_STANDARD_CODE")
    private String ownStandardCode;

    /**
     * 监管码
     */
    @TableField("SUPERVISION_CODE")
    private String supervisionCode;

    /**
     * 医保编码
     */
    @TableField("INSUR_CODE")
    private String insurCode;

    /**
     * 本系统药品目录代码
     */
    @TableField("SELF_SYS_DRUG_CATALOGUE_CODD")
    private String selfSysDrugCatalogueCodd;

    /**
     * 药品名称
     */
    @TableField("DRUG_NAME")
    private String drugName;

    /**
     * 药品商品名称
     */
    @TableField("DRUG_COMMODITY_NAME")
    private String drugCommodityName;

    /**
     * 批号
     */
    @TableField("BATCH_NUMBER")
    private String batchNumber;

    /**
     * 批次
     */
    @TableField("BATCH")
    private String batch;

    /**
     * 有效期
     */
    @TableField("TERM_OF_VALIDITY")
    private LocalDateTime termOfValidity;

    /**
     * 调价时间
     */
    @TableField("PRICE_ADJUSTMENT_TIME")
    private LocalDateTime priceAdjustmentTime;

    /**
     * 操作员工号
     */
    @TableField("OPERATOR_NUMBER")
    private String operatorNumber;

    /**
     * 操作员姓名
     */
    @TableField("OPERATOR_NAME")
    private String operatorName;

    /**
     * 调价文号
     */
    @TableField("PRICE_ADJUSTMENT_DOCUMENT_NO")
    private String priceAdjustmentDocumentNo;

    /**
     * 库存量
     */
    @TableField("INVENTORY")
    private Long inventory;

    /**
     * 库存单位
     */
    @TableField("SUK")
    private String suk;

    /**
     * 原批发价
     */
    @TableField("ORIGINAL_WHOLESALE_PRICE")
    private Double originalWholesalePrice;

    /**
     * 原进价
     */
    @TableField("ORIGINAL_PRICE")
    private Double originalPrice;

    /**
     * 原零售价
     */
    @TableField("ORIGINAL_RETAIL_PRICE")
    private Double originalRetailPrice;

    /**
     * 现批发价
     */
    @TableField("WHOLESALE_PRICE_NOW")
    private Double wholesalePriceNow;

    /**
     * 现进价
     */
    @TableField("PRICE_NOW")
    private Double priceNow;

    /**
     * 现零售价
     */
    @TableField("RETAIL_PRICE_NOW")
    private Double retailPriceNow;

    /**
     * 批发价调价利润
     */
    @TableField("WHOLESALE_PRICE_ADJUST_PROFIT")
    private Double wholesalePriceAdjustProfit;

    /**
     * 零售价调价利润
     */
    @TableField("RETAIL_PRICE_ADJUST_PROFIT")
    private Double retailPriceAdjustProfit;

    /**
     * 转换因子
     */
    @TableField("CONVERSION_FACTOR")
    private String conversionFactor;

    /**
     * 调价类别
     */
    @TableField("PRICE_ADJUSTMENT_CATEGORY")
    private String priceAdjustmentCategory;

    /**
     * 调价方式
     */
    @TableField("PRICE_ADJUSTMENT_METHOD")
    private String priceAdjustmentMethod;

    /**
     * 调价原因
     */
    @TableField("ADJUST_PRICE_REASON")
    private String adjustPriceReason;

    /**
     * 基本药物标志
     */
    @TableField("ESSENTIAL_DRUG_FLAG")
    private String essentialDrugFlag;

    /**
     * 基本药物级别
     */
    @TableField("ESSENTIAL_DRUG_LEVEL")
    private String essentialDrugLevel;

    /**
     * 业务数据新建时间
     */
    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    /**
     * 业务数据更新时间
     */
    @TableField("UPDATE_DATE")
    private LocalDateTime updateDate;

    /**
     * 系统上传时间
     */
    @TableField("UPLOAD_TIME")
    private LocalDateTime uploadTime;

    /**
     * 有效标识
     */
    @TableField("ESTATUS")
    private Integer estatus;


}
