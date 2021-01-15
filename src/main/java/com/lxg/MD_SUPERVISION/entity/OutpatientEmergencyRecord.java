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
 * 门(急)诊病历
 * </p>
 *
 * @author cmx
 * @since 2021-01-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("OUTPATIENT_EMERGENCY_RECORD")
public class OutpatientEmergencyRecord implements Serializable {

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
    @TableField("CLINIC_DEPT_CODE")
    private String clinicDeptCode;

    /**
     * 就诊科室名称
     */
    @TableField("CLINIC_DEPT_NAME")
    private String clinicDeptName;

    /**
     * 患者本地唯一ID
     */
    @TableField("PATIENT_LOCAL_ID")
    private String patientLocalId;

    /**
     * 病历序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 挂号序号
     */
    @TableField("REG_SERIAL_NO")
    private String regSerialNo;

    /**
     * 门(急)诊号
     */
    @TableField("OUTPATIENT_NO")
    private String outpatientNo;

    /**
     * 就诊次数
     */
    @TableField("VISIT_COUNT")
    private Integer visitCount;

    /**
     * 电子申请单编号
     */
    @TableField("ELECTRONIC_APPLIC_NUM")
    private String electronicApplicNum;

    /**
     * 患者姓名
     */
    @TableField("NAME")
    private String name;

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
     * 性别代码
     */
    @TableField("ENDER_CODE")
    private String enderCode;

    /**
     * 出生日期
     */
    @TableField("BIRTH_DATE")
    private LocalDateTime birthDate;

    /**
     * 过敏源代码
     */
    @TableField("ALLERGY_HISTORY_CODE")
    private String allergyHistoryCode;

    /**
     * 过敏源内容
     */
    @TableField("ALLERGY_HISTORY_DETAIL")
    private String allergyHistoryDetail;

    /**
     * 过敏史标志
     */
    @TableField("ALLERGY_HISTORY_FLAG")
    private String allergyHistoryFlag;

    /**
     * 过敏史
     */
    @TableField("ALLERGY_HISTORY")
    private String allergyHistory;

    /**
     * 留观病历标志
     */
    @TableField("EMERGENCY_OBSERVATION_FLAG")
    private String emergencyObservationFlag;

    /**
     * 发病日期时间
     */
    @TableField("INCIDENCE_DATE")
    private LocalDateTime incidenceDate;

    /**
     * 就诊日期时间
     */
    @TableField("CLINIC_DATE")
    private LocalDateTime clinicDate;

    /**
     * 就诊原因
     */
    @TableField("REASON_FOR_TREATMENT")
    private String reasonForTreatment;

    /**
     * 初诊标志代码
     */
    @TableField("NEWLY_DIAGNOSED_CODE")
    private String newlyDiagnosedCode;

    /**
     * 初诊标志名称
     */
    @TableField("NEWLY_DIAGNOSED_NAME")
    private String newlyDiagnosedName;

    /**
     * 初步诊断-西医诊断编码
     */
    @TableField("PRELIM_WESTERN_DIAG_CODE")
    private String prelimWesternDiagCode;

    /**
     * 初步诊断-西医诊断名称
     */
    @TableField("PRELIM_WESTERN_DIAG_NAME")
    private String prelimWesternDiagName;

    /**
     * 初步诊断-中医病名代码
     */
    @TableField("PRELI_DIAG_TCM_NAME_CODE")
    private String preliDiagTcmNameCode;

    /**
     * 初步诊断-中医病名名称
     */
    @TableField("PRELI_DIAG_TCM_NAME_NAME")
    private String preliDiagTcmNameName;

    /**
     * 初步诊断-中医证候代码
     */
    @TableField("PRELI_DIAG_TCM_SYNDROME_CODE")
    private String preliDiagTcmSyndromeCode;

    /**
     * 初步诊断-中医证候名称
     */
    @TableField("PRELI_DIAG_TCM_SYNDROME_NAME")
    private String preliDiagTcmSyndromeName;

    /**
     * 收入观察室日期时间
     */
    @TableField("INCOME_OBSERVATION_DATE")
    private LocalDateTime incomeObservationDate;

    /**
     * 主诉
     */
    @TableField("CHIEF_COMPLAINT")
    private String chiefComplaint;

    /**
     * 现病史
     */
    @TableField("PRESENT_HISTORY")
    private String presentHistory;

    /**
     * 既往史
     */
    @TableField("PAST_HISTORY")
    private String pastHistory;

    /**
     * 体格检查
     */
    @TableField("PHYSICAL_EXAMINATION")
    private String physicalExamination;

    /**
     * 残疾情况代码
     */
    @TableField("DISABILITY_STATUS_CODE")
    private String disabilityStatusCode;

