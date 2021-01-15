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
 * 2.8.4. 药品采购信息明细
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DRUG_PUR_DETAIL")
public class DrugPurDetail implements Serializable {

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
     * 采购明细序号
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 采购单号
     */
    @TableField("PURCHASING_NO")
    private String purchasingNo;

    /**
     * 批次号
     */
    @TableField("BATCH_NUM")
    private String batchNum;

    /**
     * 商品品种码
     */
    @TableField("GOODS")
    private String goods;

    /**
     * 商品采购码
     */
    @TableField("GOODSNO")
    private String goodsno;

    /**
     * 医保编码
     */
    @TableField("INSUR_CODE")
    private String insurCode;

    /**
     * 药品编码
     */
    @TableField("DRUG_CODE")
    private String drugCode;

    /**
     * 药品采购码
     */
    @TableField("DRUG_PROCUREMENT_CODE")
    private String drugProcurementCode;

    /**
     * 商品名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 通用名
     */
    @TableField("GNAME")
    private String gname;

    /**
     * 商品名
     */
    @TableField("DRUGNAME")
    private String drugname;

    /**
     * 商品分类
     */
    @TableField("ISDRUGNAME")
    private String isdrugname;

    /**
     * 药品类型
     */
    @TableField("BIGTYPENAME")
    private String bigtypename;

    /**
     * 规格
     */
    @TableField("EQUI_DESC")
    private String equiDesc;

    /**
     * 生产厂家
     */
    @TableField("PRODUCER")
    private String producer;

    /**
     * 包装单位
     */
    @TableField("MSUNITNO")
    private String msunitno;

    /**
     * 包装层次
     */
    @TableField("PACKLEVELNAME")
    private String packlevelname;

    /**
     * 包装数量
     */
    @TableField("PACKNUM")
    private Double packnum;

    /**
     * 产地
     */
    @TableField("DELIVERY_LOCATION")
    private String deliveryLocation;

    /**
     * 注册证号
     */
    @TableField("REGISTER")
    private String register;

    /**
     * 批准文号
     */
    @TableField("RATIFIER")
    private String ratifier;

    /**
     * GMP证号
     */
    @TableField("GMPNO")
    private String gmpno;

    /**
     * 国产进口标志
     */
    @TableField("IMPORTNAME")
    private String importname;

    /**
     * 是否中标
     */
    @TableField("ISBID")
    private String isbid;

    /**
     * 效期天数
     */
    @TableField("ENDDAY")
    private Double endday;

    /**
     * 是否停用
     */
    @TableField("IS_STOP")
    private String isStop;

    /**
     * 税率
     */
    @TableField("OUTRATE")
    private Double outrate;

    /**
     * 药品供应商代码
     */
    @TableField("SUPPLIER_CODE")
    private String supplierCode;

    /**
     * 药品供应商名称
     */
    @TableField("SUPPLIER_NAME")
    private String supplierName;

    /**
     * 上次采购价
     */
    @TableField("LAST_PRICE")
    private Double lastPrice;

    /**
     * 默认招标价
     */
    @TableField("BIDDING_PRICE")
    private Double biddingPrice;

    /**
     * 采购价
     */
    @TableField("PURCHASING_PRC")
    private Double purchasingPrc;

    /**
     * 采购数量
     */
    @TableField("PURCHASING_QTY")
    private Double purchasingQty;

    /**
     * 采购金额
     */
    @TableField("PURCHASING_AMOUNT")
    private Double purchasingAmount;

    /**
     * 配送数量
     */
    @TableField("ARQTY")
    private Double arqty;

    /**
     * 是否取消药品加成
     */
    @TableField("CANCEL_DRUG_BONUS")
    private String cancelDrugBonus;

    /**
     * 取消药品加成日期
     */
    @TableField("CANCEL_DRUG_ADD_ON_DATE")
    private LocalDateTime cancelDrugAddOnDate;

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
