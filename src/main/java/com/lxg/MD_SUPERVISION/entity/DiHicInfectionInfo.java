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
 * 2.6.20. 医院感染记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DI_HIC_INFECTION_INFO")
public class DiHicInfectionInfo implements Serializable {

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
     * 患者本地唯一ID
     */
    @TableField("PATIENT_LOCAL_ID")
    private String patientLocalId;

    /**
     * 就诊次数
     */
    @TableField("VISIT_COUNT")
    private Integer visitCount;

    /**
     * 医院感染记录ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 姓名
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
     * 感染记录编号
     */
    @TableField("INFECTION_RECORD_NUM")
    private String infectionRecordNum;

    /**
     * 入院日期
     */
    @TableField("INHOS_DATE")
    private LocalDateTime inhosDate;

    /**
     * 入院诊断代码
     */
    @TableField("INHOS_DIAGNOSIS_CODE")
    private String inhosDiagnosisCode;

    /**
     * 入院诊断
     */
    @TableField("ADMISSION_DIAGNOSIS")
    private String admissionDiagnosis;

    /**
     * 住院患者入院科室代码
     */
    @TableField("INPATIENT_ADMI_DEPT_CODE")
    private String inpatientAdmiDeptCode;

    /**
     * 住院患者入院科
     */
    @TableField("INPATIENT_DEPARTMENT")
    private String inpatientDepartment;

    /**
     * 出院日期
     */
    @TableField("OUTHOS_DATE")
    private LocalDateTime outhosDate;

    /**
     * 出院诊断代码
     */
    @TableField("OUTHOS_DIAG_CODE")
    private String outhosDiagCode;

    /**
     * 出院诊断
     */
    @TableField("OUTHOS_DIAGNOSIS")
    private String outhosDiagnosis;

    /**
     * 住院患者出院病室代码
     */
    @TableField("INPATIENTS_WARD_CODE")
    private String inpatientsWardCode;

    /**
     * 住院患者出院病室名称
     */
    @TableField("INPATIENTS_WARD")
    private String inpatientsWard;

    /**
     * 感染日期
     */
    @TableField("INFECTION_DATE")
    private LocalDateTime infectionDate;

    /**
     * 感染类型代码
     */
    @TableField("INFECTION_TYPE_CODE")
    private String infectionTypeCode;

    /**
     * 感染类型名称
     */
    @TableField("INFECTION_TYPE_NAME")
    private String infectionTypeName;

    /**
     * 感染部位代码
     */
    @TableField("INFECTION_PART_CODE")
    private String infectionPartCode;

    /**
     * 感染部位名称
     */
    @TableField("INFECTION_PART_NAME")
    private String infectionPartName;

    /**
     * 其他感染部位描述
     */
    @TableField("OTHER_SITES_INFECTION_DES")
    private String otherSitesInfectionDes;

    /**
     * 是否新生儿感染
     */
    @TableField("IS_NEONATAL_INFECTION")
    private String isNeonatalInfection;

    /**
     * 感染科室代码
     */
    @TableField("INFECTION_DEPT_CODE")
    private String infectionDeptCode;

    /**
     * 感染科室名称
     */
    @TableField("INFECTION_DEPT_NAME")
    private String infectionDeptName;

    /**
     * 感染预后代码
     */
    @TableField("INFECTION_PROGNOSTIC_CODE")
    private String infectionPrognosticCode;

    /**
     * 感染预后
     */
    @TableField("INFECTION_PROGNOSTIC")
    private String infectionPrognostic;

    /**
     * 是否进行病原学检查
     */
    @TableField("IS_PATHOGENIC_EXAMINATION")
    private String isPathogenicExamination;

    /**
     * 医院感染与原发病预后的关系代码
     */
    @TableField("REINFECT_PROGNOSIS_CODE")
    private String reinfectPrognosisCode;

    /**
     * 医院感染与原发病预后的关系名称
     */
    @TableField("REINFECT_PROGNOSIS_NAME")
    private String reinfectPrognosisName;

    /**
     * 易感因素代码
     */
    @TableField("SUSCEPTIBLE_FACTOR_CODE")
    private String susceptibleFactorCode;

    /**
     * 易感因素名称
     */
    @TableField("SUSCEPTIBLE_FACTOR")
    private String susceptibleFactor;

    /**
     * 其他易感因素描述
     */
    @TableField("OTHER_PREDISPOSE_FACTOR_DESC")
    private String otherPredisposeFactorDesc;

    /**
     * 抗生素使用情况代码
     */
    @TableField("ANTIBIOTIC_USE_SITUATION_CODE")
    private String antibioticUseSituationCode;

    /**
     * 抗生素使用情况
     */
    @TableField("ANTIBIOTIC_USE_SITUATION")
    private String antibioticUseSituation;

    /**
     * 侵袭性操作选择器代码
     */
    @TableField("INVASIVE_OPER_SELECT_CODE")
    private String invasiveOperSelectCode;

    /**
     * 侵袭性操作选择器名称
     */
    @TableField("INVASIVE_OPER_SELECT_NAME")
    private String invasiveOperSelectName;

    /**
     * 其他侵袭性操作选择器
     */
    @TableField("OTHER_INVASIVE_OPE_SELECT")
    private String otherInvasiveOpeSelect;

    /**
     * 控制方法代码
     */
    @TableField("CONTROL_METHOD_CODE")
    private String controlMethodCode;

    /**
     * 控制方法名称
     */
    @TableField("CONTROL_METHOD_NAME")
    private String controlMethodName;

    /**
     * 检查方法代码
     */
    @TableField("EXAMINATION_METHOD_CODE")
    private String examinationMethodCode;

    /**
     * 检查方法名称
     */
    @TableField("EXAMINATION_METHOD_NAME")
    private String examinationMethodName;

    /**
     * 是否进行药敏实验
     */
    @TableField("IS_DRUG_SENSITIVE_TEST")
    private String isDrugSensitiveTest;

    /**
     * 药敏情况
     */
    @TableField("DRUGSENSITIVITY")
    private String drugsensitivity;

    /**
     * 住院机构代码
     */
    @TableField("INPATIENT_CODE")
    private String inpatientCode;

    /**
     * 住院机构名称
     */
    @TableField("INPATIENT_ORGANIZATION")
    private String inpatientOrganization;

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
