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
 * 2.3.1. 入院诊断
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("HOSPITALIZED_DIAGNOSIS")
public class HospitalizedDiagnosis implements Serializable {

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
     * 入院诊断记录ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 入院记录ID
     */
    @TableField("ADMISSION_ID")
    private String admissionId;

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
     * 病理号
     */
    @TableField("PATHOLOGY_NO")
    private String pathologyNo;

    /**
     * 入院诊断顺位
     */
    @TableField("ADMISSION_DIAGNOSIS_PICKS")
    private Integer admissionDiagnosisPicks;

    /**
     * 诊断类型代码
     */
    @TableField("DISEASE_TYPE_CODE")
    private String diseaseTypeCode;

    /**
     * 诊断日期
     */
    @TableField("DIAGNOSIS_DATE")
    private LocalDateTime diagnosisDate;

    /**
     * 诊断类型名称
     */
    @TableField("DISEASE_TYPE_NAME")
    private String diseaseTypeName;

    /**
     * 是否主要诊断
     */
    @TableField("DISEASE_MAIN_FLAG")
    private String diseaseMainFlag;

    /**
     * 诊断编码
     */
    @TableField("WESTERN_DIAGNOSIS_CODE")
    private String westernDiagnosisCode;

    /**
     * 诊断名称
     */
    @TableField("WESTERN_DIAGNOSIS_NAME")
    private String westernDiagnosisName;

    /**
     * 中医病名代码
     */
    @TableField("CHINESE_DIAGNOSIS_CODE")
    private String chineseDiagnosisCode;

    /**
     * 中医病名名称
     */
    @TableField("CHINESE_DIAGNOSIS_NAME")
    private String chineseDiagnosisName;

    /**
     * 中医症候编码
     */
    @TableField("CHINESE_SYNDROME_CODE")
    private String chineseSyndromeCode;

    /**
     * 中医症候名称
     */
    @TableField("CHINESE_SYNDROME_NAME")
    private String chineseSyndromeName;

    /**
     * 诊断依据代码
     */
    @TableField("DIAGNOSIS_BASIS_CODE")
    private String diagnosisBasisCode;

    /**
     * 诊断依据
     */
    @TableField("DIAGNOSIS_BASIS")
    private String diagnosisBasis;

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
