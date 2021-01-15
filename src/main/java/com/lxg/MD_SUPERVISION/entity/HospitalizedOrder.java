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
 * 2.3.2. 住院医嘱
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("HOSPITALIZED_ORDER")
public class HospitalizedOrder implements Serializable {

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
     * 医嘱序号
     */
    @TableField("ORDER_NUMBER")
    private String orderNumber;

    /**
     * 医嘱明细序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 医嘱明细名称
     */
    @TableField("BUSINESS_LOCAL_NAME")
    private String businessLocalName;

    /**
     * 患者本地唯一ID
     */
    @TableField("PATIENT_LOCAL_ID")
    private String patientLocalId;

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
     * 电子申请单编号
     */
    @TableField("ELECTRONIC_APP_NO")
    private String electronicAppNo;

    /**
     * 医嘱组号
     */
    @TableField("ORDER_INDICATION")
    private String orderIndication;

    /**
     * 医嘱类别
     */
    @TableField("ORDER_CATEGORY")
    private Integer orderCategory;

    /**
     * 医嘱类型
     */
    @TableField("ORDER_TYPE")
    private Integer orderType;

    /**
     * 开医嘱时间
     */
    @TableField("MEDICAL_ORDER_TIME")
    private LocalDateTime medicalOrderTime;

    /**
     * 开医嘱医生代码
     */
    @TableField("MEDICAL_ORDER_DOCTOR_CODE")
    private String medicalOrderDoctorCode;

    /**
     * 开医嘱医生名称
     */
    @TableField("MEDICAL_ORDER_DOCTOR_NAME")
    private String medicalOrderDoctorName;

    /**
     * 计划开始时间
     */
    @TableField("PLAN_START_TIME")
    private LocalDateTime planStartTime;

    /**
     * 计划停止时间
     */
    @TableField("PLAN_STOP_TIME")
    private LocalDateTime planStopTime;

    /**
     * 医嘱审核日期
     */
    @TableField("AUDIT_TIME")
    private LocalDateTime auditTime;

    /**
     * 医嘱审核人姓名
     */
    @TableField("AUDITOR_NAME")
    private String auditorName;

    /**
     * 医嘱核对日期
     */
    @TableField("CHECK_TIME")
    private LocalDateTime checkTime;

    /**
     * 医嘱核对人姓名
     */
    @TableField("COLLATOR_NAME")
    private String collatorName;

    /**
     * 医嘱执行科室
     */
    @TableField("EXECUTE_DEPARTMENT")
    private String executeDepartment;

    /**
     * 医嘱执行时间
     */
    @TableField("EXECUTE_TIME")
    private LocalDateTime executeTime;

    /**
     * 医嘱执行者姓名
     */
    @TableField("ORDER_EXECUTOR")
    private String orderExecutor;

    /**
     * 停止医嘱时间
     */
    @TableField("MEDICAL_ORDER_STOP_TIME")
    private LocalDateTime medicalOrderStopTime;

    /**
     * 停止医嘱医生代码
     */
    @TableField("STOP_ADVICE_DOCTOR_CODE")
    private String stopAdviceDoctorCode;

    /**
     * 停止医嘱医生名称
     */
    @TableField("STOP_ADVICE_DOCTOR_NAME")
    private String stopAdviceDoctorName;

    /**
     * 术中医嘱标识
     */
    @TableField("INTRAOPERATIVE_ORDER_MARK")
    private String intraoperativeOrderMark;

    /**
     * 作废标识
     */
    @TableField("INVALID_MARK")
    private String invalidMark;

    /**
     * 药物类型编码
     */
    @TableField("TYPE_CODE")
    private String typeCode;

    /**
     * 药物类型
     */
    @TableField("DRUG_TYPE")
    private String drugType;

    /**
     * 医保编码
     */
    @TableField("INSUR_CODE")
    private String insurCode;

    /**
     * 药品（项目）编码
     */
    @TableField("DRUG_ID")
    private String drugId;

    /**
     * 药物（项目）名称
     */
    @TableField("DRUG_NAME")
    private String drugName;

    /**
     * 药物（项目）规格
     */
    @TableField("DRUG_SPECIFICATIONS")
    private String drugSpecifications;

    /**
     * 药品采购码
     */
    @TableField("DRUG_PROCUREMENT_CODE")
    private String drugProcurementCode;

    /**
     * 药物剂型代码
     */
    @TableField("DRUG_DOSAGE_CODE")
    private String drugDosageCode;

    /**
     * 药物剂型
     */
    @TableField("DRUG_DOSAGE_NAME")
    private String drugDosageName;

    /**
     * 药品使用总剂量
     */
    @TableField("DRUG_USE_DOSE_ALL")
    private Double drugUseDoseAll;

    /**
     * 药物使用次剂量
     */
    @TableField("DRUG_USE_DOSE")
    private Double drugUseDose;

    /**
     * 药物使用剂量单位
     */
    @TableField("DRUG_USE_DOSE_UNIT")
    private String drugUseDoseUnit;

    /**
     * 药物使用频次代码
     */
    @TableField("DRUG_USE_FREQUENCY_CODE")
    private String drugUseFrequencyCode;

    /**
     * 药物使用频次
     */
    @TableField("DRUG_USE_FREQUENCY")
    private String drugUseFrequency;

    /**
     * 用药途径代码
     */
    @TableField("DRUG_USE_ROUTE_CODE")
    private String drugUseRouteCode;

    /**
     * 用药途径
     */
    @TableField("DRUG_USE_ROUTE_NAME")
    private String drugUseRouteName;

    /**
     * 抗菌素明细标志
     */
    @TableField("ANTIBIOTIC_DETAIL_FLAG")
    private String antibioticDetailFlag;

    /**
     * 抗菌素类型
     */
    @TableField("ANTIBIOTIC_TYPE")
    private String antibioticType;

    /**
     * 毒麻\精神标志
     */
    @TableField("TOXIC_PSYCHIATRIC_FLAG")
    private String toxicPsychiatricFlag;

    /**
     * 草药脚注
     */
    @TableField("HERBAL_FOOTNOTE")
    private String herbalFootnote;

    /**
     * 医嘱嘱托
     */
    @TableField("MEDICAL_ORDER")
    private String medicalOrder;

    /**
     * 皮试判别
     */
    @TableField("SKIN_TEST")
    private Integer skinTest;

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
