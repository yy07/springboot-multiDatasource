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
 * 2.11.2. 科室信息表
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DEPT_INFO")
public class DeptInfo implements Serializable {

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
     * 科室代码
     */
    @TableField("DEPT_CODE")
    private String deptCode;

    /**
     * 标准科室代码
     */
    @TableField("STANDARD_DEP_CODE")
    private String standardDepCode;

    /**
     * 科室名称
     */
    @TableField("DEPT_NAME")
    private String deptName;

    /**
     * 科室说明
     */
    @TableField("DEP_DESCRIPTION")
    private String depDescription;

    /**
     * 中医科室标志
     */
    @TableField("CHINESE_MED_DEP_SIN")
    private String chineseMedDepSin;

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
