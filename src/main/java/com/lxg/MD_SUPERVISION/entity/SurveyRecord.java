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
 * 2.4.2. 检验记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("SURVEY_RECORD")
public class SurveyRecord implements Serializable {

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
     * 检验记录序号
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
     * 门（急）诊号
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
     * 电话号码
     */
    @TableField("PHONE_NUMBER")
    private String phoneNumber;

    /**
     * 患者类型代码
     */
    @TableField("PATIENT_TYPE_CODE")
    private String patientTypeCode;

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
    @TableField("GENDER_CODE")
    private String genderCode;

    /**
     * 疾病诊断编码
     */
    @TableField("DISEASE_DIAGNOSIS_CODE")
    private String diseaseDiagnosisCode;

    /**
     * 诊断日期
     */
    @TableField("DIAGNOSIS_DATE")
    private LocalDateTime diagnosisDate;

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
     * 检验申请机构代码
     */
    @TableField("INSPECTION_APPLY_ORGAN_ID")
    private String inspectionApplyOrganId;

    /**
     * 检验申请机构名称
     */
    @TableField("INSPECTION_APPLY_ORGAN")
    private String inspectionApplyOrgan;

    /**
     * 检验申请科室
     */
    @TableField("INSPECTION_APPLY_ROOM")
    private String inspectionApplyRoom;

    /**
     * 申请日期时间
     */
    @TableField("APPLY_DATE")
    private LocalDateTime applyDate;

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
     * 申请单据名称
     */
    @TableField("APPLICATION_NAME")
    private String applicationName;

    /**
     * 检验标本号
     */
    @TableField("INSPECTION_INSPECTION_NO")
    private String inspectionInspectionNo;

    /**
     * 标本类别
     */
    @TableField("SAMPLE_TYPE")
    private String sampleType;

    /**
     * 标本状态
     */
    @TableField("SAMPLE_STATE")
    private String sampleState;

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
     * 标本名称
     */
    @TableField("SAMPLE_NAME")
    private String sampleName;

    /**
     * 检验技师签名
     */
    @TableField("INSPECTION_ENGINEER")
    private String inspectionEngineer;

    /**
     * 检验医师签名
     */
    @TableField("INSPECTION_DOCTOR")
    private String inspectionDoctor;

    /**
     * 检验报告单编号
     */
    @TableField("INSPECTION_REPORT_NO")
    private String inspectionReportNo;

    /**
     * 检验报告序号
     */
    @TableField("INSPECTION_REPORT_DETAIL")
    private String inspectionReportDetail;

    /**
     * 报告单类别代码
     */
    @TableField("REPORT_CATEGORY_CODE")
    private String reportCategoryCode;

    /**
     * 报告单类别名称
     */
    @TableField("REPORT_CATEGORY_NAME")
    private String reportCategoryName;

    /**
     * 检验报告机构代码
     */
    @TableField("INSPECTION_REPORT_ORGAN_ID")
    private String inspectionReportOrganId;

    /**
     * 检验报告机构名称
     */
    @TableField("INSPECTION_REPORT_ORGAN")
    private String inspectionReportOrgan;

    /**
     * 检验报告科室
     */
    @TableField("INSPECTION_REPORT_ROOM")
    private String inspectionReportRoom;

    /**
     * 检验报告结果
     */
    @TableField("INSPECTION_REPORT_RESULT")
    private String inspectionReportResult;

    /**
     * 检验报告备注
     */
    @TableField("INSPECTION_REPORT_REMARKS")
    private String inspectionReportRemarks;

    /**
     * 检验报告日期
     */
    @TableField("INSPECTION_REPORT_DATE")
    private LocalDateTime inspectionReportDate;

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
     * 检验类别代码
     */
    @TableField("INSPECTION_TYPE_CODE")
    private String inspectionTypeCode;

    /**
     * 检验类别
     */
    @TableField("INSPECTION_TYPE")
    private String inspectionType;

    /**
     * 检验项目代码
     */
    @TableField("INSPECTION_ITEMS_CODE")
    private String inspectionItemsCode;

    /**
     * 检验项目名称
     */
    @TableField("INSPECTION_ITEMS_NAME")
    private String inspectionItemsName;

    /**
     * 检验-项目明细代码
     */
    @TableField("INSPECTION_DETI_CODE")
    private String inspectionDetiCode;

    /**
     * 检验-项目明细名称
     */
    @TableField("INSPECTION_DETI_NAME")
    private String inspectionDetiName;

    /**
     * 检验-结果(数值)
     */
    @TableField("INSPECTION_RESULT_N")
    private Double inspectionResultN;

    /**
     * 检验-结果(定性)
     */
    @TableField("INSPECTION_RESULT_Q")
    private String inspectionResultQ;

    /**
     * 检验结果代码
     */
    @TableField("INSPECTION_RESULT_CODE")
    private Integer inspectionResultCode;

    /**
     * 院内检验-项目代码
     */
    @TableField("HOSPI_INSPE_PROJECT_CODE")
    private String hospiInspeProjectCode;

    /**
     * 院内检验-项目名称
     */
    @TableField("HOSPI_INSPE_PROJECT_NAME")
    private String hospiInspeProjectName;

    /**
     * 检验方法
     */
    @TableField("INSPECT_METHOD")
    private String inspectMethod;

    /**
     * 检验方法名称
     */
    @TableField("INSPECT_METHOD_NAME")
    private String inspectMethodName;

    /**
     * 检验定量结果
     */
    @TableField("INSPECTION_N_RESULT")
    private Double inspectionNResult;

    /**
     * 检验定量结果计量单位
     */
    @TableField("INSPECTION_N_RESULT_UNIT")
    private String inspectionNResultUnit;

    /**
     * 检验结果异常标识
     */
    @TableField("EXAM_RESULT_IF_ABNORMAL")
    private String examResultIfAbnormal;

    /**
     * 参考值
     */
    @TableField("INSPECTION_ITEMS_REFERENCE")
    private String inspectionItemsReference;

    /**
     * 检验-计量单位
     */
    @TableField("INSPECTION_UNIT")
    private String inspectionUnit;

    /**
     * 送检日期
     */
    @TableField("SUBMISSION_DATE")
    private LocalDateTime submissionDate;

    /**
     * 送检机构代码
     */
    @TableField("SUBMISSION_ORGAN_ID")
    private String submissionOrganId;

    /**
     * 送检机构名称
     */
    @TableField("SUBMISSION_ORGAN")
    private String submissionOrgan;

    /**
     * 送检科室名称
     */
    @TableField("SUBMISSION_DEPT_NAME")
    private String submissionDeptName;

    /**
     * 检验机构代码
     */
    @TableField("INSPECTION_ORG_CODE")
    private String inspectionOrgCode;

    /**
     * 检验机构名称
     */
    @TableField("INSPECTION_ORG_NAME")
    private String inspectionOrgName;

    /**
     * 检验科室代码
     */
    @TableField("INSPECTION_DEPT_CODE")
    private String inspectionDeptCode;

    /**
     * 门诊结算序号
     */
    @TableField("OUTPATIENT_CHARGE_NO")
    private String outpatientChargeNo;

    /**
     * 住院结算序号
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
