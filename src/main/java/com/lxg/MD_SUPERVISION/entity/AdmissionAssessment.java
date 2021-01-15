package com.lxg.MD_SUPERVISION.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 2.5.3. 入院评估
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ADMISSION_ASSESSMENT")
public class AdmissionAssessment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableField("ID")
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
     * 入院评估记录序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

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
     * 国籍代码
     */
    @TableField("NATIONALITY_CODE")
    private String nationalityCode;

    /**
     * 国籍
     */
    @TableField("NATIONALITY_NAME")
    private String nationalityName;

    /**
     * 民族
     */
    @TableField("NATION")
    private String nation;

    /**
     * 民族名称
     */
    @TableField("NATION_NAME")
    private String nationName;

    /**
     * 婚姻状况代码
     */
    @TableField("MARRIAGE_CODE")
    private String marriageCode;

    /**
     * 婚姻状况
     */
    @TableField("MARRIAGE_NAME")
    private String marriageName;

    /**
     * 职业类别代码
     */
    @TableField("OCCU_CODE")
    private String occuCode;

    /**
     * 职业类别
     */
    @TableField("OCCU_NAME")
    private String occuName;

    /**
     * 学历代码
     */
    @TableField("EDU_CODE")
    private String eduCode;

    /**
     * 学历
     */
    @TableField("EDU_NAME")
    private String eduName;

    /**
     * 患者电话号码
     */
    @TableField("PHONE")
    private String phone;

    /**
     * 工作单位电话号码
     */
    @TableField("UNIT_PHONE")
    private String unitPhone;

    /**
     * 患者电子邮件地址
     */
    @TableField("EMAIL")
    private String email;

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
     * 入病房方式
     */
    @TableField("WARD_METHOD")
    private String wardMethod;

    /**
     * 入院诊断编码
     */
    @TableField("INHOS_DIAG_CODE")
    private String inhosDiagCode;

    /**
     * 入院诊断名称
     */
    @TableField("INHOS_DIAG_NAME")
    private String inhosDiagName;

    /**
     * 入院日期时间
     */
    @TableField("INHOS_DATE")
    private LocalDateTime inhosDate;

    /**
     * 主要症状
     */
    @TableField("MAIN_SYMPTOMS")
    private String mainSymptoms;

    /**
     * 体重（kg）
     */
    @TableField("WEIGHT")
    private Double weight;

    /**
     * 体温（℃）
     */
    @TableField("TEMPERATURE")
    private Double temperature;

    /**
     * 呼吸频率（次/min）
     */
    @TableField("RESPIRATORY_RATE")
    private Integer respiratoryRate;

    /**
     * 脉率（次/min）
     */
    @TableField("PULSE_RATE")
    private Integer pulseRate;

    /**
     * 收缩压（mmHg）
     */
    @TableField("SBP")
    private Integer sbp;

    /**
     * 舒张压（mmHg）
     */
    @TableField("DBP")
    private Integer dbp;

    /**
     * 入院原因
     */
    @TableField("INHOS_REASON")
    private String inhosReason;

    /**
     * 入院途径代码
     */
    @TableField("INHOS_METHOD_CODE")
    private String inhosMethodCode;

    /**
     * 入院途径
     */
    @TableField("INHOS_METHOD")
    private String inhosMethod;

    /**
     * Apgar评分值
     */
    @TableField("APGAR_SCORE")
    private Integer apgarScore;

    /**
     * 饮食情况代码
     */
    @TableField("DIET_STATE_CODE")
    private String dietStateCode;

    /**
     * 饮食情况
     */
    @TableField("DIET_STATE")
    private String dietState;

    /**
     * 发育程度代码
     */
    @TableField("DEVELOPMENTAL_DEGREE_CODE")
    private String developmentalDegreeCode;

    /**
     * 发育程度
     */
    @TableField("DEVELOPMENTAL_DEGREE_")
    private String developmentalDegree;

    /**
     * 精神状态正常标志
     */
    @TableField("MENTAL_STATE_NORMAL_FLAG")
    private String mentalStateNormalFlag;

    /**
     * 睡眠状况
     */
    @TableField("SLEEP_STATUS")
    private String sleepStatus;

    /**
     * 特殊情况
     */
    @TableField("SPECIAL_CASES")
    private String specialCases;

    /**
     * 心理状态代码
     */
    @TableField("MENTATION_STATUS_CODE")
    private String mentationStatusCode;

    /**
     * 心理状态
     */
    @TableField("MENTATION_STATUS_")
    private String mentationStatus;

    /**
     * 营养状态代码
     */
    @TableField("NUTRITIONAL_STATUS_CODE")
    private String nutritionalStatusCode;

    /**
     * 营养状态
     */
    @TableField("NUTRITIONAL_STATUS")
    private String nutritionalStatus;

    /**
     * 自理能力代码
     */
    @TableField("SELFCARE_ABILITY_CODE")
    private String selfcareAbilityCode;

    /**
     * 自理能力
     */
    @TableField("SELFCARE_ABILITY")
    private String selfcareAbility;

    /**
     * 一般健康状况标志
     */
    @TableField("GENERAL_HEALTH_FLAG")
    private String generalHealthFlag;

    /**
     * 疾病史（含外伤）
     */
    @TableField("MEDI_HISTORY")
    private String mediHistory;

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
     * 家族史
     */
    @TableField("FAMILY_HISTORY")
    private String familyHistory;

    /**
     * 护理观察项目名称
     */
    @TableField("NUR_OBSER_PROJECT_NAME")
    private String nurObserProjectName;

    /**
     * 护理观察结果
     */
    @TableField("NUR_OBSER_PROJECT_RESULT")
    private String nurObserProjectResult;

    /**
     * 吸烟标志
     */
    @TableField("SMOKE_FLAG")
    private String smokeFlag;

    /**
     * 停止吸烟天数
     */
    @TableField("STOP_SMOKING_DAYS")
    private Integer stopSmokingDays;

    /**
     * 吸烟状况代码
     */
    @TableField("SMODE_STATUS_CODE")
    private String smodeStatusCode;

    /**
     * 吸烟状况
     */
    @TableField("SMODE_STATUS")
    private String smodeStatus;

    /**
     * 日吸烟量（支）
     */
    @TableField("DAILY_SMOKE")
    private Integer dailySmoke;

    /**
     * 饮酒标志
     */
    @TableField("DRUNK_FLAG")
    private String drunkFlag;

    /**
     * 饮酒频率代码
     */
    @TableField("DRINK_FREQUENCY_CODE")
    private String drinkFrequencyCode;

    /**
     * 饮酒频率
     */
    @TableField("DRINK_FREQUENCY")
    private String drinkFrequency;

    /**
     * 日饮酒量（mL）
     */
    @TableField("DAILY_DRINK")
    private Integer dailyDrink;

    /**
     * 通知医师标志
     */
    @TableField("NOTIFY_PHYSICIAN_FLAG")
    private String notifyPhysicianFlag;

    /**
     * 通知医师日期时间
     */
    @TableField("NOTIFY_PHYSICIAN_DATETIME")
    private LocalDateTime notifyPhysicianDatetime;

    /**
     * 评估日期时间
     */
    @TableField("VALUATION_DATETIME")
    private LocalDateTime valuationDatetime;

    /**
     * 责任护士签名
     */
    @TableField("NURSE_SIGN")
    private String nurseSign;

    /**
     * 接诊护士签名
     */
    @TableField("ADMISSIONS_NURSE_SIGN")
    private String admissionsNurseSign;

    /**
     * 签名日期时间
     */
    @TableField("SIGN_DATETIME")
    private LocalDateTime signDatetime;

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
