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
 * 2.11.4. 药品基本信息表
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DRUG_DETAIL_INFO")
public class DrugDetailInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;

    /**
     * 医疗机构代码
     */
    @TableField("ORGAN_CODE_SYSTEM")
    private String organCodeSystem;

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
     * 修改标志
     */
    @TableField("MODIFY_MARK")
    private String modifyMark;

    /**
     * 本位码
     */
    @TableField("LOCAL_CODE")
    private String localCode;

    /**
     * 监管码
     */
    @TableField("SUPERVISORY_CODE")
    private String supervisoryCode;

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
     * 药品商品名称
     */
    @TableField("DRUG_PRODUCT_NAME")
    private String drugProductName;

    /**
     * DDD值
     */
    @TableField("DDD_VALUE")
    private Double dddValue;

    /**
     * DDD单位
     */
    @TableField("DDD_UNIT")
    private String dddUnit;

    /**
     * 药品代别代码
     */
    @TableField("DRUG_SURROGATE_CODE")
    private String drugSurrogateCode;

    /**
     * 处方药标志
     */
    @TableField("PRESCRIP_DRUG_SIGN")
    private String prescripDrugSign;

    /**
     * 药品类别
     */
    @TableField("DRUG_CATEGORY")
    private String drugCategory;

    /**
     * 剂量
     */
    @TableField("DOSE")
    private Double dose;

    /**
     * 剂量单位
     */
    @TableField("DOSAGE_UNIT")
    private String dosageUnit;

    /**
     * 剂型代码
     */
    @TableField("FORMULA_CODE")
    private String formulaCode;

    /**
     * 药品规格
     */
    @TableField("DRUG_SPECIFICATIONS")
    private String drugSpecifications;

    /**
     * 单位
     */
    @TableField("UNIT")
    private String unit;

    /**
     * 生产厂家代码
     */
    @TableField("MANUFACTURER_CODE")
    private String manufacturerCode;

    /**
     * 生产厂家名称
     */
    @TableField("MANUFACTURER_NAME")
    private String manufacturerName;

    /**
     * 批准文号
     */
    @TableField("APPROVAL_NUMBER")
    private String approvalNumber;

    /**
     * 基本药物标志
     */
    @TableField("ESSENTIAL_DRUG_MARK")
    private String essentialDrugMark;

    /**
     * 基本药物级别
     */
    @TableField("ESSENTIAL_DRUG_LEVEL")
    private String essentialDrugLevel;

    /**
     * 药品属性大类
     */
    @TableField("DRUG_ATTRIBUTE_TYPE")
    private String drugAttributeType;

    /**
     * 使用标志
     */
    @TableField("USE_SIGN")
    private String useSign;

    /**
     * 院内制剂标志
     */
    @TableField("IN_HOSPITAL_PRE_MARK")
    private String inHospitalPreMark;

    /**
     * 抗生素标志
     */
    @TableField("ANTIBIOTIC_MARK")
    private String antibioticMark;

    /**
     * 填报日期
     */
    @TableField("DATE_OF_FILING")
    private LocalDateTime dateOfFiling;

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
