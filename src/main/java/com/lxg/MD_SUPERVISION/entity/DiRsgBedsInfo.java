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
 * 2.9.2. 床位使用情况统计
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DI_RSG_BEDS_INFO")
public class DiRsgBedsInfo implements Serializable {

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
     * 床位使用情况统计编码
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 统计日期
     */
    @TableField("STATISTICS_DATE")
    private LocalDateTime statisticsDate;

    /**
     * 科室代码
     */
    @TableField("DEPT_WARD_CODE")
    private String deptWardCode;

    /**
     * 科室名称
     */
    @TableField("DEPT_WARD_NAME")
    private String deptWardName;

    /**
     * 编制床位数
     */
    @TableField("HOSPITAL_BEDS")
    private String hospitalBeds;

    /**
     * 实际床位数
     */
    @TableField("ACTUAL_BED_NUMBER")
    private String actualBedNumber;

    /**
     * 实际开放床位数
     */
    @TableField("ACTUAL_BED_OPEN_NUMBER")
    private String actualBedOpenNumber;

    /**
     * 实际使用床位数
     */
    @TableField("ACTUAL_BED_USE_NUMBER")
    private String actualBedUseNumber;

    /**
     * 特需服务床位数
     */
    @TableField("AP08_50_054_00")
    private String ap085005400;

    /**
     * 负压床位数
     */
    @TableField("VACUUM_BED_NUM")
    private String vacuumBedNum;

    /**
     * 重症医学科实际开放床位数
     */
    @TableField("MEDICAL_OPEN_BEDS")
    private String medicalOpenBeds;

    /**
     * 急诊留观实际开放床位数
     */
    @TableField("EMERGENCY_OBS_OPEN_BEDNUM")
    private String emergencyObsOpenBednum;

    /**
     * 康复床位数
     */
    @TableField("RECOVERY_BED_NUMBER")
    private String recoveryBedNumber;

    /**
     * 空床数
     */
    @TableField("EMPTY_BED_NUMBER")
    private String emptyBedNumber;

    /**
     * ICU实际使用床位数
     */
    @TableField("ICU_FACTUAL_SICKBED")
    private String icuFactualSickbed;

    /**
     * 急诊留观实际使用床位数
     */
    @TableField("EMERGENCY_OBS_USE_BEDNUM")
    private String emergencyObsUseBednum;

    /**
     * 填报日期时间
     */
    @TableField("FILL_DATE")
    private LocalDateTime fillDate;

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
