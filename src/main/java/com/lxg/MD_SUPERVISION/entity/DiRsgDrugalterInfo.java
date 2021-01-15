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
 * 2.8.1. 药品出入库
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DI_RSG_DRUGALTER_INFO")
public class DiRsgDrugalterInfo implements Serializable {

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
     * 出入库明细序号
     */
    @TableField("DETAIL_LOCAL_ID")
    private String detailLocalId;

    /**
     * 出入库单据号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 操作时间
     */
    @TableField("OPERATION_TIME")
    private LocalDateTime operationTime;

    /**
     * 出入库时间
     */
    @TableField("INVENTORY_TIME")
    private LocalDateTime inventoryTime;

    /**
     * 操作人代码
     */
    @TableField("OPERATOR_CODE")
    private String operatorCode;

    /**
     * 操作人名称
     */
    @TableField("OPERATOR_NAME")
    private String operatorName;

    /**
     * 复核人代码
     */
    @TableField("REVIEWER_CODE")
    private String reviewerCode;

    /**
     * 复核人名称
     */
    @TableField("REVIEWER_NAME")
    private String reviewerName;

    /**
     * 出库科室编码
     */
    @TableField("EX_WAREHOUSE_DEPARTMENT_CODE")
    private String exWarehouseDepartmentCode;

    /**
     * 出库科室名称
     */
    @TableField("EX_WAREHOUSE_DEPARTMENT_NAME")
    private String exWarehouseDepartmentName;

    /**
     * 入库科室编码
     */
    @TableField("IN_WAREHOUSE_DEPARTMENT_CODE")
    private String inWarehouseDepartmentCode;

    /**
     * 入库科室名称
     */
    @TableField("IN_WAREHOUSE_DEPARTMENT_NAME")
    private String inWarehouseDepartmentName;

    /**
     * 药品信息编码
     */
    @TableField("BUSINESS_ID")
    private String businessId;

    /**
     * 药品采购码
     */
    @TableField("DRUG_PROCUREMENT_CODE")
    private String drugProcurementCode;

    /**
     * 医保编码
     */
    @TableField("INSUR_CODE")
    private String insurCode;

    /**
     * 药品名称
     */
    @TableField("DRUG_NAME")
    private String drugName;

    /**
     * 药品类别代码
     */
    @TableField("DRUG_CLASS_CODE")
    private String drugClassCode;

    /**
     * 药品类别名称
     */
    @TableField("DRUG_CLASS_NAME")
    private String drugClassName;

    /**
     * 药品产地
     */
    @TableField("DRUG_PRODUCT_AREA")
    private String drugProductArea;

    /**
     * 生产厂家
     */
    @TableField("PRODUCT_MANUFACTURER")
    private String productManufacturer;

    /**
     * 药品失效日期
     */
    @TableField("DRUG_EXPIRATION_DATE")
    private LocalDateTime drugExpirationDate;

    /**
     * 批准文号
     */
    @TableField("RATIFIER")
    private String ratifier;

    /**
     * 最小单位
     */
    @TableField("MINIMUM_UNIT")
    private String minimumUnit;

    /**
     * 转换系数
     */
    @TableField("CONVERSION_FACTOR")
    private Long conversionFactor;

    /**
     * 药品规格
     */
    @TableField("DRUG_SPECIFICATION")
    private String drugSpecification;

    /**
     * 包装单位
     */
    @TableField("MSUNITNO")
    private String msunitno;

    /**
     * 包装系统
     */
    @TableField("PACKAGING_SYSTEM")
    private String packagingSystem;

    /**
     * 批号
     */
    @TableField("BATCH_NUM")
    private String batchNum;

    /**
     * 批次
     */
    @TableField("BATCH")
    private String batch;

    /**
     * 数量
     */
    @TableField("CHANGE_NUM")
    private String changeNum;

    /**
     * 单位
     */
    @TableField("UNIT")
    private String unit;

    /**
     * 批发价
     */
    @TableField("TRADE_PRICE")
    private Double tradePrice;

    /**
     * 进价
     */
    @TableField("PURCHASE_PRICE")
    private Double purchasePrice;

    /**
     * 零售价
     */
    @TableField("SELLING_PRICE")
    private Double sellingPrice;

    /**
     * 总金额
     */
    @TableField("TOTAL_AMOUNT")
    private Double totalAmount;

    /**
     * 出入库标识
     */
    @TableField("WAREHOUSE_ACCESS_FLAG")
    private String warehouseAccessFlag;

    /**
     * 出入库方式
     */
    @TableField("WAREHOUSE_ACCESS_WAY")
    private String warehouseAccessWay;

    /**
     * 供应商代码
     */
    @TableField("SUPPLIER_CODE")
    private String supplierCode;

    /**
     * 供应商名称
     */
    @TableField("SUPPLIER_NAME")
    private String supplierName;

    /**
     * 采购方式
     */
    @TableField("PROCUREMENT_MODE")
    private String procurementMode;

    /**
     * 采购单据号
     */
    @TableField("PURCHASING_DOCUMENT_NUMBER")
    private String purchasingDocumentNumber;

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
