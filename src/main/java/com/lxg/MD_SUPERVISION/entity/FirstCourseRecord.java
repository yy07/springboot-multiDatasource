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
 * 2.6.4. 住院病程记录-首次病程记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("FIRST_COURSE_RECORD")
public class FirstCourseRecord implements Serializable {

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
     * 首次病程记录ID
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
     * 记录日期时间
     */
    @TableField("RECORD_DATE")
    private LocalDateTime recordDate;

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
     * 主诉
     */
    @TableField("CHIEF_COMPLAINT")
    private String chiefComplaint;

    /**
     * 病例特点
     */
    @TableField("RECORD_FEATURE")
    private String recordFeature;

    /**
     * 中医“四诊”观察结果
     */
    @TableField("CHINA_FOUR_DIAG_OBSER")
    private String chinaFourDiagObser;

    /**
     * 诊断依据
     */
    @TableField("DIAGNOSIS_BASIS")
    private String diagnosisBasis;

    /**
     * 初步诊断-西医诊断编码
     */
    @TableField("PD_WEST_DIAG_CODE")
    private String pdWestDiagCode;

    /**
     * 初步诊断-西医诊断
     */
    @TableField("PD_WEST_DIAG_NAME")
    private String pdWestDiagName;

    /**
     * 初步诊断-中医病名代码
     */
    @TableField("PD_TCM_DIS_CODE")
    private String pdTcmDisCode;

    /**
     * 初步诊断-中医病名
     */
    @TableField("PD_TCM_DIS_NAME")
    private String pdTcmDisName;

    /**
     * 初步诊断-中医证候代码
     */
    @TableField("PD_SYNDROMES_DIS_CODE")
    private String pdSyndromesDisCode;

    /**
     * 初步诊断-中医证候
     */
    @TableField("PD_SYNDROMES_DIS_NAME")
    private String pdSyndromesDisName;

    /**
     * 鉴别诊断-西医诊断名称
     */
    @TableField("INHOS_DIAG_CM_DIS_NAME")
    private String inhosDiagCmDisName;

    /**
     * 鉴别诊断-中医病名名称
     */
    @TableField("INHOS_DIAG_CM_NAME")
    private String inhosDiagCmName;

    /**
     * 鉴别诊断-中医证候名称
     */
    @TableField("INHOS_DIAG_CM_SYNDROME_NAME")
    private String inhosDiagCmSyndromeName;

    /**
     * 诊疗计划
     */
    @TableField("ASSESSMENT_PLAN")
    private String assessmentPlan;

    /**
     * 治则治法
     */
    @TableField("THERAPEUTIC_THERAPY")
    private String therapeuticTherapy;

    /**
     * 住院医师签名
     */
    @TableField("ADMISSION_DOCTOR_SIG")
    private String admissionDoctorSig;

    /**
     * 上级医师签名
     */
    @TableField("SUP_DOCTOR_SIG")
    private String supDoctorSig;

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
