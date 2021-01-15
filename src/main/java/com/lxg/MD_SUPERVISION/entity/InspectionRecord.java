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
 * 2.4.1. 检查记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("INSPECTION_RECORD")
public class InspectionRecord implements Serializable {

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
     * 检查记录序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 医嘱本地ID
     */
    @TableField("ORDER_LID")
    private String orderLid;

    /**
     * 医嘱明细序号
     */
    @TableField("ORDER_DETAIL_ID")
    private String orderDetailId;

    /**
     * 处方序号
     */
    @TableField("PRESCRIBE_NO")
    private String prescribeNo;

    /**
     * 处方明细序号
     */
    @TableField("PRESCRIBE_DETAIL_NO")
    private String prescribeDetailNo;

    /**
     * 电子申请单编号
     */
    @TableField("ELECTRONIC_APP_NO")
    private String electronicAppNo;

    /**
     * 挂号序号
     */
    @TableField("REG_SERIAL_NO")
    private String regSerialNo;

    /**
     * 病案号
     */
    @TableField("MEDICAL_RECORD_NO")
    private String medicalRecordNo;

    /**
     * 数据域代码
     */
    @TableField("DATA_ORIGIN")
    private Integer dataOrigin;

    /**
     * 门(急)诊号
     */
    @TableField("OUTPATIENT_NO")
    private String outpatientNo;

    /**
     * 住院号
     */
    @TableField("INPATIENT_NO")
    private String inpatientNo;

    /**
     * 就诊次数
     */
    @TableField("VISIT_COUNT")
    private Integer visitCount;

    /**
     * 就诊类型代码
     */
    @TableField("CLINIC_TYPE_CODE")
    private String clinicTypeCode;

    /**
     * 就诊类型名称
     */
    @TableField("CLINIC_TYPE_NAME")
    private String clinicTypeName;

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
     * 检查报告单编号
     */
    @TableField("EXAM_RT_NO")
    private String examRtNo;

    /**
     * 检查报告单名称
     */
    @TableField("EXAM_RT_NAME")
    private String examRtName;

    /**
     * 检查申请机构代码
     */
    @TableField("EXAM_APPLY_ORGAN_ID")
    private String examApplyOrganId;

    /**
     * 检查申请机构名称
     */
    @TableField("EXAM_APPLY_ORGAN")
    private String examApplyOrgan;

    /**
     * 检查申请科室
     */
    @TableField("EXAM_APPLY_ROOM")
    private String examApplyRoom;

    /**
     * 检查申请日期时间
     */
    @TableField("EXAM_APPLY_TIME")
    private LocalDateTime examApplyTime;

    /**
     * 申请人工号
     */
    @TableField("APPLY_PEOPLE_NO")
    private String applyPeopleNo;

    /**
     * 申请人姓名
     */
    @TableField("APPLY_PEOPLE_NAME")
    private String applyPeopleName;

    /**
     * 主诉
     */
    @TableField("CHIEF_COMPLAINT")
    private String chiefComplaint;

    /**
     * 症状开始日期时间
     */
    @TableField("START_SYMPTOMS_DATE")
    private LocalDateTime startSymptomsDate;

    /**
     * 症状停止日期时间
     */
    @TableField("STOP_SYMPTOMS_DATE")
    private LocalDateTime stopSymptomsDate;

    /**
     * 症状描述
     */
    @TableField("SYMPTOM_DESC")
    private String symptomDesc;

    /**
     * 特殊检查标志
     */
    @TableField("SPECIAL_EXAM_FLAG")
    private String specialExamFlag;

    /**
     * 申请原因
     */
    @TableField("REQUEST_REASON")
    private String requestReason;

    /**
     * 申请单详细内容
     */
    @TableField("REQUEST_DETAILS")
    private String requestDetails;

    /**
     * 病史摘要
     */
    @TableField("HISTORY_SUMMARY")
    private String historySummary;

    /**
     * 检查目的
     */
    @TableField("INSPECTION_PURPOSE")
    private String inspectionPurpose;

    /**
     * 操作编码
     */
    @TableField("OPERATION_NO")
    private String operationNo;

    /**
     * 操作名称
     */
    @TableField("OPERATION_NAME")
    private String operationName;

    /**
     * 操作部位代码
     */
    @TableField("OPERATION_POSITION_CODE")
    private String operationPositionCode;

    /**
     * 操作部位名称
     */
    @TableField("OPERATION_POSITION_NAME")
    private String operationPositionName;

    /**
     * 介入物名称
     */
    @TableField("INSERTION_NAME")
    private String insertionName;

    /**
     * 操作方法描述
     */
    @TableField("OPERATION_DESC")
    private String operationDesc;

    /**
     * 操作次数
     */
    @TableField("OPERATION_TIMES")
    private Integer operationTimes;

    /**
     * 操作日期时间
     */
    @TableField("OPERATION_DATE")
    private LocalDateTime operationDate;

    /**
     * 麻醉方法代码
     */
    @TableField("ANESTHESIA_METHOD_CODE")
    private String anesthesiaMethodCode;

    /**
     * 麻醉方法名称
     */
    @TableField("ANESTHESIA_METHOD_NAME")
    private String anesthesiaMethodName;

    /**
     * 麻醉观察结果
     */
    @TableField("ANESTHESIA_OBSERVATION_RESULT")
    private String anesthesiaObservationResult;

    /**
     * 麻醉中西医标识代码
     */
    @TableField("ANESTHESIA_DOCTOR_FLAG_CODE")
    private String anesthesiaDoctorFlagCode;

