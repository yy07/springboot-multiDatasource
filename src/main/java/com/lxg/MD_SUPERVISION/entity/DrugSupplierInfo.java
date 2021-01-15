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
 * 2.11.5. 药品供应商信息表
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DRUG_SUPPLIER_INFO")
public class DrugSupplierInfo implements Serializable {

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
     * 厂家代码
     */
    @TableField("MANUFACTURER_CODE")
    private String manufacturerCode;

    /**
     * 修改标志
     */
    @TableField("MODIFY_MARK")
    private String modifyMark;

    /**
     * 厂家名称
     */
    @TableField("MANUFACTURER_NAME")
    private String manufacturerName;

    /**
     * 名称缩写
     */
    @TableField("ABBREVIATION")
    private String abbreviation;

    /**
     * 统一社会信用代码
     */
    @TableField("UNIFIED_SOCIAL_CREDIT_CODE")
    private String unifiedSocialCreditCode;

    /**
     * 开户银行
     */
    @TableField("BANK_ACCOUNT_NAME")
    private String bankAccountName;

    /**
     * 银行账号
     */
    @TableField("BANK_ACCOUNT")
    private String bankAccount;

    /**
     * 地址
     */
    @TableField("ADDRESS")
    private String address;

    /**
     * 邮政编码
     */
    @TableField("POSTAL_CODE")
    private String postalCode;

    /**
     * 联系人
     */
    @TableField("CONTACT")
    private String contact;

    /**
     * 联系电话
     */
    @TableField("CONTACT_NUMBER")
    private String contactNumber;

    /**
     * 邮箱地址
     */
    @TableField("EMAIL_ADDRESS")
    private String emailAddress;

    /**
     * 厂家类型
     */
    @TableField("MANUFACTURER_TYPE")
    private String manufacturerType;

    /**
     * 备注
     */
    @TableField("REMARKS")
    private String remarks;

    /**
     * 填报日期
     */
    @TableField("DATE_OF_FILING")
    private LocalDateTime dateOfFiling;

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
