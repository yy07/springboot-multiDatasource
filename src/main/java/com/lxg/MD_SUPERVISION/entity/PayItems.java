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
 * 2.11.3. 收费项目目录表
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("PAY_ITEMS")
public class PayItems implements Serializable {

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
     * 医疗服务项目编码
     */
    @TableField("CHARGE_DETAIL_CODE")
    private String chargeDetailCode;

    /**
     * 贵州省收费目录代码
     */
    @TableField("GZ_PAY_ITEMS_CODE")
    private String gzPayItemsCode;

    /**
     * 贵州省医疗服务价格项目名称
     */
    @TableField("GZ_PAY_ITEMS_NAME")
    private String gzPayItemsName;

    /**
     * 统计年度
     */
    @TableField("ACCT_YEAR")
    private String acctYear;

    /**
     * 统计月份
     */
    @TableField("ACCT_MONTH")
    private String acctMonth;

    /**
     * 医疗服务制定依据
     */
    @TableField("MEDICAL_SERVICE_BASIS")
    private String medicalServiceBasis;

    /**
     * 医疗服务制定依据名称
     */
    @TableField("MEDICAL_SERVICE_BASIS_NAME")
    private String medicalServiceBasisName;

    /**
     * 院内服务项目编码
     */
    @TableField("INHOSPITAL_SERVICE_PRO_CODE")
    private String inhospitalServiceProCode;

    /**
     * 院内服务项目名称
     */
    @TableField("INHOSPITAL_SERVICE_PRO_NAME")
    private String inhospitalServiceProName;

    /**
     * 是否院内或地方新增项目
     */
    @TableField("NEW_PROJECT_IN_HOSP_OR_LOCAL")
    private String newProjectInHospOrLocal;

    /**
     * 项目内涵
     */
    @TableField("PROJECT_CONNOTATION")
    private String projectConnotation;

    /**
     * 除外内容
     */
    @TableField("EXCLUSION_CONTENT")
    private String exclusionContent;

    /**
     * 计价单位
     */
    @TableField("SALES_UNIT")
    private String salesUnit;

    /**
     * 项目规格
     */
    @TableField("PAY_ITEMS_SPEC")
    private String payItemsSpec;

    /**
     * 项目价格
     */
    @TableField("PAY_ITEMS_PRICE")
    private Double payItemsPrice;

    /**
     * 服务总数量
     */
    @TableField("TOTAL_NUM_SERVICES")
    private Double totalNumServices;

    /**
     * 计价说明
     */
    @TableField("PRICING_STATEMENT")
    private String pricingStatement;

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
