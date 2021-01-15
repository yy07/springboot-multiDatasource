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
 * 2.5.12. 生命体征测量记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("MONITOR_VITAL_SIGNS_RECORD")
public class MonitorVitalSignsRecord implements Serializable {

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
    @TableField("DEPT_CODE")
    private String deptCode;

    /**
     * 就诊科室名称
     */
    @TableField("DEPT_NAME")
    private String deptName;

    /**
     * 生命体征记录单号
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
    @TableField("MEDICAL_RECORD_NO")
    private String medicalRecordNo;

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
     * 疾病诊断编码
     */
    @TableField("DIS_DIAG_CODE")
    private String disDiagCode;

    /**
     * 疾病诊断
     */
    @TableField("DIS_DIAG_NAME")
    private String disDiagName;

    /**
     * 入院日期时间
     */
    @TableField("INHOS_DATE")
    private LocalDateTime inhosDate;

    /**
     * 实际住院天数
     */
    @TableField("ACTUAL_HOSPITAL_STAY")
    private Integer actualHospitalStay;

    /**
     * 手术或分娩后天数
     */
    @TableField("SURGERY_CHILDBIRTH_DAYS")
    private Integer surgeryChildbirthDays;

    /**
     * 体重(kg)
     */
    @TableField("WEIGHT")
    private Double weight;

    /**
     * 身高(cm)
     */
    @TableField("HEIGHT")
    private Double height;

    /**
     * 腹围(cm)
     */
    @TableField("ABDOMINAL_GIRTH")
    private Double abdominalGirth;

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
     * 手术次数(次)
     */
    @TableField("OPERATION_TIMES")
    private Integer operationTimes;

    /**
     * 液体总入量(ml/日)
     */
    @TableField("LIQUID_VOLUME")
    private Double liquidVolume;

    /**
     * 液体总出量(ml/日)
     */
    @TableField("LIQUID_MEASURE_TOTAL")
    private Double liquidMeasureTotal;

    /**
     * 导尿标识
     */
    @TableField("URETHRAL_CATHETERIZATION_FLAG")
    private String urethralCatheterizationFlag;

    /**
     * 尿量(ml/日)
     */
    @TableField("URINE_OUTPUT")
    private Double urineOutput;

    /**
     * 其他液体排出量(ml/日)
     */
    @TableField("OTHER_LIQUID_DISCHARGE")
    private Double otherLiquidDischarge;

    /**
     * 灌肠标识
     */
    @TableField("ENEMA_FLAG")
    private String enemaFlag;

    /**
     * 大便失禁标识
     */
    @TableField("FECAL_INCONTINENCE_FLAG")
    private String fecalIncontinenceFlag;

    /**
     * 大便次数(次/日)
     */
    @TableField("DEFECATE_FREQUENCY")
    private Integer defecateFrequency;

    /**
     * 卧床标志
     */
    @TableField("LIE_IN_BED_FLAG")
    private String lieInBedFlag;

    /**
     * 住院患者过敏源
     */
    @TableField("INPATIENT_ALLERGENS")
    private String inpatientAllergens;

    /**
     * 住院患者过敏源名称
     */
    @TableField("INPATIENT_ALLERGENS_NAME")
    private String inpatientAllergensName;

    /**
     * 审核人工号
     */
    @TableField("AUDIT_CODE")
    private String auditCode;

    /**
     * 审核人
     */
    @TableField("AUDIT_NAME")
    private String auditName;

    /**
     * 审核时间
     */
    @TableField("AUDIT_TIME")
    private LocalDateTime auditTime;

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
