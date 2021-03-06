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
 * 2.5.7. 一般护理记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("GENERAL_CARE_RECORD")
public class GeneralCareRecord implements Serializable {

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
     * 就诊次数
     */
    @TableField("VISIT_COUNT")
    private Integer visitCount;

    /**
     * 一般护理记录ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 医嘱本地ID
     */
    @TableField("ORDER_LID")
    private String orderLid;

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
     * 疾病诊断编码
     */
    @TableField("DIS_DIAG_CODE")
    private String disDiagCode;

    /**
     * 疾病诊断名称
     */
    @TableField("DIS_DIAG_NAME")
    private String disDiagName;

    /**
     * 护理等级代码
     */
    @TableField("NURSING_GRADE_CODE")
    private String nursingGradeCode;

    /**
     * 护理等级名称
     */
    @TableField("NURSING_GRADE_NAME")
    private String nursingGradeName;

    /**
     * 护理类型代码
     */
    @TableField("NURSING_TYPE_CODE")
    private String nursingTypeCode;

    /**
     * 护理类型名称
     */
    @TableField("NURSING_TYPE_NAME")
    private String nursingTypeName;

    /**
     * 过敏史
     */
    @TableField("ALLERGY_HISTORY")
    private String allergyHistory;

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
     * 血氧饱和度（%）
     */
    @TableField("OXYGEN_SATURATION")
    private Double oxygenSaturation;

    /**
     * 足背动脉搏动标志
     */
    @TableField("DORSAL_ARTERIAL_PULSE_FLAG")
    private String dorsalArterialPulseFlag;

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
     * 导管护理描述
     */
    @TableField("CATHETER_CARE_DESCRIPTION")
    private String catheterCareDescription;

    /**
     * 气管护理代码
     */
    @TableField("TRACHEAL_CARE_CODE")
    private String trachealCareCode;

    /**
     * 气管护理
     */
    @TableField("TRACHEAL_CARE_NAME")
    private String trachealCareName;

    /**
     * 体位护理
     */
    @TableField("POSITION_CARE")
    private String positionCare;

    /**
     * 皮肤护理
     */
    @TableField("SKIN_CARE")
    private String skinCare;

    /**
     * 营养护理
     */
    @TableField("NUTRITIONAL_CARE")
    private String nutritionalCare;

    /**
     * 饮食指导代码
     */
    @TableField("DIETARY_GUIDANCE_CODE")
    private String dietaryGuidanceCode;

    /**
     * 饮食指导
     */
    @TableField("DIETARY_GUIDANCE_NAME")
    private String dietaryGuidanceName;

    /**
     * 心理护理代码
     */
    @TableField("PSYCHOLOGICAL_CARE_CODE")
    private String psychologicalCareCode;

    /**
     * 心理护理名称
     */
    @TableField("PSYCHOLOGICAL_CARE_NAME")
    private String psychologicalCareName;

    /**
     * 安全护理代码
     */
    @TableField("SAFETY_CARE_CODE")
    private String safetyCareCode;

    /**
     * 安全护理名称
     */
    @TableField("SAFETY_CARE_NAME")
    private String safetyCareName;

    /**
     * 简要病情
     */
    @TableField("BRIEF_ILLNESS")
    private String briefIllness;

    /**
     * 护理观察项目名称
     */
    @TableField("NURSING_OBSER_PROJECT_NAME")
    private String nursingObserProjectName;

    /**
     * 护理观察结果
     */
    @TableField("NURSING_OBSER_PROJECT_RESULT")
    private String nursingObserProjectResult;

    /**
     * 护理操作名称
     */
    @TableField("NURSING_NAME")
    private String nursingName;

    /**
     * 护理操作项目类目名称
     */
    @TableField("NURSING_PROJECT_CATEGORY_NAME")
    private String nursingProjectCategoryName;

    /**
     * 护理操作结果
     */
    @TableField("NURSING_RESULT")
    private String nursingResult;

    /**
     * 发出手术安全核对表标志
     */
    @TableField("SURGICAL_SAFETY_CHECK_FLAG")
    private String surgicalSafetyCheckFlag;

    /**
     * 收回手术安全核对表标志
     */
    @TableField("RECOVER_SURGICAL_SAFETY_FLAG")
    private String recoverSurgicalSafetyFlag;

    /**
     * 发出手术风险评估表标志
     */
    @TableField("SURGICAL_RISK_ASSESS_FLAG")
    private String surgicalRiskAssessFlag;

    /**
     * 收回手术风险评估表标志
     */
    @TableField("RECOVE_OPERAT_RISK_ASSET_FLAG")
    private String recoveOperatRiskAssetFlag;

    /**
     * 隔离标志
     */
    @TableField("ISOLATION_FLAG")
    private String isolationFlag;

    /**
     * 隔离种类代码
     */
    @TableField("ISOLATION_CATEGORY_CODE")
    private String isolationCategoryCode;

    /**
     * 隔离种类
     */
    @TableField("ISOLATION_CATEGORY_NAME")
    private String isolationCategoryName;

    /**
     * 护士签名
     */
    @TableField("NURSES_SIG")
    private String nursesSig;

    /**
     * 签名日期时间
     */
    @TableField("SIGNATURE_DATETIME")
    private LocalDateTime signatureDatetime;

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
