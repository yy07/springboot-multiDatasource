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
 * 2.5.13. 生命体征测量明细记录
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("MONITOR_VITAL_SIGNS_DETAIL")
public class MonitorVitalSignsDetail implements Serializable {

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
    @TableField("DEPT_CODE")
    private String deptCode;

    /**
     * 就诊科室名称
     */
    @TableField("DEPT_NAME")
    private String deptName;

    /**
     * 生命体征测量明细序号
     */
    @TableField("DETAILS_LOCAL_ID")
    private String detailsLocalId;

    /**
     * 生命体征记录单号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 记录日期时间
     */
    @TableField("RECORD_DATE")
    private LocalDateTime recordDate;

    /**
     * 呼吸频率(次/min)
     */
    @TableField("RESPIRATORY_RATE")
    private Integer respiratoryRate;

    /**
     * 使用呼吸机标志
     */
    @TableField("VENTILATOR_FLAG")
    private String ventilatorFlag;

    /**
     * 脉率(次/min)
     */
    @TableField("PULSE_RATE")
    private Integer pulseRate;

    /**
     * 起搏器心率(次/min)
     */
    @TableField("HEART_PACEMAKER")
    private Integer heartPacemaker;

    /**
     * 收缩压(mmHg)
     */
    @TableField("SBP")
    private Integer sbp;

    /**
     * 舒张压(mmHg)
     */
    @TableField("DBP")
    private Integer dbp;

    /**
     * 体温(℃)
     */
    @TableField("TEMPERATURE")
    private Double temperature;

    /**
     * 脉搏短绌标志
     */
    @TableField("SHORT_PULSE_LIGHT")
    private String shortPulseLight;

    /**
     * 体温表类型
     */
    @TableField("THERMOMETER_TYPE")
    private String thermometerType;

    /**
     * 体温表类型名称
     */
    @TableField("THERMOMETER_NAME")
    private String thermometerName;

    /**
     * 物理降温标识
     */
    @TableField("PHYSICAL_COOLING_FLAG")
    private String physicalCoolingFlag;

    /**
     * 降温处理后体温(℃)
     */
    @TableField("COOLING_TEMPERATURE_TREATMENT")
    private Integer coolingTemperatureTreatment;

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
