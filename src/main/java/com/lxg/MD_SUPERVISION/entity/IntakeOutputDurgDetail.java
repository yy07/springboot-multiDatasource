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
 * 2.5.10. 出入量记录用药明细
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("INTAKE_OUTPUT_DURG_DETAIL")
public class IntakeOutputDurgDetail implements Serializable {

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
     * 出入量记录用药明细序号
     */
    @TableField("DETAILS_LOCAL_ID")
    private String detailsLocalId;

    /**
     * 出入量记录ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 医嘱本地ID
     */
    @TableField("ORDER_LID")
    private String orderLid;

    /**
     * 药物名称
     */
    @TableField("DRUG_NAME")
    private String drugName;

    /**
     * 药物用法
     */
    @TableField("MEDICINE_METHODS")
    private String medicineMethods;

    /**
     * 中药使用类别代码
     */
    @TableField("CHINESE_MEDICINE_TYPE")
    private String chineseMedicineType;

    /**
     * 中药使用类别名称
     */
    @TableField("CHINESE_MEDICINE_TYPE_NAME")
    private String chineseMedicineTypeName;

    /**
     * 药物使用频率
     */
    @TableField("DRUG_USE_FREQUENCY")
    private String drugUseFrequency;

    /**
     * 药物使用频率名称
     */
    @TableField("DRUG_USE_FREQUENCY_NAME")
    private String drugUseFrequencyName;

    /**
     * 药物使用剂量单位
     */
    @TableField("DRUG_USE_DOSE_UNIT")
    private String drugUseDoseUnit;

    /**
     * 药物使用次剂量
     */
    @TableField("DRUG_USE_DOSE")
    private Double drugUseDose;

    /**
     * 药物使用总剂量
     */
    @TableField("DRUG_USE_TOTAL_DOSE")
    private Double drugUseTotalDose;

    /**
     * 用药途径代码
     */
    @TableField("DRUG_USE_ROUTE_CODE")
    private String drugUseRouteCode;

    /**
     * 用药途径名称
     */
    @TableField("DRUG_USE_ROUTE_NAME")
    private String drugUseRouteName;

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
