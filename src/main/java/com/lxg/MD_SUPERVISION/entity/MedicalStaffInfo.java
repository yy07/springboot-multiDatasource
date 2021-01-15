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
 * 2.10.2. 医护人员信息表
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("MEDICAL_STAFF_INFO")
public class MedicalStaffInfo implements Serializable {

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
     * 医护信息编号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 职工编码
     */
    @TableField("EMP_CODE")
    private String empCode;

    /**
     * 工号
     */
    @TableField("JOB_NO")
    private String jobNo;

    /**
     * 民族代码
     */
    @TableField("NATIONAL_CODE")
    private String nationalCode;

    /**
     * 身份标识-类别代码
     */
    @TableField("ID_TYPE_NO")
    private String idTypeNo;

    /**
     * 身份标识-号码
     */
    @TableField("ID_NO")
    private String idNo;

    /**
     * 科室代码
     */
    @TableField("DEPT_CODE")
    private String deptCode;

    /**
     * 科室名称
     */
    @TableField("DEPT_NAME")
    private String deptName;

    /**
     * 职务代码
     */
    @TableField("POST_CODE")
    private String postCode;

    /**
     * 职务名称
     */
    @TableField("POST_NAME")
    private String postName;

    /**
     * 邮箱地址
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 家庭地址
     */
    @TableField("FAMILAY_ADD")
    private String familayAdd;

    /**
     * 邮政编码
     */
    @TableField("POSTAL_CODE")
    private String postalCode;

    /**
     * 电话号码
     */
    @TableField("PHONE_NUMBER1")
    private String phoneNumber1;

    /**
     * 手机号码
     */
    @TableField("PHONE_NUMBER2")
    private String phoneNumber2;

    /**
     * 是否可挂号
     */
    @TableField("IS_REGISTRATION")
    private String isRegistration;

    /**
     * 是否为全科医生
     */
    @TableField("IS_PRACTITIONER")
    private String isPractitioner;

    /**
     * 开立处方权限编码
     */
    @TableField("PRESCRIPTION_AUTHORITY_CODE")
    private String prescriptionAuthorityCode;

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
