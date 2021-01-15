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
 * 2.3.6. 出院小结
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DISCHARGE_ABSTRACT")
public class DischargeAbstract implements Serializable {

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
     * 出院小结序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 病案号
     */
    @TableField("MEDICAL_RECORD_NO")
    private String medicalRecordNo;

    /**
     * 住院号
     */
    @TableField("INPATIENT_NO")
    private String inpatientNo;

    /**
     * 住院次数
     */
    @TableField("VISIT_COUNT")
    private Integer visitCount;

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
     * 性别名称
     */
    @TableField("GENDER_NAME")
    private String genderName;

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
     * 患者身份证号标识
     */
    @TableField("IDCARD_FLAG")
    private String idcardFlag;

    /**
     * 居民健康卡号
     */
    @TableField("HEALTH_FILE_NO")
    private String healthFileNo;

    /**
     * 婚姻状况代码
     */
    @TableField("MARRIAGE_CODE")
    private String marriageCode;

    /**
     * 婚姻状况名称
     */
    @TableField("MARRIAGE_NAME")
    private String marriageName;

    /**
     * 患者电话号码
     */
    @TableField("PHONE_NO")
    private String phoneNo;

    /**
     * 联系人姓名
     */
    @TableField("CONTACT_NAME")
    private String contactName;

    /**
     * 联系人电话号码
     */
    @TableField("CONTACT_PHONE")
    private String contactPhone;

    /**
     * 入院情况
     */
    @TableField("INHOS_STATE")
    private String inhosState;

    /**
     * 入院诊断编码
     */
    @TableField("DIAGNOSIS_NO_IN")
    private String diagnosisNoIn;

    /**
     * 入院诊断中医病名代码
     */
    @TableField("DISEASE_NO_IN")
    private String diseaseNoIn;

    /**
     * 入院诊断中医证候代码
     */
    @TableField("SYNDROME_NO_IN")
    private String syndromeNoIn;

    /**
     * 出院诊断编码
     */
    @TableField("DIAGNOSIS_NO_OUT")
    private String diagnosisNoOut;

    /**
     * 出院诊断中医病名代码
     */
    @TableField("DISEASE_NO_OUT")
    private String diseaseNoOut;

    /**
     * 出院诊断中医证候代码
     */
    @TableField("SYNDROME_NO_OUT")
    private String syndromeNoOut;

    /**
     * 手术操作编码
     */
    @TableField("OPERATION_NO")
    private String operationNo;

    /**
     * 手术操作开始时间
     */
    @TableField("OPERATION_TIME")
    private LocalDateTime operationTime;

    /**
     * 麻醉方法代码
     */
    @TableField("ANAESTHESIA_NO")
    private String anaesthesiaNo;

    /**
     * 手术过程
     */
    @TableField("OPERATION_PROCESS")
    private String operationProcess;

    /**
     * 手术切口类别代码
     */
    @TableField("NOTCH_LEVEL")
    private String notchLevel;

    /**
     * 手术切口愈合等级代码
     */
    @TableField("HEALING_LEVEL")
    private String healingLevel;

    /**
     * 治则治法
     */
    @TableField("THERAPEUTIC_THERAPY")
    private String therapeuticTherapy;

    /**
     * 治则治法名称
     */
    @TableField("THERAPEUTIC_THERAPY_NAME")
    private String therapeuticTherapyName;

    /**
     * 中医“四诊”观察结果
     */
    @TableField("CHINA_FOUR_DIAG_OBSER")
    private String chinaFourDiagObser;

    /**
     * 阳性辅助检查结果
     */
    @TableField("POSITIVE_TEST_RESULTS")
    private String positiveTestResults;

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
     * 诊疗过程描述
     */
    @TableField("TREATMENT_PROCESS_DESC")
    private String treatmentProcessDesc;

    /**
     * 病情转归代码
     */
    @TableField("DISEASE_OUTCOME_CODE")
    private String diseaseOutcomeCode;

    /**
     * 病情转归名称
     */
    @TableField("DISEASE_OUTCOME_NAME")
    private String diseaseOutcomeName;

    /**
     * 出院情况
     */
    @TableField("OUTHOS_STATE")
    private String outhosState;

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
     * 出院日期时间
     */
    @TableField("OUTHOS_DATE")
    private LocalDateTime outhosDate;

    /**
     * 实际住院天数
     */
    @TableField("ACTUAL_HOSPITAL_STAY")
    private Integer actualHospitalStay;

    /**
     * 住院医师姓名
     */
    @TableField("ADMISSION_DOCTOR_SIG")
    private String admissionDoctorSig;

    /**
     * 住院医师签名时间
     */
    @TableField("ADMISSION_SIG_DATETIME")
    private LocalDateTime admissionSigDatetime;

    /**
     * 上级医师姓名
     */
    @TableField("SUP_DOCTOR_SIG")
    private String supDoctorSig;

    /**
     * 上级医师签名时间
     */
    @TableField("SIGNATURE_DATETIME")
    private LocalDateTime signatureDatetime;

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
