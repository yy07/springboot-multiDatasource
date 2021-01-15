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
 * 2.2.7. 门(急)诊发药记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("OUTPATIENT_DISPENSE_RECORD")
public class OutpatientDispenseRecord implements Serializable {

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
     * 发药明细序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 发药序号
     */
    @TableField("PRESCRIBE_LOCAL_ID")
    private String prescribeLocalId;

    /**
     * 药品编码
     */
    @TableField("DRUG_ID")
    private String drugId;

    /**
     * 药品采购码
     */
    @TableField("DRUG_PROCUREMENT_CODE")
    private String drugProcurementCode;

    /**
     * 药物名称
     */
    @TableField("DRUG_NAME")
    private String drugName;

    /**
     * 医保编码
     */
    @TableField("INSUR_CODE")
    private String insurCode;

    /**
     * 药物规格
     */
    @TableField("DRUG_SPECIFICATIONS")
    private String drugSpecifications;

    /**
     * 药品发药数量
     */
    @TableField("DISPENSING_QUANTITY")
    private Integer dispensingQuantity;

    /**
     * 药品发药单位
     */
    @TableField("DISPENSING_UNIT")
    private String dispensingUnit;

    /**
     * 配药人代码
     */
    @TableField("DISPENSER_PY_CODE")
    private String dispenserPyCode;

    /**
     * 配药人名称
     */
    @TableField("DISPENSER_PY_NAME")
    private String dispenserPyName;

    /**
     * 配药时间
     */
    @TableField("DISPENSER_PY_TIME")
    private LocalDateTime dispenserPyTime;

    /**
     * 发药人代码
     */
    @TableField("DISPENSER_FY_CODE")
    private String dispenserFyCode;

    /**
     * 发药人名称
     */
    @TableField("DISPENSER_FY_NAME")
    private String dispenserFyName;

    /**
     * 发药时间
     */
    @TableField("DISPENSER_FY_TIME")
    private LocalDateTime dispenserFyTime;

    /**
     * 药品批号
     */
    @TableField("DRUGS_BATCH_NUMBER")
    private String drugsBatchNumber;

    /**
     * 药品批次
     */
    @TableField("DRUGS_BATCH")
    private String drugsBatch;

    /**
     * 退药标识
     */
    @TableField("DRUG_WITHDRAWAL_IDEN")
    private String drugWithdrawalIden;

    /**
     * 退药时间
     */
    @TableField("DRUG_WITHDRAWAL_TIME")
    private LocalDateTime drugWithdrawalTime;

    /**
     * 退药人代码
     */
    @TableField("DRUG_WITHDRAWAL_PERSON_CODE")
    private String drugWithdrawalPersonCode;

    /**
     * 退药人名称
     */
    @TableField("DRUG_WITHDRAWAL_PERSON_NAME")
    private String drugWithdrawalPersonName;

    /**
     * 药房代码
     */
    @TableField("PHARMACY_CODE")
    private String pharmacyCode;

    /**
     * 药房名称
     */
    @TableField("PHARMACY_NAME")
    private String pharmacyName;

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
