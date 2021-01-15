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
 * 2.11.1. 医疗机构信息
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("HOSPITAL_INFO")
public class HospitalInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;

    /**
     * 医疗机构代码
     */
    @TableField("ORGAN_CODE_SYSTEM")
    private String organCodeSystem;

    /**
     * 医疗机构组织机构代码
     */
    @TableField("ORGAN_CODE")
    private String organCode;

    /**
     * 医疗机构名称
     */
    @TableField("ORGAN_NAME")
    private String organName;

    /**
     * 医疗卫生机构分类与代码
     */
    @TableField("HEALTH_INST_CLASS_CODE")
    private String healthInstClassCode;

    /**
     * 医疗机构分类管理代码
     */
    @TableField("HEALTH_INST_MANA_CODE")
    private String healthInstManaCode;

    /**
     * 行政区划代码
     */
    @TableField("DISTRICT_CODE")
    private String districtCode;

    /**
     * 上级组织机构代码
     */
    @TableField("P_ORGANIZATION_CODE")
    private String pOrganizationCode;

    /**
     * 上级组织机构名称
     */
    @TableField("P_ORGANIZATION")
    private String pOrganization;

    /**
     * 主办类型
     */
    @TableField("SPONSOR_TYPE")
    private String sponsorType;

    /**
     * 医疗机构联系电话
     */
    @TableField("ORGAN_NUMBER")
    private String organNumber;

    /**
     * 医疗机构负责人(法人)姓名
     */
    @TableField("ORGAN_HEAD_NAME")
    private String organHeadName;

    /**
     * 医疗机构负责人联系电话
     */
    @TableField("ORGAN_HEAD_NUMBER")
    private String organHeadNumber;

    /**
     * 执业单位类别
     */
    @TableField("PRACTICE_TYPE_CODE")
    private String practiceTypeCode;

    /**
     * 医院等级代码
     */
    @TableField("HOS_GRADE_CODE")
    private String hosGradeCode;

    /**
     * 医疗机构执业许可证登记号
     */
    @TableField("PRACTICE_LICENSE_NO")
    private String practiceLicenseNo;

    /**
     * 执业许可证登记地址
     */
    @TableField("PRACTICE_LICENSE_ADDR")
    private String practiceLicenseAddr;

    /**
     * 诊疗科目代码
     */
    @TableField("DIAGNOSIS_SUBJECT_CODE")
    private String diagnosisSubjectCode;

    /**
     * 诊疗科目
     */
    @TableField("DIAGNOSIS_SUBJECT")
    private String diagnosisSubject;

    /**
     * 有效期（开始日期）
     */
    @TableField("VALIDITY_PERIOD_START")
    private LocalDateTime validityPeriodStart;

    /**
     * 有效期（到期日期）
     */
    @TableField("VALIDITY_PERIOD_END")
    private LocalDateTime validityPeriodEnd;

    /**
     * 发证机关
     */
    @TableField("CERTIFICATION_AUTHORITY")
    private String certificationAuthority;

    /**
     * 发证日期
     */
    @TableField("CERTIFICATION_DATE")
    private LocalDateTime certificationDate;

    /**
     * 地址-省(自治区、直辖市)
     */
    @TableField("PROVINCE")
    private String province;

    /**
     * 地址-市(地区、州)
     */
    @TableField("CITY")
    private String city;

    /**
     * 地址-县(区)
     */
    @TableField("COUNTY")
    private String county;

    /**
     * 地址-乡(镇、街道办事处)
     */
    @TableField("TOWN_SHIP")
    private String townShip;

    /**
     * 地址-村(街、路、弄等)
     */
    @TableField("RELATION_STREET")
    private String relationStreet;

    /**
     * 地址-门牌号码
     */
    @TableField("HOUSE_NUMBER")
    private String houseNumber;

    /**
     * 邮政编码
     */
    @TableField("POST_CODE")
    private String postCode;

    /**
     * 医疗机构需要上传数据表的代码
     */
    @TableField("PLATFORM_NEED_UPLOAD")
    private String platformNeedUpload;

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
