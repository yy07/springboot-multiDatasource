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
 * 2.6.13. 住院病程记录-术前讨论
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("PRE_OPERATION_DISCUSSION")
public class PreOperationDiscussion implements Serializable {

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
     * 术前讨论ID
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
     * 讨论日期时间
     */
    @TableField("DISCUSS_DATE")
    private LocalDateTime discussDate;

    /**
     * 讨论地点
     */
    @TableField("DISCUSSION_SITE")
    private String discussionSite;

    /**
     * 主持人姓名
     */
    @TableField("HOST_NAME")
    private String hostName;

    /**
     * 参加讨论人员名单
     */
    @TableField("RESCUE_PERSONS")
    private String rescuePersons;

    /**
     * 专业技术职务类别代码
     */
    @TableField("PROFESSIONAL_CATAGORY_CODE")
    private String professionalCatagoryCode;

    /**
     * 专业技术职务类别
     */
    @TableField("PROFESSIONAL_CATAGORY_NAME")
    private String professionalCatagoryName;

    /**
     * 入院日期时间
     */
    @TableField("INHOS_DATE")
    private LocalDateTime inhosDate;

    /**
     * 术前诊断编码
     */
    @TableField("PREOPERATIVE_DIAGNOSTIC_CODE")
    private String preoperativeDiagnosticCode;

    /**
     * 术前诊断
     */
    @TableField("PREOPERATIVE_DIAGNOSTIC_NAME")
    private String preoperativeDiagnosticName;

    /**
     * 拟实施手术及操作名称
     */
    @TableField("IMPLEMENT_OPERATION_NAME")
    private String implementOperationName;

    /**
     * 拟实施手术及操作编码
     */
    @TableField("IMPLEMENT_OPERATION_CODE")
    private String implementOperationCode;

    /**
     * 拟实施手术目标部位名称
     */
    @TableField("IMPLEMENT_SURGICAL_SITE_NAME")
    private String implementSurgicalSiteName;

    /**
     * 拟实施手术及操作日期时间
     */
    @TableField("IMPLEMENT_OPERATION_TIME")
    private LocalDateTime implementOperationTime;

    /**
     * 拟实施麻醉方法代码
     */
    @TableField("IMPLEMENTED_CODE")
    private String implementedCode;

    /**
     * 拟实施麻醉方法
     */
    @TableField("IMPLEMENTED")
    private String implemented;

    /**
     * 手术要点
     */
    @TableField("OPERATION_KEY_POINTS")
    private String operationKeyPoints;

    /**
     * 术前准备
     */
    @TableField("PREOPERATIVE_PREPARATION")
    private String preoperativePreparation;

    /**
     * 手术指征
     */
    @TableField("OPERATION_INDICATION")
    private String operationIndication;

    /**
     * 手术方案
     */
    @TableField("OPERATION_PLAN")
    private String operationPlan;

    /**
     * 注意事项
     */
    @TableField("NOTE")
    private String note;

    /**
     * 讨论意见
     */
    @TableField("DISCUSSION_OPINION")
    private String discussionOpinion;

    /**
     * 讨论结论
     */
    @TableField("DISCUSSION_CONCLUSION")
    private String discussionConclusion;

    /**
     * 手术者签名
     */
    @TableField("OPERATOR_SIGNATURE")
    private String operatorSignature;

    /**
     * 麻醉医师签名
     */
    @TableField("ANESTHESIA_DOCTOR_SIGNATURE")
    private String anesthesiaDoctorSignature;

    /**
     * 医师签名
     */
    @TableField("DOCTOR_SIGNATURE")
    private String doctorSignature;

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
