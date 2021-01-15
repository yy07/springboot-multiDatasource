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
 * 2.3.8. 中医病案首页
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("INPATIENT_TCM_RECORD")
public class InpatientTcmRecord implements Serializable {

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
     * 患者本地唯一ID
     */
    @TableField("PATIENT_LOCAL_ID")
    private String patientLocalId;

    /**
     * 中医住院病案首页ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 住院号
     */
    @TableField("INPATIENT_NO")
    private String inpatientNo;

    /**
     * 就诊科室代码
     */
    @TableField("CLINIC_DEPT_CODE")
    private String clinicDeptCode;

    /**
     * 就诊科室名称
     */
    @TableField("CLINIC_DEPT_NAME")
    private String clinicDeptName;

    /**
     * 组织机构代码
     */
    @TableField("ZZJGDM")
    private String zzjgdm;

    /**
     * 对应的系统登录用户名
     */
    @TableField("USERNAME")
    private String username;

    /**
     * 医疗付款方式
     */
    @TableField("YLFKFS")
    private String ylfkfs;

    /**
     * 健康卡号
     */
    @TableField("JKKH")
    private String jkkh;

    /**
     * 住院次数
     */
    @TableField("ZYCS")
    private Integer zycs;

    /**
     * 病案号
     */
    @TableField("BAH")
    private String bah;

    /**
     * 姓名
     */
    @TableField("XM")
    private String xm;

    /**
     * 性别
     */
    @TableField("XB")
    private String xb;

    /**
     * 出生日期
     */
    @TableField("CSRQ")
    private LocalDateTime csrq;

    /**
     * 年龄（岁）
     */
    @TableField("NL")
    private Integer nl;

    /**
     * 国籍
     */
    @TableField("GJ")
    private String gj;

    /**
     * 年龄不足1周岁的年龄（天）
     */
    @TableField("BZYZS_NL")
    private Integer bzyzsNl;

    /**
     * 新生儿出生体重(克)
     */
    @TableField("XSETZ")
    private Integer xsetz;

    /**
     * 新生儿出生体重(克)2
     */
    @TableField("XSETZ2")
    private Integer xsetz2;

    /**
     * 新生儿出生体重(克)3
     */
    @TableField("XSETZ3")
    private Integer xsetz3;

    /**
     * 新生儿出生体重(克)4
     */
    @TableField("XSETZ4")
    private Integer xsetz4;

    /**
     * 新生儿出生体重(克)5
     */
    @TableField("XSETZ5")
    private Integer xsetz5;

    /**
     * 新生儿入院体重（克）
     */
    @TableField("XSERYTZ")
    private Integer xserytz;

    /**
     * 出生地
     */
    @TableField("CSD")
    private String csd;

    /**
     * 籍贯
     */
    @TableField("GG")
    private String gg;

    /**
     * 民族
     */
    @TableField("MZ")
    private String mz;

    /**
     * 身份证号
     */
    @TableField("SFZH")
    private String sfzh;

    /**
     * 职业
     */
    @TableField("ZY")
    private String zy;

    /**
     * 婚姻
     */
    @TableField("HY")
    private String hy;

    /**
     * 现住址
     */
    @TableField("XZZ")
    private String xzz;

    /**
     * 现住址电话
     */
    @TableField("DH")
    private String dh;

    /**
     * 现住址邮政编码
     */
    @TableField("YB1")
    private String yb1;

    /**
     * 户口地址
     */
    @TableField("HKDZ")
    private String hkdz;

    /**
     * 户口地址邮政编码
     */
    @TableField("YB2")
    private String yb2;

    /**
     * 工作单位及地址
     */
    @TableField("GZDWJDZ")
    private String gzdwjdz;

    /**
     * 工作单位电话
     */
    @TableField("DWDH")
    private String dwdh;

    /**
     * 工作单位邮政编码
     */
    @TableField("YB3")
    private String yb3;

    /**
     * 联系人姓名
     */
    @TableField("LXRXM")
    private String lxrxm;

    /**
     * 联系人关系
     */
    @TableField("GX")
    private String gx;

    /**
     * 联系人地址
     */
    @TableField("DZ")
    private String dz;

    /**
     * 电话
     */
    @TableField("DH1")
    private String dh1;

    /**
     * 入院途径
     */
    @TableField("RYTJ")
    private String rytj;

    /**
     * 治疗类别
     */
    @TableField("ZLLB")
    private String zllb;

    /**
     * 入院时间
     */
    @TableField("RYSJ")
    private LocalDateTime rysj;

    /**
     * 时
     */
    @TableField("RYSJ_S")
    private String rysjS;

    /**
     * 入院科别
     */
    @TableField("RYKB")
    private String rykb;

    /**
     * 入院病房
     */
    @TableField("RYBF")
    private String rybf;

    /**
     * 转科科别
     */
    @TableField("ZKKB")
    private String zkkb;

    /**
     * 出院时间
     */
    @TableField("CYSJ")
    private LocalDateTime cysj;

    /**
     * 时
     */
    @TableField("CYSJ_S")
    private String cysjS;

    /**
     * 出院科别
     */
    @TableField("CYKB")
    private String cykb;

    /**
     * 出院病房
     */
    @TableField("CYBF")
    private String cybf;

    /**
     * 实际住院(天)
     */
    @TableField("SJZY")
    private Integer sjzy;

    /**
     * 门(急)诊诊断(中医诊断)
     */
    @TableField("MZD_ZYZD")
    private String mzdZyzd;

    /**
     * 门(急)诊诊断疾病代码(中医诊断)
     */
    @TableField("JBDM")
    private String jbdm;

    /**
     * 门（急）诊诊断名称(西医诊断)
     */
    @TableField("MZZD_XYZD")
    private String mzzdXyzd;

    /**
     * 门（急）诊诊断编码(西医诊断)
     */
    @TableField("JBBM")
    private String jbbm;

    /**
     * 实施临床路径
     */
    @TableField("SSLCLJ")
    private String sslclj;

    /**
     * 使用医疗机构中药制剂
     */
    @TableField("ZYYJ")
    private String zyyj;

    /**
     * 使用中医诊疗设备
     */
    @TableField("ZYZLSB")
    private String zyzlsb;

    /**
     * 使用中医诊疗技术
     */
    @TableField("ZYZLJS")
    private String zyzljs;

    /**
     * 辩证施护
     */
    @TableField("BZSH")
    private String bzsh;

    /**
     * 主病出院中医诊断
     */
    @TableField("ZB")
    private String zb;

    /**
     * 主病疾病编码
     */
    @TableField("ZB_JBBM")
    private String zbJbbm;

    /**
     * 主病入院病情
     */
    @TableField("ZB_RYBQ")
    private String zbRybq;

    /**
     * 出院主要诊断名称(西医)
     */
    @TableField("ZYZD")
    private String zyzd;

    /**
     * 出院主要诊断编码(西医)
     */
    @TableField("ZYZD_JBBM")
    private String zyzdJbbm;

    /**
     * 出院主要诊断入院病情(西医)
     */
    @TableField("XY_RYBQ")
    private String xyRybq;

    /**
     * 主证出院中医诊断1
     */
    @TableField("ZZ1")
    private String zz1;

    /**
     * 主证疾病编码1
     */
    @TableField("ZZ_JBBM1")
    private String zzJbbm1;

    /**
     * 主证住入院病情1
     */
    @TableField("ZZ_RYBQ1")
    private String zzRybq1;

    /**
     * 主证出院中医诊断2
     */
    @TableField("ZZ2")
    private String zz2;

    /**
     * 主证疾病编码2
     */
    @TableField("ZZ_JBBM2")
    private String zzJbbm2;

    /**
     * 主证住入院病情2
     */
    @TableField("ZZ_RYBQ2")
    private String zzRybq2;

    /**
     * 主证出院中医诊断3
     */
    @TableField("ZZ3")
    private String zz3;

    /**
     * 主证疾病编码3
     */
    @TableField("ZZ_JBBM3")
    private String zzJbbm3;

    /**
     * 主证住入院病情3
     */
    @TableField("ZZ_RYBQ3")
    private String zzRybq3;

    /**
     * 主证出院中医诊断4
     */
    @TableField("ZZ4")
    private String zz4;

    /**
     * 主证疾病编码4
     */
    @TableField("ZZ_JBBM4")
    private String zzJbbm4;

    /**
     * 主证住入院病情4
     */
    @TableField("ZZ_RYBQ4")
    private String zzRybq4;

    /**
     * 主证出院中医诊断5
     */
    @TableField("ZZ5")
    private String zz5;

    /**
     * 主证疾病编码5
     */
    @TableField("ZZ_JBBM5")
    private String zzJbbm5;

    /**
     * 主证住入院病情5
     */
    @TableField("ZZ_RYBQ5")
    private String zzRybq5;

    /**
     * 主证出院中医诊断6
     */
    @TableField("ZZ6")
    private String zz6;

    /**
     * 主证疾病编码6
     */
    @TableField("ZZ_JBBM6")
    private String zzJbbm6;

    /**
     * 主证住入院病情6
     */
    @TableField("ZZ_RYBQ6")
    private String zzRybq6;

    /**
     * 主证出院中医诊断7
     */
    @TableField("ZZ7")
    private String zz7;

    /**
     * 主证疾病编码7
     */
    @TableField("ZZ_JBBM7")
    private String zzJbbm7;

    /**
     * 主证住入院病情7
     */
    @TableField("ZZ_RYBQ7")
    private String zzRybq7;

    /**
     * 出院其他诊断名称(西医)1
     */
    @TableField("QTZD1")
    private String qtzd1;

    /**
     * 出院其他诊断编码(西医)1
     */
    @TableField("ZYZD_JBBM1")
    private String zyzdJbbm1;

    /**
     * 出院其他诊断入院病情(西医)1
     */
    @TableField("RYBQ1")
    private String rybq1;

    /**
     * 出院其他诊断名称(西医)2
     */
    @TableField("QTZD2")
    private String qtzd2;

    /**
     * 出院其他诊断编码(西医)2
     */
    @TableField("ZYZD_JBBM2")
    private String zyzdJbbm2;

    /**
     * 出院其他诊断入院病情(西医)2
     */
    @TableField("RYBQ2")
    private String rybq2;

    /**
     * 出院其他诊断名称(西医)3
     */
    @TableField("QTZD3")
    private String qtzd3;

    /**
     * 出院其他诊断编码(西医)3
     */
    @TableField("ZYZD_JBBM3")
    private String zyzdJbbm3;

    /**
     * 出院其他诊断入院病情(西医)3
     */
    @TableField("RYBQ3")
    private String rybq3;

