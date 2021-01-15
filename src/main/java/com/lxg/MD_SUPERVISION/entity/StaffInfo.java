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
 * 2.10.1. 职工信息表
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("STAFF_INFO")
public class StaffInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;

    /**
     * 医疗机构代码
     */
    @TableField("CLINIC_ORGAN_CODE")
    private String clinicOrganCode;

    /**
     * 医疗机构名称
     */
    @TableField("CLINIC_ORGAN_NAME")
    private String clinicOrganName;

    /**
     * 职工信息ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 职工编码
     */
    @TableField("EMP_CODE")
    private String empCode;

    /**
     * 职工工号
     */
    @TableField("JOB_NO")
    private String jobNo;

    /**
     * 职工名称
     */
    @TableField("EMP_NAME")
    private String empName;

    /**
     * 注册证件类型代码
     */
    @TableField("ID_TYPE_NO")
    private String idTypeNo;

    /**
     * 注册证件号码
     */
    @TableField("ID_NO")
    private String idNo;

    /**
     * 职工性别代码
     */
    @TableField("EMP_SEX_CODE")
    private String empSexCode;

    /**
     * 职工性别
     */
    @TableField("EMP_SEX")
    private String empSex;

    /**
     * 出生日期
     */
    @TableField("EMP_BRITHDA")
    private LocalDateTime empBrithda;

    /**
     * 民族代码
     */
    @TableField("NATIONAL_CODE")
    private String nationalCode;

    /**
     * 参加工作日期
     */
    @TableField("FIRSTJOB_DAY")
    private LocalDateTime firstjobDay;

    /**
     * 工作单位联系电话
     */
    @TableField("WORK_PHONE_NO")
    private String workPhoneNo;

    /**
     * 个人联系电话
     */
    @TableField("PERSONAL_PHONE_NO")
    private String personalPhoneNo;

    /**
     * 职工所在科室代码
     */
    @TableField("DEPT_CODE")
    private String deptCode;

    /**
     * 职工所在科室名称
     */
    @TableField("DEPT_NAME")
    private String deptName;

    /**
     * 人员类别编码
     */
    @TableField("EMP_KIND_CODE")
    private String empKindCode;

    /**
     * 医师/卫生监督员执业证书编码
     */
    @TableField("DH_CERTIFICATE_ID")
    private String dhCertificateId;

    /**
     * 从事专业类别代码
     */
    @TableField("PROFESSIONAL_TYPE")
    private String professionalType;

    /**
     * 医师执业类别代码
     */
    @TableField("PRACTICE_TYPE")
    private String practiceType;

    /**
     * 医师执业范围代码
     */
    @TableField("PRACTICE_AREA")
    private String practiceArea;

    /**
     * 是否注册为多机构执业医师
     */
    @TableField("MULTIPLE_PRACTICE")
    private String multiplePractice;

    /**
     * 第2执业单位类别代码
     */
    @TableField("PRACTICE_TYPE2")
    private String practiceType2;

    /**
     * 第3执业单位类别代码
     */
    @TableField("PRACTICE_TYPE3")
    private String practiceType3;

    /**
     * 执业资格代码
     */
    @TableField("PRACTICE_RIGHTS_CODE")
    private String practiceRightsCode;

    /**
     * 行政/业务管理职务代码
     */
    @TableField("MANAGERIAL_POST")
    private String managerialPost;

    /**
     * 专业技术资格（评）名称
     */
    @TableField("PTQ_NAME")
    private String ptqName;

    /**
     * 专业技术资格（评）代码
     */
    @TableField("PTQ_CODE")
    private String ptqCode;

    /**
     * 专业技术职务（聘）代码
     */
    @TableField("TECHNICAL_POSITION")
    private String technicalPosition;

    /**
     * 学历编码
     */
    @TableField("EDU_CODE")
    private String eduCode;

    /**
     * 学位代码
     */
    @TableField("DEGREE_CODE")
    private String degreeCode;

    /**
     * 所学专业代码
     */
    @TableField("TECHNICAL_CODE")
    private String technicalCode;

    /**
     * 所学专业名称
     */
    @TableField("THCHNICAL_NAME")
    private String thchnicalName;

    /**
     * 专科特长1
     */
    @TableField("SPECIALITY1")
    private String speciality1;

    /**
     * 专科特长2
     */
    @TableField("SPECIALITY2")
    private String speciality2;

    /**
     * 专科特长3
     */
    @TableField("SPECIALITY3")
    private String speciality3;

    /**
     * 全科医生取得培训合格证书情况（限参加培训人员）
     */
    @TableField("TRAINING_RESULT")
    private String trainingResult;

    /**
     * 是否由乡镇卫生院或社区卫生服务机构派驻村卫生室工作
     */
    @TableField("IS_STATIONED")
    private String isStationed;

    /**
     * 是否中国科学院士和中国工程院院士
     */
    @TableField("IS_ACADEMICIAN")
    private String isAcademician;

    /**
     * 是否有突出贡献的中青年科学、技术、管理专家
     */
    @TableField("IS_EXPERT")
    private String isExpert;

    /**
     * 是否享受国务院政府特殊津贴人员
     */
    @TableField("IS_STATEDEPT")
    private String isStatedept;

    /**
     * 是否新世纪百千万人才工程国家级人选
     */
    @TableField("IS_CENTURY")
    private String isCentury;

    /**
     * 是否国家科技奖项负责人
     */
    @TableField("IS_TECHLEADER")
    private String isTechleader;

    /**
     * 期内流动情况
     */
    @TableField("MOBILITY")
    private String mobility;

    /**
     * 流入/流出时间
     */
    @TableField("MOBILITY_DATE")
    private LocalDateTime mobilityDate;

    /**
     * 编制情况
     */
    @TableField("ORGANIZATION_CODE")
    private String organizationCode;

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
