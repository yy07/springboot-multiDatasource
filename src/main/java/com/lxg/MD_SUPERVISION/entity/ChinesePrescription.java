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
 * 2.2.5. 中药处方
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("CHINESE_PRESCRIPTION")
public class ChinesePrescription implements Serializable {

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
     * 处方明细序号
     */
    @TableField("PRESCRIBE_SERIAL_NO")
    private String prescribeSerialNo;

    /**
     * 处方编号
     */
    @TableField("PRESCRIBE_NO")
    private String prescribeNo;

    /**
     * 处方备注信息
     */
    @TableField("PRESCRIPTION_NOTE_INF")
    private String prescriptionNoteInf;

    /**
     * 处方发药药剂师签名
     */
    @TableField("PRESCRIPTION_DRUG_PHARM_SIG")
    private String prescriptionDrugPharmSig;

    /**
     * 处方核对药剂师签名
     */
    @TableField("PRESCRIPTION_CHECK_SIG")
    private String prescriptionCheckSig;

    /**
     * 处方药品组号
     */
    @TableField("PRESCRIPTION_MEDICINE_NO")
    private String prescriptionMedicineNo;

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
     * 患者姓名
     */
    @TableField("NAME")
    private String name;

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
     * 性别代码
     */
    @TableField("GENDER_CODE")
    private String genderCode;

    /**
     * 处方开立科室代码
     */
    @TableField("PRESCRIPTION_DEP_CODE")
    private String prescriptionDepCode;

    /**
     * 处方开立科室名称
     */
    @TableField("PRESCRIPTION_DEP_NAME")
    private String prescriptionDepName;

    /**
     * 处方开立日期
     */
    @TableField("PRESCRIBE_INPUT_DATE")
    private LocalDateTime prescribeInputDate;

    /**
     * 处方开立医师签名
     */
    @TableField("PRESCRIBE_INPUT_SIG")
    private String prescribeInputSig;

    /**
     * 处方审核药剂师签名
     */
    @TableField("PRESCRIBE_CHK_SIG")
    private String prescribeChkSig;

    /**
     * 处方调配药剂师签名
     */
    @TableField("PRESCRIBE_DISPEN_SIG")
    private String prescribeDispenSig;

    /**
     * 医生代码
     */
    @TableField("DOCTOR_CODE")
    private String doctorCode;

    /**
     * 医生名称
     */
    @TableField("DOCTOR_NAME")
    private String doctorName;

    /**
     * 处方类别代码
     */
    @TableField("PRESCRIPTION_IDENTIFIER_NO")
    private String prescriptionIdentifierNo;

    /**
     * 处方项目分类代码
     */
    @TableField("PRESCRIPTION_ITEM_CLASS_CODE")
    private String prescriptionItemClassCode;

    /**
     * 处方项目分类名称
     */
    @TableField("PRESCRIPTION_ITEM_CLASS_NAME")
    private String prescriptionItemClassName;

    /**
     * 处方明细代码
     */
    @TableField("PRESCRIPTION_DETAIL_CODE")
    private String prescriptionDetailCode;

    /**
     * 处方明细名称
     */
    @TableField("PRESCRIPTION_DETAIL_NAME")
    private String prescriptionDetailName;

    /**
     * 审方药师代码
     */
    @TableField("TRIALPARTY_PHA_CODE")
    private String trialpartyPhaCode;

    /**
     * 审方药师名称
     */
    @TableField("TRIALPARTY_PHA_NAME")
    private String trialpartyPhaName;

    /**
     * 疾病诊断编码
     */
    @TableField("DISEASE_DIAGNOSIS_CODE")
    private String diseaseDiagnosisCode;

    /**
     * 药品（项目）编码
     */
    @TableField("DRUG_ID")
    private String drugId;

    /**
     * 中药类别名称
     */
    @TableField("TCM_CATE_NAME")
    private String tcmCateName;

    /**
     * 中药类别代码
     */
    @TableField("TCM_CODE")
    private String tcmCode;

    /**
     * 草药脚注
     */
    @TableField("HERBAL_FOOTNOTE")
    private String herbalFootnote;

    /**
     * 药物（项目）名称
     */
    @TableField("DRUG_NAME")
    private String drugName;

    /**
     * 药物规格
     */
    @TableField("DRUG_SPECIFICATIONS")
    private String drugSpecifications;

    /**
     * 药物剂型代码
     */
    @TableField("DRUG_DOSAGE_CODE")
    private String drugDosageCode;

    /**
     * 药物剂型名称
     */
    @TableField("DRUG_DOSAGE_NAME")
    private String drugDosageName;

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
     * 药物使用-频率
     */
    @TableField("DRUG_USE_FREQUENCY")
    private String drugUseFrequency;

    /**
     * 药物使用途径代码
     */
    @TableField("DRUG_USE_ROUTE_CODE")
    private String drugUseRouteCode;

    /**
     * 药物使用-途径
     */
    @TableField("DRUG_USE_ROUTE_NAME")
    private String drugUseRouteName;