    /**
     * 出院其他诊断名称(西医)4
     */
    @TableField("QTZD4")
    private String qtzd4;

    /**
     * 出院其他诊断编码(西医)4
     */
    @TableField("ZYZD_JBBM4")
    private String zyzdJbbm4;

    /**
     * 出院其他诊断入院病情(西医)4
     */
    @TableField("RYBQ4")
    private String rybq4;

    /**
     * 出院其他诊断名称(西医)5
     */
    @TableField("QTZD5")
    private String qtzd5;

    /**
     * 出院其他诊断编码(西医)5
     */
    @TableField("ZYZD_JBBM5")
    private String zyzdJbbm5;

    /**
     * 出院其他诊断入院病情(西医)5
     */
    @TableField("RYBQ5")
    private String rybq5;

    /**
     * 出院其他诊断名称(西医)6
     */
    @TableField("QTZD6")
    private String qtzd6;

    /**
     * 出院其他诊断编码(西医)6
     */
    @TableField("ZYZD_JBBM6")
    private String zyzdJbbm6;

    /**
     * 出院其他诊断入院病情(西医)6
     */
    @TableField("RYBQ6")
    private String rybq6;

    /**
     * 出院其他诊断名称(西医)7
     */
    @TableField("QTZD7")
    private String qtzd7;

    /**
     * 出院其他诊断编码(西医)7
     */
    @TableField("ZYZD_JBBM7")
    private String zyzdJbbm7;

    /**
     * 出院其他诊断入院病情(西医)7
     */
    @TableField("RYBQ7")
    private String rybq7;

    /**
     * 出院其他诊断名称(西医)8
     */
    @TableField("QTZD8")
    private String qtzd8;

    /**
     * 出院其他诊断编码(西医)8
     */
    @TableField("ZYZD_JBBM8")
    private String zyzdJbbm8;

    /**
     * 出院其他诊断入院病情(西医)8
     */
    @TableField("RYBQ8")
    private String rybq8;

    /**
     * 出院其他诊断名称(西医)9
     */
    @TableField("QTZD9")
    private String qtzd9;

    /**
     * 出院其他诊断编码(西医)9
     */
    @TableField("ZYZD_JBBM9")
    private String zyzdJbbm9;

    /**
     * 出院其他诊断入院病情(西医)9
     */
    @TableField("RYBQ9")
    private String rybq9;

    /**
     * 出院其他诊断名称(西医)10
     */
    @TableField("QTZD10")
    private String qtzd10;

    /**
     * 出院其他诊断编码(西医)10
     */
    @TableField("ZYZD_JBBM10")
    private String zyzdJbbm10;

    /**
     * 出院其他诊断入院病情(西医)10
     */
    @TableField("RYBQ10")
    private String rybq10;

    /**
     * 出院其他诊断名称(西医)11
     */
    @TableField("QTZD11")
    private String qtzd11;

    /**
     * 出院其他诊断编码(西医)11
     */
    @TableField("ZYZD_JBBM11")
    private String zyzdJbbm11;

    /**
     * 出院其他诊断入院病情(西医)11
     */
    @TableField("RYBQ11")
    private String rybq11;

    /**
     * 出院其他诊断名称(西医)12
     */
    @TableField("QTZD12")
    private String qtzd12;

    /**
     * 出院其他诊断编码(西医)12
     */
    @TableField("ZYZD_JBBM12")
    private String zyzdJbbm12;

    /**
     * 出院其他诊断入院病情(西医)12
     */
    @TableField("RYBQ12")
    private String rybq12;

    /**
     * 出院其他诊断名称(西医)13
     */
    @TableField("QTZD13")
    private String qtzd13;

    /**
     * 出院其他诊断编码(西医)13
     */
    @TableField("ZYZD_JBBM13")
    private String zyzdJbbm13;

    /**
     * 出院其他诊断入院病情(西医)13
     */
    @TableField("RYBQ13")
    private String rybq13;

    /**
     * 出院其他诊断名称(西医)14
     */
    @TableField("QTZD14")
    private String qtzd14;

    /**
     * 出院其他诊断编码(西医)14
     */
    @TableField("ZYZD_JBBM14")
    private String zyzdJbbm14;

    /**
     * 出院其他诊断入院病情(西医)14
     */
    @TableField("RYBQ14")
    private String rybq14;

    /**
     * 出院其他诊断名称(西医)15
     */
    @TableField("QTZD15")
    private String qtzd15;

    /**
     * 出院其他诊断编码(西医)15
     */
    @TableField("ZYZD_JBBM15")
    private String zyzdJbbm15;

    /**
     * 出院其他诊断入院病情(西医)15
     */
    @TableField("RYBQ15")
    private String rybq15;

    /**
     * 出院其他诊断名称(西医)16
     */
    @TableField("QTZD16")
    private String qtzd16;

    /**
     * 出院其他诊断编码(西医)16
     */
    @TableField("ZYZD_JBBM16")
    private String zyzdJbbm16;

    /**
     * 出院其他诊断入院病情(西医)16
     */
    @TableField("RYBQ16")
    private String rybq16;

    /**
     * 出院其他诊断名称(西医)17
     */
    @TableField("QTZD17")
    private String qtzd17;

    /**
     * 出院其他诊断编码(西医)17
     */
    @TableField("ZYZD_JBBM17")
    private String zyzdJbbm17;

    /**
     * 出院其他诊断入院病情(西医)17
     */
    @TableField("RYBQ17")
    private String rybq17;

    /**
     * 出院其他诊断名称(西医)18
     */
    @TableField("QTZD18")
    private String qtzd18;

    /**
     * 出院其他诊断编码(西医)18
     */
    @TableField("ZYZD_JBBM18")
    private String zyzdJbbm18;

    /**
     * 出院其他诊断入院病情(西医)18
     */
    @TableField("RYBQ18")
    private String rybq18;

    /**
     * 出院其他诊断名称(西医)19
     */
    @TableField("QTZD19")
    private String qtzd19;

    /**
     * 出院其他诊断编码(西医)19
     */
    @TableField("ZYZD_JBBM19")
    private String zyzdJbbm19;

    /**
     * 出院其他诊断入院病情(西医)19
     */
    @TableField("RYBQ19")
    private String rybq19;

    /**
     * 出院其他诊断名称(西医)20
     */
    @TableField("QTZD20")
    private String qtzd20;

    /**
     * 出院其他诊断编码(西医)20
     */
    @TableField("ZYZD_JBBM20")
    private String zyzdJbbm20;

    /**
     * 出院其他诊断入院病情(西医)20
     */
    @TableField("RYBQ20")
    private String rybq20;

    /**
     * 出院其他诊断名称(西医)21
     */
    @TableField("QTZD21")
    private String qtzd21;

    /**
     * 出院其他诊断编码(西医)21
     */
    @TableField("ZYZD_JBBM21")
    private String zyzdJbbm21;

    /**
     * 出院其他诊断入院病情(西医)21
     */
    @TableField("RYBQ21")
    private String rybq21;

    /**
     * 出院其他诊断名称(西医)22
     */
    @TableField("QTZD22")
    private String qtzd22;

    /**
     * 出院其他诊断编码(西医)22
     */
    @TableField("ZYZD_JBBM22")
    private String zyzdJbbm22;

    /**
     * 出院其他诊断入院病情(西医)22
     */
    @TableField("RYBQ22")
    private String rybq22;

    /**
     * 出院其他诊断名称(西医)23
     */
    @TableField("QTZD23")
    private String qtzd23;

    /**
     * 出院其他诊断编码(西医)23
     */
    @TableField("ZYZD_JBBM23")
    private String zyzdJbbm23;

    /**
     * 出院其他诊断入院病情(西医)23
     */
    @TableField("RYBQ23")
    private String rybq23;

    /**
     * 出院其他诊断名称(西医)24
     */
    @TableField("QTZD24")
    private String qtzd24;

    /**
     * 出院其他诊断编码(西医)24
     */
    @TableField("ZYZD_JBBM24")
    private String zyzdJbbm24;

    /**
     * 出院其他诊断入院病情(西医)24
     */
    @TableField("RYBQ24")
    private String rybq24;

    /**
     * 出院其他诊断名称(西医)25
     */
    @TableField("QTZD25")
    private String qtzd25;

    /**
     * 出院其他诊断编码(西医)25
     */
    @TableField("ZYZD_JBBM25")
    private String zyzdJbbm25;

    /**
     * 出院其他诊断入院病情(西医)25
     */
    @TableField("RYBQ25")
    private String rybq25;

    /**
     * 出院其他诊断名称(西医)26
     */
    @TableField("QTZD26")
    private String qtzd26;

    /**
     * 出院其他诊断编码(西医)26
     */
    @TableField("ZYZD_JBBM26")
    private String zyzdJbbm26;

    /**
     * 出院其他诊断入院病情(西医)26
     */
    @TableField("RYBQ26")
    private String rybq26;

    /**
     * 出院其他诊断名称(西医)27
     */
    @TableField("QTZD27")
    private String qtzd27;

    /**
     * 出院其他诊断编码(西医)27
     */
    @TableField("ZYZD_JBBM27")
    private String zyzdJbbm27;

    /**
     * 出院其他诊断入院病情(西医)27
     */
    @TableField("RYBQ27")
    private String rybq27;

    /**
     * 出院其他诊断名称(西医)28
     */
    @TableField("QTZD28")
    private String qtzd28;

    /**
     * 出院其他诊断编码(西医)28
     */
    @TableField("ZYZD_JBBM28")
    private String zyzdJbbm28;

    /**
     * 出院其他诊断入院病情(西医)28
     */
    @TableField("RYBQ28")
    private String rybq28;

    /**
     * 出院其他诊断名称(西医)29
     */
    @TableField("QTZD29")
    private String qtzd29;

    /**
     * 出院其他诊断编码(西医)29
     */
    @TableField("ZYZD_JBBM29")
    private String zyzdJbbm29;

    /**
     * 出院其他诊断入院病情(西医)29
     */
    @TableField("RYBQ29")
    private String rybq29;

    /**
     * 出院其他诊断名称(西医)30
     */
    @TableField("QTZD30")
    private String qtzd30;

    /**
     * 出院其他诊断编码(西医)30
     */
    @TableField("ZYZD_JBBM30")
    private String zyzdJbbm30;

    /**
     * 出院其他诊断入院病情(西医)30
     */
    @TableField("RYBQ30")
    private String rybq30;

    /**
     * 出院其他诊断名称(西医)31
     */
    @TableField("QTZD31")
    private String qtzd31;

