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
 * 2.3.4. 住院费用明细
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("HOSPITALIZED_EXPSET_DETAIL")
public class HospitalizedExpsetDetail implements Serializable {

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
     * 住院号
     */
    @TableField("HOSPITALIZATION_NO")
    private String hospitalizationNo;

    /**
     * 住院次数
     */
    @TableField("VISIT_COUNT")
    private Integer visitCount;

    /**
     * 费用明细序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 结算序号
     */
    @TableField("PRESCRIBE_LOCAL_ID")
    private String prescribeLocalId;

    /**
     * 医嘱明细序号
     */
    @TableField("MEDICAL_ORDER_DETAIL_NO")
    private String medicalOrderDetailNo;

    /**
     * 交易类别
     */
    @TableField("TRANSACATION_TYPE")
    private Integer transacationType;

    /**
     * 交易时间
     */
    @TableField("REFUND_TIME")
    private LocalDateTime refundTime;

    /**
     * 退费标识
     */
    @TableField("REFUND_LABEL")
    private Integer refundLabel;

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
     * 药品（项目）名称
     */
    @TableField("DRUG_NAME")
    private String drugName;

    /**
     * 药品（项目）规格
     */
    @TableField("DRUG_SPECIFICATIONS")
    private String drugSpecifications;

    /**
     * 药品采购码
     */
    @TableField("DRUG_PROCUREMENT_CODE")
    private String drugProcurementCode;

    /**
     * 药品（项目）数量
     */
    @TableField("DRUGS_NUMBER")
    private String drugsNumber;

    /**
     * 药品（项目）单位
     */
    @TableField("DRUGS_UNIT")
    private String drugsUnit;

    /**
     * 收费项目类别
     */
    @TableField("CHARGE_ITEM_CATEGORY")
    private String chargeItemCategory;

    /**
     * 单价
     */
    @TableField("UNIT_PRICE")
    private String unitPrice;

    /**
     * 数量
     */
    @TableField("NUMBER_AMOUNT")
    private String numberAmount;

    /**
     * 金额
     */
    @TableField("SUM_MONEY")
    private Double sumMoney;

    /**
     * 自费金额
     */
    @TableField("SEL_PAY_AMOUNT")
    private Double selPayAmount;

    /**
     * 报销金额
     */
    @TableField("REIMBURSEMENT_AMOUNT")
    private Double reimbursementAmount;

    /**
     * 费用类别
     */
    @TableField("COST_CATEGORY")
    private String costCategory;

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
