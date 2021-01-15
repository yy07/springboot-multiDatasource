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
 * 2.11.7. 固定资产分类表
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DICT_EQUI_KIND")
public class DictEquiKind implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;

    /**
     * 机构代码
     */
    @TableField("CLINIC_ORGAN_CODE")
    private String clinicOrganCode;

    /**
     * 机构名称
     */
    @TableField("CLINIC_ORGAN_NAME")
    private String clinicOrganName;

    /**
     * 固定资产分类表序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 固定资产分类编码
     */
    @TableField("EQUI_KIND_COD")
    private String equiKindCod;

    /**
     * 固定资产分类名称
     */
    @TableField("EQUI_KIND_NA")
    private String equiKindNa;

    /**
     * 资产类型
     */
    @TableField("EQUI_KIND_TYPE")
    private String equiKindType;

    /**
     * 级次
     */
    @TableField("KIND_LEVE")
    private String kindLeve;

    /**
     * 是否末级
     */
    @TableField("IS_LAST")
    private String isLast;

    /**
     * 是否停用
     */
    @TableField("IS_STOP")
    private String isStop;

    /**
     * 停用日期
     */
    @TableField("END_DATE")
    private LocalDateTime endDate;

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