    /**
     * 出院其他诊断编码(西医)31
     */
    @TableField("ZYZD_JBBM31")
    private String zyzdJbbm31;

    /**
     * 出院其他诊断入院病情(西医)31
     */
    @TableField("RYBQ31")
    private String rybq31;

    /**
     * 出院其他诊断名称(西医)32
     */
    @TableField("QTZD32")
    private String qtzd32;

    /**
     * 出院其他诊断编码(西医)32
     */
    @TableField("ZYZD_JBBM32")
    private String zyzdJbbm32;

    /**
     * 出院其他诊断入院病情(西医)32
     */
    @TableField("RYBQ32")
    private String rybq32;

    /**
     * 出院其他诊断名称(西医)33
     */
    @TableField("QTZD33")
    private String qtzd33;

    /**
     * 出院其他诊断编码(西医)33
     */
    @TableField("ZYZD_JBBM33")
    private String zyzdJbbm33;

    /**
     * 出院其他诊断入院病情(西医)33
     */
    @TableField("RYBQ33")
    private String rybq33;

    /**
     * 出院其他诊断名称(西医)34
     */
    @TableField("QTZD34")
    private String qtzd34;

    /**
     * 出院其他诊断编码(西医)34
     */
    @TableField("ZYZD_JBBM34")
    private String zyzdJbbm34;

    /**
     * 出院其他诊断入院病情(西医)34
     */
    @TableField("RYBQ34")
    private String rybq34;

    /**
     * 出院其他诊断名称(西医)35
     */
    @TableField("QTZD35")
    private String qtzd35;

    /**
     * 出院其他诊断编码(西医)35
     */
    @TableField("ZYZD_JBBM35")
    private String zyzdJbbm35;

    /**
     * 出院其他诊断入院病情(西医)35
     */
    @TableField("RYBQ35")
    private String rybq35;

    /**
     * 出院其他诊断名称(西医)36
     */
    @TableField("QTZD36")
    private String qtzd36;

    /**
     * 出院其他诊断编码(西医)36
     */
    @TableField("ZYZD_JBBM36")
    private String zyzdJbbm36;

    /**
     * 出院其他诊断入院病情(西医)36
     */
    @TableField("RYBQ36")
    private String rybq36;

    /**
     * 出院其他诊断名称(西医)37
     */
    @TableField("QTZD37")
    private String qtzd37;

    /**
     * 出院其他诊断编码(西医)37
     */
    @TableField("ZYZD_JBBM37")
    private String zyzdJbbm37;

    /**
     * 出院其他诊断入院病情(西医)37
     */
    @TableField("RYBQ37")
    private String rybq37;

    /**
     * 出院其他诊断名称(西医)38
     */
    @TableField("QTZD38")
    private String qtzd38;

    /**
     * 出院其他诊断编码(西医)38
     */
    @TableField("ZYZD_JBBM38")
    private String zyzdJbbm38;

    /**
     * 出院其他诊断入院病情(西医)38
     */
    @TableField("RYBQ38")
    private String rybq38;

    /**
     * 出院其他诊断名称(西医)39
     */
    @TableField("QTZD39")
    private String qtzd39;

    /**
     * 出院其他诊断编码(西医)39
     */
    @TableField("ZYZD_JBBM39")
    private String zyzdJbbm39;

    /**
     * 出院其他诊断入院病情(西医)39
     */
    @TableField("RYBQ39")
    private String rybq39;

    /**
     * 出院其他诊断名称(西医)40
     */
    @TableField("QTZD40")
    private String qtzd40;

    /**
     * 出院其他诊断编码(西医)40
     */
    @TableField("ZYZD_JBBM40")
    private String zyzdJbbm40;

    /**
     * 出院其他诊断入院病情(西医)40
     */
    @TableField("RYBQ40")
    private String rybq40;

    /**
     * 损伤、中毒外部原因名称
     */
    @TableField("WBYY")
    private String wbyy;

    /**
     * 损伤、中毒外部原因编码
     */
    @TableField("JBBM1")
    private String jbbm1;

    /**
     * 病理诊断名称
     */
    @TableField("BLZD")
    private String blzd;

    /**
     * 病理诊断编码
     */
    @TableField("JBBM2")
    private String jbbm2;

    /**
     * 病理号
     */
    @TableField("BLH")
    private String blh;

    /**
     * 有无药物过敏
     */
    @TableField("YWGM")
    private String ywgm;

    /**
     * 过敏药物名称
     */
    @TableField("GMYW")
    private String gmyw;

    /**
     * 死亡患者尸检
     */
    @TableField("SJ")
    private String sj;

    /**
     * ABO血型
     */
    @TableField("XX")
    private String xx;

    /**
     * Rh血型
     */
    @TableField("RH")
    private String rh;

    /**
     * 科主任
     */
    @TableField("KZR")
    private String kzr;

    /**
     * 主任（副主任）医师
     */
    @TableField("ZRYS")
    private String zrys;

    /**
     * 主治医师
     */
    @TableField("ZZYS")
    private String zzys;

    /**
     * 住院医师
     */
    @TableField("ZYYS")
    private String zyys;

    /**
     * 责任护士
     */
    @TableField("ZRHS")
    private String zrhs;

    /**
     * 进修医师
     */
    @TableField("JXYS")
    private String jxys;

    /**
     * 实习医师
     */
    @TableField("SXYS")
    private String sxys;

    /**
     * 编码员
     */
    @TableField("BMY")
    private String bmy;

    /**
     * 病案质量
     */
    @TableField("BAZL")
    private String bazl;

    /**
     * 质控医师
     */
    @TableField("ZKYS")
    private String zkys;

    /**
     * 质控护士
     */
    @TableField("ZKHS")
    private String zkhs;

    /**
     * 质控日期
     */
    @TableField("ZKRQ")
    private LocalDateTime zkrq;

    /**
     * 主要手术操作编码
     */
    @TableField("SSJCZBM1")
    private String ssjczbm1;

    /**
     * 主要手术操作名称
     */
    @TableField("SSJCZMC1")
    private String ssjczmc1;

    /**
     * 主要手术操作日期
     */
    @TableField("SSJCZRQ1")
    private LocalDateTime ssjczrq1;

    /**
     * 主要手术操作级别
     */
    @TableField("SHJB1")
    private String shjb1;

    /**
     * 主要手术操作术者
     */
    @TableField("SZ1")
    private String sz1;

    /**
     * 主要手术操作Ⅰ助
     */
    @TableField("YZ1")
    private String yz1;

    /**
     * 主要手术操作Ⅱ助
     */
    @TableField("EZ1")
    private String ez1;

    /**
     * 主要手术操作切口愈合等级
     */
    @TableField("QKDJ1")
    private String qkdj1;

    /**
     * 主要手术操作切口愈合类别
     */
    @TableField("QKYLB1")
    private String qkylb1;

    /**
     * 主要手术操作麻醉方式
     */
    @TableField("MZFS1")
    private String mzfs1;

    /**
     * 主要手术操作麻醉医师
     */
    @TableField("MZYS1")
    private String mzys1;

    /**
     * 其他手术操作编码1
     */
    @TableField("SSJCZBM2")
    private String ssjczbm2;

    /**
     * 其他手术操作名称1
     */
    @TableField("SSJCZMC2")
    private String ssjczmc2;

    /**
     * 其他手术操作日期1
     */
    @TableField("SSJCZRQ2")
    private LocalDateTime ssjczrq2;

    /**
     * 其他手术操作级别1
     */
    @TableField("SHJB2")
    private String shjb2;

    /**
     * 其他手术操作术者1
     */
    @TableField("SZ2")
    private String sz2;

    /**
     * 其他手术操作Ⅰ助1
     */
    @TableField("YZ2")
    private String yz2;

    /**
     * 其他手术操作Ⅱ助1
     */
    @TableField("EZ2")
    private String ez2;

    /**
     * 其他手术操作切口愈合等级1
     */
    @TableField("QKDJ2")
    private String qkdj2;

    /**
     * 切口愈合类别1
     */
    @TableField("QKYLB2")
    private String qkylb2;

    /**
     * 其他手术操作麻醉方式1
     */
    @TableField("MZFS2")
    private String mzfs2;

    /**
     * 其他手术操作麻醉医师1
     */
    @TableField("MZYS2")
    private String mzys2;

    /**
     * 其他手术操作编码2
     */
    @TableField("SSJCZBM3")
    private String ssjczbm3;

    /**
     * 其他手术操作名称2
     */
    @TableField("SSJCZMC3")
    private String ssjczmc3;

    /**
     * 其他手术操作日期2
     */
    @TableField("SSJCZRQ3")
    private LocalDateTime ssjczrq3;

    /**
     * 其他手术操作级别2
     */
    @TableField("SHJB3")
    private String shjb3;

    /**
     * 其他手术操作术者2
     */
    @TableField("SZ3")
    private String sz3;

    /**
     * 其他手术操作Ⅰ助2
     */
    @TableField("YZ3")
    private String yz3;

    /**
     * 其他手术操作Ⅱ助2
     */
    @TableField("EZ3")
    private String ez3;

    /**
     * 其他手术操作切口愈合等级2
     */
    @TableField("QKDJ3")
    private String qkdj3;

    /**
     * 切口愈合类别2
     */
    @TableField("QKYLB3")
    private String qkylb3;

    /**
     * 其他手术操作麻醉方式2
     */
    @TableField("MZFS3")
    private String mzfs3;

    /**
     * 其他手术操作麻醉医师2
     */
    @TableField("MZYS3")
    private String mzys3;

    /**
     * 其他手术操作编码3
     */
    @TableField("SSJCZBM4")
    private String ssjczbm4;

    /**
     * 其他手术操作名称3
     */
    @TableField("SSJCZMC4")
    private String ssjczmc4;

    /**
     * 其他手术操作日期3
     */
    @TableField("SSJCZRQ4")
    private LocalDateTime ssjczrq4;

    /**
     * 其他手术操作级别3
     */
    @TableField("SHJB4")
    private String shjb4;

    /**
     * 其他手术操作术者3
     */
    @TableField("SZ4")
    private String sz4;

    /**
     * 其他手术操作Ⅰ助3
     */
    @TableField("YZ4")
    private String yz4;

    /**
     * 其他手术操作Ⅱ助3
     */
    @TableField("EZ4")
    private String ez4;

    /**
     * 其他手术操作切口愈合等级3
     */
    @TableField("QKDJ4")
    private String qkdj4;

    /**
     * 切口愈合类别3
     */
    @TableField("QKYLB4")
    private String qkylb4;

