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
 * 2.6.11. 住院病程记录-会诊记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("CONSULTATION_RECORD")
public class ConsultationRecord implements Serializable {

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
     * 会诊记录ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 医嘱本地ID
     */
    @TableField("ORDER_LID")
    private String orderLid;

    /**
     * 电子申请单编号
     */
    @TableField("ELECTRONIC_APP_NO")
    private String electronicAppNo;

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
     * 病历摘要
     */
    @TableField("RECORD_SUM")
    private String recordSum;

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
     * 西医诊断名称
     */
    @TableField("WESTERN_DIAGNOSIS_NAME")
    private String westernDiagnosisName;

    /**
     * 西医诊断编码
     */
    @TableField("WESTERN_DIAGNOSIS_CODE")
    private String westernDiagnosisCode;

    /**
     * 中医病名名称
     */
    @TableField("CHINESE_DIAGNOSIS_NAME")
    private String chineseDiagnosisName;

    /**
     * 中医病名代码
     */
    @TableField("CHINESE_DIAGNOSIS_CODE")
    private String chineseDiagnosisCode;

    /**
     * 中医证候名称
     */
    @TableField("CHINESE_SYNDROME_NAME")
    private String chineseSyndromeName;

    /**
     * 中医证候代码
     */
    @TableField("CHINESE_SYNDROME_CODE")
    private String chineseSyndromeCode;

    /**
     * 治则治法
     */
    @TableField("THERAPEUTIC_THERAPY")
    private String therapeuticTherapy;

    /**
     * 诊疗过程名称
     */
    @TableField("ASSESSMENT_NAME")
    private String assessmentName;

    /**
     * 诊疗过程描述
     */
    @TableField("TREATMENT_PROCESS_DESC")
    private String treatmentProcessDesc;

    /**
     * 会诊类型
     */
    @TableField("CONSULTATION_TYPE")
    private String consultationType;

    /**
     * 会诊原因
     */
    @TableField("CONSULTATION_COURSE")
    private String consultationCourse;

    /**
     * 会诊目的
     */
    @TableField("CONSULTATION_PURPOSE")
    private String consultationPurpose;

    /**
     * 会诊申请医师签名
     */
    @TableField("CONSULTATION_APPLY_DR_SIG")
    private String consultationApplyDrSig;

    /**
     * 会诊申请科室
     */
    @TableField("CONSULTATION_APPLY_DEPT")
    private String consultationApplyDept;

    /**
     * 会诊申请医疗机构名称
     */
    @TableField("CONSULTATION_APPLY_ORG")
    private String consultationApplyOrg;

    /**
     * 会诊意见
     */
    @TableField("CONSULTATION_OPINION")
    private String consultationOpinion;

    /**
     * 会诊医师签名
     */
    @TableField("CONSULTATION_DR_SIG")
    private String consultationDrSig;

    /**
     * 会诊科室名称
     */
    @TableField("CONSULTATION_DEPT")
    private String consultationDept;

    /**
     * 会诊医师所在医疗机构名称
     */
    @TableField("CONSULTATION_DR_ORG")
    private String consultationDrOrg;

    /**
     * 会诊所在医疗机构名称
     */
    @TableField("CONSULTATION_ORG_NAME")
    private String consultationOrgName;

    /**
     * 会诊日期时间
     */
    @TableField("CONSULTATION_DATE")
    private LocalDateTime consultationDate;

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
