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
 * 2.6.10. 住院病程记录-抢救记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("SALVAGE_RECROD")
public class SalvageRecrod implements Serializable {

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
     * 抢救记录ID
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
     * 疾病诊断名称
     */
    @TableField("DIS_DIAG_NAME")
    private String disDiagName;

    /**
     * 疾病诊断编码
     */
    @TableField("DIS_DIAG_CODE")
    private String disDiagCode;

    /**
     * 病情变化情况
     */
    @TableField("CONDITION_CHANGE")
    private String conditionChange;

    /**
     * 抢救措施
     */
    @TableField("RESCUE_MEASURE")
    private String rescueMeasure;

    /**
     * 手术及操作编码
     */
    @TableField("OPERATION_CODE")
    private String operationCode;

    /**
     * 手术及操作名称
     */
    @TableField("OPERATION_NAME")
    private String operationName;

    /**
     * 手术及操作目标部位名称
     */
    @TableField("OPERTATION_TARGET_NAME")
    private String opertationTargetName;

    /**
     * 介入物名称
     */
    @TableField("INSERTION_NAME")
    private String insertionName;

    /**
     * 操作方法
     */
    @TableField("OPERATION")
    private String operation;

    /**
     * 操作次数
     */
    @TableField("OPERATION_TIMES")
    private Integer operationTimes;

    /**
     * 抢救开始日期时间
     */
    @TableField("RSU_START_TIME")
    private LocalDateTime rsuStartTime;

    /**
     * 抢救结束日期时间
     */
    @TableField("RSU_END_TIME")
    private LocalDateTime rsuEndTime;

    /**
     * 检查/检验项目名称
     */
    @TableField("INSPECTION_ITEM_NAME")
    private String inspectionItemName;

    /**
     * 检查/检验结果
     */
    @TableField("INSPECTION_RESULT")
    private String inspectionResult;

    /**
     * 检查/检验定量结果
     */
    @TableField("INSPECTION_QUANTIFY_RESULT")
    private Double inspectionQuantifyResult;

    /**
     * 检查/检验结果代码
     */
    @TableField("INSPECTION_RESULT_CODE")
    private Integer inspectionResultCode;

    /**
     * 注意事项
     */
    @TableField("NOTE")
    private String note;

    /**
     * 参加抢救人员名单
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