    /**
     * 其他手术操作麻醉方式3
     */
    @TableField("MZFS4")
    private String mzfs4;

    /**
     * 其他手术操作麻醉医师3
     */
    @TableField("MZYS4")
    private String mzys4;

    /**
     * 其他手术操作编码4
     */
    @TableField("SSJCZBM5")
    private String ssjczbm5;

    /**
     * 其他手术操作名称4
     */
    @TableField("SSJCZMC5")
    private String ssjczmc5;

    /**
     * 其他手术操作日期4
     */
    @TableField("SSJCZRQ5")
    private LocalDateTime ssjczrq5;

    /**
     * 其他手术操作级别4
     */
    @TableField("SHJB5")
    private String shjb5;

    /**
     * 其他手术操作术者4
     */
    @TableField("SZ5")
    private String sz5;

    /**
     * 其他手术操作Ⅰ助4
     */
    @TableField("YZ5")
    private String yz5;

    /**
     * 其他手术操作Ⅱ助4
     */
    @TableField("EZ5")
    private String ez5;

    /**
     * 其他手术操作切口愈合等级4
     */
    @TableField("QKDJ5")
    private String qkdj5;

    /**
     * 切口愈合类别4
     */
    @TableField("QKYLB5")
    private String qkylb5;

    /**
     * 其他手术操作麻醉方式4
     */
    @TableField("MZFS5")
    private String mzfs5;

    /**
     * 其他手术操作麻醉医师4
     */
    @TableField("MZYS5")
    private String mzys5;

    /**
     * 其他手术操作编码5
     */
    @TableField("SSJCZBM6")
    private String ssjczbm6;

    /**
     * 其他手术操作名称5
     */
    @TableField("SSJCZMC6")
    private String ssjczmc6;

    /**
     * 其他手术操作日期5
     */
    @TableField("SSJCZRQ6")
    private LocalDateTime ssjczrq6;

    /**
     * 其他手术操作级别5
     */
    @TableField("SHJB6")
    private String shjb6;

    /**
     * 其他手术操作术者5
     */
    @TableField("SZ6")
    private String sz6;

    /**
     * 其他手术操作Ⅰ助5
     */
    @TableField("YZ6")
    private String yz6;

    /**
     * 其他手术操作Ⅱ助5
     */
    @TableField("EZ6")
    private String ez6;

    /**
     * 其他手术操作切口愈合等级5
     */
    @TableField("QKDJ6")
    private String qkdj6;

    /**
     * 切口愈合类别5
     */
    @TableField("QKYLB6")
    private String qkylb6;

    /**
     * 其他手术操作麻醉方式5
     */
    @TableField("MZFS6")
    private String mzfs6;

    /**
     * 其他手术操作麻醉医师5
     */
    @TableField("MZYS6")
    private String mzys6;

    /**
     * 其他手术操作编码6
     */
    @TableField("SSJCZBM7")
    private String ssjczbm7;

    /**
     * 其他手术操作名称6
     */
    @TableField("SSJCZMC7")
    private String ssjczmc7;

    /**
     * 其他手术操作日期6
     */
    @TableField("SSJCZRQ7")
    private LocalDateTime ssjczrq7;

    /**
     * 其他手术操作级别6
     */
    @TableField("SHJB7")
    private String shjb7;

    /**
     * 其他手术操作术者6
     */
    @TableField("SZ7")
    private String sz7;

    /**
     * 其他手术操作Ⅰ助6
     */
    @TableField("YZ7")
    private String yz7;

    /**
     * 其他手术操作Ⅱ助6
     */
    @TableField("EZ7")
    private String ez7;

    /**
     * 其他手术操作切口愈合等级6
     */
    @TableField("QKDJ7")
    private String qkdj7;

    /**
     * 切口愈合类别6
     */
    @TableField("QKYLB7")
    private String qkylb7;

    /**
     * 其他手术操作麻醉方式6
     */
    @TableField("MZFS7")
    private String mzfs7;

    /**
     * 其他手术操作麻醉医师6
     */
    @TableField("MZYS7")
    private String mzys7;

    /**
     * 其他手术操作编码7
     */
    @TableField("SSJCZBM8")
    private String ssjczbm8;

    /**
     * 其他手术操作名称7
     */
    @TableField("SSJCZMC8")
    private String ssjczmc8;

    /**
     * 其他手术操作日期7
     */
    @TableField("SSJCZRQ8")
    private LocalDateTime ssjczrq8;

    /**
     * 其他手术操作级别7
     */
    @TableField("SHJB8")
    private String shjb8;

    /**
     * 其他手术操作术者7
     */
    @TableField("SZ8")
    private String sz8;

    /**
     * 其他手术操作Ⅰ助7
     */
    @TableField("YZ8")
    private String yz8;

    /**
     * 其他手术操作Ⅱ助7
     */
    @TableField("EZ8")
    private String ez8;

    /**
     * 其他手术操作切口愈合等级7
     */
    @TableField("QKDJ8")
    private String qkdj8;

    /**
     * 切口愈合类别7
     */
    @TableField("QKYLB8")
    private String qkylb8;

    /**
     * 其他手术操作麻醉方式7
     */
    @TableField("MZFS8")
    private String mzfs8;

    /**
     * 其他手术操作麻醉医师7
     */
    @TableField("MZYS8")
    private String mzys8;

    /**
     * 其他手术操作编码8
     */
    @TableField("SSJCZBM9")
    private String ssjczbm9;

    /**
     * 其他手术操作名称8
     */
    @TableField("SSJCZMC9")
    private String ssjczmc9;

    /**
     * 其他手术操作日期8
     */
    @TableField("SSJCZRQ9")
    private LocalDateTime ssjczrq9;

    /**
     * 其他手术操作级别8
     */
    @TableField("SHJB9")
    private String shjb9;

    /**
     * 其他手术操作术者8
     */
    @TableField("SZ9")
    private String sz9;

    /**
     * 其他手术操作Ⅰ助8
     */
    @TableField("YZ9")
    private String yz9;

    /**
     * 其他手术操作Ⅱ助8
     */
    @TableField("EZ9")
    private String ez9;

    /**
     * 其他手术操作切口愈合等级8
     */
    @TableField("QKDJ9")
    private String qkdj9;

    /**
     * 切口愈合类别8
     */
    @TableField("QKYLB9")
    private String qkylb9;

    /**
     * 其他手术操作麻醉方式8
     */
    @TableField("MZFS9")
    private String mzfs9;

    /**
     * 其他手术操作麻醉医师8
     */
    @TableField("MZYS9")
    private String mzys9;

    /**
     * 其他手术操作编码9
     */
    @TableField("SSJCZBM10")
    private String ssjczbm10;

    /**
     * 其他手术操作名称9
     */
    @TableField("SSJCZMC10")
    private String ssjczmc10;

    /**
     * 其他手术操作日期9
     */
    @TableField("SSJCZRQ10")
    private LocalDateTime ssjczrq10;

    /**
     * 其他手术操作级别9
     */
    @TableField("SHJB10")
    private String shjb10;

    /**
     * 其他手术操作术者9
     */
    @TableField("SZ10")
    private String sz10;

    /**
     * 其他手术操作Ⅰ助9
     */
    @TableField("YZ10")
    private String yz10;

    /**
     * 其他手术操作Ⅱ助9
     */
    @TableField("EZ10")
    private String ez10;

    /**
     * 其他手术操作切口愈合等级9
     */
    @TableField("QKDJ10")
    private String qkdj10;

    /**
     * 切口愈合类别9
     */
    @TableField("QKYLB10")
    private String qkylb10;

    /**
     * 其他手术操作麻醉方式9
     */
    @TableField("MZFS10")
    private String mzfs10;

    /**
     * 其他手术操作麻醉医师9
     */
    @TableField("MZYS10")
    private String mzys10;

    /**
     * 其他手术操作编码10
     */
    @TableField("SSJCZBM11")
    private String ssjczbm11;

    /**
     * 其他手术操作名称10
     */
    @TableField("SSJCZMC11")
    private String ssjczmc11;

    /**
     * 其他手术操作日期10
     */
    @TableField("SSJCZRQ11")
    private LocalDateTime ssjczrq11;

    /**
     * 其他手术操作级别10
     */
    @TableField("SHJB11")
    private String shjb11;

    /**
     * 其他手术操作术者10
     */
    @TableField("SZ11")
    private String sz11;

    /**
     * 其他手术操作Ⅰ助10
     */
    @TableField("YZ11")
    private String yz11;

    /**
     * 其他手术操作Ⅱ助10
     */
    @TableField("EZ11")
    private String ez11;

    /**
     * 其他手术操作切口愈合等级10
     */
    @TableField("QKDJ11")
    private String qkdj11;

    /**
     * 切口愈合类别10
     */
    @TableField("QKYLB11")
    private String qkylb11;

    /**
     * 其他手术操作麻醉方式10
     */
    @TableField("MZFS11")
    private String mzfs11;

    /**
     * 其他手术操作麻醉医师10
     */
    @TableField("MZYS11")
    private String mzys11;

    /**
     * 其他手术操作编码11
     */
    @TableField("SSJCZBM12")
    private String ssjczbm12;

    /**
     * 其他手术操作名称11
     */
    @TableField("SSJCZMC12")
    private String ssjczmc12;

    /**
     * 其他手术操作日期11
     */
    @TableField("SSJCZRQ12")
    private LocalDateTime ssjczrq12;

    /**
     * 其他手术操作级别11
     */
    @TableField("SHJB12")
    private String shjb12;

    /**
     * 其他手术操作术者11
     */
    @TableField("SZ12")
    private String sz12;

    /**
     * 其他手术操作Ⅰ助11
     */
    @TableField("YZ12")
    private String yz12;

    /**
     * 其他手术操作Ⅱ助11
     */
    @TableField("EZ12")
    private String ez12;

    /**
     * 其他手术操作切口愈合等级11
     */
    @TableField("QKDJ12")
    private String qkdj12;

    /**
     * 切口愈合类别11
     */
    @TableField("QKYLB12")
    private String qkylb12;

    /**
     * 其他手术操作麻醉方式11
     */
    @TableField("MZFS12")
    private String mzfs12;

    /**
     * 其他手术操作麻醉医师11
     */
    @TableField("MZYS12")
    private String mzys12;

    /**
     * 其他手术操作编码12
     */
    @TableField("SSJCZBM13")
    private String ssjczbm13;

    /**
     * 其他手术操作名称12
     */
    @TableField("SSJCZMC13")
    private String ssjczmc13;

