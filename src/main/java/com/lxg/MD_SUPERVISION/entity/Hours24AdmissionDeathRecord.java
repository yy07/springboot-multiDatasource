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
 * 2.6.3. 24H内入院死亡记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("HOURS24_ADMISSION_DEATH_RECORD")
public class Hours24AdmissionDeathRecord implements Serializable {

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
     * 入院死亡记录ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 住院号
     */
    @TableField("INPATIENT_NO")
    private String inpatientNo;

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
     * 入院日期时间
     */
    @TableField("INHOS_DATE")
    private LocalDateTime inhosDate;

    /**
     * 死亡日期时间
     */
    @TableField("DEATH_TIME")
    private LocalDateTime deathTime;

    /**
     * 入院情况
     */
    @TableField("INHOS_STATE")
    private String inhosState;

    /**
     * 中医“四诊”观察结果
     */
    @TableField("TCM_FOUR_DIAG_METHODS")
    private String tcmFourDiagMethods;

    /**
     * 治则治法
     */
    @TableField("PRINCIPLE_METHOD")
    private String principleMethod;

    /**
     * 入院诊断-西医诊断
     */
    @TableField("INHOS_DIAG_WM_DIAG_DESC")
    private String inhosDiagWmDiagDesc;

    /**
     * 入院诊断-西医诊断名称
     */
    @TableField("INHOS_DIAG_WM_DIAG_NAME")
    private String inhosDiagWmDiagName;

    /**
     * 入院诊断-西医诊断编码
     */
    @TableField("INHOS_DIAG_WM_DIAG_CODE")
    private String inhosDiagWmDiagCode;

    /**
     * 入院诊断-中医病名
     */
    @TableField("INHOS_DIAG_CM_DIS_DESC")
    private String inhosDiagCmDisDesc;

    /**
     * 入院诊断-中医病名名称
     */
    @TableField("INHOS_DIAG_CM_DIS_NAME")
    private String inhosDiagCmDisName;

    /**
     * 入院诊断-中医病名代码
     */
    @TableField("INHOS_DIAG_CM_DIS_CODE")
    private String inhosDiagCmDisCode;

    /**
     * 入院诊断-中医证候
     */
    @TableField("INHOS_DIAG_CM_SYNDROME_DESC")
    private String inhosDiagCmSyndromeDesc;

    /**
     * 入院诊断-中医证候名称
     */
    @TableField("INHOS_DIAG_CM_SYNDROME_NAME")
    private String inhosDiagCmSyndromeName;

    /**
     * 入院诊断-中医证候代码
     */
    @TableField("INHOS_DIAG_CM_SYNDROME_CODE")
    private String inhosDiagCmSyndromeCode;

    /**
     * 诊疗过程描述
     */
    @TableField("TREATMENT_PROCESS_DESC")
    private String treatmentProcessDesc;

    /**
     * 死亡原因
     */
    @TableField("DEATH_REASON")
    private String deathReason;

    /**
     * 死亡诊断-西医诊断
     */
    @TableField("DEATH_DIAG_WM_DIAG_DESC")
    private String deathDiagWmDiagDesc;

    /**
     * 死亡诊断-西医诊断名称
     */
    @TableField("DEATH_DIAG_WM_DIAG_NAME")
    private String deathDiagWmDiagName;

    /**
     * 死亡诊断-西医诊断编码
     */
    @TableField("DEATH_DIAG_WM_DIAG_CODE")
    private String deathDiagWmDiagCode;

    /**
     * 死亡诊断-中医病名
     */
    @TableField("DEATH_DIAG_CM_DIS_DESC")
    private String deathDiagCmDisDesc;

    /**
     * 死亡诊断-中医病名名称
     */
    @TableField("DEATH_DIAG_CM_DIS_NAME")
    private String deathDiagCmDisName;

    /**
     * 死亡诊断-中医病名代码
     */
    @TableField("DEATH_DIAG_CM_DIS_CODE")
    private String deathDiagCmDisCode;

    /**
     * 死亡诊断-中医证候
     */
    @TableField("DEATH_DIAG_CM_SYNDROME_DESC")
    private String deathDiagCmSyndromeDesc;

    /**
     * 死亡诊断-中医证候名称
     */
    @TableField("DEATH_DIAG_CM_SYNDROME_NAME")
    private String deathDiagCmSyndromeName;

    /**
     * 死亡诊断-中医证候代码
     */
    @TableField("DEATH_DIAG_CM_SYNDROME_CODE")
    private String deathDiagCmSyndromeCode;

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
    @TableField("DIRECTOR_DOCTOR_SIG")
    private String directorDoctorSig;

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
