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
 * 2.5.5. 出院评估与指导
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DISCHARGE_ASSESSMENT")
public class DischargeAssessment implements Serializable {

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
     * 出院评估与指导序号
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
     * 出院诊断编码
     */
    @TableField("OUTHOS_DIAG_CODE")
    private String outhosDiagCode;

    /**
     * 出院诊断
     */
    @TableField("OUTHOS_DIAG_NAME")
    private String outhosDiagName;

    /**
     * 出院日期时间
     */
    @TableField("OUTHOS_DATE")
    private LocalDateTime outhosDate;

    /**
     * 饮食情况代码
     */
    @TableField("DIET_STATE_CODE")
    private Integer dietStateCode;

    /**
     * 饮食情况
     */
    @TableField("DIET_STATE")
    private String dietState;

    /**
     * 自理能力代码
     */
    @TableField("SELFCARE_ABILITY_CODE")
    private Integer selfcareAbilityCode;

    /**
     * 自理能力
     */
    @TableField("SELFCARE_ABILITY")
    private String selfcareAbility;

    /**
     * 出院情况
     */
    @TableField("OUTHOS_STATE")
    private String outhosState;

    /**
     * 离院方式代码
     */
    @TableField("OUTHOS_METHOD_CODE")
    private Integer outhosMethodCode;

    /**
     * 离院方式
     */
    @TableField("OUTHOS_METHOD_NAME")
    private String outhosMethodName;

    /**
     * 用药指导
     */
    @TableField("MEDI_GUIDE")
    private String mediGuide;

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
     * 生活方式指导
     */
    @TableField("LIFESTYLE_GUIDANCE")
    private String lifestyleGuidance;

    /**
     * 宣教内容
     */
    @TableField("MISSION_CONTENT")
    private String missionContent;

    /**
     * 复诊指导
     */
    @TableField("REFERRAL_GUIDANCE")
    private String referralGuidance;

    /**
     * 护士签名
     */
    @TableField("NURSES_SIG")
    private String nursesSig;

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