    /**
     * 其他手术操作日期12
     */
    @TableField("SSJCZRQ13")
    private LocalDateTime ssjczrq13;

    /**
     * 其他手术操作级别12
     */
    @TableField("SHJB13")
    private String shjb13;

    /**
     * 其他手术操作术者12
     */
    @TableField("SZ13")
    private String sz13;

    /**
     * 其他手术操作Ⅰ助12
     */
    @TableField("YZ13")
    private String yz13;

    /**
     * 其他手术操作Ⅱ助12
     */
    @TableField("EZ13")
    private String ez13;

    /**
     * 其他手术操作切口愈合等级12
     */
    @TableField("QKDJ13")
    private String qkdj13;

    /**
     * 切口愈合类别12
     */
    @TableField("QKYLB13")
    private String qkylb13;

    /**
     * 其他手术操作麻醉方式12
     */
    @TableField("MZFS13")
    private String mzfs13;

    /**
     * 其他手术操作麻醉医师12
     */
    @TableField("MZYS13")
    private String mzys13;

    /**
     * 其他手术操作编码13
     */
    @TableField("SSJCZBM14")
    private String ssjczbm14;

    /**
     * 其他手术操作名称13
     */
    @TableField("SSJCZMC14")
    private String ssjczmc14;

    /**
     * 其他手术操作日期13
     */
    @TableField("SSJCZRQ14")
    private LocalDateTime ssjczrq14;

    /**
     * 其他手术操作级别13
     */
    @TableField("SHJB14")
    private String shjb14;

    /**
     * 其他手术操作术者13
     */
    @TableField("SZ14")
    private String sz14;

    /**
     * 其他手术操作Ⅰ助13
     */
    @TableField("YZ14")
    private String yz14;

    /**
     * 其他手术操作Ⅱ助13
     */
    @TableField("EZ14")
    private String ez14;

    /**
     * 其他手术操作切口愈合等级13
     */
    @TableField("QKDJ14")
    private String qkdj14;

    /**
     * 切口愈合类别13
     */
    @TableField("QKYLB14")
    private String qkylb14;

    /**
     * 其他手术操作麻醉方式13
     */
    @TableField("MZFS14")
    private String mzfs14;

    /**
     * 其他手术操作麻醉医师13
     */
    @TableField("MZYS14")
    private String mzys14;

    /**
     * 其他手术操作编码14
     */
    @TableField("SSJCZBM15")
    private String ssjczbm15;

    /**
     * 其他手术操作名称14
     */
    @TableField("SSJCZMC15")
    private String ssjczmc15;

    /**
     * 其他手术操作日期14
     */
    @TableField("SSJCZRQ15")
    private LocalDateTime ssjczrq15;

    /**
     * 其他手术操作级别14
     */
    @TableField("SHJB15")
    private String shjb15;

    /**
     * 其他手术操作术者14
     */
    @TableField("SZ15")
    private String sz15;

    /**
     * 其他手术操作Ⅰ助14
     */
    @TableField("YZ15")
    private String yz15;

    /**
     * 其他手术操作Ⅱ助14
     */
    @TableField("EZ15")
    private String ez15;

    /**
     * 其他手术操作切口愈合等级14
     */
    @TableField("QKDJ15")
    private String qkdj15;

    /**
     * 切口愈合类别14
     */
    @TableField("QKYLB15")
    private String qkylb15;

    /**
     * 其他手术操作麻醉方式14
     */
    @TableField("MZFS15")
    private String mzfs15;

    /**
     * 其他手术操作麻醉医师14
     */
    @TableField("MZYS15")
    private String mzys15;

    /**
     * 其他手术操作编码15
     */
    @TableField("SSJCZBM16")
    private String ssjczbm16;

    /**
     * 其他手术操作名称15
     */
    @TableField("SSJCZMC16")
    private String ssjczmc16;

    /**
     * 其他手术操作日期15
     */
    @TableField("SSJCZRQ16")
    private LocalDateTime ssjczrq16;

    /**
     * 其他手术操作级别15
     */
    @TableField("SHJB16")
    private String shjb16;

    /**
     * 其他手术操作术者15
     */
    @TableField("SZ16")
    private String sz16;

    /**
     * 其他手术操作Ⅰ助15
     */
    @TableField("YZ16")
    private String yz16;

    /**
     * 其他手术操作Ⅱ助15
     */
    @TableField("EZ16")
    private String ez16;

    /**
     * 其他手术操作切口愈合等级15
     */
    @TableField("QKDJ16")
    private String qkdj16;

    /**
     * 切口愈合类别15
     */
    @TableField("QKYLB16")
    private String qkylb16;

    /**
     * 其他手术操作麻醉方式15
     */
    @TableField("MZFS16")
    private String mzfs16;

    /**
     * 其他手术操作麻醉医师15
     */
    @TableField("MZYS16")
    private String mzys16;

    /**
     * 其他手术操作编码16
     */
    @TableField("SSJCZBM17")
    private String ssjczbm17;

    /**
     * 其他手术操作名称16
     */
    @TableField("SSJCZMC17")
    private String ssjczmc17;

    /**
     * 其他手术操作日期16
     */
    @TableField("SSJCZRQ17")
    private LocalDateTime ssjczrq17;

    /**
     * 其他手术操作级别16
     */
    @TableField("SHJB17")
    private String shjb17;

    /**
     * 其他手术操作术者16
     */
    @TableField("SZ17")
    private String sz17;

    /**
     * 其他手术操作Ⅰ助16
     */
    @TableField("YZ17")
    private String yz17;

    /**
     * 其他手术操作Ⅱ助16
     */
    @TableField("EZ17")
    private String ez17;

    /**
     * 其他手术操作切口愈合等级16
     */
    @TableField("QKDJ17")
    private String qkdj17;

    /**
     * 切口愈合类别16
     */
    @TableField("QKYLB17")
    private String qkylb17;

    /**
     * 其他手术操作麻醉方式16
     */
    @TableField("MZFS17")
    private String mzfs17;

    /**
     * 其他手术操作麻醉医师16
     */
    @TableField("MZYS17")
    private String mzys17;

    /**
     * 其他手术操作编码17
     */
    @TableField("SSJCZBM18")
    private String ssjczbm18;

    /**
     * 其他手术操作名称17
     */
    @TableField("SSJCZMC18")
    private String ssjczmc18;

    /**
     * 其他手术操作日期17
     */
    @TableField("SSJCZRQ18")
    private LocalDateTime ssjczrq18;

    /**
     * 其他手术操作级别17
     */
    @TableField("SHJB18")
    private String shjb18;

    /**
     * 其他手术操作术者17
     */
    @TableField("SZ18")
    private String sz18;

    /**
     * 其他手术操作Ⅰ助17
     */
    @TableField("YZ18")
    private String yz18;

    /**
     * 其他手术操作Ⅱ助17
     */
    @TableField("EZ18")
    private String ez18;

    /**
     * 其他手术操作切口愈合等级17
     */
    @TableField("QKDJ18")
    private String qkdj18;

    /**
     * 切口愈合类别17
     */
    @TableField("QKYLB18")
    private String qkylb18;

    /**
     * 其他手术操作麻醉方式17
     */
    @TableField("MZFS18")
    private String mzfs18;

    /**
     * 其他手术操作麻醉医师17
     */
    @TableField("MZYS18")
    private String mzys18;

    /**
     * 其他手术操作编码18
     */
    @TableField("SSJCZBM19")
    private String ssjczbm19;

    /**
     * 其他手术操作名称18
     */
    @TableField("SSJCZMC19")
    private String ssjczmc19;

    /**
     * 其他手术操作日期18
     */
    @TableField("SSJCZRQ19")
    private LocalDateTime ssjczrq19;

    /**
     * 其他手术操作级别18
     */
    @TableField("SHJB19")
    private String shjb19;

    /**
     * 其他手术操作术者18
     */
    @TableField("SZ19")
    private String sz19;

    /**
     * 其他手术操作Ⅰ助18
     */
    @TableField("YZ19")
    private String yz19;

    /**
     * 其他手术操作Ⅱ助18
     */
    @TableField("EZ19")
    private String ez19;

    /**
     * 其他手术操作切口愈合等级18
     */
    @TableField("QKDJ19")
    private String qkdj19;

    /**
     * 切口愈合类别18
     */
    @TableField("QKYLB19")
    private String qkylb19;

    /**
     * 其他手术操作麻醉方式18
     */
    @TableField("MZFS19")
    private String mzfs19;

    /**
     * 其他手术操作麻醉医师18
     */
    @TableField("MZYS19")
    private String mzys19;

    /**
     * 其他手术操作编码19
     */
    @TableField("SSJCZBM20")
    private String ssjczbm20;

    /**
     * 其他手术操作名称19
     */
    @TableField("SSJCZMC20")
    private String ssjczmc20;

    /**
     * 其他手术操作日期19
     */
    @TableField("SSJCZRQ20")
    private LocalDateTime ssjczrq20;

    /**
     * 其他手术操作级别19
     */
    @TableField("SHJB20")
    private String shjb20;

    /**
     * 其他手术操作术者19
     */
    @TableField("SZ20")
    private String sz20;

    /**
     * 其他手术操作Ⅰ助19
     */
    @TableField("YZ20")
    private String yz20;

    /**
     * 其他手术操作Ⅱ助19
     */
    @TableField("EZ20")
    private String ez20;

    /**
     * 其他手术操作切口愈合等级19
     */
    @TableField("QKDJ20")
    private String qkdj20;

    /**
     * 切口愈合类别19
     */
    @TableField("QKYLB20")
    private String qkylb20;

    /**
     * 其他手术操作麻醉方式19
     */
    @TableField("MZFS20")
    private String mzfs20;

    /**
     * 其他手术操作麻醉医师19
     */
    @TableField("MZYS20")
    private String mzys20;

    /**
     * 其他手术操作编码20
     */
    @TableField("SSJCZBM21")
    private String ssjczbm21;

    /**
     * 其他手术操作名称20
     */
    @TableField("SSJCZMC21")
    private String ssjczmc21;

    /**
     * 其他手术操作日期20
     */
    @TableField("SSJCZRQ21")
    private LocalDateTime ssjczrq21;

    /**
     * 其他手术操作级别20
     */
    @TableField("SHJB21")
    private String shjb21;

    /**
     * 其他手术操作术者20
     */
    @TableField("SZ21")
    private String sz21;

    /**
     * 其他手术操作Ⅰ助20
     */
    @TableField("YZ21")
    private String yz21;

