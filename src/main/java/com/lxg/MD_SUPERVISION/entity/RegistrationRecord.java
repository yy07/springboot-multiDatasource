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
 * 门(急)诊挂号表
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("REGISTRATION_RECORD")
public class RegistrationRecord implements Serializable {

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
     * 患者本地唯一ID
     */
    @TableField("PATIENT_LOCAL_ID")
    private String patientLocalId;

    /**
     * 挂号序号
     */
    @TableField("REG_SERIAL_NO")
    private String regSerialNo;

    /**
     * 门(急)诊号
     */
    @TableField("OUTPATIENT_NO")
    private String outpatientNo;

    /**
     * 就诊次数
     */
    @TableField("VISIT_COUNT")
    private Integer visitCount;

    /**
     * 挂号类别代码
     */
    @TableField("REG_TYPE_CODE")
    private String regTypeCode;

    /**
     * 挂号类别
     */
    @TableField("REG_TYPE")
    private String regType;

    /**
     * 挂号方式代码
     */
    @TableField("REG_WAY_CODE")
    private String regWayCode;

    /**
     * 挂号方式
     */
    @TableField("REG_WAY")
    private String regWay;

    /**
     * 挂号费
     */
    @TableField("REG_FEE")
    private Double regFee;

    /**
     * 预约途径代码
     */
    @TableField("RESVER_WAY_CODE")
    private String resverWayCode;

    /**
     * 预约途径
     */
    @TableField("RESVER_WAY")
    private String resverWay;

    /**
     * 挂退号标识
     */
    @TableField("REG_NON_FLAG")
    private String regNonFlag;

    /**
     * 门急诊标识
     */
    @TableField("OUTPATIENT_FLAG")
    private String outpatientFlag;

    /**
     * 初复诊标识
     */
    @TableField("FIRST_RETURN_FLAG")
    private String firstReturnFlag;

    /**
     * 是否就诊标识
     */
    @TableField("IS_MEDICAL_FLAG")
    private String isMedicalFlag;

    /**
     * 挂号日期/退号日期
     */
    @TableField("REG_NON_DATE")
    private LocalDateTime regNonDate;

    /**
     * 就诊时间
     */
    @TableField("CLINIC_DATE")
    private LocalDateTime clinicDate;

    /**
     * 医疗费用支付方式代码
     */
    @TableField("MEDICAL_PAY_WAY_CODE")
    private String medicalPayWayCode;

    /**
     * 医疗费用支付方式
     */
    @TableField("PAY_WAY")
    private String payWay;

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
     * 就诊医生代码
     */
    @TableField("CLINIC_DOCTOR_CODE")
    private String clinicDoctorCode;

    /**
     * 就诊医生名称
     */
    @TableField("CLINIC_DOCTOR_NAME")
    private String clinicDoctorName;

    /**
     * 挂号时间段
     */
    @TableField("REG_TIME_SLOT")
    private String regTimeSlot;

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
