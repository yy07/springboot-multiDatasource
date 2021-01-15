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
 * 2.6.21. 传染病报告
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DI_IDN_INDNOT_INFO")
public class DiIdnIndnotInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;

    /**
     * 上传机构代码
     */
    @TableField("CLINIC_ORGAN_CODE")
    private String clinicOrganCode;

    /**
     * 上传机构名称
     */
    @TableField("CLINIC_ORGAN_NAME")
    private String clinicOrganName;

    /**
     * 患者本地唯一 id
     */
    @TableField("PATIENT_LOCAL_ID")
    private String patientLocalId;

    /**
     * 就诊次数
     */
    @TableField("VISIT_COUNT")
    private Integer visitCount;

    /**
     * 传染病报告ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 地区编码
     */
    @TableField("REGION_CODE")
    private String regionCode;

    /**
     * 地区名称
     */
    @TableField("REGION_NAME")
    private String regionName;

    /**
     * 批次号
     */
    @TableField("BATCH_NUM")
    private String batchNum;

    /**
     * 健康档案标识符
     */
    @TableField("EHR_NUM")
    private String ehrNum;

    /**
     * 记录表单编号
     */
    @TableField("RECORD_IDEN")
    private String recordIden;

    /**
     * 本人姓名
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
     * 年龄
     */
    @TableField("AGE")
    private String age;

    /**
     * 传染病报告卡编号
     */
    @TableField("REPORT_NUM")
    private String reportNum;

    /**
     * 报卡类别代码
     */
    @TableField("REPORT_TYPE_CODE")
    private String reportTypeCode;

    /**
     * 报告卡类别
     */
    @TableField("REPORT_TYPE")
    private String reportType;

    /**
     * 家长姓名
     */
    @TableField("PATENT_NAME")
    private String patentName;

    /**
     * 出生日期
     */
    @TableField("BIRTH_DATE")
    private LocalDateTime birthDate;

    /**
     * 证件类型代码
     */
    @TableField("CERT_TYPE")
    private String certType;

    /**
     * 证件名称
     */
    @TableField("CERT_NAME")
    private String certName;

    /**
     * 证件号码
     */
    @TableField("CERT_NUMBER")
    private String certNumber;

    /**
     * 地址全-现在地址
     */
    @TableField("UA_ADDRESS")
    private String uaAddress;

    /**
     * 现住地址-省（自治区、直辖市）
     */
    @TableField("UAPROVINCE")
    private String uaprovince;

    /**
     * 现住地址-市（地区、州）
     */
    @TableField("UACITY")
    private String uacity;

    /**
     * 现住地址-县（区）
     */
    @TableField("UACOUNTY")
    private String uacounty;

    /**
     * 现住地址-乡（镇、街道办事处）
     */
    @TableField("UATOWN_SHIP")
    private String uatownShip;

    /**
     * 现住地址-村（街、路、弄等）
     */
    @TableField("UASTREET")
    private String uastreet;

    /**
     * 现住地址-门牌号码
     */
    @TableField("UAHOUSE_NUMBER")
    private String uahouseNumber;

    /**
     * 现住地址-邮政编码
     */
    @TableField("UAPOST_CODE")
    private String uapostCode;

    /**
     * 本人电话号码
     */
    @TableField("UNIT_PHONE")
    private String unitPhone;

    /**
     * 工作单位名称
     */
    @TableField("UNIT_NAME")
    private String unitName;

    /**
     * 联系电话-住址
     */
    @TableField("ADDRESS_PHONE")
    private String addressPhone;

    /**
     * 家人电话号码
     */
    @TableField("CONTACT_PHONE")
    private String contactPhone;

    /**
     * 传染病患者属于（归属）代码
     */
    @TableField("PATIENT_CLASS_CODE")
    private String patientClassCode;

    /**
     * 病人所属类别
     */
    @TableField("PATIENT_CLASS")
    private String patientClass;

    /**
     * 地址全-户籍
     */
    @TableField("HR_ADDRESS")
    private String hrAddress;

    /**
     * 户籍单位地址-省(自治区、直辖市)
     */
    @TableField("HRPROVINCE")
    private String hrprovince;

    /**
     * 户籍单位地址-市(地区、州)
     */
    @TableField("HRCITY")
    private String hrcity;

    /**
     * 户籍单位地址-县(区)
     */
    @TableField("HRCOUNTY")
    private String hrcounty;

    /**
     * 户籍单位地址-乡(镇、街道办事处)
     */
    @TableField("HRTOWN_SHIP")
    private String hrtownShip;

    /**
     * 户籍单位地址-村(街、路、弄等)
     */
    @TableField("HRSTREET")
    private String hrstreet;

    /**
     * 户籍单位地址-门牌号码
     */
    @TableField("HRHOUSE_NUMBER")
    private String hrhouseNumber;

    /**
     * 户籍单位地址-邮政编码
     */
    @TableField("HRPOST_CODE")
    private String hrpostCode;

    /**
     * 地址全-工作单位地址
     */
    @TableField("PA_ADDRESS")
    private String paAddress;

    /**
     * 工作单位地址-省(自治区、直辖市)
     */
    @TableField("PAPROVINCE")
    private String paprovince;

    /**
     * 工作单位地址-市(地区、州)
     */
    @TableField("PACITY")
    private String pacity;

    /**
     * 工作单位地址-县(区)
     */
    @TableField("PACOUNTY")
    private String pacounty;

    /**
     * 工作单位地址-乡(镇、街道办事处)
     */
    @TableField("PATOWN_SHIP")
    private String patownShip;

    /**
     * 工作单位地址-村(街、路、弄等)
     */
    @TableField("PASTREET")
    private String pastreet;

    /**
     * 工作单位地址-门牌号码
     */
    @TableField("PAHOUSE_NUMBER")
    private String pahouseNumber;

    /**
     * 工作单位地址-邮政编码
     */
    @TableField("PAPOST_CODE")
    private String papostCode;

    /**
     * 传染病患者职业代码
     */
    @TableField("INFECTEDPERSON_OCCUPATION")
    private String infectedpersonOccupation;

    /**
     * 职业(传染病)
     */
    @TableField("OCCUPATION_NAME")
    private String occupationName;

    /**
     * 其他职业(传染病)
     */
    @TableField("INFECT_OTHER_OCCUPATION")
    private String infectOtherOccupation;

    /**
     * 诊断状态代码
     */
    @TableField("DIAGNOSIS_STATUS")
    private String diagnosisStatus;

    /**
     * 诊断状态
     */
    @TableField("DIAGNOSIS_STATUS_NAME")
    private String diagnosisStatusName;

    /**
     * 诊断结果
     */
    @TableField("DIAGNOSIS_RESULT")
    private String diagnosisResult;

    /**
     * 传染病发病类别代码
     */
    @TableField("INFECTIOUS_ATTACK_TYPE")
    private String infectiousAttackType;

    /**
     * 传染病发病类别
     */
    @TableField("INFECTIOUS_ATTACK")
    private String infectiousAttack;

    /**
     * 首次出现症状日期
     */
    @TableField("FIRST_SYMPTOMS_DATE")
    private LocalDateTime firstSymptomsDate;

    /**
     * 诊断日期
     */
    @TableField("DIAGNOSIS_DATE")
    private LocalDateTime diagnosisDate;

    /**
     * 死亡日期时间
     */
    @TableField("DEATH_DATE")
    private LocalDateTime deathDate;

    /**
     * 传染病类别代码
     */
    @TableField("INFECTIOUS_TYPE_CODE")
    private String infectiousTypeCode;

    /**
     * 传染病类别
     */
    @TableField("INFECTIOUS_TYPE")
    private String infectiousType;

    /**
     * 传染病名称代码
     */
    @TableField("INFECTIOUS_NAME_CODE")
    private String infectiousNameCode;

    /**
     * 传染病名称
     */
    @TableField("INFECTIOUS_NAME")
    private String infectiousName;

    /**
     * 其他法定管理以及重点监测传染病名称
     */
    @TableField("OTHER_INFECTIOUS_NAME")
    private String otherInfectiousName;

    /**
     * 订正病名
     */
    @TableField("AMEND_NAME")
    private String amendName;

    /**
     * 退卡原因
     */
    @TableField("BACK_CARD_CAUSE")
    private String backCardCause;

    /**
     * 报告医师工号
     */
    @TableField("REPORT_DOCTOR_SIGN")
    private String reportDoctorSign;

    /**
     * 报告医师姓名
     */
    @TableField("REPORT_DOCTOR_NAME")
    private String reportDoctorName;

    /**
     * 填报日期
     */
    @TableField("FILL_DATE")
    private LocalDateTime fillDate;

    /**
     * 填报单位代码
     */
    @TableField("FILL_ORGAN_CODE")
    private String fillOrganCode;

    /**
     * 填报机构名称
     */
    @TableField("FILL_ORGAN_NAME")
    private String fillOrganName;

    /**
     * 填报人姓名
     */
    @TableField("FILL_PERSON_NAME")
    private String fillPersonName;

    /**
     * 填报单位电话号码
     */
    @TableField("FILL_ORGAN_PHONE")
    private String fillOrganPhone;

    /**
     * 备注
     */
    @TableField("NOTE")
    private String note;

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