    /**
     * 其他手术操作Ⅱ助20
     */
    @TableField("EZ21")
    private String ez21;

    /**
     * 其他手术操作切口愈合等级20
     */
    @TableField("QKDJ21")
    private String qkdj21;

    /**
     * 切口愈合类别20
     */
    @TableField("QKYLB21")
    private String qkylb21;

    /**
     * 其他手术操作麻醉方式20
     */
    @TableField("MZFS21")
    private String mzfs21;

    /**
     * 其他手术操作麻醉医师20
     */
    @TableField("MZYS21")
    private String mzys21;

    /**
     * 其他手术操作编码21
     */
    @TableField("SSJCZBM22")
    private String ssjczbm22;

    /**
     * 其他手术操作名称21
     */
    @TableField("SSJCZMC22")
    private String ssjczmc22;

    /**
     * 其他手术操作日期21
     */
    @TableField("SSJCZRQ22")
    private LocalDateTime ssjczrq22;

    /**
     * 其他手术操作级别21
     */
    @TableField("SHJB22")
    private String shjb22;

    /**
     * 其他手术操作术者21
     */
    @TableField("SZ22")
    private String sz22;

    /**
     * 其他手术操作Ⅰ助21
     */
    @TableField("YZ22")
    private String yz22;

    /**
     * 其他手术操作Ⅱ助21
     */
    @TableField("EZ22")
    private String ez22;

    /**
     * 其他手术操作切口愈合等级21
     */
    @TableField("QKDJ22")
    private String qkdj22;

    /**
     * 切口愈合类别21
     */
    @TableField("QKYLB22")
    private String qkylb22;

    /**
     * 其他手术操作麻醉方式21
     */
    @TableField("MZFS22")
    private String mzfs22;

    /**
     * 其他手术操作麻醉医师21
     */
    @TableField("MZYS22")
    private String mzys22;

    /**
     * 其他手术操作编码22
     */
    @TableField("SSJCZBM23")
    private String ssjczbm23;

    /**
     * 其他手术操作名称22
     */
    @TableField("SSJCZMC23")
    private String ssjczmc23;

    /**
     * 其他手术操作日期22
     */
    @TableField("SSJCZRQ23")
    private LocalDateTime ssjczrq23;

    /**
     * 其他手术操作级别22
     */
    @TableField("SHJB23")
    private String shjb23;

    /**
     * 其他手术操作术者22
     */
    @TableField("SZ23")
    private String sz23;

    /**
     * 其他手术操作Ⅰ助22
     */
    @TableField("YZ23")
    private String yz23;

    /**
     * 其他手术操作Ⅱ助22
     */
    @TableField("EZ23")
    private String ez23;

    /**
     * 其他手术操作切口愈合等级22
     */
    @TableField("QKDJ23")
    private String qkdj23;

    /**
     * 切口愈合类别22
     */
    @TableField("QKYLB23")
    private String qkylb23;

    /**
     * 其他手术操作麻醉方式22
     */
    @TableField("MZFS23")
    private String mzfs23;

    /**
     * 其他手术操作麻醉医师22
     */
    @TableField("MZYS23")
    private String mzys23;

    /**
     * 其他手术操作编码23
     */
    @TableField("SSJCZBM24")
    private String ssjczbm24;

    /**
     * 其他手术操作名称23
     */
    @TableField("SSJCZMC24")
    private String ssjczmc24;

    /**
     * 其他手术操作日期23
     */
    @TableField("SSJCZRQ24")
    private LocalDateTime ssjczrq24;

    /**
     * 其他手术操作级别23
     */
    @TableField("SHJB24")
    private String shjb24;

    /**
     * 其他手术操作术者23
     */
    @TableField("SZ24")
    private String sz24;

    /**
     * 其他手术操作Ⅰ助23
     */
    @TableField("YZ24")
    private String yz24;

    /**
     * 其他手术操作Ⅱ助23
     */
    @TableField("EZ24")
    private String ez24;

    /**
     * 其他手术操作切口愈合等级23
     */
    @TableField("QKDJ24")
    private String qkdj24;

    /**
     * 切口愈合类别23
     */
    @TableField("QKYLB24")
    private String qkylb24;

    /**
     * 其他手术操作麻醉方式23
     */
    @TableField("MZFS24")
    private String mzfs24;

    /**
     * 其他手术操作麻醉医师23
     */
    @TableField("MZYS24")
    private String mzys24;

    /**
     * 其他手术操作编码24
     */
    @TableField("SSJCZBM25")
    private String ssjczbm25;

    /**
     * 其他手术操作名称24
     */
    @TableField("SSJCZMC25")
    private String ssjczmc25;

    /**
     * 其他手术操作日期24
     */
    @TableField("SSJCZRQ25")
    private LocalDateTime ssjczrq25;

    /**
     * 其他手术操作级别24
     */
    @TableField("SHJB25")
    private String shjb25;

    /**
     * 其他手术操作术者24
     */
    @TableField("SZ25")
    private String sz25;

    /**
     * 其他手术操作Ⅰ助24
     */
    @TableField("YZ25")
    private String yz25;

    /**
     * 其他手术操作Ⅱ助24
     */
    @TableField("EZ25")
    private String ez25;

    /**
     * 其他手术操作切口愈合等级24
     */
    @TableField("QKDJ25")
    private String qkdj25;

    /**
     * 切口愈合类别24
     */
    @TableField("QKYLB25")
    private String qkylb25;

    /**
     * 其他手术操作麻醉方式24
     */
    @TableField("MZFS25")
    private String mzfs25;

    /**
     * 其他手术操作麻醉医师24
     */
    @TableField("MZYS25")
    private String mzys25;

    /**
     * 其他手术操作编码25
     */
    @TableField("SSJCZBM26")
    private String ssjczbm26;

    /**
     * 其他手术操作名称25
     */
    @TableField("SSJCZMC26")
    private String ssjczmc26;

    /**
     * 其他手术操作日期25
     */
    @TableField("SSJCZRQ26")
    private LocalDateTime ssjczrq26;

    /**
     * 其他手术操作级别25
     */
    @TableField("SHJB26")
    private String shjb26;

    /**
     * 其他手术操作术者25
     */
    @TableField("SZ26")
    private String sz26;

    /**
     * 其他手术操作Ⅰ助25
     */
    @TableField("YZ26")
    private String yz26;

    /**
     * 其他手术操作Ⅱ助25
     */
    @TableField("EZ26")
    private String ez26;

    /**
     * 其他手术操作切口愈合等级25
     */
    @TableField("QKDJ26")
    private String qkdj26;

    /**
     * 切口愈合类别25
     */
    @TableField("QKYLB26")
    private String qkylb26;

    /**
     * 其他手术操作麻醉方式25
     */
    @TableField("MZFS26")
    private String mzfs26;

    /**
     * 其他手术操作麻醉医师25
     */
    @TableField("MZYS26")
    private String mzys26;

    /**
     * 其他手术操作编码26
     */
    @TableField("SSJCZBM27")
    private String ssjczbm27;

    /**
     * 其他手术操作名称26
     */
    @TableField("SSJCZMC27")
    private String ssjczmc27;

    /**
     * 其他手术操作日期26
     */
    @TableField("SSJCZRQ27")
    private LocalDateTime ssjczrq27;

    /**
     * 其他手术操作级别26
     */
    @TableField("SHJB27")
    private String shjb27;

    /**
     * 其他手术操作术者26
     */
    @TableField("SZ27")
    private String sz27;

    /**
     * 其他手术操作Ⅰ助26
     */
    @TableField("YZ27")
    private String yz27;

    /**
     * 其他手术操作Ⅱ助26
     */
    @TableField("EZ27")
    private String ez27;

    /**
     * 其他手术操作切口愈合等级26
     */
    @TableField("QKDJ27")
    private String qkdj27;

    /**
     * 切口愈合类别26
     */
    @TableField("QKYLB27")
    private String qkylb27;

    /**
     * 其他手术操作麻醉方式26
     */
    @TableField("MZFS27")
    private String mzfs27;

    /**
     * 其他手术操作麻醉医师26
     */
    @TableField("MZYS27")
    private String mzys27;

    /**
     * 其他手术操作编码27
     */
    @TableField("SSJCZBM28")
    private String ssjczbm28;

    /**
     * 其他手术操作名称27
     */
    @TableField("SSJCZMC28")
    private String ssjczmc28;

    /**
     * 其他手术操作日期27
     */
    @TableField("SSJCZRQ28")
    private LocalDateTime ssjczrq28;

    /**
     * 其他手术操作级别27
     */
    @TableField("SHJB28")
    private String shjb28;

    /**
     * 其他手术操作术者27
     */
    @TableField("SZ28")
    private String sz28;

    /**
     * 其他手术操作Ⅰ助27
     */
    @TableField("YZ28")
    private String yz28;

    /**
     * 其他手术操作Ⅱ助27
     */
    @TableField("EZ28")
    private String ez28;

    /**
     * 其他手术操作切口愈合等级27
     */
    @TableField("QKDJ28")
    private String qkdj28;

    /**
     * 切口愈合类别27
     */
    @TableField("QKYLB28")
    private String qkylb28;

    /**
     * 其他手术操作麻醉方式27
     */
    @TableField("MZFS28")
    private String mzfs28;

    /**
     * 其他手术操作麻醉医师27
     */
    @TableField("MZYS28")
    private String mzys28;

    /**
     * 其他手术操作编码28
     */
    @TableField("SSJCZBM29")
    private String ssjczbm29;

    /**
     * 其他手术操作名称28
     */
    @TableField("SSJCZMC29")
    private String ssjczmc29;

    /**
     * 其他手术操作日期28
     */
    @TableField("SSJCZRQ29")
    private LocalDateTime ssjczrq29;

    /**
     * 其他手术操作级别28
     */
    @TableField("SHJB29")
    private String shjb29;

    /**
     * 其他手术操作术者28
     */
    @TableField("SZ29")
    private String sz29;

    /**
     * 其他手术操作Ⅰ助28
     */
    @TableField("YZ29")
    private String yz29;

    /**
     * 其他手术操作Ⅱ助28
     */
    @TableField("EZ29")
    private String ez29;

    /**
     * 其他手术操作切口愈合等级28
     */
    @TableField("QKDJ29")
    private String qkdj29;

    /**
     * 切口愈合类别28
     */
    @TableField("QKYLB29")
    private String qkylb29;

    /**
     * 其他手术操作麻醉方式28
     */
    @TableField("MZFS29")
    private String mzfs29;

    /**
     * 其他手术操作麻醉医师28
     */
    @TableField("MZYS29")
    private String mzys29;

