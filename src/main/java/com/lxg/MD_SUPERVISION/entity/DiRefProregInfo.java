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
 * 2.6.19. 转诊记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DI_REF_PROREG_INFO")
public class DiRefProregInfo implements Serializable {

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
     * 就诊类型代码
     */
    @TableField("PATIENT_TYPE")
    private String patientType;

    /**
     * 就诊类型名称
     */
    @TableField("PATIENT_TYPE_NAME")
    private String patientTypeName;

    /**
     * 数据域代码
     */
    @TableField("DATA_ORIGIN")
    private Integer dataOrigin;

    /**
     * 门(急)诊号
     */
    @TableField("OUTPATIENT_NO")
    private String outpatientNo;

    /**
     * 住院号
     */
    @TableField("INPATIENT_NO")
    private String inpatientNo;

    /**
     * 就诊次数
     */
    @TableField("VISIT_COUNT")
    private Integer visitCount;

    /**
     * 转诊记录ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 患者姓名
     */
    @TableField("NAME")
    private String name;

    /**
     * 性别代码
     */
    @TableField("GENDER")
    private String gender;

    /**
     * 性别
     */
    @TableField("GENDER_NAME")
    private String genderName;

    /**
     * 年龄（岁）
     */
    @TableField("AGE_YEAR")
    private Integer ageYear;

    /**
     * 年龄（月）
     */
    @TableField("AGE_MONTH")
    private String ageMonth;

    /**
     * 病案号
     */
    @TableField("MEDICAL_RECORD_NO")
    private String medicalRecordNo;

    /**
     * 初步印象
     */
    @TableField("PRELIMINARY_IMPRESSION")
    private String preliminaryImpression;

    /**
     * 现病史
     */
    @TableField("PRESENT_HISTORY")
    private String presentHistory;

    /**
     * 既往疾病种类代码
     */
    @TableField("PASTDIS_TYPE_CODE")
    private String pastdisTypeCode;

    /**
     * 既往疾病种类
     */
    @TableField("PASTDIS_TYPE")
    private String pastdisType;

    /**
     * 既往疾病史
     */
    @TableField("MEDICAL_HISTORY")
    private String medicalHistory;

    /**
     * 转诊原因
     */
    @TableField("REFERRAL_REASONS_FOR")
    private String referralReasonsFor;

    /**
     * 治疗过程描述
     */
    @TableField("TREAT_PROCESS_DESCRIPTION")
    private String treatProcessDescription;

    /**
     * 转诊申请单号
     */
    @TableField("REFERRAL_APPLICATION")
    private String referralApplication;

    /**
     * 转诊时间
     */
    @TableField("REFERRAL_TIME")
    private LocalDateTime referralTime;

    /**
     * 转诊类型代码
     */
    @TableField("REFERRAL_TYPE_CODE")
    private String referralTypeCode;

    /**
     * 转诊类型
     */
    @TableField("REFERRAL_TYPE")
    private String referralType;

    /**
     * 转诊医院代码
     */
    @TableField("REFERRAL_HOSPITAL_CODE")
    private String referralHospitalCode;

    /**
     * 转诊医院
     */
    @TableField("REFERRAL_HOSPITAL")
    private String referralHospital;

    /**
     * 转诊机构科室代码
     */
    @TableField("REFERRAL_AGENCIES_CODE")
    private String referralAgenciesCode;

    /**
     * 转诊机构科室名称
     */
    @TableField("REFERRAL_AGENCIES")
    private String referralAgencies;

    /**
     * 转诊医生工号
     */
    @TableField("DOCTOR_NUMBER")
    private String doctorNumber;

    /**
     * 转诊医师姓名
     */
    @TableField("REFERRAL_DOCTOR")
    private String referralDoctor;

    /**
     * 转诊医生联系电话
     */
    @TableField("DOCTOR_PHONE")
    private String doctorPhone;

    /**
     * 录入人
     */
    @TableField("INPUT")
    private String input;

    /**
     * 录入时间
     */
    @TableField("INPUT_TIME")
    private LocalDateTime inputTime;

    /**
     * 审核时间
     */
    @TableField("AUDIT_TIME")
    private LocalDateTime auditTime;

    /**
     * 审核人
     */
    @TableField("AUDIT_NAME")
    private String auditName;

    /**
     * 审核意见
     */
    @TableField("AUDIT_OPINION")
    private String auditOpinion;

    /**
     * 接诊时间
     */
    @TableField("RECEPTION_TIME")
    private LocalDateTime receptionTime;

    /**
     * 接诊机构代码
     */
    @TableField("ADMISSIONS_MECHANISM_CODE")
    private String admissionsMechanismCode;

    /**
     * 接诊机构
     */
    @TableField("ADMISSIONS_MECHANISM")
    private String admissionsMechanism;

    /**
     * 接诊机构科室代码
     */
    @TableField("ADMISSIONS_DEPARTMENT_CODE")
    private String admissionsDepartmentCode;

    /**
     * 接诊机构科室名称
     */
    @TableField("ADMISSIONS_DEPARTMENT")
    private String admissionsDepartment;

    /**
     * 接诊医生工号
     */
    @TableField("DOCTORS_WORK_NUMBER")
    private String doctorsWorkNumber;

    /**
     * 接诊医生
     */
    @TableField("DOCTORS")
    private String doctors;

    /**
     * 接诊医生联系电话
     */
    @TableField("DOCTORS_PHONE_NUMBER")
    private String doctorsPhoneNumber;

    /**
     * 诊断结果
     */
    @TableField("PATHOLOGY_DIS")
    private String pathologyDis;

    /**
     * 治疗方案
     */
    @TableField("ASSESSMENT_PLAN")
    private String assessmentPlan;

    /**
     * 康复措施指导
     */
    @TableField("REHABILITATION_MEASURES")
    private String rehabilitationMeasures;

    /**
     * 检查结论
     */
    @TableField("CHECK_CONCLUSION")
    private String checkConclusion;

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
