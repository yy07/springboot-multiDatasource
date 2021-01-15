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
 * 2.5.6. 手术护理记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("OPERATION_CARE_RECORD")
public class OperationCareRecord implements Serializable {

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
     * 住院次数
     */
    @TableField("VISIT_COUNT")
    private Integer visitCount;

    /**
     * 手术护理记录ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 就诊类型代码
     */
    @TableField("VISIT_TYPE_NO")
    private String visitTypeNo;

    /**
     * 就诊类型名称
     */
    @TableField("VISIT_TYPE_NAME")
    private String visitTypeName;

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
     * 手术间编号
     */
    @TableField("OPERATING_ROOM_NUMBER")
    private String operatingRoomNumber;

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
     * ABO血型代码
     */
    @TableField("ABO_BLOOD")
    private String aboBlood;

    /**
     * ABO血型
     */
    @TableField("ABO_BLOOD_NAME")
    private String aboBloodName;

    /**
     * Rh血型代码
     */
    @TableField("RH_BLOOD_CODE")
    private String rhBloodCode;

    /**
     * Rh血型
     */
    @TableField("RH_BLOOD_NAME")
    private String rhBloodName;

    /**
     * 术前诊断编码
     */
    @TableField("PREOPERATIVE_DIAGNOSTIC_CODE")
    private String preoperativeDiagnosticCode;

    /**
     * 术前诊断
     */
    @TableField("PREOPERATIVE_DIAGNOSTIC_NAME")
    private String preoperativeDiagnosticName;

    /**
     * 手术及操作编码
     */
    @TableField("OPERATION_CODE")
    private String operationCode;

    /**
     * 手术及操作名称
     */
    @TableField("OPERATION_NAME")
    private String operationName;

    /**
     * 手术者姓名
     */
    @TableField("OPERATOR_NAME")
    private String operatorName;

    /**
     * 手术目标部位名称
     */
    @TableField("OPERTATION_TARGET_NAME")
    private String opertationTargetName;

    /**
     * 手术结束日期时间
     */
    @TableField("OPERATION_END_DATETIME")
    private LocalDateTime operationEndDatetime;

    /**
     * 手术开始日期时间
     */
    @TableField("OPERATION_START_DATETIME")
    private LocalDateTime operationStartDatetime;

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
     * 皮肤检查描述
     */
    @TableField("SKIN_INSPECTION_DESCRIPTION")
    private String skinInspectionDescription;

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
     * 入手术室日期时间
     */
    @TableField("IN_OPERATEROOM_DATETIME")
    private LocalDateTime inOperateroomDatetime;

    /**
     * 出手术室日期时间
     */
    @TableField("OUT_OPERATEROOM_DATETIME")
    private LocalDateTime outOperateroomDatetime;

    /**
     * 准备事项
     */
    @TableField("PREPARATION")
    private String preparation;

    /**
     * 术中病理标志
     */
    @TableField("INTRAOPERAT_PATHOLOGICAL_MARK")
    private String intraoperatPathologicalMark;

    /**
     * 术中所用物品名称
     */
    @TableField("INTRAOPERATIVE_DRUG_NAME")
    private String intraoperativeDrugName;

    /**
     * 术前清点标志
     */
    @TableField("PREOPERATIVE_INVENTORY_FLAG")
    private String preoperativeInventoryFlag;

    /**
     * 关前核对标志
     */
    @TableField("PREOPERATIVE_CHECK_FLAG")
    private String preoperativeCheckFlag;

    /**
     * 关后核对标志
     */
    @TableField("POSTOPERATIVE_CHECK_FLAG")
    private String postoperativeCheckFlag;

    /**
     * 病人交接核对项目
     */
    @TableField("PATIENT_TRANS_CHECK_PROJECT")
    private String patientTransCheckProject;

    /**
     * 巡台护士签名
     */
    @TableField("PATROL_NURSE_SIGNATURE")
    private String patrolNurseSignature;

    /**
     * 器械护士签名
     */
    @TableField("EQUIPMENT_NURSES_SIGNATURE")
    private String equipmentNursesSignature;

    /**
     * 交接护士签名
     */
    @TableField("TRANSFER_NURSE_SIGNATURE")
    private String transferNurseSignature;

    /**
     * 转运者签名
     */
    @TableField("TRANSPORTER_SIGNATURE")
    private String transporterSignature;

    /**
     * 交接日期时间
     */
    @TableField("HANDOVER_DATETIME")
    private LocalDateTime handoverDatetime;

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
