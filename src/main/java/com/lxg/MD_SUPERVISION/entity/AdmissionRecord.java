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
 * 2.6.1. 入院记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ADMISSION_RECORD")
public class AdmissionRecord implements Serializable {

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
     * 入院记录编号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 住院号
     */
    @TableField("INPATIENT_NO")
    private String inpatientNo;

    /**
     * 病区名称
     */
    @TableField("WARD_NAME")
    private String wardName;

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
     * 民族
     */
    @TableField("NATION")
    private Integer nation;

    /**
     * 民族名称
     */
    @TableField("NATION_NAME")
    private String nationName;

    /**
     * 婚姻状况代码
     */
    @TableField("MARRIAGE_CODE")
    private Integer marriageCode;

    /**
     * 婚姻状况名称
     */
    @TableField("MARRIAGE_NAME")
    private String marriageName;

    /**
     * 地址-省（自治区、直辖市）
     */
    @TableField("PROVINCE")
    private String province;

    /**
     * 地址-市（地区、州）
     */
    @TableField("CITY")
    private String city;

    /**
     * 地址-县（区）
     */
    @TableField("COUNTY")
    private String county;

    /**
     * 地址-乡（镇、街道办事处）
     */
    @TableField("TOWN_SHIP")
    private String townShip;

    /**
     * 地址-村（街、路、弄等）
     */
    @TableField("RELATION_STREET")
    private String relationStreet;

    /**
     * 地址-门牌号码
     */
    @TableField("HOUSE_NUMBER")
    private String houseNumber;

    /**
     * 现住址-详细地址
     */
    @TableField("DETAIL")
    private String detail;

    /**
     * 职业类别代码
     */
    @TableField("OCCUPATION_CODE")
    private Integer occupationCode;

    /**
     * 职业类别名称
     */
    @TableField("OCCUPATION_NAME")
    private String occupationName;

    /**
     * 入院日期时间
     */
    @TableField("INHOS_DATE")
    private LocalDateTime inhosDate;

    /**
     * 病史陈述者姓名
     */
    @TableField("HISTORY_PRESENTER_NAME")
    private String historyPresenterName;

    /**
     * 陈述者与患者的关系代码
     */
    @TableField("PRESENTER_PATIENT_RELAT_CODE")
    private Integer presenterPatientRelatCode;

    /**
     * 陈述者与患者的关系
     */
    @TableField("PRESENTER_PATIENT_RELAT")
    private String presenterPatientRelat;

    /**
     * 陈述内容可靠标志
     */
    @TableField("STATEMENTS_RELIABLE_MARKE")
    private String statementsReliableMarke;

    /**
     * 主诉
     */
    @TableField("CHIEF_COMPLAINT")
    private String chiefComplaint;

    /**
     * 现病史
     */
    @TableField("PRESENT_HISTORY")
    private String presentHistory;

    /**
     * 一般健康状况标志
     */
    @TableField("GENERAL_HEALTH_FLAG")
    private String generalHealthFlag;

    /**
     * 疾病史（含外伤）
     */
    @TableField("MEDICAL_HISTORY")
    private String medicalHistory;

    /**
     * 患者传染性标志
     */
    @TableField("INFECTIOUS_FLAG")
    private String infectiousFlag;

    /**
     * 传染病史
     */
    @TableField("INFECTIOUS_HISTORY")
    private String infectiousHistory;

    /**
     * 预防接种史
     */
    @TableField("VACCINATION_HISTORY")
    private String vaccinationHistory;

    /**
     * 手术史
     */
    @TableField("OPERATION_HISTORY")
    private String operationHistory;

    /**
     * 输血史
     */
    @TableField("BLOOD_HISTORY")
    private String bloodHistory;

    /**
     * 过敏史
     */
    @TableField("ALLERGY_HISTORY")
    private String allergyHistory;

    /**
     * 个人史
     */
    @TableField("PERSONAL_HISTORY")
    private String personalHistory;

    /**
     * 婚育史
     */
    @TableField("OBSTETRICAL_HISTORY")
    private String obstetricalHistory;

    /**
     * 月经史
     */
    @TableField("MENSTRUAL_HISTORY")
    private String menstrualHistory;

    /**
     * 家族史
     */
    @TableField("FAMILY_HISTORY")
    private String familyHistory;

    /**
     * 体格检查--体温（℃）
     */
    @TableField("TEMPERATURE")
    private Double temperature;

    /**
     * 体格检查--脉率（次/min）
     */
    @TableField("PULSE_RATE")
    private Integer pulseRate;

    /**
     * 体格检查--呼吸频率（次/min）
     */
    @TableField("RESPIRATORY_RATE")
    private Integer respiratoryRate;

