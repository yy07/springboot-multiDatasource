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
 * 2.3.5. 住院结算
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("HOSPITALIZED_SETTLEMENT")
public class HospitalizedSettlement implements Serializable {

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
     * 结算序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 第N次结算
     */
    @TableField("NUMBER_N")
    private Double numberN;

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
     * 就诊类型代码
     */
    @TableField("PATIENT_TYPE")
    private String patientType;

    /**
     * 就诊类型名称
     */
    @TableField("PATIENT_TYPE_NAME")
    private String patientTypeName;

    /**
     * 交易类别
     */
    @TableField("TRANSACATION_TYPE")
    private Integer transacationType;

    /**
     * 退费标志
     */
    @TableField("REFUND_FLAG")
    private String refundFlag;

    /**
     * 修改标志
     */
    @TableField("MODIFY_FLAG")
    private String modifyFlag;

    /**
     * 发票号
     */
    @TableField("INVOICE_NUMBER")
    private String invoiceNumber;

    /**
     * 结算标志
     */
    @TableField("CHARGE_FLAG")
    private String chargeFlag;

    /**
     * 身份标识-类别代码
     */
    @TableField("IDENTITY_CATEGORY_CODE")
    private String identityCategoryCode;

    /**
     * 身份标识-号码
     */
    @TableField("IDENTITY_NUMBER")
    private String identityNumber;

    /**
     * 姓名
     */
    @TableField("NAME")
    private String name;

    /**
     * 保险类型
     */
    @TableField("INSURANCE_TYPE")
    private String insuranceType;

    /**
     * 医疗付款方式
     */
    @TableField("MEDICAL_PAYMENT_METHOD")
    private String medicalPaymentMethod;

    /**
     * 医疗付款方式-证件号码
     */
    @TableField("MEDICAL_PAYMENT_METHOD_ID")
    private String medicalPaymentMethodId;

    /**
     * 收费时间
     */
    @TableField("CHARGE_TIME")
    private LocalDateTime chargeTime;

    /**
     * 退费时间
     */
    @TableField("REFUND_TIME")
    private LocalDateTime refundTime;

    /**
     * 总金额
     */
    @TableField("TOTAL_SUM")
    private Double totalSum;

    /**
     * 实收金额
     */
    @TableField("AMOUNT_RECEIVED")
    private Double amountReceived;

    /**
     * 医保范围总额
     */
    @TableField("MEDICAL_INSURANCE_AMOUNT")
    private Double medicalInsuranceAmount;

    /**
     * 医保支付金额
     */
    @TableField("MEDICAL_INSURANCE_PAY_AMOUNT")
    private Double medicalInsurancePayAmount;

    /**
     * 自费金额
     */
    @TableField("SELF_EXPENSES_AMOUNT")
    private Double selfExpensesAmount;

    /**
     * 优惠金额
     */
    @TableField("DISCOUNT_AMOUNT")
    private Double discountAmount;

    /**
     * 医保范围外个人支付
     */
    @TableField("SELF_PAY_AMOUNT_OUT")
    private Double selfPayAmountOut;

    /**
     * 医保范围内个人自付
     */
    @TableField("SELF_PAY_AMOUNT_IN")
    private Double selfPayAmountIn;

    /**
     * 医保基金支付
     */
    @TableField("FUND_PAY_AMOUNT")
    private Double fundPayAmount;

    /**
     * 住院费
     */
    @TableField("INPATIENT_COST_SUM")
    private Double inpatientCostSum;

    /**
     * 西药费
     */
    @TableField("WESTERN_MEDICINE_FEE")
    private Double westernMedicineFee;

    /**
     * 中成药费
     */
    @TableField("CHINESE_PATENT_DRUG_FEE")
    private Double chinesePatentDrugFee;

    /**
     * 中草药费
     */
    @TableField("CHINESE_HERBAL_MEDICINE_FEE")
    private Double chineseHerbalMedicineFee;

    /**
     * 挂号费
     */
    @TableField("REGISTRATION_FEE")
    private Double registrationFee;

    /**
     * 床位费
     */
    @TableField("BED_FEE")
    private Double bedFee;

    /**
     * 诊察费
     */
    @TableField("DIAGNOSTIC_FEE")
    private Double diagnosticFee;

    /**
     * 检查费
     */
    @TableField("INSPECTION_FEE")
    private Double inspectionFee;

    /**
     * 治疗费
     */
    @TableField("TREATMENT_FEE")
    private Double treatmentFee;

    /**
     * 手术材料费
     */
    @TableField("SURGICAL_MATERIAL_FEE")
    private Double surgicalMaterialFee;

    /**
     * 护理费
     */
    @TableField("NURSING_FEE")
    private Double nursingFee;

    /**
     * 手术费
     */
    @TableField("OPERATION_FEE")
    private Double operationFee;

    /**
     * 化验费
     */
    @TableField("LABORATORY_FEE")
    private Double laboratoryFee;

    /**
     * 输血费
     */
    @TableField("BLOOD_TRANSFUSION_FEE")
    private Double bloodTransfusionFee;

    /**
     * 麻醉费
     */
    @TableField("ANESTHESIA_COST")
    private Double anesthesiaCost;

    /**
     * 放射费
     */
    @TableField("RADIOLOGICAL_FEE")
    private Double radiologicalFee;

    /**
     * 输氧费
     */
    @TableField("OXYGEN_SUPPLY_FEE")
    private Double oxygenSupplyFee;

    /**
     * 接生费
     */
    @TableField("DELIVERING_BABY_FEE")
    private Double deliveringBabyFee;

    /**
     * 婴儿费
     */
    @TableField("INFANT_FEE")
    private Double infantFee;

    /**
     * 陪床费
     */
    @TableField("ACCOMPANYING_BED_FEE")
    private Double accompanyingBedFee;

    /**
     * 诊疗费
     */
    @TableField("CONSULTATION_FEE")
    private Double consultationFee;

    /**
     * 特需服务费
     */
    @TableField("SPECIAL_SERVICE_FEE")
    private Double specialServiceFee;

    /**
     * 其他费
     */
    @TableField("OTHER_FEE")
    private Double otherFee;

    /**
     * 检查用材料费
     */
    @TableField("INSPECTION_MATERIAL_FEE")
    private Double inspectionMaterialFee;

    /**
     * 治疗用材料费
     */
    @TableField("THERAPEUTIC_MATERIALS_FEE")
    private Double therapeuticMaterialsFee;

    /**
     * 药事服务费
     */
    @TableField("MEDICINE_SERVICE_FEE")
    private Double medicineServiceFee;

    /**
     * 收费操作员工号
     */
    @TableField("CHARGE_OPERATOR_NUMBER")
    private String chargeOperatorNumber;

    /**
     * 收费操作员姓名
     */
    @TableField("CHARGE_OPERATOR_NAME")
    private String chargeOperatorName;

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
