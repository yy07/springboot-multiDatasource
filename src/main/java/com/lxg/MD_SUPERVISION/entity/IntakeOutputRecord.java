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
 * 2.5.9. 出入量记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("INTAKE_OUTPUT_RECORD")
public class IntakeOutputRecord implements Serializable {

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
     * 出入量记录ID
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
     * 体重（kg）
     */
    @TableField("WEIGHT")
    private Double weight;

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
     * 护理等级
     */
    @TableField("NURSING_GRADE_NAME")
    private String nursingGradeName;

    /**
     * 护理类型代码
     */
    @TableField("NURSING_TYPE_CODE")
    private String nursingTypeCode;

    /**
     * 护理类型
     */
    @TableField("NURSING_TYPE_NAME")
    private String nursingTypeName;

    /**
     * 护理观察结果
     */
    @TableField("NURSING_OBSER_PROJECT_RESULT")
    private String nursingObserProjectResult;

    /**
     * 护理操作项目类目名称
     */
    @TableField("NURSING_PROJECT_CATEGORY_NAME")
    private String nursingProjectCategoryName;

    /**
     * 护理操作名称
     */
    @TableField("NURSING_NAME")
    private String nursingName;

    /**
     * 护理操作结果
     */
    @TableField("NURSING_RESULT")
    private String nursingResult;

    /**
     * 记录日期时间
     */
    @TableField("RECORD_DATE")
    private LocalDateTime recordDate;

    /**
     * 呕吐标志
     */
    @TableField("VOMITING_FLAG")
    private String vomitingFlag;

    /**
     * 排尿困难标志
     */
    @TableField("DYSURIA_FLAG")
    private String dysuriaFlag;

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
     * 业务数据产生时间
     */
    @TableField("DATAGENERATE_DATE")
    private LocalDateTime datagenerateDate;

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