    /**
     * 麻醉中西医标识
     */
    @TableField("ANESTHESIA_DOCTOR_FLAG")
    private String anesthesiaDoctorFlag;

    /**
     * 麻醉医师签名
     */
    @TableField("ANESTHESIA_DOCTOR_SIGNATURE")
    private String anesthesiaDoctorSignature;

    /**
     * 诊疗过程描述
     */
    @TableField("TREATMENT_PROCESS_DESC")
    private String treatmentProcessDesc;

    /**
     * 标本类别
     */
    @TableField("SAMPLE_TYPE")
    private String sampleType;

    /**
     * 检查标本号
     */
    @TableField("EXAM_INSPECTION_NO")
    private String examInspectionNo;

    /**
     * 标本状态
     */
    @TableField("SAMPLE_STATE")
    private String sampleState;

    /**
     * 标本固定液名称
     */
    @TableField("SPECIMEN_FIXATIVE_NAME")
    private String specimenFixativeName;

    /**
     * 标本采样日期时间
     */
    @TableField("SPECIMEN_SAMPLE_DATE")
    private LocalDateTime specimenSampleDate;

    /**
     * 接收标本日期时间
     */
    @TableField("RECEIVE_SPECIMEN_DATE")
    private LocalDateTime receiveSpecimenDate;

    /**
     * 检查标识
     */
    @TableField("EXAM_FLAG")
    private String examFlag;

    /**
     * 检查标识名称
     */
    @TableField("EXAM_FLAG_NAME")
    private String examFlagName;

    /**
     * 检查-类别代码
     */
    @TableField("CHECK_TYP_CODE")
    private String checkTypCode;

    /**
     * 检查类别
     */
    @TableField("EXAM_TYPE")
    private String examType;

    /**
     * 检查方法名称
     */
    @TableField("EXAM_METHOD_NAME")
    private String examMethodName;

    /**
     * 检查项目代码
     */
    @TableField("EXAM_ITEM_CODE")
    private String examItemCode;

    /**
     * 院内检查项目代码
     */
    @TableField("EXAM_HOSP_ITEM_CODE")
    private String examHospItemCode;

    /**
     * 检查项目名称
     */
    @TableField("EXAM_ITEM_NAME")
    private String examItemName;

    /**
     * 院内检查项目名称
     */
    @TableField("EXAM_HOSP_ITEM_NAME")
    private String examHospItemName;

    /**
     * 检查结果代码
     */
    @TableField("EXAM_RESULT_CODE")
    private String examResultCode;

    /**
     * 检查结果
     */
    @TableField("EXAM_RESULT")
    private String examResult;

    /**
     * 检查结果是否阳性
     */
    @TableField("EXAM_RESULT_IF_POSITIVE")
    private String examResultIfPositive;

    /**
     * 检查结果异常标识
     */
    @TableField("EXAM_RESULT_IF_ABNORMAL")
    private String examResultIfAbnormal;

    /**
     * 检查定量结果
     */
    @TableField("EXAM_QUANTIFY_RESULT")
    private Double examQuantifyResult;

    /**
     * 检查定量结果计量单位
     */
    @TableField("EXAM_QUANTIFY_UNIT")
    private String examQuantifyUnit;

    /**
     * 检查结论
     */
    @TableField("EXAM_SUMMER")
    private String examSummer;

    /**
     * 检查技师签名
     */
    @TableField("TECHNICIAN_SIG")
    private String technicianSig;

    /**
     * 检查医师签名
     */
    @TableField("EXAM_DOCTOR")
    private String examDoctor;

    /**
     * 检查科室代码
     */
    @TableField("CHECK_DEPT_CODE")
    private String checkDeptCode;

    /**
     * 检查日期
     */
    @TableField("EXAM_DATE")
    private LocalDateTime examDate;

    /**
     * 检查报告机构代码
     */
    @TableField("EXAM_REPORT_ORGAN_ID")
    private String examReportOrganId;

    /**
     * 检查报告机构名称
     */
    @TableField("EXAM_REPORT_ORGAN")
    private String examReportOrgan;

    /**
     * 检查报告科室
     */
    @TableField("EXAM_REPORT_ROOM")
    private String examReportRoom;

    /**
     * 检查报告结果-客观所见
     */
    @TableField("OBJECTIVE_EXAM_RESULT")
    private String objectiveExamResult;

    /**
     * 检查报告结果-主观提示
     */
    @TableField("SUBJECTIVE_EXAM_RESULT")
    private String subjectiveExamResult;

    /**
     * 检查报告备注
     */
    @TableField("EXAM_RT_REMARKS")
    private String examRtRemarks;

    /**
     * 检查报告日期
     */
    @TableField("EXAM_RT_DATE")
    private LocalDateTime examRtDate;

    /**
     * 报告医师签名
     */
    @TableField("REPORT_DOCTOR")
    private String reportDoctor;

    /**
     * 审核医师签名
     */
    @TableField("REPORTAUDIT")
    private String reportaudit;

    /**
     * 审核日期
     */
    @TableField("AUDIT_DATE")
    private LocalDateTime auditDate;

    /**
     * 门诊结算序号
     */
    @TableField("OUTPATIENT_CHARGE_NO")
    private String outpatientChargeNo;

    /**
     * 住院收费序号
     */
    @TableField("INPATIENT_CHARGE_NO")
    private String inpatientChargeNo;

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
