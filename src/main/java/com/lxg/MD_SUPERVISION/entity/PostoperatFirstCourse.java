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
 * 2.6.14. 住院病程记录-术后首次病程记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("POSTOPERAT_FIRST_COURSE")
public class PostoperatFirstCourse implements Serializable {

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
     * 术后首次病程记录ID
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
     * 记录日期时间
     */
    @TableField("RECORD_DATE")
    private LocalDateTime recordDate;

    /**
     * 手术及操作编码
     */
    @TableField("OPERATION_CODE")
    private String operationCode;

    /**
     * 手术及操作
     */
    @TableField("OPERATION_OPERATION")
    private String operationOperation;

    /**
     * 手术名称
     */
    @TableField("OPERATION_NAME")
    private String operationName;

    /**
     * 手术目标部位名称
     */
    @TableField("OPERTATION_TARGET_NAME")
    private String opertationTargetName;

    /**
     * 手术日期时间
     */
    @TableField("OPERATION_START_DATETIME")
    private LocalDateTime operationStartDatetime;

    /**
     * 麻醉方法代码
     */
    @TableField("ANESTHESIA_METHOD_CODE")
    private String anesthesiaMethodCode;

    /**
     * 麻醉方法
     */
    @TableField("ANESTHESIA_METHOD")
    private String anesthesiaMethod;

    /**
     * 手术过程
     */
    @TableField("OPERATION_PROCESS")
    private String operationProcess;

    /**
     * 术后诊断名称
     */
    @TableField("POSTOPERATIVE_DIAGNOSIS_NAME")
    private String postoperativeDiagnosisName;

    /**
     * 术后诊断编码
     */
    @TableField("POSTOPERATIVE_DIAGNOSIS_CODE")
    private String postoperativeDiagnosisCode;

    /**
     * 诊断依据
     */
    @TableField("DIAGNOSIS_BASIS")
    private String diagnosisBasis;

    /**
     * 注意事项
     */
    @TableField("NOTE")
    private String note;

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
