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
 * 2.8.3. 药品库存信息表
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DRUG_INVENTORY_INFO")
public class DrugInventoryInfo implements Serializable {

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
     * 库存序号
     */
    @TableField("INVENTORY_NO")
    private String inventoryNo;

    /**
     * 修改标志
     */
    @TableField("MODIFICATION_FLAG")
    private String modificationFlag;

    /**
     * 药品代码
     */
    @TableField("DRUG_CODING")
    private String drugCoding;

    /**
     * 药品采购码
     */
    @TableField("DRUG_PROCUREMENT_CODE")
    private String drugProcurementCode;

    /**
     * 本位码
     */
    @TableField("STANDARD_CODE")
    private String standardCode;

    /**
     * 监管码
     */
    @TableField("SUPERVISE_CODE")
    private String superviseCode;

    /**
     * 本系统药品目录代码
     */
    @TableField("CATALOGUE_CODE")
    private String catalogueCode;

    /**
     * 药品名称
     */
    @TableField("DRUG_NAME")
    private String drugName;

    /**
     * 药品类别
     */
    @TableField("DRUG_TYPE")
    private Integer drugType;

    /**
     * 批号
     */
    @TableField("BATCH_NUMBER")
    private String batchNumber;

    /**
     * 有效期
     */
    @TableField("VALIDITY_PERIOD")
    private LocalDateTime validityPeriod;

    /**
     * 库存数量
     */
    @TableField("INVENTORY")
    private String inventory;

    /**
     * 库存上限
     */
    @TableField("INVENTORY_U")
    private String inventoryU;

    /**
     * 库存下限
     */
    @TableField("INVENTORY_D")
    private String inventoryD;

    /**
     * 库存单位
     */
    @TableField("SUK")
    private String suk;

    /**
     * 最小单位
     */
    @TableField("SMALLEST_UNIT")
    private String smallestUnit;

    /**
     * 规格
     */
    @TableField("SPECIFICATION")
    private String specification;

    /**
     * 包装单位
     */
    @TableField("UNIT")
    private String unit;

    /**
     * 包装数量
     */
    @TableField("PACKAGE_NUMBER")
    private String packageNumber;

    /**
     * 生产厂家代码
     */
    @TableField("MANUFACTURER_CODE")
    private String manufacturerCode;

    /**
     * 生产厂家名称
     */
    @TableField("MANUFACTURER")
    private String manufacturer;

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
     * 库房标识
     */
    @TableField("WAREHOUSE_FLAG")
    private String warehouseFlag;

    /**
     * 库房编码
     */
    @TableField("WAREHOUSE_CODE")
    private String warehouseCode;

    /**
     * 库房名称
     */
    @TableField("WAREHOUSE_NAME")
    private String warehouseName;

    /**
     * 药品库存编号
     */
    @TableField("DRUG_INVENTORY_CODE")
    private String drugInventoryCode;

    /**
     * 药品类别名称
     */
    @TableField("DRUG_TYPE_NAME")
    private String drugTypeName;

    /**
     * 药品产地
     */
    @TableField("DRUG_ORIGIN")
    private String drugOrigin;

    /**
     * 批准文号
     */
    @TableField("RATIFY_NUMBER")
    private String ratifyNumber;

    /**
     * 入库时间
     */
    @TableField("INVENTORY_TIME")
    private LocalDateTime inventoryTime;

    /**
     * 进货药品价格
     */
    @TableField("PURCHASE_PRICE")
    private String purchasePrice;

    /**
     * 零售药品价格
     */
    @TableField("RETAIL_PRICE")
    private String retailPrice;

    /**
     * 批发药品价格
     */
    @TableField("TRADE_PRICE")
    private String tradePrice;

    /**
     * 药品出库数量合计
     */
    @TableField("DELIVERY_COUNT")
    private String deliveryCount;

    /**
     * 药品入库数量合计
     */
    @TableField("INVENTORY_QUANTITY")
    private String inventoryQuantity;

    /**
     * 填报日期
     */
    @TableField("FLEXIBLE")
    private LocalDateTime flexible;

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

    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    @TableField("UPDATE_DATE")
    private LocalDateTime updateDate;


}
