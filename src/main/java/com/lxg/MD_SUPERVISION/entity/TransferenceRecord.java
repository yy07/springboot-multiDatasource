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
 * 2.6.8. 住院病程记录-转科记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("TRANSFERENCE_RECORD")
public class TransferenceRecord implements Serializable {

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
     * 转科记录ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

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
     * 入院日期时间
     */
    @TableField("INHOS_DATE")
    private LocalDateTime inhosDate;

    /**
     * 主诉
     */
    @TableField("CHIEF_COMPLAINT")
    private String chiefComplaint;

    /**
     * 入院情况
     */
    @TableField("INHOS_STATE")
    private String inhosState;

    /**
     * 中医“四诊”观察结果
     */
    @TableField("CHINA_FOUR_DIAG_OBSER")
    private String chinaFourDiagObser;

    /**
     * 入院诊断-西医诊断编码
     */
    @TableField("INHOS_DIAG_WM_DIAG_CODE")
    private String inhosDiagWmDiagCode;

    /**
     * 入院诊断-西医诊断
     */
    @TableField("INHOS_DIAG_WM_DIAG_NAME")
    private String inhosDiagWmDiagName;

    /**
     * 入院诊断-中医病名代码
     */
    @TableField("INHOS_DIAG_CM_DIS_CODE")
    private String inhosDiagCmDisCode;

    /**
     * 入院诊断-中医病名
     */
    @TableField("INHOS_DIAG_CM_DIS_NAME")
    private String inhosDiagCmDisName;

    /**
     * 入院诊断-中医证候代码
     */
    @TableField("INHOS_DIAG_CM_SYNDROME_CODE")
    private String inhosDiagCmSyndromeCode;

    /**
     * 入院诊断-中医证候
     */
    @TableField("INHOS_DIAG_CM_SYNDROME_NAME")
    private String inhosDiagCmSyndromeName;

    /**
     * 治则治法
     */
    @TableField("THERAPEUTIC_THERAPY")
    private String therapeuticTherapy;

    /**
     * 诊疗过程描述
     */
    @TableField("TREATMENT_PROCESS_DESC")
    private String treatmentProcessDesc;

    /**
     * 目前情况
     */
    @TableField("CURRENT_SITUATION")
    private String currentSituation;

    /**
     * 目前诊断-西医诊断编码
     */
    @TableField("CURRENT_DIAG_WM_DIAG_CODE")
    private String currentDiagWmDiagCode;

    /**
     * 目前诊断-西医诊断
     */
    @TableField("CURRENT_DIAG_WM_DIAG_NAME")
    private String currentDiagWmDiagName;

    /**
     * 目前诊断-中医病名代码
     */
    @TableField("CURRENT_DIAG_CM_DIS_CODE")
    private String currentDiagCmDisCode;

    /**
     * 目前诊断-中医病名
     */
    @TableField("CURRENT_DIAG_CM_DIS_NAME")
    private String currentDiagCmDisName;

    /**
     * 目前诊断-中医证候代码
     */
    @TableField("CURRENT_DIAG_CM_SYNDROME_CODE")
    private String currentDiagCmSyndromeCode;

    /**
     * 目前诊断-中医证候
     */
    @TableField("CURRENT_DIAG_CM_SYNDROME_NAME")
    private String currentDiagCmSyndromeName;

    /**
     * 转科目的
     */
    @TableField("TRANSFER_PURPOSE")
    private String transferPurpose;

    /**
     * 转入诊疗计划
     */
    @TableField("ASSESSMENT_PLAN")
    private String assessmentPlan;

    /**
     * 中药处方医嘱内容
     */
    @TableField("CH_MEDICINE_DECOCTION")
    private String chMedicineDecoction;

    /**
     * 中药煎煮方法
     */
    @TableField("CH_MEDICINE_DECOCTION_METHOD")
    private String chMedicineDecoctionMethod;

    /**
     * 中药用药方法
     */
    @TableField("CHINESE_MEDICINE_TREAT_METHOD")
    private String chineseMedicineTreatMethod;

    /**
     * 注意事项
     */
    @TableField("NOTE")
    private String note;

    /**
     * 转科记录类型
     */
    @TableField("TRANSFER_RCD_TYPE")
    private Integer transferRcdType;

    /**
     * 转科记录类型名称
     */
    @TableField("TRANSFER_RCD_TYPE_NAME")
    private String transferRcdTypeName;

    /**
     * 转出日期时间
     */
    @TableField("TRANSFER_OUT_DATE")
    private LocalDateTime transferOutDate;

    /**
     * 转出科室
     */
    @TableField("TRANSFER_OUT_DEPT")
    private String transferOutDept;

    /**
     * 转出医师签名
     */
    @TableField("TRANSFER_OUT_DOCTOR_SIG")
    private String transferOutDoctorSig;

    /**
     * 转入日期时间
     */
    @TableField("TRANSFER_IN_DATE")
    private LocalDateTime transferInDate;

    /**
     * 转入科室
     */
    @TableField("TRANSFER_IN_DEPT")
    private String transferInDept;

    /**
     * 转入医师签名
     */
    @TableField("TRANSFER_IN_DOCTOR_SIG")
    private String transferInDoctorSig;

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
