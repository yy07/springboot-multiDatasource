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
 * 2.2.6. 门(急)诊结算记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("OUTPATIENT_EMERG_SETTLEMENT")
public class OutpatientEmergSettlement implements Serializable {

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
     * 门(急)诊号
     */
    @TableField("OUTPATIENT_NO")
    private String outpatientNo;

    /**
     * 挂号序号
     */
    @TableField("REG_SERIAL_NO")
    private String regSerialNo;

    /**
     * 结算明细序号
     */
    @TableField("SETTLE_SERIAL_NO")
    private String settleSerialNo;

    /**
     * 第N次结算
     */
    @TableField("SETTLE_NO")
    private String settleNo;

    /**
     * 交易类别
     */
    @TableField("TRANS_TYPE")
    private String transType;

    /**
     * 医疗费用支付方式代码
     */
    @TableField("MEDI_EXP_PAY_CODE")
    private String mediExpPayCode;

    /**
     * 处方序号
     */
    @TableField("PRESCRIBE_NO")
    private String prescribeNo;

    /**
     * 申请单号
     */
    @TableField("APPLE_NO")
    private String appleNo;

    /**
     * 费用类别代码
     */
    @TableField("COST_TYPE_CODE")
    private String costTypeCode;

    /**
     * 费用类别名称
     */
    @TableField("COST_TYPE_NAME")
    private String costTypeName;

    /**
     * 药品(项目)代码
     */
    @TableField("DRUG_ID")
    private String drugId;

    /**
     * 药品(项目)名称
     */
    @TableField("DRUG_NAME")
    private String drugName;

    /**
     * 药品采购码
     */
    @TableField("DRUG_PROCUREMENT_CODE")
    private String drugProcurementCode;

    /**
     * 医保编码
     */
    @TableField("INSUR_CODE")
    private String insurCode;

    /**
     * 医保名称
     */
    @TableField("INSUR_NAME")
    private String insurName;

    /**
     * 药品与费用开立数量单位
     */
    @TableField("UNIT")
    private String unit;

    /**
     * 数量
     */
    @TableField("AMOUNT")
    private Double amount;

    /**
     * 药品与费用单价
     */
    @TableField("COST_SUM")
    private Double costSum;

    /**
     * 自费金额
     */
    @TableField("PERSONAL_EXPENSES")
    private Double personalExpenses;

    /**
     * 报销金额
     */
    @TableField("REIMB_COST_SUM")
    private Double reimbCostSum;

    /**
     * 总费用（元）
     */
    @TableField("TOTAL_AMOUNT")
    private Double totalAmount;

    /**
     * 医保范围外个人自费
     */
    @TableField("INDIVI_EXP_OUT_INSUR")
    private Double indiviExpOutInsur;

    /**
     * 医保范围内总额
     */
    @TableField("TOTAL_INSUR_AMOUNT")
    private Double totalInsurAmount;

    /**
     * 医保基金支付
     */
    @TableField("MEDICAL_INSUR_PAY")
    private Double medicalInsurPay;

    /**
     * 医保范围内自付
     */
    @TableField("PAY_WITHIN_INSUR")
    private Double payWithinInsur;

    /**
     * 退费标识
     */
    @TableField("RESUND_IDEN")
    private String resundIden;

    /**
     * 发票号
     */
    @TableField("RECEIPT_NO")
    private String receiptNo;

    /**
     * 结算日期
     */
    @TableField("SETTLEMENT_DATE")
    private LocalDateTime settlementDate;

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