    /**
     * 其他手术操作编码29
     */
    @TableField("SSJCZBM30")
    private String ssjczbm30;

    /**
     * 其他手术操作名称29
     */
    @TableField("SSJCZMC30")
    private String ssjczmc30;

    /**
     * 其他手术操作日期29
     */
    @TableField("SSJCZRQ30")
    private LocalDateTime ssjczrq30;

    /**
     * 其他手术操作级别29
     */
    @TableField("SHJB30")
    private String shjb30;

    /**
     * 其他手术操作术者29
     */
    @TableField("SZ30")
    private String sz30;

    /**
     * 其他手术操作Ⅰ助29
     */
    @TableField("YZ30")
    private String yz30;

    /**
     * 其他手术操作Ⅱ助29
     */
    @TableField("EZ30")
    private String ez30;

    /**
     * 其他手术操作切口愈合等级29
     */
    @TableField("QKDJ30")
    private String qkdj30;

    /**
     * 切口愈合类别29
     */
    @TableField("QKYLB30")
    private String qkylb30;

    /**
     * 其他手术操作麻醉方式29
     */
    @TableField("MZFS30")
    private String mzfs30;

    /**
     * 其他手术操作麻醉医师29
     */
    @TableField("MZYS30")
    private String mzys30;

    /**
     * 其他手术操作编码30
     */
    @TableField("SSJCZBM31")
    private String ssjczbm31;

    /**
     * 其他手术操作名称30
     */
    @TableField("SSJCZMC31")
    private String ssjczmc31;

    /**
     * 其他手术操作日期30
     */
    @TableField("SSJCZRQ31")
    private LocalDateTime ssjczrq31;

    /**
     * 其他手术操作级别30
     */
    @TableField("SHJB31")
    private String shjb31;

    /**
     * 其他手术操作术者30
     */
    @TableField("SZ31")
    private String sz31;

    /**
     * 其他手术操作Ⅰ助30
     */
    @TableField("YZ31")
    private String yz31;

    /**
     * 其他手术操作Ⅱ助30
     */
    @TableField("EZ31")
    private String ez31;

    /**
     * 其他手术操作切口愈合等级30
     */
    @TableField("QKDJ31")
    private String qkdj31;

    /**
     * 切口愈合类别30
     */
    @TableField("QKYLB31")
    private String qkylb31;

    /**
     * 其他手术操作麻醉方式30
     */
    @TableField("MZFS31")
    private String mzfs31;

    /**
     * 其他手术操作麻醉医师30
     */
    @TableField("MZYS31")
    private String mzys31;

    /**
     * 其他手术操作编码31
     */
    @TableField("SSJCZBM32")
    private String ssjczbm32;

    /**
     * 其他手术操作名称31
     */
    @TableField("SSJCZMC32")
    private String ssjczmc32;

    /**
     * 其他手术操作日期31
     */
    @TableField("SSJCZRQ32")
    private LocalDateTime ssjczrq32;

    /**
     * 其他手术操作级别31
     */
    @TableField("SHJB32")
    private String shjb32;

    /**
     * 其他手术操作术者31
     */
    @TableField("SZ32")
    private String sz32;

    /**
     * 其他手术操作Ⅰ助31
     */
    @TableField("YZ32")
    private String yz32;

    /**
     * 其他手术操作Ⅱ助31
     */
    @TableField("EZ32")
    private String ez32;

    /**
     * 其他手术操作切口愈合等级31
     */
    @TableField("QKDJ32")
    private String qkdj32;

    /**
     * 切口愈合类别31
     */
    @TableField("QKYLB32")
    private String qkylb32;

    /**
     * 其他手术操作麻醉方式31
     */
    @TableField("MZFS32")
    private String mzfs32;

    /**
     * 其他手术操作麻醉医师31
     */
    @TableField("MZYS32")
    private String mzys32;

    /**
     * 其他手术操作编码32
     */
    @TableField("SSJCZBM33")
    private String ssjczbm33;

    /**
     * 其他手术操作名称32
     */
    @TableField("SSJCZMC33")
    private String ssjczmc33;

    /**
     * 其他手术操作日期32
     */
    @TableField("SSJCZRQ33")
    private LocalDateTime ssjczrq33;

    /**
     * 其他手术操作级别32
     */
    @TableField("SHJB33")
    private String shjb33;

    /**
     * 其他手术操作术者32
     */
    @TableField("SZ33")
    private String sz33;

    /**
     * 其他手术操作Ⅰ助32
     */
    @TableField("YZ33")
    private String yz33;

    /**
     * 其他手术操作Ⅱ助32
     */
    @TableField("EZ33")
    private String ez33;

    /**
     * 其他手术操作切口愈合等级32
     */
    @TableField("QKDJ33")
    private String qkdj33;

    /**
     * 切口愈合类别32
     */
    @TableField("QKYLB33")
    private String qkylb33;

    /**
     * 其他手术操作麻醉方式32
     */
    @TableField("MZFS33")
    private String mzfs33;

    /**
     * 其他手术操作麻醉医师32
     */
    @TableField("MZYS33")
    private String mzys33;

    /**
     * 其他手术操作编码33
     */
    @TableField("SSJCZBM34")
    private String ssjczbm34;

    /**
     * 其他手术操作名称33
     */
    @TableField("SSJCZMC34")
    private String ssjczmc34;

    /**
     * 其他手术操作日期33
     */
    @TableField("SSJCZRQ34")
    private LocalDateTime ssjczrq34;

    /**
     * 其他手术操作级别33
     */
    @TableField("SHJB34")
    private String shjb34;

    /**
     * 其他手术操作术者33
     */
    @TableField("SZ34")
    private String sz34;

    /**
     * 其他手术操作Ⅰ助33
     */
    @TableField("YZ34")
    private String yz34;

    /**
     * 其他手术操作Ⅱ助33
     */
    @TableField("EZ34")
    private String ez34;

    /**
     * 其他手术操作切口愈合等级33
     */
    @TableField("QKDJ34")
    private String qkdj34;

    /**
     * 切口愈合类别33
     */
    @TableField("QKYLB34")
    private String qkylb34;

    /**
     * 其他手术操作麻醉方式33
     */
    @TableField("MZFS34")
    private String mzfs34;

    /**
     * 其他手术操作麻醉医师33
     */
    @TableField("MZYS34")
    private String mzys34;

    /**
     * 其他手术操作编码34
     */
    @TableField("SSJCZBM35")
    private String ssjczbm35;

    /**
     * 其他手术操作名称34
     */
    @TableField("SSJCZMC35")
    private String ssjczmc35;

    /**
     * 其他手术操作日期34
     */
    @TableField("SSJCZRQ35")
    private LocalDateTime ssjczrq35;

    /**
     * 其他手术操作级别34
     */
    @TableField("SHJB35")
    private String shjb35;

    /**
     * 其他手术操作术者34
     */
    @TableField("SZ35")
    private String sz35;

    /**
     * 其他手术操作Ⅰ助34
     */
    @TableField("YZ35")
    private String yz35;

    /**
     * 其他手术操作Ⅱ助34
     */
    @TableField("EZ35")
    private String ez35;

    /**
     * 其他手术操作切口愈合等级34
     */
    @TableField("QKDJ35")
    private String qkdj35;

    /**
     * 切口愈合类别34
     */
    @TableField("QKYLB35")
    private String qkylb35;

    /**
     * 其他手术操作麻醉方式34
     */
    @TableField("MZFS35")
    private String mzfs35;

    /**
     * 其他手术操作麻醉医师34
     */
    @TableField("MZYS35")
    private String mzys35;

    /**
     * 其他手术操作编码35
     */
    @TableField("SSJCZBM36")
    private String ssjczbm36;

    /**
     * 其他手术操作名称35
     */
    @TableField("SSJCZMC36")
    private String ssjczmc36;

    /**
     * 其他手术操作日期35
     */
    @TableField("SSJCZRQ36")
    private LocalDateTime ssjczrq36;

    /**
     * 其他手术操作级别35
     */
    @TableField("SHJB36")
    private String shjb36;

    /**
     * 其他手术操作术者35
     */
    @TableField("SZ36")
    private String sz36;

    /**
     * 其他手术操作Ⅰ助35
     */
    @TableField("YZ36")
    private String yz36;

    /**
     * 其他手术操作Ⅱ助35
     */
    @TableField("EZ36")
    private String ez36;

    /**
     * 其他手术操作切口愈合等级35
     */
    @TableField("QKDJ36")
    private String qkdj36;

    /**
     * 切口愈合类别35
     */
    @TableField("QKYLB36")
    private String qkylb36;

    /**
     * 其他手术操作麻醉方式35
     */
    @TableField("MZFS36")
    private String mzfs36;

    /**
     * 其他手术操作麻醉医师35
     */
    @TableField("MZYS36")
    private String mzys36;

    /**
     * 其他手术操作编码36
     */
    @TableField("SSJCZBM37")
    private String ssjczbm37;

    /**
     * 其他手术操作名称36
     */
    @TableField("SSJCZMC37")
    private String ssjczmc37;

    /**
     * 其他手术操作日期36
     */
    @TableField("SSJCZRQ37")
    private LocalDateTime ssjczrq37;

    /**
     * 其他手术操作级别36
     */
    @TableField("SHJB37")
    private String shjb37;

    /**
     * 其他手术操作术者36
     */
    @TableField("SZ37")
    private String sz37;

    /**
     * 其他手术操作Ⅰ助36
     */
    @TableField("YZ37")
    private String yz37;

    /**
     * 其他手术操作Ⅱ助36
     */
    @TableField("EZ37")
    private String ez37;

    /**
     * 其他手术操作切口愈合等级36
     */
    @TableField("QKDJ37")
    private String qkdj37;

    /**
     * 切口愈合类别36
     */
    @TableField("QKYLB37")
    private String qkylb37;

    /**
     * 其他手术操作麻醉方式36
     */
    @TableField("MZFS37")
    private String mzfs37;

    /**
     * 其他手术操作麻醉医师36
     */
    @TableField("MZYS37")
    private String mzys37;

    /**
     * 其他手术操作编码37
     */
    @TableField("SSJCZBM38")
    private String ssjczbm38;

    /**
     * 其他手术操作名称37
     */
    @TableField("SSJCZMC38")
    private String ssjczmc38;

    /**
     * 其他手术操作日期37
     */
    @TableField("SSJCZRQ38")
    private LocalDateTime ssjczrq38;

    /**
     * 其他手术操作级别37
     */
    @TableField("SHJB38")
    private String shjb38;