    /**
     * 症状名称
     */
    @TableField("SYMPTOM_NAME")
    private String symptomName;

    /**
     * 症状代码
     */
    @TableField("SYMPTOM_CODE")
    private String symptomCode;

    /**
     * 中医“四诊”观察结果
     */
    @TableField("CHINA_FOUR_DIAG_OBSER")
    private String chinaFourDiagObser;

    /**
     * 辅助检查项目
     */
    @TableField("AE_ITEM_NAME")
    private String aeItemName;

    /**
     * 辅助检查结果
     */
    @TableField("AE_RESULT")
    private String aeResult;

    /**
     * 辨证依据
     */
    @TableField("DIFFERENTIATION_BASED")
    private String differentiationBased;

    /**
     * 治则治法
     */
    @TableField("THERAPEUTIC_THERAPY")
    private String therapeuticTherapy;

    /**
     * 治则治法描述
     */
    @TableField("THERAPEUTIC_THERAPY_NAME")
    private String therapeuticTherapyName;

    /**
     * 急诊留观病程记录
     */
    @TableField("EMERGENCY_OBS_COURSE_RECORD")
    private String emergencyObsCourseRecord;

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
     * 急诊抢救记录
     */
    @TableField("EMERGENCY_RESCUE_RECORD")
    private String emergencyRescueRecord;

    /**
     * 记录日期时间
     */
    @TableField("RECORD_DATE")
    private LocalDateTime recordDate;

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
     * 专业技术职务类别名称
     */
    @TableField("PROFESSIONAL_CATAGORY_NAME")
    private String professionalCatagoryName;

    /**
     * 患者去向
     */
    @TableField("PATIENT_WHEREABOUTS")
    private String patientWhereabouts;

    /**
     * 医师签名
     */
    @TableField("DOCTOR_SIGNATURE")
    private String doctorSignature;

    /**
     * 科室标识
     */
    @TableField("DEPT_CODE")
    private String deptCode;

    /**
     * 就诊医生姓名
     */
    @TableField("CLINIC_DOCTOR_NAME")
    private String clinicDoctorName;

    /**
     * 保管机构名称
     */
    @TableField("CUSTODIAN_NAME")
    private String custodianName;

    /**
     * 责任医师职工编号
     */
    @TableField("DOCTOR_NUMBER")
    private String doctorNumber;

    /**
     * 责任医师姓名
     */
    @TableField("PHYSICIAN_LIABILITY_NAME")
    private String physicianLiabilityName;

    /**
     * 处置意见
     */
    @TableField("DISPOSAL_OPINIONS")
    private String disposalOpinions;

    /**
     * 取消医嘱者签名
     */
    @TableField("CANCEL_SIGNATURE")
    private String cancelSignature;

    /**
     * 医嘱备注信息
     */
    @TableField("MEDI_ADVICE_INF")
    private String mediAdviceInf;

    /**
     * 医嘱开立科室
     */
    @TableField("MEDI_INSTITUTION")
    private String mediInstitution;

    /**
     * 医嘱开立日期时间
     */
    @TableField("MEDI_ORDER_TIME")
    private LocalDateTime mediOrderTime;

    /**
     * 医嘱开立者签名
     */
    @TableField("MED_PRACTI_SIGNATURE")
    private String medPractiSignature;

    /**
     * 医嘱取消日期时间
     */
    @TableField("MEDI_ORDER_CANCEL_TIME")
    private LocalDateTime mediOrderCancelTime;

    /**
     * 医嘱审核日期时间
     */
    @TableField("MEDI_ORDER_REVIEW_TIME")
    private LocalDateTime mediOrderReviewTime;

    /**
     * 医嘱审核者签名
     */
    @TableField("MEDI_ORDER_REVIEW_SIG")
    private String mediOrderReviewSig;

    /**
     * 医嘱项目类型代码
     */
    @TableField("MEDI_ORDER_TYPE_CODE")
    private String mediOrderTypeCode;

    /**
     * 医嘱项目内容
     */
    @TableField("MEDI_PROGRAM_CONTENT")
    private String mediProgramContent;

    /**
     * 医嘱执行科室
     */
    @TableField("MEDI_ORDER_EXECUTIVE_DEP")
    private String mediOrderExecutiveDep;

    /**
     * 医嘱执行日期时间
     */
    @TableField("MEDI_ORDER_EXECUTIVE_TIME")
    private LocalDateTime mediOrderExecutiveTime;

    /**
     * 医嘱执行者签名
     */
    @TableField("MEDI_ORDER_EXECUTIVE_SIG")
    private String mediOrderExecutiveSig;

    /**
     * 医嘱执行状态
     */
    @TableField("MEDI_ORDER_EXEC_STATUS")
    private String mediOrderExecStatus;

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