    /**
     * 体格检查--收缩压（mmHg）
     */
    @TableField("SBP")
    private Integer sbp;

    /**
     * 体格检查--舒张压（mmHg）
     */
    @TableField("DBP")
    private Integer dbp;

    /**
     * 体格检查--身高（cm）
     */
    @TableField("HEIGHT")
    private Double height;

    /**
     * 体格检查--体重（kg）
     */
    @TableField("WEIGHT")
    private Double weight;

    /**
     * 体格检查--一般状况检查结果
     */
    @TableField("GENERAL_STATUS_RESULTS")
    private String generalStatusResults;

    /**
     * 体格检查--皮肤和黏膜检查结果
     */
    @TableField("SKIN_CHECK_RESULT")
    private String skinCheckResult;

    /**
     * 体格检查--全身浅表淋巴结检查结果
     */
    @TableField("LYMPH_NODE_CHECK_RESULT")
    private String lymphNodeCheckResult;

    /**
     * 体格检查--头部及其器官检查结果
     */
    @TableField("HEADITS_ORGAN_EXAM_RESULT")
    private String headitsOrganExamResult;

    /**
     * 体格检查--颈部检查结果
     */
    @TableField("NECK_CHECK_RESULT")
    private String neckCheckResult;

    /**
     * 体格检查--胸部检查结果
     */
    @TableField("CHEST_CHECK_RESULT")
    private String chestCheckResult;

    /**
     * 体格检查--腹部检查结果
     */
    @TableField("ABDOMINAL_CHECK_RESULT")
    private String abdominalCheckResult;

    /**
     * 体格检查--肛门指诊检查结果描述
     */
    @TableField("DRE_CHECK_RESULT")
    private String dreCheckResult;

    /**
     * 体格检查--外生殖器检查结果
     */
    @TableField("EXT_GENITAL_CHECK_ANOMALY")
    private String extGenitalCheckAnomaly;

    /**
     * 体格检查--脊柱检查结果
     */
    @TableField("SPINE_CHECK_RESULT")
    private String spineCheckResult;

    /**
     * 体格检查--四肢检查结果
     */
    @TableField("LIMBS_CHECK_RESULT")
    private String limbsCheckResult;

    /**
     * 体格检查--神经系统检查结果
     */
    @TableField("NERVOUS_CHECK_RESULT")
    private String nervousCheckResult;

    /**
     * 专科情况
     */
    @TableField("SPECIALIST_STATUS")
    private String specialistStatus;

    /**
     * 辅助检查结果
     */
    @TableField("AE_RESULT")
    private String aeResult;

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
     * 治则治法名称
     */
    @TableField("THERAPEUTIC_THERAPY_NAME")
    private String therapeuticTherapyName;

    /**
     * 接诊医师签名
     */
    @TableField("RECEPTION_DOCTOR_SIG")
    private String receptionDoctorSig;

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
     * 病案号
     */
    @TableField("MEDICAL_RECORD_NO")
    private String medicalRecordNo;

    /**
     * 病史陈述者联系电话
     */
    @TableField("HISTORY_STATEMENT_PHONE")
    private String historyStatementPhone;

    /**
     * 病史陈述者地址
     */
    @TableField("HISTORY_STATEMENT_ADDRESS")
    private String historyStatementAddress;

    /**
     * 入院途径代码
     */
    @TableField("INHOS_METHOD_CODE")
    private String inhosMethodCode;

    /**
     * 入院途径
     */
    @TableField("INHOS_METHOD_NAME")
    private String inhosMethodName;

    /**
     * 住院症状代码
     */
    @TableField("HOS_SYMPTOMS_CODE")
    private String hosSymptomsCode;

    /**
     * 住院症状
     */
    @TableField("HOS_SYMPTOMS")
    private String hosSymptoms;

    /**
     * 发病日期时间
     */
    @TableField("ATTACK")
    private LocalDateTime attack;

    /**
     * 症状开始日期时间
     */
    @TableField("START_SYMPTOMS_DATE")
    private LocalDateTime startSymptomsDate;

    /**
     * 症状停止日期时间
     */
    @TableField("STOP_SYMPTOMS_DATE")
    private LocalDateTime stopSymptomsDate;

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
     * 疾病状态代码
     */
    @TableField("HOS_DISEASE_STATUS_CODE")
    private String hosDiseaseStatusCode;

    /**
     * 疾病状态
     */
    @TableField("HOS_DISEASE_STATUS")
    private String hosDiseaseStatus;

    /**
     * 治疗结果代码
     */
    @TableField("TREATMENT_OUTCOME_CODE")
    private String treatmentOutcomeCode;

    /**
     * 治疗结果
     */
    @TableField("TREATMENT_OUTCOME")
    private String treatmentOutcome;

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
