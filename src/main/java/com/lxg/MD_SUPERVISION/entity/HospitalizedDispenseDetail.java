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
 * 2.3.3. 住院发药记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("HOSPITALIZED_DISPENSE_DETAIL")
public class HospitalizedDispenseDetail implements Serializable {

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
     * 发药明细序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 发药单号
     */
    @TableField("PRESCRIBE_LOCAL_ID")
    private String prescribeLocalId;

    /**
     * 医嘱序号
     */
    @TableField("ORDER_NUMBER")
    private String orderNumber;

    /**
     * 医嘱明细序号
     */
    @TableField("MEDICAL_ORDER_DETAIL_NO")
    private String medicalOrderDetailNo;

    /**
     * 医嘱组号
     */
    @TableField("ORDER_INDICATION")
    private String orderIndication;

    /**
     * 收费明细序号
     */
    @TableField("CHARGE_DETAIL_NUMBER")
    private String chargeDetailNumber;

    /**
     * 医保编码
     */
    @TableField("INSUR_CODE")
    private String insurCode;

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
     * 药品名称
     */
    @TableField("DRUG_NAME")
    private String drugName;

    /**
     * 药品规格
     */
    @TableField("DRUG_SPECIFICATIONS")
    private String drugSpecifications;

    /**
     * 药品数量
     */
    @TableField("DRUGS_NUMBER")
    private String drugsNumber;

    /**
     * 药品单位
     */
    @TableField("DRUGS_UNIT")
    private String drugsUnit;

    /**
     * 配药人代码
     */
    @TableField("DISPENSER_CODE")
    private String dispenserCode;

    /**
     * 配药人名称
     */
    @TableField("DISPENSER_NAME")
    private String dispenserName;

    /**
     * 配药时间
     */
    @TableField("DISPENSING_TIME")
    private LocalDateTime dispensingTime;

    /**
     * 发药人代码
     */
    @TableField("REFILL_DISPENSER_CODE")
    private String refillDispenserCode;

    /**
     * 发药人名称
     */
    @TableField("REFILL_DISPENSER_NAME")
    private String refillDispenserName;

    /**
     * 发药时间
     */
    @TableField("REFILL_DISPENSER_TIME")
    private LocalDateTime refillDispenserTime;

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
    @TableField("DRUG_WITHDRAWAL_LABLE")
    private String drugWithdrawalLable;

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
