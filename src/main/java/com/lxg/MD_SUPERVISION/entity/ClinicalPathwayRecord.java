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
 * 2.3.9. 住院诊疗临床路径记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("CLINICAL_PATHWAY_RECORD")
public class ClinicalPathwayRecord implements Serializable {

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
     * 住院科室代码
     */
    @TableField("CLINIC_DEPT_CODE")
    private String clinicDeptCode;

    /**
     * 住院科室名称
     */
    @TableField("CLINIC_DEPT_NAME")
    private String clinicDeptName;

    /**
     * 住院诊疗临床路径记录序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 患者本地唯一ID
     */
    @TableField("PATIENT_LOCAL_ID")
    private String patientLocalId;

    /**
     * 病案号
     */
    @TableField("CASE_HISTORY_CODE")
    private String caseHistoryCode;

    /**
     * 住院号
     */
    @TableField("ADMISSION_CODE")
    private String admissionCode;

    /**
     * 住院次数
     */
    @TableField("ADMISSION_COUNT")
    private Integer admissionCount;

    /**
     * 患者姓名
     */
    @TableField("NAME")
    private String name;

    /**
     * 患者性别代码
     */
    @TableField("GENDER_CODE")
    private String genderCode;

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
     * 路径状态代码
     */
    @TableField("PATHWAY_STATUS_CODE")
    private Integer pathwayStatusCode;

    /**
     * 路径状态
     */
    @TableField("PATHWAY_STATUS")
    private String pathwayStatus;

    /**
     * 入径时间
     */
    @TableField("PATHWAY_TIME")
    private LocalDateTime pathwayTime;

    /**
     * 入径诊断代码
     */
    @TableField("PATHWAY_DIAGNOSIS_CODE")
    private String pathwayDiagnosisCode;

    /**
     * 入径诊断
     */
    @TableField("PATHWAY_DIAGNOSIS")
    private String pathwayDiagnosis;

    /**
     * 变异时间
     */
    @TableField("VARIATION_TIME")
    private LocalDateTime variationTime;

    /**
     * 变异诊断时间
     */
    @TableField("VARIATION_DIAGNOSIS_TIME")
    private LocalDateTime variationDiagnosisTime;

    /**
     * 变异诊断代码
     */
    @TableField("VARIATION_DIAGNOSIS_CODE")
    private String variationDiagnosisCode;

    /**
     * 变异诊断
     */
    @TableField("VARIATION_DIAGNOSIS")
    private String variationDiagnosis;

    /**
     * 路径编码
     */
    @TableField("PATHWAY_CODE")
    private String pathwayCode;

    /**
     * 路径名称
     */
    @TableField("PATHWAY_NAME")
    private String pathwayName;

    /**
     * 变异原因编码
     */
    @TableField("VARIATION_REASON_CODE")
    private String variationReasonCode;

    /**
     * 出径时间
     */
    @TableField("PATHWAY_OUT_TIME")
    private LocalDateTime pathwayOutTime;

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