    /**
     * 其他手术操作术者37
     */
    @TableField("SZ38")
    private String sz38;

    /**
     * 其他手术操作Ⅰ助37
     */
    @TableField("YZ38")
    private String yz38;

    /**
     * 其他手术操作Ⅱ助37
     */
    @TableField("EZ38")
    private String ez38;

    /**
     * 其他手术操作切口愈合等级37
     */
    @TableField("QKDJ38")
    private String qkdj38;

    /**
     * 切口愈合类别37
     */
    @TableField("QKYLB38")
    private String qkylb38;

    /**
     * 其他手术操作麻醉方式37
     */
    @TableField("MZFS38")
    private String mzfs38;

    /**
     * 其他手术操作麻醉医师37
     */
    @TableField("MZYS38")
    private String mzys38;

    /**
     * 其他手术操作编码38
     */
    @TableField("SSJCZBM39")
    private String ssjczbm39;

    /**
     * 其他手术操作名称38
     */
    @TableField("SSJCZMC39")
    private String ssjczmc39;

    /**
     * 其他手术操作日期38
     */
    @TableField("SSJCZRQ39")
    private LocalDateTime ssjczrq39;

    /**
     * 其他手术操作级别38
     */
    @TableField("SHJB39")
    private String shjb39;

    /**
     * 其他手术操作术者38
     */
    @TableField("SZ39")
    private String sz39;

    /**
     * 其他手术操作Ⅰ助38
     */
    @TableField("YZ39")
    private String yz39;

    /**
     * 其他手术操作Ⅱ助38
     */
    @TableField("EZ39")
    private String ez39;

    /**
     * 其他手术操作切口愈合等级38
     */
    @TableField("QKDJ39")
    private String qkdj39;

    /**
     * 切口愈合类别38
     */
    @TableField("QKYLB39")
    private String qkylb39;

    /**
     * 其他手术操作麻醉方式38
     */
    @TableField("MZFS39")
    private String mzfs39;

    /**
     * 其他手术操作麻醉医师38
     */
    @TableField("MZYS39")
    private String mzys39;

    /**
     * 其他手术操作编码39
     */
    @TableField("SSJCZBM40")
    private String ssjczbm40;

    /**
     * 其他手术操作名称39
     */
    @TableField("SSJCZMC40")
    private String ssjczmc40;

    /**
     * 其他手术操作日期39
     */
    @TableField("SSJCZRQ40")
    private LocalDateTime ssjczrq40;

    /**
     * 其他手术操作级别39
     */
    @TableField("SHJB40")
    private String shjb40;

    /**
     * 其他手术操作术者39
     */
    @TableField("SZ40")
    private String sz40;

    /**
     * 其他手术操作Ⅰ助39
     */
    @TableField("YZ40")
    private String yz40;

    /**
     * 其他手术操作Ⅱ助39
     */
    @TableField("EZ40")
    private String ez40;

    /**
     * 其他手术操作切口愈合等级39
     */
    @TableField("QKDJ40")
    private String qkdj40;

    /**
     * 切口愈合类别39
     */
    @TableField("QKYLB40")
    private String qkylb40;

    /**
     * 其他手术操作麻醉方式39
     */
    @TableField("MZFS40")
    private String mzfs40;

    /**
     * 其他手术操作麻醉医师39
     */
    @TableField("MZYS40")
    private String mzys40;

    /**
     * 其他手术操作编码40
     */
    @TableField("SSJCZBM41")
    private String ssjczbm41;

    /**
     * 其他手术操作名称40
     */
    @TableField("SSJCZMC41")
    private String ssjczmc41;

    /**
     * 其他手术操作日期40
     */
    @TableField("SSJCZRQ41")
    private LocalDateTime ssjczrq41;

    /**
     * 其他手术操作级别40
     */
    @TableField("SHJB41")
    private String shjb41;

    /**
     * 其他手术操作术者40
     */
    @TableField("SZ41")
    private String sz41;

    /**
     * 其他手术操作Ⅰ助40
     */
    @TableField("YZ41")
    private String yz41;

    /**
     * 其他手术操作Ⅱ助40
     */
    @TableField("EZ41")
    private String ez41;

    /**
     * 其他手术操作切口愈合等级40
     */
    @TableField("QKDJ41")
    private String qkdj41;

    /**
     * 切口愈合类别40
     */
    @TableField("QKYLB41")
    private String qkylb41;

    /**
     * 其他手术操作麻醉方式40
     */
    @TableField("MZFS41")
    private String mzfs41;

    /**
     * 其他手术操作麻醉医师40
     */
    @TableField("MZYS41")
    private String mzys41;

    /**
     * 离院方式
     */
    @TableField("LYFS")
    private String lyfs;

    /**
     * 医嘱转院，拟接收医疗机构名称
     */
    @TableField("YZZY_JGMC")
    private String yzzyJgmc;

    /**
     * 医嘱转社区卫生服务机构/乡镇卫生院，拟接收医疗机构名称
     */
    @TableField("WSY_JGMC")
    private String wsyJgmc;

    /**
     * 是否有出院31天内再住院计划
     */
    @TableField("ZZYJH")
    private Integer zzyjh;

    /**
     * 目的
     */
    @TableField("MD")
    private String md;

    /**
     * 颅脑损伤患者昏迷入院前时间（天)
     */
    @TableField("RYQ_T")
    private Integer ryqT;

    /**
     * 小时
     */
    @TableField("RYQ_XS")
    private Integer ryqXs;

    /**
     * 分钟
     */
    @TableField("RYQ_FZ")
    private Integer ryqFz;

    /**
     * 颅脑损伤患者昏迷时间天
     */
    @TableField("RYH_T")
    private Integer ryhT;

    /**
     * 小时
     */
    @TableField("RYH_XS")
    private Integer ryhXs;

    /**
     * 分钟
     */
    @TableField("RYH_FZ")
    private Integer ryhFz;

    /**
     * 总费用
     */
    @TableField("ZFY")
    private Double zfy;

    /**
     * 自付金额
     */
    @TableField("ZFJE")
    private Double zfje;

    /**
     * 综合医疗服务类(1)一般医疗服务费
     */
    @TableField("YLFWF")
    private Double ylfwf;

    /**
     * 中医辨证论治费
     */
    @TableField("BZLZF")
    private Double bzlzf;

    /**
     * 中医辨证论治会诊费
     */
    @TableField("ZYBLZHZF")
    private Double zyblzhzf;

    /**
     * (2)一般治疗操作费
     */
    @TableField("ZLCZF")
    private Double zlczf;

    /**
     * (3)护理费
     */
    @TableField("HLF")
    private Double hlf;

    /**
     * (4)其他费用
     */
    @TableField("QTFY")
    private Double qtfy;

    /**
     * 诊断类(5)病理诊断费
     */
    @TableField("BLZDF")
    private Double blzdf;

    /**
     * (6)实验室诊断费
     */
    @TableField("ZDF")
    private Double zdf;

    /**
     * (7)影像学诊断费
     */
    @TableField("YXXZDF")
    private Double yxxzdf;

    /**
     * (8)临床诊断项目费
     */
    @TableField("LCZDXMF")
    private Double lczdxmf;

    /**
     * 治疗类(9)非手术治疗项目费
     */
    @TableField("FSSZLXMF")
    private Double fsszlxmf;

    /**
     * 临床物理治疗费
     */
    @TableField("ZLF")
    private Double zlf;

    /**
     * (10)手术治疗费
     */
    @TableField("SSZLF")
    private Double sszlf;

    /**
     * 麻醉费
     */
    @TableField("MZF")
    private Double mzf;

    /**
     * 手术费
     */
    @TableField("SSF")
    private Double ssf;

    /**
     * 康复类(11)康复费
     */
    @TableField("KFF")
    private Double kff;

    /**
     * 中医类(中医和名族医医疗服务)（12）中医诊断
     */
    @TableField("ZYL_ZYZD")
    private Double zylZyzd;

    /**
     * (13)中医治疗
     */
    @TableField("ZYZL")
    private Double zyzl;

    /**
     * 中医外治
     */
    @TableField("ZYWZ")
    private Double zywz;

    /**
     * 中医骨伤
     */
    @TableField("ZYGS")
    private Double zygs;

    /**
     * 针刺与灸法
     */
    @TableField("ZCYJF")
    private Double zcyjf;

    /**
     * 中医推拿治疗
     */
    @TableField("ZYTNZL")
    private Double zytnzl;

    /**
     * 中医肛肠治疗
     */
    @TableField("ZYGCZL")
    private Double zygczl;

    /**
     * 中医特殊治疗
     */
    @TableField("ZYTSZL")
    private Double zytszl;

    /**
     * (14)中医其他
     */
    @TableField("ZYQT")
    private Double zyqt;

    /**
     * 中医特殊调配加工
     */
    @TableField("ZYTSTPJG")
    private Double zytstpjg;

    /**
     * 辨证施膳
     */
    @TableField("BZSS")
    private Double bzss;

    /**
     * 西药类(15)西药费
     */
    @TableField("XYF")
    private Double xyf;

    /**
     * 抗菌药物费
     */
    @TableField("KJYWF")
    private Double kjywf;

    /**
     * 中药类(16)中成药费
     */
    @TableField("ZCYF")
    private Double zcyf;

    /**
     * 医疗机构中药制剂费
     */
    @TableField("ZYZJF")
    private Double zyzjf;

    /**
     * (17)中草药费
     */
    @TableField("ZCYF1")
    private Double zcyf1;

    /**
     * 血液和血液制品类(18)血费
     */
    @TableField("XF")
    private Double xf;

    /**
     * (19)白蛋白类制品费
     */
    @TableField("BDBLZPF")
    private Double bdblzpf;

    /**
     * (20)球蛋白类制品费
     */
    @TableField("QDBLZPF")
    private Double qdblzpf;

    /**
     * (21)凝血因子类制品费
     */
    @TableField("NXYZLZPF")
    private Double nxyzlzpf;

    /**
     * (22)细胞因子类制品费
     */
    @TableField("XBYZLZPF")
    private Double xbyzlzpf;

    /**
     * 耗材类(23)检查用一次性医用材料费
     */
    @TableField("JCYYCLF")
    private Double jcyyclf;

    /**
     * (24)治疗用一次性医用材料费
     */
    @TableField("YYCLF")
    private Double yyclf;

    /**
     * (25)手术用一次性医用材料费
     */
    @TableField("SSYCXCLF")
    private Double ssycxclf;

    /**
     * 其他类(26)其他费
     */
    @TableField("QTF")
    private Double qtf;

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
