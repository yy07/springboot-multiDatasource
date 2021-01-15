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
 * 2.6.18. 疑难病例讨论记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("INTRACTABLE_DISCUSSRECORD")
public class IntractableDiscussrecord implements Serializable {

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
     * 疑难病例讨论记录ID
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
     * 讨论日期时间
     */
    @TableField("DISCUSS_DATE")
    private LocalDateTime discussDate;

    /**
     * 讨论地点
     */
    @TableField("DISCUSSION_SITE")
    private String discussionSite;

    /**
     * 参加讨论人员名单
     */
    @TableField("RESCUE_PERSONS")
    private String rescuePersons;

    /**
     * 主持人姓名
     */
    @TableField("HOST_NAME")
    private String hostName;

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
     * 讨论意见
     */
    @TableField("DISCUSSION_OPINION")
    private String discussionOpinion;

    /**
     * 中医“四诊”观察结果
     */
    @TableField("CHINA_FOUR_DIAG_OBSER")
    private String chinaFourDiagObser;

    /**
     * 辨证论治详细描述
     */
    @TableField("TCM_TREATMENT_DETAILS")
    private String tcmTreatmentDetails;

    /**
     * 中药处方医嘱内容
     */
    @TableField("CH_MEDICINE_DECOCTION")
    private String chMedicineDecoction;

    /**
     * 中药用药方法
     */
    @TableField("CHINESE_MEDICINE_TREAT_METHOD")
    private String chineseMedicineTreatMethod;

    /**
     * 主持人总结意见
     */
    @TableField("IDEAS_SUMMARY")
    private String ideasSummary;

    /**
     * 医师签名
     */
    @TableField("DOCTOR_SIGNATURE")
    private String doctorSignature;

    /**
     * 主治医师签名
     */
    @TableField("ATTENDING_DOCTOR_SIG")
    private String attendingDoctorSig;

    /**
     * 主任医师签名
     */
    @TableField("DIRECTOR_DOCTOR_SIGNATURE")
    private String directorDoctorSignature;

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