    /**
     * 药物使用总剂量
     */
    @TableField("DRUG_USE_TOTAL_DOSE")
    private Double drugUseTotalDose;

    /**
     * 服药天数
     */
    @TableField("DRUG_USE_DAYS")
    private Integer drugUseDays;

    /**
     * 治则治法
     */
    @TableField("THERAPEUTIC_THERAPY")
    private String therapeuticTherapy;

    /**
     * 中药饮片处方
     */
    @TableField("CHINESE_MEDICINE_PRESCRIPTION")
    private String chineseMedicinePrescription;

    /**
     * 中药饮片剂数(剂)
     */
    @TableField("CHINESE_DRINK_TABLET_NUMBER")
    private Integer chineseDrinkTabletNumber;

    /**
     * 中药饮片煎煮法
     */
    @TableField("CHINESE_HERBALMEDI_METHOD")
    private String chineseHerbalmediMethod;

    /**
     * 中药用药方法
     */
    @TableField("CHINESE_MEDICINE_USE_METHOD")
    private String chineseMedicineUseMethod;

    /**
     * 中医病名代码
     */
    @TableField("CHINESE_DIAGNOSIS_CODE")
    private String chineseDiagnosisCode;

    /**
     * 中医证候代码
     */
    @TableField("CHINESE_SYNDROME_DESC")
    private String chineseSyndromeDesc;

    /**
     * 药品种类
     */
    @TableField("YPLB")
    private Integer yplb;

    /**
     * 皮试判别(是否过敏)
     */
    @TableField("SKIN_TEST_CRITERION")
    private String skinTestCriterion;

    /**
     * 是否统一采购药品
     */
    @TableField("IS_UNIFIED_PROCUREMENT_DRUGS")
    private String isUnifiedProcurementDrugs;

    /**
     * 基药编码
     */
    @TableField("BASE_DRUG_CODE")
    private String baseDrugCode;

    /**
     * 医保编码
     */
    @TableField("INSUR_CODE")
    private String insurCode;

    /**
     * 药品采购码
     */
    @TableField("DRUG_PROCUREMENT_CODE")
    private String drugProcurementCode;

    /**
     * 抗菌药物标志
     */
    @TableField("ANTIBACTERIALS_FLAG")
    private String antibacterialsFlag;

    /**
     * 处方药品金额
     */
    @TableField("PRESCRIPTION_DRUG_AMOUNT")
    private Double prescriptionDrugAmount;

    /**
     * 药物开立数量单位
     */
    @TableField("DRUGS_UNIT")
    private String drugsUnit;

    /**
     * 单价
     */
    @TableField("UNIT_PRICE")
    private Double unitPrice;

    /**
     * 总价
     */
    @TableField("TOT_AMOUNT")
    private Double totAmount;

    /**
     * 数量
     */
    @TableField("QUANTITY")
    private Integer quantity;

    /**
     * 用药开始时间
     */
    @TableField("MEDICATION_START_TIME")
    private LocalDateTime medicationStartTime;

    /**
     * 用药停止日期时间
     */
    @TableField("MEDICATION_STOP_TIME")
    private LocalDateTime medicationStopTime;

    /**
     * 用药天数
     */
    @TableField("MEDICATION_DAYS")
    private Integer medicationDays;

    /**
     * 处方有效天数
     */
    @TableField("PRESCRIBE_DAYS")
    private Integer prescribeDays;

    /**
     * 药物类型代码
     */
    @TableField("MEDICINE_TYPE_CODE")
    private String medicineTypeCode;

    /**
     * 药物类型名称
     */
    @TableField("MEDICINE_TYPE_NAME")
    private String medicineTypeName;

    /**
     * 是否主药
     */
    @TableField("IF_MAIN_MEDICINE")
    private String ifMainMedicine;

    /**
     * 是否基本药物
     */
    @TableField("IF_BASE_MEDICINE")
    private String ifBaseMedicine;

    /**
     * 是否适应
     */
    @TableField("ADAPTIVE_FLAG")
    private String adaptiveFlag;

    /**
     * 是否加急
     */
    @TableField("URGENT_FLAG")
    private String urgentFlag;

    /**
     * 是否药观
     */
    @TableField("MED_VIEW_FLAG")
    private String medViewFlag;

    /**
     * 药管平台码
     */
    @TableField("DRUG_PLATFORM_CODE")
    private String drugPlatformCode;

    /**
     * 皮试结果
     */
    @TableField("SKIN_TEST_RESULT")
    private String skinTestResult;

    /**
     * 挂号序号
     */
    @TableField("REG_SN")
    private String regSn;

    /**
     * 结算序号
     */
    @TableField("SETTLEMENT_SN")
    private String settlementSn;

    /**
     * 退费标识
     */
    @TableField("RESUND_IDEN")
    private String resundIden;

    /**
     * 发药序号
     */
    @TableField("DISPENSING_NO")
    private String dispensingNo;

    /**
     * 退药标识
     */
    @TableField("DRUG_WITHDRAWAL_IDEN")
    private String drugWithdrawalIden;

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
