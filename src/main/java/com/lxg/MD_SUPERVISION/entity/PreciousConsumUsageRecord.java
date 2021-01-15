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
 * 2.5.11. 高值耗材使用记录表
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("PRECIOUS_CONSUM_USAGE_RECORD")
public class PreciousConsumUsageRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;

    /**
     * 就诊机构代码
     */
    @TableField("CLINIC_ORGAN_CODE")
    private String clinicOrganCode;

    /**
     * 就诊机构名称
     */
    @TableField("CLINIC_ORGAN_NAME")
    private String clinicOrganName;

    /**
     * 就诊科室代码
     */
    @TableField("CLINIC_DEPT_CODE")
    private String clinicDeptCode;

    /**
     * 就诊科室名称
     */
    @TableField("CLINIC_DEPT_NAME")
    private String clinicDeptName;

    /**
     * 患者本地唯一ID
     */
    @TableField("PATIENT_LOCAL_ID")
    private String patientLocalId;

    /**
     * 高值耗材使用记录序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 入院记录ID
     */
    @TableField("AMISSION_RECORD_ID")
    private String amissionRecordId;

    /**
     * 住院号
     */
    @TableField("ADMISSION_CODE")
    private String admissionCode;

    /**
     * 住院次数
     */
    @TableField("ADMISSION_COUNT")
    private Integer admissionCount;

    /**
     * 患者姓名
     */
    @TableField("NAME")
    private String name;

    /**
     * 患者性别代码
     */
    @TableField("GENDER_CODE")
    private String genderCode;

    /**
     * 年龄(岁)
     */
    @TableField("AGE_YEAR")
    private Integer ageYear;

    /**
     * 年龄(月)
     */
    @TableField("AGE_MONTH")
    private String ageMonth;

    /**
     * 材料编码
     */
    @TableField("MATERIALS_CODE")
    private String materialsCode;

    /**
     * 医院内部材料编码
     */
    @TableField("MATERIALS_HIS_CODE")
    private String materialsHisCode;

    /**
     * 产品编码
     */
    @TableField("PRODUCT_CODE")
    private String productCode;

    /**
     * 材料名称
     */
    @TableField("INV_NAME")
    private String invName;

    /**
     * 耗材单价
     */
    @TableField("UNIT_PRICE")
    private Double unitPrice;

    /**
     * 数量
     */
    @TableField("AMOUNT")
    private Integer amount;

    /**
     * 耗材单位
     */
    @TableField("CONSUMABLE_UNIT")
    private String consumableUnit;

    /**
     * 耗材总金额
     */
    @TableField("TOTAL_MONEY")
    private Double totalMoney;

    /**
     * 使用途径
     */
    @TableField("USE_WAYS")
    private String useWays;

    /**
     * 植入性耗材标志
     */
    @TableField("PLANTING_HUMAN_MATERIAL_FLAG")
    private String plantingHumanMaterialFlag;

    /**
     * 使用日期时间
     */
    @TableField("USE_DATE")
    private LocalDateTime useDate;

    /**
     * 产品生产厂家
     */
    @TableField("PRODUCT_MANUFACTURER")
    private String productManufacturer;

    /**
     * 产品供应商
     */
    @TableField("PRODUCT_SUPPLIER")
    private String productSupplier;

    /**
     * 护士签名
     */
    @TableField("NURSE_SIGNATURE")
    private String nurseSignature;

    /**
     * 签名日期时间
     */
    @TableField("SIGNATURE_TIME")
    private LocalDateTime signatureTime;

    /**
     * 记录日期时间
     */
    @TableField("RECORD_TIME")
    private LocalDateTime recordTime;

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
