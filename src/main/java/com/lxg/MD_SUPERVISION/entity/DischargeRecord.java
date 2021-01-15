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
 * 2.6.15. 住院病程记录-出院记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DISCHARGE_RECORD")
public class DischargeRecord implements Serializable {

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
     * 住院次数
     */
    @TableField("VISIT_COUNT")
    private Integer visitCount;

    /**
     * 出院记录ID
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
     * 住院号
     */
    @TableField("INPATIENT_NO")
    private String inpatientNo;

    /**
     * 科室代码
     */
    @TableField("CLINIC_DEPT_CODE")
    private String clinicDeptCode;

    /**
     * 科室名称
     */
    @TableField("DEPT_NAME")
    private String deptName;

    /**
     * 病区名称
     */
    @TableField("WARD_NAME")
    private String wardName;

    /**
     * 病房号
     */
    @TableField("WARD_NUM")
    private String wardNum;

    /**
     * 病床号
     */
    @TableField("BED_NUM")
    private String bedNum;

    /**
     * 入院日期时间
     */
    @TableField("INHOS_DATE")
    private LocalDateTime inhosDate;

    /**
     * 入院情况
     */
    @TableField("INHOS_STATE")
    private String inhosState;

    /**
     * 入院诊断编码
     */
    @TableField("INHOS_DIAGNOSIS_CODE")
    private String inhosDiagnosisCode;

    /**
     * 入院诊断名称
     */
    @TableField("INHOS_DIAGNOSIS_NAME")
    private String inhosDiagnosisName;

    /**
     * 阳性辅助检查结果
     */
    @TableField("POSITIVE_TEST_RESULTS")
    private String positiveTestResults;

    /**
     * 中医“四诊”观察结果
     */
    @TableField("CHINA_FOUR_DIAG_OBSER")
    private String chinaFourDiagObser;

    /**
     * 治则治法
     */
    @TableField("THERAPEUTIC_THERAPY")
    private String therapeuticTherapy;

    /**
     * 诊疗过程描述
     */
    @TableField("TREATMENT_PROCESS_DESC")
    private String treatmentProcessDesc;

    /**
     * 中药煎煮方法
     */
    @TableField("CH_MEDICINE_DECOCTION")
    private String chMedicineDecoction;

    /**
     * 中药用药方法
     */
    @TableField("CHINESE_MEDICINE_TREAT_METHOD")
    private String chineseMedicineTreatMethod;

    /**
     * 出院情况
     */
    @TableField("OUTHOS_STATE")
    private String outhosState;

    /**
     * 出院日期时间
     */
    @TableField("OUTHOS_DATE")
    private LocalDateTime outhosDate;

    /**
     * 出院时症状与体征
     */
    @TableField("OUTHOS_SYMPTOMS_SIGNS")
    private String outhosSymptomsSigns;

    /**
     * 出院医嘱
     */
    @TableField("OUTHOS_ADVIC")
    private String outhosAdvic;

    /**
     * 住院医师签名
     */
    @TableField("ADMISSION_DOCTOR_SIG")
    private String admissionDoctorSig;

    /**
     * 主治医师签名
     */
    @TableField("ATTENDING_DOCTOR_SIG")
    private String attendingDoctorSig;

    /**
     * 主任医师签名
     */
    @TableField("DIRECTOR_DOCTOR_SIGNATURE")
    private String directorDoctorSignature;

    /**
     * 签名日期时间
     */
    @TableField("SIGNATURE_DATETIME")
    private LocalDateTime signatureDatetime;

    /**
     * 出院诊断-西医诊断
     */
    @TableField("EXHOS_DIAG_WM_DIAG_DESC")
    private String exhosDiagWmDiagDesc;

    /**
     * 出院诊断-西医诊断名称
     */
    @TableField("EXHOS_DIAG_WM_DIAG_NAME")
    private String exhosDiagWmDiagName;

    /**
     * 出院诊断-西医诊断编码
     */
    @TableField("EXHOS_DIAG_WM_DIAG_CODE")
    private String exhosDiagWmDiagCode;

    /**
     * 出院诊断-中医病名
     */
    @TableField("EXHOS_DIAG_CM_DIS_DESC")
    private String exhosDiagCmDisDesc;

    /**
     * 出院诊断-中医病名名称
     */
    @TableField("EXHOS_DIAG_CM_DIS_NAME")
    private String exhosDiagCmDisName;

    /**
     * 出院诊断-中医病名代码
     */
    @TableField("EXHOS_DIAG_CM_DIS_CODE")
    private String exhosDiagCmDisCode;

    /**
     * 出院诊断-中医证候
     */
    @TableField("EXHOS_DIAG_CM_SYNDROME_DESC")
    private String exhosDiagCmSyndromeDesc;

    /**
     * 出院诊断-中医证候名称
     */
    @TableField("EXHOS_DIAG_CM_SYNDROME_NAME")
    private String exhosDiagCmSyndromeName;

    /**
     * 出院诊断-中医证候代码
     */
    @TableField("EXHOS_DIAG_CM_SYNDROME_CODE")
    private String exhosDiagCmSyndromeCode;

    /**
     * 出生日期
     */
    @TableField("BIRTH_DATE")
    private LocalDateTime birthDate;

    /**
     * 病案号
     */
    @TableField("MEDICAL_RECORD_NO")
    private String medicalRecordNo;

    /**
     * 并发症
     */
    @TableField("COMPLICATION")
    private String complication;

    /**
     * 治疗方案
     */
    @TableField("ASSESSMENT_PLAN")
    private String assessmentPlan;

    /**
     * 住院患者治疗结果
     */
    @TableField("INPATIENT_TREAT_RESULT_NAME")
    private String inpatientTreatResultName;

    /**
     * 特殊检查及重要会诊
     */
    @TableField("SPECIAL_INSPECT_CONSULTAT")
    private String specialInspectConsultat;

    /**
     * 出院方式代码
     */
    @TableField("OUTHOS_WAY_CODE")
    private String outhosWayCode;

    /**
     * 出院方式
     */
    @TableField("OUTHOS_WAY")
    private String outhosWay;

    /**
     * 康复措施指导
     */
    @TableField("REHABILITATION_MEASURES")
    private String rehabilitationMeasures;

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
     * 住院患者入院科室代码
     */
    @TableField("INPATIENT_ADMI_DEPT_CODE")
    private String inpatientAdmiDeptCode;

    /**
     * 住院患者入院科室
     */
    @TableField("INPATIENT_DEPARTMENT")
    private String inpatientDepartment;

    /**
     * 住院患者出院病室代码
     */
    @TableField("INPATIENTS_WARD_CODE")
    private String inpatientsWardCode;

    /**
     * 住院患者出院病室
     */
    @TableField("INPATIENTS_WARD")
    private String inpatientsWard;

    /**
     * 是否是结构化文档
     */
    @TableField("STRUCT_FLAG")
    private String structFlag;

    /**
     * 文本内容
     */
    @TableField("TEXT_CONTENT")
    private String textContent;

    /**
     * 存入类型
     */
    @TableField("CONTENT_TYPE")
    private String contentType;

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
