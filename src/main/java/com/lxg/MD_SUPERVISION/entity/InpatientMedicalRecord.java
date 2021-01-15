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
 * 2.3.7. 住院病案首页
 * </p>
 *
 * @author cmx
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("INPATIENT_MEDICAL_RECORD")
public class InpatientMedicalRecord implements Serializable {

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
     * 住院病案首页ID
     */
    @TableField("BUSINESS_LOCAL_ID")
    private String businessLocalId;

    /**
     * 患者本地唯一ID
     */
    @TableField("PATIENT_LOCAL_ID")
    private String patientLocalId;

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
     * 病案号
     */
    @TableField("A48")
    private String a48;

    /**
     * 住院号
     */
    @TableField("INPATIENT_NO")
    private String inpatientNo;

    /**
     * 住院次数
     */
    @TableField("A49")
    private Integer a49;

    /**
     * 入院时间
     */
    @TableField("B12")
    private LocalDateTime b12;

    /**
     * 出院时间
     */
    @TableField("B15")
    private LocalDateTime b15;

    /**
     * 健康卡号
     */
    @TableField("A47")
    private String a47;

    /**
     * 医疗付费方式
     */
    @TableField("A46C")
    private String a46c;

    /**
     * 姓名
     */
    @TableField("A11")
    private String a11;

    /**
     * 性别
     */
    @TableField("A12C")
    private String a12c;

    /**
     * 出生日期
     */
    @TableField("A13")
    private LocalDateTime a13;

    /**
     * 年龄(岁)
     */
    @TableField("A14")
    private Integer a14;

    /**
     * 国籍
     */
    @TableField("A15C")
    private String a15c;

    /**
     * 婚姻
     */
    @TableField("A21C")
    private String a21c;

    /**
     * 职业
     */
    @TableField("A38C")
    private String a38c;

    /**
     * 民族
     */
    @TableField("A19C")
    private String a19c;

    /**
     * 身份证号
     */
    @TableField("A20")
    private String a20;

    /**
     * 出生地址
     */
    @TableField("A22")
    private String a22;

    /**
     * 籍贯省（自治区、直辖市）
     */
    @TableField("A23C")
    private String a23c;

    /**
     * 户口地址
     */
    @TableField("A24")
    private String a24;

    /**
     * 户口地址邮政编码
     */
    @TableField("A25C")
    private String a25c;

    /**
     * 现住址
     */
    @TableField("A26")
    private String a26;

    /**
     * 现住址电话
     */
    @TableField("A27")
    private String a27;

    /**
     * 现住址邮政编码
     */
    @TableField("A28C")
    private String a28c;

    /**
     * 工作单位及地址
     */
    @TableField("A29")
    private String a29;

    /**
     * 工作单位电话
     */
    @TableField("A30")
    private String a30;

    /**
     * 工作单位邮政编码
     */
    @TableField("A31C")
    private String a31c;

    /**
     * 联系人姓名
     */
    @TableField("A32")
    private String a32;

    /**
     * 联系人关系
     */
    @TableField("A33C")
    private String a33c;

    /**
     * 联系人地址
     */
    @TableField("A34")
    private String a34;

    /**
     * 联系人电话
     */
    @TableField("A35")
    private String a35;

    /**
     * 入院途径
     */
    @TableField("B11C")
    private String b11c;

    /**
     * 入院科别
     */
    @TableField("B13C")
    private String b13c;

    /**
     * 入院病房
     */
    @TableField("B14")
    private String b14;

    /**
     * 转科科别
     */
    @TableField("B21C")
    private String b21c;

    /**
     * 出院科别
     */
    @TableField("B16C")
    private String b16c;

    /**
     * 出院病房
     */
    @TableField("B17")
    private String b17;

    /**
     * 实际住院(天)
     */
    @TableField("B20")
    private Integer b20;

    /**
     * 门(急)诊诊断编码
     */
    @TableField("C01C")
    private String c01c;

    /**
     * 门(急)诊诊断名称
     */
    @TableField("C02N")
    private String c02n;

    /**
     * 出院主要诊断编码
     */
    @TableField("C03C")
    private String c03c;

    /**
     * 出院主要诊断名称
     */
    @TableField("C04N")
    private String c04n;

    /**
     * 出院主要诊断入院病情
     */
    @TableField("C05C")
    private String c05c;

    /**
     * 出院其他诊断编码1
     */
    @TableField("C06X01C")
    private String c06x01c;

    /**
     * 出院其他诊断名称1
     */
    @TableField("C07X01N")
    private String c07x01n;

    /**
     * 出院其他诊断入院病情1
     */
    @TableField("C08X01C")
    private String c08x01c;

    /**
     * 出院其他诊断编码2
     */
    @TableField("C06X02C")
    private String c06x02c;

    /**
     * 出院其他诊断名称2
     */
    @TableField("C07X02N")
    private String c07x02n;

    /**
     * 出院其他诊断入院病情2
     */
    @TableField("C08X02C")
    private String c08x02c;

    /**
     * 出院其他诊断编码3
     */
    @TableField("C06X03C")
    private String c06x03c;

    /**
     * 出院其他诊断名称3
     */
    @TableField("C07X03N")
    private String c07x03n;

    /**
     * 出院其他诊断入院病情3
     */
    @TableField("C08X03C")
    private String c08x03c;

    /**
     * 出院其他诊断编码4
     */
    @TableField("C06X04C")
    private String c06x04c;

    /**
     * 出院其他诊断名称4
     */
    @TableField("C07X04N")
    private String c07x04n;

    /**
     * 出院其他诊断入院病情4
     */
    @TableField("C08X04C")
    private String c08x04c;

    /**
     * 出院其他诊断编码5
     */
    @TableField("C06X05C")
    private String c06x05c;

    /**
     * 出院其他诊断名称5
     */
    @TableField("C07X05N")
    private String c07x05n;

    /**
     * 出院其他诊断入院病情5
     */
    @TableField("C08X05C")
    private String c08x05c;

    /**
     * 出院其他诊断编码6
     */
    @TableField("C06X06C")
    private String c06x06c;

    /**
     * 出院其他诊断名称6
     */
    @TableField("C07X06N")
    private String c07x06n;

    /**
     * 出院其他诊断入院病情6
     */
    @TableField("C08X06C")
    private String c08x06c;

    /**
     * 出院其他诊断编码7
     */
    @TableField("C06X07C")
    private String c06x07c;

    /**
     * 出院其他诊断名称7
     */
    @TableField("C07X07N")
    private String c07x07n;

    /**
     * 出院其他诊断入院病情7
     */
    @TableField("C08X07C")
    private String c08x07c;

    /**
     * 出院其他诊断编码8
     */
    @TableField("C06X08C")
    private String c06x08c;

    /**
     * 出院其他诊断名称8
     */
    @TableField("C07X08N")
    private String c07x08n;

    /**
     * 出院其他诊断入院病情8
     */
    @TableField("C08X08C")
    private String c08x08c;

    /**
     * 出院其他诊断编码9
     */
    @TableField("C06X09C")
    private String c06x09c;

    /**
     * 出院其他诊断名称9
     */
    @TableField("C07X09N")
    private String c07x09n;

    /**
     * 出院其他诊断入院病情9
     */
    @TableField("C08X09C")
    private String c08x09c;

    /**
     * 出院其他诊断编码10
     */
    @TableField("C06X10C")
    private String c06x10c;

    /**
     * 出院其他诊断名称10
     */
    @TableField("C07X10N")
    private String c07x10n;

    /**
     * 出院其他诊断入院病情10
     */
    @TableField("C08X10C")
    private String c08x10c;

    /**
     * 出院其他诊断编码11
     */
    @TableField("C06X11C")
    private String c06x11c;

    /**
     * 出院其他诊断名称11
     */
    @TableField("C07X11N")
    private String c07x11n;

    /**
     * 出院其他诊断入院病情11
     */
    @TableField("C08X11C")
    private String c08x11c;

    /**
     * 出院其他诊断编码12
     */
    @TableField("C06X12C")
    private String c06x12c;

    /**
     * 出院其他诊断名称12
     */
    @TableField("C07X12N")
    private String c07x12n;

    /**
     * 出院其他诊断入院病情12
     */
    @TableField("C08X12C")
    private String c08x12c;

    /**
     * 出院其他诊断编码13
     */
    @TableField("C06X13C")
    private String c06x13c;

    /**
     * 出院其他诊断名称13
     */
    @TableField("C07X13N")
    private String c07x13n;

    /**
     * 出院其他诊断入院病情13
     */
    @TableField("C08X13C")
    private String c08x13c;

    /**
     * 出院其他诊断编码14
     */
    @TableField("C06X14C")
    private String c06x14c;

    /**
     * 出院其他诊断名称14
     */
    @TableField("C07X14N")
    private String c07x14n;

    /**
     * 出院其他诊断入院病情14
     */
    @TableField("C08X14C")
    private String c08x14c;

    /**
     * 出院其他诊断编码15
     */
    @TableField("C06X15C")
    private String c06x15c;

    /**
     * 出院其他诊断名称15
     */
    @TableField("C07X15N")
    private String c07x15n;

    /**
     * 出院其他诊断入院病情15
     */
    @TableField("C08X15C")
    private String c08x15c;

    /**
     * 出院其他诊断编码16
     */
    @TableField("C06X16C")
    private String c06x16c;

    /**
     * 出院其他诊断名称16
     */
    @TableField("C07X16N")
    private String c07x16n;

    /**
     * 出院其他诊断入院病情16
     */
    @TableField("C08X16C")
    private String c08x16c;

    /**
     * 出院其他诊断编码17
     */
    @TableField("C06X17C")
    private String c06x17c;

    /**
     * 出院其他诊断名称17
     */
    @TableField("C07X17N")
    private String c07x17n;

    /**
     * 出院其他诊断入院病情17
     */
    @TableField("C08X17C")
    private String c08x17c;

    /**
     * 出院其他诊断编码18
     */
    @TableField("C06X18C")
    private String c06x18c;

    /**
     * 出院其他诊断名称18
     */
    @TableField("C07X18N")
    private String c07x18n;

    /**
     * 出院其他诊断入院病情18
     */
    @TableField("C08X18C")
    private String c08x18c;

    /**
     * 出院其他诊断编码19
     */
    @TableField("C06X19C")
    private String c06x19c;

    /**
     * 出院其他诊断名称19
     */
    @TableField("C07X19N")
    private String c07x19n;

    /**
     * 出院其他诊断入院病情19
     */
    @TableField("C08X19C")
    private String c08x19c;

    /**
     * 出院其他诊断编码20
     */
    @TableField("C06X20C")
    private String c06x20c;

    /**
     * 出院其他诊断名称20
     */
    @TableField("C07X20N")
    private String c07x20n;

    /**
     * 出院其他诊断入院病情20
     */
    @TableField("C08X20C")
    private String c08x20c;

    /**
     * 出院其他诊断编码21
     */
    @TableField("C06X21C")
    private String c06x21c;

    /**
     * 出院其他诊断名称21
     */
    @TableField("C07X21N")
    private String c07x21n;

    /**
     * 出院其他诊断入院病情21
     */
    @TableField("C08X21C")
    private String c08x21c;

    /**
     * 出院其他诊断编码22
     */
    @TableField("C06X22C")
    private String c06x22c;

    /**
     * 出院其他诊断名称22
     */
    @TableField("C07X22N")
    private String c07x22n;

    /**
     * 出院其他诊断入院病情22
     */
    @TableField("C08X22C")
    private String c08x22c;

    /**
     * 出院其他诊断编码23
     */
    @TableField("C06X23C")
    private String c06x23c;

    /**
     * 出院其他诊断名称23
     */
    @TableField("C07X23N")
    private String c07x23n;

    /**
     * 出院其他诊断入院病情23
     */
    @TableField("C08X23C")
    private String c08x23c;

    /**
     * 出院其他诊断编码24
     */
    @TableField("C06X24C")
    private String c06x24c;

    /**
     * 出院其他诊断名称24
     */
    @TableField("C07X24N")
    private String c07x24n;

    /**
     * 出院其他诊断入院病情24
     */
    @TableField("C08X24C")
    private String c08x24c;

    /**
     * 出院其他诊断编码25
     */
    @TableField("C06X25C")
    private String c06x25c;

    /**
     * 出院其他诊断名称25
     */
    @TableField("C07X25N")
    private String c07x25n;

    /**
     * 出院其他诊断入院病情25
     */
    @TableField("C08X25C")
    private String c08x25c;

    /**
     * 出院其他诊断编码26
     */
    @TableField("C06X26C")
    private String c06x26c;

    /**
     * 出院其他诊断名称26
     */
    @TableField("C07X26N")
    private String c07x26n;

    /**
     * 出院其他诊断入院病情26
     */
    @TableField("C08X26C")
    private String c08x26c;

    /**
     * 出院其他诊断编码27
     */
    @TableField("C06X27C")
    private String c06x27c;

    /**
     * 出院其他诊断名称27
     */
    @TableField("C07X27N")
    private String c07x27n;

    /**
     * 出院其他诊断入院病情27
     */
    @TableField("C08X27C")
    private String c08x27c;

    /**
     * 出院其他诊断编码28
     */
    @TableField("C06X28C")
    private String c06x28c;

    /**
     * 出院其他诊断名称28
     */
    @TableField("C07X28N")
    private String c07x28n;

    /**
     * 出院其他诊断入院病情28
     */
    @TableField("C08X28C")
    private String c08x28c;

    /**
     * 出院其他诊断编码29
     */
    @TableField("C06X29C")
    private String c06x29c;

    /**
     * 出院其他诊断名称29
     */
    @TableField("C07X29N")
    private String c07x29n;

    /**
     * 出院其他诊断入院病情29
     */
    @TableField("C08X29C")
    private String c08x29c;

    /**
     * 出院其他诊断编码30
     */
    @TableField("C06X30C")
    private String c06x30c;

    /**
     * 出院其他诊断名称30
     */
    @TableField("C07X30N")
    private String c07x30n;

    /**
     * 出院其他诊断入院病情30
     */
    @TableField("C08X30C")
    private String c08x30c;

    /**
     * 出院其他诊断编码31
     */
    @TableField("C06X31C")
    private String c06x31c;

    /**
     * 出院其他诊断名称31
     */
    @TableField("C07X31N")
    private String c07x31n;

    /**
     * 出院其他诊断入院病情31
     */
    @TableField("C08X31C")
    private String c08x31c;

    /**
     * 出院其他诊断编码32
     */
    @TableField("C06X32C")
    private String c06x32c;

    /**
     * 出院其他诊断名称32
     */
    @TableField("C07X32N")
    private String c07x32n;

    /**
     * 出院其他诊断入院病情32
     */
    @TableField("C08X32C")
    private String c08x32c;

    /**
     * 出院其他诊断编码33
     */
    @TableField("C06X33C")
    private String c06x33c;

    /**
     * 出院其他诊断名称33
     */
    @TableField("C07X33N")
    private String c07x33n;

    /**
     * 出院其他诊断入院病情33
     */
    @TableField("C08X33C")
    private String c08x33c;

    /**
     * 出院其他诊断编码34
     */
    @TableField("C06X34C")
    private String c06x34c;

    /**
     * 出院其他诊断名称34
     */
    @TableField("C07X34N")
    private String c07x34n;

    /**
     * 出院其他诊断入院病情34
     */
    @TableField("C08X34C")
    private String c08x34c;

    /**
     * 出院其他诊断编码35
     */
    @TableField("C06X35C")
    private String c06x35c;

    /**
     * 出院其他诊断名称35
     */
    @TableField("C07X35N")
    private String c07x35n;

    /**
     * 出院其他诊断入院病情35
     */
    @TableField("C08X35C")
    private String c08x35c;

    /**
     * 出院其他诊断编码36
     */
    @TableField("C06X36C")
    private String c06x36c;

    /**
     * 出院其他诊断名称36
     */
    @TableField("C07X36N")
    private String c07x36n;

    /**
     * 出院其他诊断入院病情36
     */
    @TableField("C08X36C")
    private String c08x36c;

    /**
     * 出院其他诊断编码37
     */
    @TableField("C06X37C")
    private String c06x37c;

    /**
     * 出院其他诊断名称37
     */
    @TableField("C07X37N")
    private String c07x37n;

    /**
     * 出院其他诊断入院病情37
     */
    @TableField("C08X37C")
    private String c08x37c;

    /**
     * 出院其他诊断编码38
     */
    @TableField("C06X38C")
    private String c06x38c;

    /**
     * 出院其他诊断名称38
     */
    @TableField("C07X38N")
    private String c07x38n;

    /**
     * 出院其他诊断入院病情38
     */
    @TableField("C08X38C")
    private String c08x38c;

    /**
     * 出院其他诊断编码39
     */
    @TableField("C06X39C")
    private String c06x39c;

    /**
     * 出院其他诊断名称39
     */
    @TableField("C07X39N")
    private String c07x39n;

    /**
     * 出院其他诊断入院病情39
     */
    @TableField("C08X39C")
    private String c08x39c;

    /**
     * 出院其他诊断编码40
     */
    @TableField("C06X40C")
    private String c06x40c;

    /**
     * 出院其他诊断名称40
     */
    @TableField("C07X40N")
    private String c07x40n;

    /**
     * 出院其他诊断入院病情40
     */
    @TableField("C08X40C")
    private String c08x40c;

    /**
     * 病理诊断编码
     */
    @TableField("C09C")
    private String c09c;

    /**
     * 病理诊断名称
     */
    @TableField("C10N")
    private String c10n;

    /**
     * 病理号
     */
    @TableField("C11")
    private String c11;

    /**
     * 损伤、中毒外部原因编码
     */
    @TableField("C12C")
    private String c12c;

    /**
     * 损伤、中毒外部原因名称
     */
    @TableField("C13N")
    private String c13n;

    /**
     * 有无药物过敏
     */
    @TableField("C24C")
    private String c24c;

    /**
     * 过敏药物名称
     */
    @TableField("C25")
    private String c25;

    /**
     * 科主任
     */
    @TableField("B22")
    private String b22;

    /**
     * 主（副主）任医师
     */
    @TableField("B23")
    private String b23;

    /**
     * 主治医师
     */
    @TableField("B24")
    private String b24;

    /**
     * 住院医师
     */
    @TableField("B25")
    private String b25;

    /**
     * 责任护士
     */
    @TableField("B26")
    private String b26;

    /**
     * 进修医师
     */
    @TableField("B27")
    private String b27;

    /**
     * 实习医师
     */
    @TableField("B28")
    private String b28;

    /**
     * 编码员
     */
    @TableField("B29")
    private String b29;

    /**
     * 病案质量
     */
    @TableField("B30C")
    private String b30c;

    /**
     * 质控医师
     */
    @TableField("B31")
    private String b31;

    /**
     * 质控护师
     */
    @TableField("B32")
    private String b32;

    /**
     * 质控日期
     */
    @TableField("B33")
    private LocalDateTime b33;

    /**
     * 死亡患者尸检
     */
    @TableField("C34C")
    private String c34c;

    /**
     * ABO血型
     */
    @TableField("C26C")
    private String c26c;

    /**
     * Rh血型
     */
    @TableField("C27C")
    private String c27c;

    /**
     * 主要手术操作编码
     */
    @TableField("C14X01C")
    private String c14x01c;

    /**
     * 主要手术操作名称
     */
    @TableField("C15X01N")
    private String c15x01n;

    /**
     * 主要手术操作日期
     */
    @TableField("C16X01")
    private LocalDateTime c16x01;

    /**
     * 主要手术操作级别
     */
    @TableField("C17X01")
    private String c17x01;

    /**
     * 主要手术操作术者
     */
    @TableField("C18X01")
    private String c18x01;

    /**
     * 主要手术操作Ⅰ助
     */
    @TableField("C19X01")
    private String c19x01;

    /**
     * 主要手术操作Ⅱ助
     */
    @TableField("C20X01")
    private String c20x01;

    /**
     * 主要手术操作切口愈合等级
     */
    @TableField("C21X01C")
    private String c21x01c;

    /**
     * 主要手术操作麻醉方式
     */
    @TableField("C22X01C")
    private String c22x01c;

    /**
     * 主要手术操作麻醉医师
     */
    @TableField("C23X01")
    private String c23x01;

    /**
     * 其他手术操作编码1
     */
    @TableField("C35X01C")
    private String c35x01c;

    /**
     * 其他手术操作名称1
     */
    @TableField("C36X01N")
    private String c36x01n;

    /**
     * 其他手术操作日期1
     */
    @TableField("C37X01")
    private LocalDateTime c37x01;

    /**
     * 其他手术操作级别1
     */
    @TableField("C38X01")
    private String c38x01;

    /**
     * 其他手术操作术者1
     */
    @TableField("C39X01")
    private String c39x01;

    /**
     * 其他手术操作I助1
     */
    @TableField("C40X01")
    private String c40x01;

    /**
     * 其他手术操作II助1
     */
    @TableField("C41X01")
    private String c41x01;

    /**
     * 其他手术操作切口愈合等级1
     */
    @TableField("C42X01C")
    private String c42x01c;

    /**
     * 其他手术操作麻醉方式1
     */
    @TableField("C43X01C")
    private String c43x01c;

    /**
     * 其他手术操作麻醉医师1
     */
    @TableField("C44X01")
    private String c44x01;

    /**
     * 其他手术操作编码2
     */
    @TableField("C35X02C")
    private String c35x02c;

    /**
     * 其他手术操作名称2
     */
    @TableField("C36X02N")
    private String c36x02n;

    /**
     * 其他手术操作日期2
     */
    @TableField("C37X02")
    private LocalDateTime c37x02;

    /**
     * 其他手术操作级别2
     */
    @TableField("C38X02")
    private String c38x02;

    /**
     * 其他手术操作术者2
     */
    @TableField("C39X02")
    private String c39x02;

    /**
     * 其他手术操作I助2
     */
    @TableField("C40X02")
    private String c40x02;

    /**
     * 其他手术操作II助2
     */
    @TableField("C41X02")
    private String c41x02;

    /**
     * 其他手术操作切口愈合等级2
     */
    @TableField("C42X02C")
    private String c42x02c;

    /**
     * 其他手术操作麻醉方式2
     */
    @TableField("C43X02C")
    private String c43x02c;

    /**
     * 其他手术操作麻醉医师2
     */
    @TableField("C44X02")
    private String c44x02;

    /**
     * 其他手术操作编码3
     */
    @TableField("C35X03C")
    private String c35x03c;

    /**
     * 其他手术操作名称3
     */
    @TableField("C36X03N")
    private String c36x03n;

    /**
     * 其他手术操作日期3
     */
    @TableField("C37X03")
    private LocalDateTime c37x03;

    /**
     * 其他手术操作级别3
     */
    @TableField("C38X03")
    private String c38x03;

    /**
     * 其他手术操作术者3
     */
    @TableField("C39X03")
    private String c39x03;

    /**
     * 其他手术操作I助3
     */
    @TableField("C40X03")
    private String c40x03;

    /**
     * 其他手术操作II助3
     */
    @TableField("C41X03")
    private String c41x03;

    /**
     * 其他手术操作切口愈合等级3
     */
    @TableField("C42X03C")
    private String c42x03c;

    /**
     * 其他手术操作麻醉方式3
     */
    @TableField("C43X03C")
    private String c43x03c;

    /**
     * 其他手术操作麻醉医师3
     */
    @TableField("C44X03")
    private String c44x03;

    /**
     * 其他手术操作编码4
     */
    @TableField("C35X04C")
    private String c35x04c;

    /**
     * 其他手术操作名称4
     */
    @TableField("C36X04N")
    private String c36x04n;

    /**
     * 其他手术操作日期4
     */
    @TableField("C37X04")
    private LocalDateTime c37x04;

    /**
     * 其他手术操作级别4
     */
    @TableField("C38X04")
    private String c38x04;

    /**
     * 其他手术操作术者4
     */
    @TableField("C39X04")
    private String c39x04;

    /**
     * 其他手术操作I助4
     */
    @TableField("C40X04")
    private String c40x04;

    /**
     * 其他手术操作II助4
     */
    @TableField("C41X04")
    private String c41x04;

    /**
     * 其他手术操作切口愈合等级4
     */
    @TableField("C42X04C")
    private String c42x04c;

    /**
     * 其他手术操作麻醉方式4
     */
    @TableField("C43X04C")
    private String c43x04c;

    /**
     * 其他手术操作麻醉医师4
     */
    @TableField("C44X04")
    private String c44x04;

    /**
     * 其他手术操作编码5
     */
    @TableField("C35X05C")
    private String c35x05c;

    /**
     * 其他手术操作名称5
     */
    @TableField("C36X05N")
    private String c36x05n;

    /**
     * 其他手术操作日期5
     */
    @TableField("C37X05")
    private LocalDateTime c37x05;

    /**
     * 其他手术操作级别5
     */
    @TableField("C38X05")
    private String c38x05;

    /**
     * 其他手术操作术者5
     */
    @TableField("C39X05")
    private String c39x05;

    /**
     * 其他手术操作I助5
     */
    @TableField("C40X05")
    private String c40x05;

    /**
     * 其他手术操作II助5
     */
    @TableField("C41X05")
    private String c41x05;

    /**
     * 其他手术操作切口愈合等级5
     */
    @TableField("C42X05C")
    private String c42x05c;

    /**
     * 其他手术操作麻醉方式5
     */
    @TableField("C43X05C")
    private String c43x05c;

    /**
     * 其他手术操作麻醉医师5
     */
    @TableField("C44X05")
    private String c44x05;

    /**
     * 其他手术操作编码6
     */
    @TableField("C35X06C")
    private String c35x06c;

    /**
     * 其他手术操作名称6
     */
    @TableField("C36X06N")
    private String c36x06n;

    /**
     * 其他手术操作日期6
     */
    @TableField("C37X06")
    private LocalDateTime c37x06;

    /**
     * 其他手术操作级别6
     */
    @TableField("C38X06")
    private String c38x06;

    /**
     * 其他手术操作术者6
     */
    @TableField("C39X06")
    private String c39x06;

    /**
     * 其他手术操作I助6
     */
    @TableField("C40X06")
    private String c40x06;

    /**
     * 其他手术操作II助6
     */
    @TableField("C41X06")
    private String c41x06;

    /**
     * 其他手术操作切口愈合等级6
     */
    @TableField("C42X06C")
    private String c42x06c;

    /**
     * 其他手术操作麻醉方式6
     */
    @TableField("C43X06C")
    private String c43x06c;

    /**
     * 其他手术操作麻醉医师6
     */
    @TableField("C44X06")
    private String c44x06;

    /**
     * 其他手术操作编码7
     */
    @TableField("C35X07C")
    private String c35x07c;

    /**
     * 其他手术操作名称7
     */
    @TableField("C36X07N")
    private String c36x07n;

    /**
     * 其他手术操作日期7
     */
    @TableField("C37X07")
    private LocalDateTime c37x07;

    /**
     * 其他手术操作级别7
     */
    @TableField("C38X07")
    private String c38x07;

    /**
     * 其他手术操作术者7
     */
    @TableField("C39X07")
    private String c39x07;

    /**
     * 其他手术操作I助7
     */
    @TableField("C40X07")
    private String c40x07;

    /**
     * 其他手术操作II助7
     */
    @TableField("C41X07")
    private String c41x07;

    /**
     * 其他手术操作切口愈合等级7
     */
    @TableField("C42X07C")
    private String c42x07c;

    /**
     * 其他手术操作麻醉方式7
     */
    @TableField("C43X07C")
    private String c43x07c;

    /**
     * 其他手术操作麻醉医师7
     */
    @TableField("C44X07")
    private String c44x07;

    /**
     * 其他手术操作编码8
     */
    @TableField("C35X08C")
    private String c35x08c;

    /**
     * 其他手术操作名称8
     */
    @TableField("C36X08N")
    private String c36x08n;

    /**
     * 其他手术操作日期8
     */
    @TableField("C37X08")
    private LocalDateTime c37x08;

    /**
     * 其他手术操作级别8
     */
    @TableField("C38X08")
    private String c38x08;

    /**
     * 其他手术操作术者8
     */
    @TableField("C39X08")
    private String c39x08;

    /**
     * 其他手术操作I助8
     */
    @TableField("C40X08")
    private String c40x08;

    /**
     * 其他手术操作II助8
     */
    @TableField("C41X08")
    private String c41x08;

    /**
     * 其他手术操作切口愈合等级8
     */
    @TableField("C42X08C")
    private String c42x08c;

    /**
     * 其他手术操作麻醉方式8
     */
    @TableField("C43X08C")
    private String c43x08c;

    /**
     * 其他手术操作麻醉医师8
     */
    @TableField("C44X08")
    private String c44x08;

    /**
     * 其他手术操作编码9
     */
    @TableField("C35X09C")
    private String c35x09c;

    /**
     * 其他手术操作名称9
     */
    @TableField("C36X09N")
    private String c36x09n;

    /**
     * 其他手术操作日期9
     */
    @TableField("C37X09")
    private LocalDateTime c37x09;

    /**
     * 其他手术操作级别9
     */
    @TableField("C38X09")
    private String c38x09;

    /**
     * 其他手术操作术者9
     */
    @TableField("C39X09")
    private String c39x09;

    /**
     * 其他手术操作I助9
     */
    @TableField("C40X09")
    private String c40x09;

    /**
     * 其他手术操作II助9
     */
    @TableField("C41X09")
    private String c41x09;

    /**
     * 其他手术操作切口愈合等级9
     */
    @TableField("C42X09C")
    private String c42x09c;

    /**
     * 其他手术操作麻醉方式9
     */
    @TableField("C43X09C")
    private String c43x09c;

    /**
     * 其他手术操作麻醉医师9
     */
    @TableField("C44X09")
    private String c44x09;

    /**
     * 其他手术操作编码10
     */
    @TableField("C35X10C")
    private String c35x10c;

    /**
     * 其他手术操作名称10
     */
    @TableField("C36X10N")
    private String c36x10n;

    /**
     * 其他手术操作日期10
     */
    @TableField("C37X10")
    private LocalDateTime c37x10;

    /**
     * 其他手术操作级别10
     */
    @TableField("C38X10")
    private String c38x10;

    /**
     * 其他手术操作术者10
     */
    @TableField("C39X10")
    private String c39x10;

    /**
     * 其他手术操作I助10
     */
    @TableField("C40X10")
    private String c40x10;

    /**
     * 其他手术操作II助10
     */
    @TableField("C41X10")
    private String c41x10;

    /**
     * 其他手术操作切口愈合等级10
     */
    @TableField("C42X10C")
    private String c42x10c;

    /**
     * 其他手术操作麻醉方式10
     */
    @TableField("C43X10C")
    private String c43x10c;

    /**
     * 其他手术操作麻醉医师10
     */
    @TableField("C44X10")
    private String c44x10;

    /**
     * 其他手术操作编码11
     */
    @TableField("C35X11C")
    private String c35x11c;

    /**
     * 其他手术操作名称11
     */
    @TableField("C36X11N")
    private String c36x11n;

    /**
     * 其他手术操作日期11
     */
    @TableField("C37X11")
    private LocalDateTime c37x11;

    /**
     * 其他手术操作级别11
     */
    @TableField("C38X11")
    private String c38x11;

    /**
     * 其他手术操作术者11
     */
    @TableField("C39X11")
    private String c39x11;

    /**
     * 其他手术操作I助11
     */
    @TableField("C40X11")
    private String c40x11;

    /**
     * 其他手术操作II助11
     */
    @TableField("C41X11")
    private String c41x11;

    /**
     * 其他手术操作切口愈合等级11
     */
    @TableField("C42X11C")
    private String c42x11c;

    /**
     * 其他手术操作麻醉方式11
     */
    @TableField("C43X11C")
    private String c43x11c;

    /**
     * 其他手术操作麻醉医师11
     */
    @TableField("C44X11")
    private String c44x11;

    /**
     * 其他手术操作编码12
     */
    @TableField("C35X12C")
    private String c35x12c;

    /**
     * 其他手术操作名称12
     */
    @TableField("C36X12N")
    private String c36x12n;

    /**
     * 其他手术操作日期12
     */
    @TableField("C37X12")
    private LocalDateTime c37x12;

    /**
     * 其他手术操作级别12
     */
    @TableField("C38X12")
    private String c38x12;

    /**
     * 其他手术操作术者12
     */
    @TableField("C39X12")
    private String c39x12;

    /**
     * 其他手术操作I助12
     */
    @TableField("C40X12")
    private String c40x12;

    /**
     * 其他手术操作II助12
     */
    @TableField("C41X12")
    private String c41x12;

    /**
     * 其他手术操作切口愈合等级12
     */
    @TableField("C42X12C")
    private String c42x12c;

    /**
     * 其他手术操作麻醉方式12
     */
    @TableField("C43X12C")
    private String c43x12c;

    /**
     * 其他手术操作麻醉医师12
     */
    @TableField("C44X12")
    private String c44x12;

    /**
     * 其他手术操作编码13
     */
    @TableField("C35X13C")
    private String c35x13c;

    /**
     * 其他手术操作名称13
     */
    @TableField("C36X13N")
    private String c36x13n;

    /**
     * 其他手术操作日期13
     */
    @TableField("C37X13")
    private LocalDateTime c37x13;

    /**
     * 其他手术操作级别13
     */
    @TableField("C38X13")
    private String c38x13;

    /**
     * 其他手术操作术者13
     */
    @TableField("C39X13")
    private String c39x13;

    /**
     * 其他手术操作I助13
     */
    @TableField("C40X13")
    private String c40x13;

    /**
     * 其他手术操作II助13
     */
    @TableField("C41X13")
    private String c41x13;

    /**
     * 其他手术操作切口愈合等级13
     */
    @TableField("C42X13C")
    private String c42x13c;

    /**
     * 其他手术操作麻醉方式13
     */
    @TableField("C43X13C")
    private String c43x13c;

    /**
     * 其他手术操作麻醉医师13
     */
    @TableField("C44X13")
    private String c44x13;

    /**
     * 其他手术操作编码14
     */
    @TableField("C35X14C")
    private String c35x14c;

    /**
     * 其他手术操作名称14
     */
    @TableField("C36X14N")
    private String c36x14n;

    /**
     * 其他手术操作日期14
     */
    @TableField("C37X14")
    private LocalDateTime c37x14;

    /**
     * 其他手术操作级别14
     */
    @TableField("C38X14")
    private String c38x14;

    /**
     * 其他手术操作术者14
     */
    @TableField("C39X14")
    private String c39x14;

    /**
     * 其他手术操作I助14
     */
    @TableField("C40X14")
    private String c40x14;

    /**
     * 其他手术操作II助14
     */
    @TableField("C41X14")
    private String c41x14;

    /**
     * 其他手术操作切口愈合等级14
     */
    @TableField("C42X14C")
    private String c42x14c;

    /**
     * 其他手术操作麻醉方式14
     */
    @TableField("C43X14C")
    private String c43x14c;

    /**
     * 其他手术操作麻醉医师14
     */
    @TableField("C44X14")
    private String c44x14;

    /**
     * 其他手术操作编码15
     */
    @TableField("C35X15C")
    private String c35x15c;

    /**
     * 其他手术操作名称15
     */
    @TableField("C36X15N")
    private String c36x15n;

    /**
     * 其他手术操作日期15
     */
    @TableField("C37X15")
    private LocalDateTime c37x15;

    /**
     * 其他手术操作级别15
     */
    @TableField("C38X15")
    private String c38x15;

    /**
     * 其他手术操作术者15
     */
    @TableField("C39X15")
    private String c39x15;

    /**
     * 其他手术操作I助15
     */
    @TableField("C40X15")
    private String c40x15;

    /**
     * 其他手术操作II助15
     */
    @TableField("C41X15")
    private String c41x15;

    /**
     * 其他手术操作切口愈合等级15
     */
    @TableField("C42X15C")
    private String c42x15c;

    /**
     * 其他手术操作麻醉方式15
     */
    @TableField("C43X15C")
    private String c43x15c;

    /**
     * 其他手术操作麻醉医师15
     */
    @TableField("C44X15")
    private String c44x15;

    /**
     * 其他手术操作编码16
     */
    @TableField("C35X16C")
    private String c35x16c;

    /**
     * 其他手术操作名称16
     */
    @TableField("C36X16N")
    private String c36x16n;

    /**
     * 其他手术操作日期16
     */
    @TableField("C37X16")
    private LocalDateTime c37x16;

    /**
     * 其他手术操作级别16
     */
    @TableField("C38X16")
    private String c38x16;

    /**
     * 其他手术操作术者16
     */
    @TableField("C39X16")
    private String c39x16;

    /**
     * 其他手术操作I助16
     */
    @TableField("C40X16")
    private String c40x16;

    /**
     * 其他手术操作II助16
     */
    @TableField("C41X16")
    private String c41x16;

    /**
     * 其他手术操作切口愈合等级16
     */
    @TableField("C42X16C")
    private String c42x16c;

    /**
     * 其他手术操作麻醉方式16
     */
    @TableField("C43X16C")
    private String c43x16c;

    /**
     * 其他手术操作麻醉医师16
     */
    @TableField("C44X16")
    private String c44x16;

    /**
     * 其他手术操作编码17
     */
    @TableField("C35X17C")
    private String c35x17c;

    /**
     * 其他手术操作名称17
     */
    @TableField("C36X17N")
    private String c36x17n;

    /**
     * 其他手术操作日期17
     */
    @TableField("C37X17")
    private LocalDateTime c37x17;

    /**
     * 其他手术操作级别17
     */
    @TableField("C38X17")
    private String c38x17;

    /**
     * 其他手术操作术者17
     */
    @TableField("C39X17")
    private String c39x17;

    /**
     * 其他手术操作I助17
     */
    @TableField("C40X17")
    private String c40x17;

    /**
     * 其他手术操作II助17
     */
    @TableField("C41X17")
    private String c41x17;

    /**
     * 其他手术操作切口愈合等级17
     */
    @TableField("C42X17C")
    private String c42x17c;

    /**
     * 其他手术操作麻醉方式17
     */
    @TableField("C43X17C")
    private String c43x17c;

    /**
     * 其他手术操作麻醉医师17
     */
    @TableField("C44X17")
    private String c44x17;

    /**
     * 其他手术操作编码18
     */
    @TableField("C35X18C")
    private String c35x18c;

    /**
     * 其他手术操作名称18
     */
    @TableField("C36X18N")
    private String c36x18n;

    /**
     * 其他手术操作日期18
     */
    @TableField("C37X18")
    private LocalDateTime c37x18;

    /**
     * 其他手术操作级别18
     */
    @TableField("C38X18")
    private String c38x18;

    /**
     * 其他手术操作术者18
     */
    @TableField("C39X18")
    private String c39x18;

    /**
     * 其他手术操作I助18
     */
    @TableField("C40X18")
    private String c40x18;

    /**
     * 其他手术操作II助18
     */
    @TableField("C41X18")
    private String c41x18;

    /**
     * 其他手术操作切口愈合等级18
     */
    @TableField("C42X18C")
    private String c42x18c;

    /**
     * 其他手术操作麻醉方式18
     */
    @TableField("C43X18C")
    private String c43x18c;

    /**
     * 其他手术操作麻醉医师18
     */
    @TableField("C44X18")
    private String c44x18;

    /**
     * 其他手术操作编码19
     */
    @TableField("C35X19C")
    private String c35x19c;

    /**
     * 其他手术操作名称19
     */
    @TableField("C36X19N")
    private String c36x19n;

    /**
     * 其他手术操作日期19
     */
    @TableField("C37X19")
    private LocalDateTime c37x19;

    /**
     * 其他手术操作级别19
     */
    @TableField("C38X19")
    private String c38x19;

    /**
     * 其他手术操作术者19
     */
    @TableField("C39X19")
    private String c39x19;

    /**
     * 其他手术操作I助19
     */
    @TableField("C40X19")
    private String c40x19;

    /**
     * 其他手术操作II助19
     */
    @TableField("C41X19")
    private String c41x19;

    /**
     * 其他手术操作切口愈合等级19
     */
    @TableField("C42X19C")
    private String c42x19c;

    /**
     * 其他手术操作麻醉方式19
     */
    @TableField("C43X19C")
    private String c43x19c;

    /**
     * 其他手术操作麻醉医师19
     */
    @TableField("C44X19")
    private String c44x19;

    /**
     * 其他手术操作编码20
     */
    @TableField("C35X20C")
    private String c35x20c;

    /**
     * 其他手术操作名称20
     */
    @TableField("C36X20N")
    private String c36x20n;

    /**
     * 其他手术操作日期20
     */
    @TableField("C37X20")
    private LocalDateTime c37x20;

    /**
     * 其他手术操作级别20
     */
    @TableField("C38X20")
    private String c38x20;

    /**
     * 其他手术操作术者20
     */
    @TableField("C39X20")
    private String c39x20;

    /**
     * 其他手术操作I助20
     */
    @TableField("C40X20")
    private String c40x20;

    /**
     * 其他手术操作II助20
     */
    @TableField("C41X20")
    private String c41x20;

    /**
     * 其他手术操作切口愈合等级20
     */
    @TableField("C42X20C")
    private String c42x20c;

    /**
     * 其他手术操作麻醉方式20
     */
    @TableField("C43X20C")
    private String c43x20c;

    /**
     * 其他手术操作麻醉医师20
     */
    @TableField("C44X20")
    private String c44x20;

    /**
     * 其他手术操作编码21
     */
    @TableField("C35X21C")
    private String c35x21c;

    /**
     * 其他手术操作名称21
     */
    @TableField("C36X21N")
    private String c36x21n;

    /**
     * 其他手术操作日期21
     */
    @TableField("C37X21")
    private LocalDateTime c37x21;

    /**
     * 其他手术操作级别21
     */
    @TableField("C38X21")
    private String c38x21;

    /**
     * 其他手术操作术者21
     */
    @TableField("C39X21")
    private String c39x21;

    /**
     * 其他手术操作I助21
     */
    @TableField("C40X21")
    private String c40x21;

    /**
     * 其他手术操作II助21
     */
    @TableField("C41X21")
    private String c41x21;

    /**
     * 其他手术操作切口愈合等级21
     */
    @TableField("C42X21C")
    private String c42x21c;

    /**
     * 其他手术操作麻醉方式21
     */
    @TableField("C43X21C")
    private String c43x21c;

    /**
     * 其他手术操作麻醉医师21
     */
    @TableField("C44X21")
    private String c44x21;

    /**
     * 其他手术操作编码22
     */
    @TableField("C35X22C")
    private String c35x22c;

    /**
     * 其他手术操作名称22
     */
    @TableField("C36X22N")
    private String c36x22n;

    /**
     * 其他手术操作日期22
     */
    @TableField("C37X22")
    private LocalDateTime c37x22;

    /**
     * 其他手术操作级别22
     */
    @TableField("C38X22")
    private String c38x22;

    /**
     * 其他手术操作术者22
     */
    @TableField("C39X22")
    private String c39x22;

    /**
     * 其他手术操作I助22
     */
    @TableField("C40X22")
    private String c40x22;

    /**
     * 其他手术操作II助22
     */
    @TableField("C41X22")
    private String c41x22;

    /**
     * 其他手术操作切口愈合等级22
     */
    @TableField("C42X22C")
    private String c42x22c;

    /**
     * 其他手术操作麻醉方式22
     */
    @TableField("C43X22C")
    private String c43x22c;

    /**
     * 其他手术操作麻醉医师22
     */
    @TableField("C44X22")
    private String c44x22;

    /**
     * 其他手术操作编码23
     */
    @TableField("C35X23C")
    private String c35x23c;

    /**
     * 其他手术操作名称23
     */
    @TableField("C36X23N")
    private String c36x23n;

    /**
     * 其他手术操作日期23
     */
    @TableField("C37X23")
    private LocalDateTime c37x23;

    /**
     * 其他手术操作级别23
     */
    @TableField("C38X23")
    private String c38x23;

    /**
     * 其他手术操作术者23
     */
    @TableField("C39X23")
    private String c39x23;

    /**
     * 其他手术操作I助23
     */
    @TableField("C40X23")
    private String c40x23;

    /**
     * 其他手术操作II助23
     */
    @TableField("C41X23")
    private String c41x23;

    /**
     * 其他手术操作切口愈合等级23
     */
    @TableField("C42X23C")
    private String c42x23c;

    /**
     * 其他手术操作麻醉方式23
     */
    @TableField("C43X23C")
    private String c43x23c;

    /**
     * 其他手术操作麻醉医师23
     */
    @TableField("C44X23")
    private String c44x23;

    /**
     * 其他手术操作编码24
     */
    @TableField("C35X24C")
    private String c35x24c;

    /**
     * 其他手术操作名称24
     */
    @TableField("C36X24N")
    private String c36x24n;

    /**
     * 其他手术操作日期24
     */
    @TableField("C37X24")
    private LocalDateTime c37x24;

    /**
     * 其他手术操作级别24
     */
    @TableField("C38X24")
    private String c38x24;

    /**
     * 其他手术操作术者24
     */
    @TableField("C39X24")
    private String c39x24;

    /**
     * 其他手术操作I助24
     */
    @TableField("C40X24")
    private String c40x24;

    /**
     * 其他手术操作II助24
     */
    @TableField("C41X24")
    private String c41x24;

    /**
     * 其他手术操作切口愈合等级24
     */
    @TableField("C42X24C")
    private String c42x24c;

    /**
     * 其他手术操作麻醉方式24
     */
    @TableField("C43X24C")
    private String c43x24c;

    /**
     * 其他手术操作麻醉医师24
     */
    @TableField("C44X24")
    private String c44x24;

    /**
     * 其他手术操作编码25
     */
    @TableField("C35X25C")
    private String c35x25c;

    /**
     * 其他手术操作名称25
     */
    @TableField("C36X25N")
    private String c36x25n;

    /**
     * 其他手术操作日期25
     */
    @TableField("C37X25")
    private LocalDateTime c37x25;

    /**
     * 其他手术操作级别25
     */
    @TableField("C38X25")
    private String c38x25;

    /**
     * 其他手术操作术者25
     */
    @TableField("C39X25")
    private String c39x25;

    /**
     * 其他手术操作I助25
     */
    @TableField("C40X25")
    private String c40x25;

    /**
     * 其他手术操作II助25
     */
    @TableField("C41X25")
    private String c41x25;

    /**
     * 其他手术操作切口愈合等级25
     */
    @TableField("C42X25C")
    private String c42x25c;

    /**
     * 其他手术操作麻醉方式25
     */
    @TableField("C43X25C")
    private String c43x25c;

    /**
     * 其他手术操作麻醉医师25
     */
    @TableField("C44X25")
    private String c44x25;

    /**
     * 其他手术操作编码26
     */
    @TableField("C35X26C")
    private String c35x26c;

    /**
     * 其他手术操作名称26
     */
    @TableField("C36X26N")
    private String c36x26n;

    /**
     * 其他手术操作日期26
     */
    @TableField("C37X26")
    private LocalDateTime c37x26;

    /**
     * 其他手术操作级别26
     */
    @TableField("C38X26")
    private String c38x26;

    /**
     * 其他手术操作术者26
     */
    @TableField("C39X26")
    private String c39x26;

    /**
     * 其他手术操作I助26
     */
    @TableField("C40X26")
    private String c40x26;

    /**
     * 其他手术操作II助26
     */
    @TableField("C41X26")
    private String c41x26;

    /**
     * 其他手术操作切口愈合等级26
     */
    @TableField("C42X26C")
    private String c42x26c;

    /**
     * 其他手术操作麻醉方式26
     */
    @TableField("C43X26C")
    private String c43x26c;

    /**
     * 其他手术操作麻醉医师26
     */
    @TableField("C44X26")
    private String c44x26;

    /**
     * 其他手术操作编码27
     */
    @TableField("C35X27C")
    private String c35x27c;

    /**
     * 其他手术操作名称27
     */
    @TableField("C36X27N")
    private String c36x27n;

    /**
     * 其他手术操作日期27
     */
    @TableField("C37X27")
    private LocalDateTime c37x27;

    /**
     * 其他手术操作级别27
     */
    @TableField("C38X27")
    private String c38x27;

    /**
     * 其他手术操作术者27
     */
    @TableField("C39X27")
    private String c39x27;

    /**
     * 其他手术操作I助27
     */
    @TableField("C40X27")
    private String c40x27;

    /**
     * 其他手术操作II助27
     */
    @TableField("C41X27")
    private String c41x27;

    /**
     * 其他手术操作切口愈合等级27
     */
    @TableField("C42X27C")
    private String c42x27c;

    /**
     * 其他手术操作麻醉方式27
     */
    @TableField("C43X27C")
    private String c43x27c;

    /**
     * 其他手术操作麻醉医师27
     */
    @TableField("C44X27")
    private String c44x27;

    /**
     * 其他手术操作编码28
     */
    @TableField("C35X28C")
    private String c35x28c;

    /**
     * 其他手术操作名称28
     */
    @TableField("C36X28N")
    private String c36x28n;

    /**
     * 其他手术操作日期28
     */
    @TableField("C37X28")
    private LocalDateTime c37x28;

    /**
     * 其他手术操作级别28
     */
    @TableField("C38X28")
    private String c38x28;

    /**
     * 其他手术操作术者28
     */
    @TableField("C39X28")
    private String c39x28;

    /**
     * 其他手术操作I助28
     */
    @TableField("C40X28")
    private String c40x28;

    /**
     * 其他手术操作II助28
     */
    @TableField("C41X28")
    private String c41x28;

    /**
     * 其他手术操作切口愈合等级28
     */
    @TableField("C42X28C")
    private String c42x28c;

    /**
     * 其他手术操作麻醉方式28
     */
    @TableField("C43X28C")
    private String c43x28c;

    /**
     * 其他手术操作麻醉医师28
     */
    @TableField("C44X28")
    private String c44x28;

    /**
     * 其他手术操作编码29
     */
    @TableField("C35X29C")
    private String c35x29c;

    /**
     * 其他手术操作名称29
     */
    @TableField("C36X29N")
    private String c36x29n;

    /**
     * 其他手术操作日期29
     */
    @TableField("C37X29")
    private LocalDateTime c37x29;

    /**
     * 其他手术操作级别29
     */
    @TableField("C38X29")
    private String c38x29;

    /**
     * 其他手术操作术者29
     */
    @TableField("C39X29")
    private String c39x29;

    /**
     * 其他手术操作I助29
     */
    @TableField("C40X29")
    private String c40x29;

    /**
     * 其他手术操作II助29
     */
    @TableField("C41X29")
    private String c41x29;

    /**
     * 其他手术操作切口愈合等级29
     */
    @TableField("C42X29C")
    private String c42x29c;

    /**
     * 其他手术操作麻醉方式29
     */
    @TableField("C43X29C")
    private String c43x29c;

    /**
     * 其他手术操作麻醉医师29
     */
    @TableField("C44X29")
    private String c44x29;

    /**
     * 其他手术操作编码30
     */
    @TableField("C35X30C")
    private String c35x30c;

    /**
     * 其他手术操作名称30
     */
    @TableField("C36X30N")
    private String c36x30n;

    /**
     * 其他手术操作日期30
     */
    @TableField("C37X30")
    private LocalDateTime c37x30;

    /**
     * 其他手术操作级别30
     */
    @TableField("C38X30")
    private String c38x30;

    /**
     * 其他手术操作术者30
     */
    @TableField("C39X30")
    private String c39x30;

    /**
     * 其他手术操作I助30
     */
    @TableField("C40X30")
    private String c40x30;

    /**
     * 其他手术操作II助30
     */
    @TableField("C41X30")
    private String c41x30;

    /**
     * 其他手术操作切口愈合等级30
     */
    @TableField("C42X30C")
    private String c42x30c;

    /**
     * 其他手术操作麻醉方式30
     */
    @TableField("C43X30C")
    private String c43x30c;

    /**
     * 其他手术操作麻醉医师30
     */
    @TableField("C44X30")
    private String c44x30;

    /**
     * 其他手术操作编码31
     */
    @TableField("C35X31C")
    private String c35x31c;

    /**
     * 其他手术操作名称31
     */
    @TableField("C36X31N")
    private String c36x31n;

    /**
     * 其他手术操作日期31
     */
    @TableField("C37X31")
    private LocalDateTime c37x31;

    /**
     * 其他手术操作级别31
     */
    @TableField("C38X31")
    private String c38x31;

    /**
     * 其他手术操作术者31
     */
    @TableField("C39X31")
    private String c39x31;

    /**
     * 其他手术操作I助31
     */
    @TableField("C40X31")
    private String c40x31;

    /**
     * 其他手术操作II助31
     */
    @TableField("C41X31")
    private String c41x31;

    /**
     * 其他手术操作切口愈合等级31
     */
    @TableField("C42X31C")
    private String c42x31c;

    /**
     * 其他手术操作麻醉方式31
     */
    @TableField("C43X31C")
    private String c43x31c;

    /**
     * 其他手术操作麻醉医师31
     */
    @TableField("C44X31")
    private String c44x31;

    /**
     * 其他手术操作编码32
     */
    @TableField("C35X32C")
    private String c35x32c;

    /**
     * 其他手术操作名称32
     */
    @TableField("C36X32N")
    private String c36x32n;

    /**
     * 其他手术操作日期32
     */
    @TableField("C37X32")
    private LocalDateTime c37x32;

    /**
     * 其他手术操作级别32
     */
    @TableField("C38X32")
    private String c38x32;

    /**
     * 其他手术操作术者32
     */
    @TableField("C39X32")
    private String c39x32;

    /**
     * 其他手术操作I助32
     */
    @TableField("C40X32")
    private String c40x32;

    /**
     * 其他手术操作II助32
     */
    @TableField("C41X32")
    private String c41x32;

    /**
     * 其他手术操作切口愈合等级32
     */
    @TableField("C42X32C")
    private String c42x32c;

    /**
     * 其他手术操作麻醉方式32
     */
    @TableField("C43X32C")
    private String c43x32c;

    /**
     * 其他手术操作麻醉医师32
     */
    @TableField("C44X32")
    private String c44x32;

    /**
     * 其他手术操作编码33
     */
    @TableField("C35X33C")
    private String c35x33c;

    /**
     * 其他手术操作名称33
     */
    @TableField("C36X33N")
    private String c36x33n;

    /**
     * 其他手术操作日期33
     */
    @TableField("C37X33")
    private LocalDateTime c37x33;

    /**
     * 其他手术操作级别33
     */
    @TableField("C38X33")
    private String c38x33;

    /**
     * 其他手术操作术者33
     */
    @TableField("C39X33")
    private String c39x33;

    /**
     * 其他手术操作I助33
     */
    @TableField("C40X33")
    private String c40x33;

    /**
     * 其他手术操作II助33
     */
    @TableField("C41X33")
    private String c41x33;

    /**
     * 其他手术操作切口愈合等级33
     */
    @TableField("C42X33C")
    private String c42x33c;

    /**
     * 其他手术操作麻醉方式33
     */
    @TableField("C43X33C")
    private String c43x33c;

    /**
     * 其他手术操作麻醉医师33
     */
    @TableField("C44X33")
    private String c44x33;

    /**
     * 其他手术操作编码34
     */
    @TableField("C35X34C")
    private String c35x34c;

    /**
     * 其他手术操作名称34
     */
    @TableField("C36X34N")
    private String c36x34n;

    /**
     * 其他手术操作日期34
     */
    @TableField("C37X34")
    private LocalDateTime c37x34;

    /**
     * 其他手术操作级别34
     */
    @TableField("C38X34")
    private String c38x34;

    /**
     * 其他手术操作术者34
     */
    @TableField("C39X34")
    private String c39x34;

    /**
     * 其他手术操作I助34
     */
    @TableField("C40X34")
    private String c40x34;

    /**
     * 其他手术操作II助34
     */
    @TableField("C41X34")
    private String c41x34;

    /**
     * 其他手术操作切口愈合等级34
     */
    @TableField("C42X34C")
    private String c42x34c;

    /**
     * 其他手术操作麻醉方式34
     */
    @TableField("C43X34C")
    private String c43x34c;

    /**
     * 其他手术操作麻醉医师34
     */
    @TableField("C44X34")
    private String c44x34;

    /**
     * 其他手术操作编码35
     */
    @TableField("C35X35C")
    private String c35x35c;

    /**
     * 其他手术操作名称35
     */
    @TableField("C36X35N")
    private String c36x35n;

    /**
     * 其他手术操作日期35
     */
    @TableField("C37X35")
    private LocalDateTime c37x35;

    /**
     * 其他手术操作级别35
     */
    @TableField("C38X35")
    private String c38x35;

    /**
     * 其他手术操作术者35
     */
    @TableField("C39X35")
    private String c39x35;

    /**
     * 其他手术操作I助35
     */
    @TableField("C40X35")
    private String c40x35;

    /**
     * 其他手术操作II助35
     */
    @TableField("C41X35")
    private String c41x35;

    /**
     * 其他手术操作切口愈合等级35
     */
    @TableField("C42X35C")
    private String c42x35c;

    /**
     * 其他手术操作麻醉方式35
     */
    @TableField("C43X35C")
    private String c43x35c;

    /**
     * 其他手术操作麻醉医师35
     */
    @TableField("C44X35")
    private String c44x35;

    /**
     * 其他手术操作编码36
     */
    @TableField("C35X36C")
    private String c35x36c;

    /**
     * 其他手术操作名称36
     */
    @TableField("C36X36N")
    private String c36x36n;

    /**
     * 其他手术操作日期36
     */
    @TableField("C37X36")
    private LocalDateTime c37x36;

    /**
     * 其他手术操作级别36
     */
    @TableField("C38X36")
    private String c38x36;

    /**
     * 其他手术操作术者36
     */
    @TableField("C39X36")
    private String c39x36;

    /**
     * 其他手术操作I助36
     */
    @TableField("C40X36")
    private String c40x36;

    /**
     * 其他手术操作II助36
     */
    @TableField("C41X36")
    private String c41x36;

    /**
     * 其他手术操作切口愈合等级36
     */
    @TableField("C42X36C")
    private String c42x36c;

    /**
     * 其他手术操作麻醉方式36
     */
    @TableField("C43X36C")
    private String c43x36c;

    /**
     * 其他手术操作麻醉医师36
     */
    @TableField("C44X36")
    private String c44x36;

    /**
     * 其他手术操作编码37
     */
    @TableField("C35X37C")
    private String c35x37c;

    /**
     * 其他手术操作名称37
     */
    @TableField("C36X37N")
    private String c36x37n;

    /**
     * 其他手术操作日期37
     */
    @TableField("C37X37")
    private LocalDateTime c37x37;

    /**
     * 其他手术操作级别37
     */
    @TableField("C38X37")
    private String c38x37;

    /**
     * 其他手术操作术者37
     */
    @TableField("C39X37")
    private String c39x37;

    /**
     * 其他手术操作I助37
     */
    @TableField("C40X37")
    private String c40x37;

    /**
     * 其他手术操作II助37
     */
    @TableField("C41X37")
    private String c41x37;

    /**
     * 其他手术操作切口愈合等级37
     */
    @TableField("C42X37C")
    private String c42x37c;

    /**
     * 其他手术操作麻醉方式37
     */
    @TableField("C43X37C")
    private String c43x37c;

    /**
     * 其他手术操作麻醉医师37
     */
    @TableField("C44X37")
    private String c44x37;

    /**
     * 其他手术操作编码38
     */
    @TableField("C35X38C")
    private String c35x38c;

    /**
     * 其他手术操作名称38
     */
    @TableField("C36X38N")
    private String c36x38n;

    /**
     * 其他手术操作日期38
     */
    @TableField("C37X38")
    private LocalDateTime c37x38;

    /**
     * 其他手术操作级别38
     */
    @TableField("C38X38")
    private String c38x38;

    /**
     * 其他手术操作术者38
     */
    @TableField("C39X38")
    private String c39x38;

    /**
     * 其他手术操作I助38
     */
    @TableField("C40X38")
    private String c40x38;

    /**
     * 其他手术操作II助38
     */
    @TableField("C41X38")
    private String c41x38;

    /**
     * 其他手术操作切口愈合等级38
     */
    @TableField("C42X38C")
    private String c42x38c;

    /**
     * 其他手术操作麻醉方式38
     */
    @TableField("C43X38C")
    private String c43x38c;

    /**
     * 其他手术操作麻醉医师38
     */
    @TableField("C44X38")
    private String c44x38;

    /**
     * 其他手术操作编码39
     */
    @TableField("C35X39C")
    private String c35x39c;

    /**
     * 其他手术操作名称39
     */
    @TableField("C36X39N")
    private String c36x39n;

    /**
     * 其他手术操作日期39
     */
    @TableField("C37X39")
    private LocalDateTime c37x39;

    /**
     * 其他手术操作级别39
     */
    @TableField("C38X39")
    private String c38x39;

    /**
     * 其他手术操作术者39
     */
    @TableField("C39X39")
    private String c39x39;

    /**
     * 其他手术操作I助39
     */
    @TableField("C40X39")
    private String c40x39;

    /**
     * 其他手术操作II助39
     */
    @TableField("C41X39")
    private String c41x39;

    /**
     * 其他手术操作切口愈合等级39
     */
    @TableField("C42X39C")
    private String c42x39c;

    /**
     * 其他手术操作麻醉方式39
     */
    @TableField("C43X39C")
    private String c43x39c;

    /**
     * 其他手术操作麻醉医师39
     */
    @TableField("C44X39")
    private String c44x39;

    /**
     * 其他手术操作编码40
     */
    @TableField("C35X40C")
    private String c35x40c;

    /**
     * 其他手术操作名称40
     */
    @TableField("C36X40N")
    private String c36x40n;

    /**
     * 其他手术操作日期40
     */
    @TableField("C37X40")
    private LocalDateTime c37x40;

    /**
     * 其他手术操作级别40
     */
    @TableField("C38X40")
    private String c38x40;

    /**
     * 其他手术操作术者40
     */
    @TableField("C39X40")
    private String c39x40;

    /**
     * 其他手术操作I助40
     */
    @TableField("C40X40")
    private String c40x40;

    /**
     * 其他手术操作II助40
     */
    @TableField("C41X40")
    private String c41x40;

    /**
     * 其他手术操作切口愈合等级40
     */
    @TableField("C42X40C")
    private String c42x40c;

    /**
     * 其他手术操作麻醉方式40
     */
    @TableField("C43X40C")
    private String c43x40c;

    /**
     * 其他手术操作麻醉医师40
     */
    @TableField("C44X40")
    private String c44x40;

    /**
     * 年龄不足1周岁的年龄(天)
     */
    @TableField("A16")
    private Integer a16;

    /**
     * 新生儿出生体重(克)
     */
    @TableField("A18X01")
    private Integer a18x01;

    /**
     * 新生儿出生体重(克)2
     */
    @TableField("A18X02")
    private Integer a18x02;

    /**
     * 新生儿出生体重(克)3
     */
    @TableField("A18X03")
    private Integer a18x03;

    /**
     * 新生儿出生体重(克)4
     */
    @TableField("A18X04")
    private Integer a18x04;

    /**
     * 新生儿出生体重(克)5
     */
    @TableField("A18X05")
    private Integer a18x05;

    /**
     * 新生儿入院体重(克)
     */
    @TableField("A17")
    private Integer a17;

    /**
     * 颅脑损伤患者入院前昏迷时间(天)
     */
    @TableField("C28")
    private Integer c28;

    /**
     * 颅脑损伤患者入院前昏迷时间(小时)
     */
    @TableField("C29")
    private Integer c29;

    /**
     * 颅脑损伤患者入院前昏迷时间(分钟)
     */
    @TableField("C30")
    private Integer c30;

    /**
     * 颅脑损伤患者入院后昏迷时间(天)
     */
    @TableField("C31")
    private Integer c31;

    /**
     * 颅脑损伤患者入院后昏迷时间(小时)
     */
    @TableField("C32")
    private Integer c32;

    /**
     * 颅脑损伤患者入院后昏迷时间(分钟)
     */
    @TableField("C33")
    private Integer c33;

    /**
     * 是否有出院31日内再住院计划
     */
    @TableField("B36C")
    private Integer b36c;

    /**
     * 出院31天再住院计划目的
     */
    @TableField("B37")
    private String b37;

    /**
     * 离院方式
     */
    @TableField("B34C")
    private String b34c;

    /**
     * 医嘱转院、转社区卫生服务机构/乡镇卫生院名称
     */
    @TableField("B35")
    private String b35;

    /**
     * 住院总费用
     */
    @TableField("D01")
    private Double d01;

    /**
     * 住院总费用其中自付金额
     */
    @TableField("D09")
    private Double d09;

    /**
     * 1.一般医疗服务费
     */
    @TableField("D11")
    private Double d11;

    /**
     * 2.一般治疗操作费
     */
    @TableField("D12")
    private Double d12;

    /**
     * 3.护理费
     */
    @TableField("D13")
    private Double d13;

    /**
     * 4.综合医疗服务类其他费用
     */
    @TableField("D14")
    private Double d14;

    /**
     * 5.病理诊断费
     */
    @TableField("D15")
    private Double d15;

    /**
     * 6.实验室诊断费
     */
    @TableField("D16")
    private Double d16;

    /**
     * 7.影像学诊断费
     */
    @TableField("D17")
    private Double d17;

    /**
     * 8.临床诊断项目费
     */
    @TableField("D18")
    private Double d18;

    /**
     * 9.非手术治疗项目费
     */
    @TableField("D19")
    private Double d19;

    /**
     * 其中：临床物理治疗费
     */
    @TableField("D19X01")
    private Double d19x01;

    /**
     * 10.手术治疗费
     */
    @TableField("D20")
    private Double d20;

    /**
     * 其中：麻醉费
     */
    @TableField("D20X01")
    private Double d20x01;

    /**
     * 其中：手术费
     */
    @TableField("D20X02")
    private Double d20x02;

    /**
     * 11.康复费
     */
    @TableField("D21")
    private Double d21;

    /**
     * 12.中医治疗费
     */
    @TableField("D22")
    private Double d22;

    /**
     * 13.西药费
     */
    @TableField("D23")
    private Double d23;

    /**
     * 其中：抗菌药物费
     */
    @TableField("D23X01")
    private Double d23x01;

    /**
     * 14.中成药费
     */
    @TableField("D24")
    private Double d24;

    /**
     * 15.中草药费
     */
    @TableField("D25")
    private Double d25;

    /**
     * 16.血费
     */
    @TableField("D26")
    private Double d26;

    /**
     * 17.白蛋白类制品费
     */
    @TableField("D27")
    private Double d27;

    /**
     * 18.球蛋白类制品费
     */
    @TableField("D28")
    private Double d28;

    /**
     * 19.凝血因子类制品费
     */
    @TableField("D29")
    private Double d29;

    /**
     * 20.细胞因子类制品费
     */
    @TableField("D30")
    private Double d30;

    /**
     * 21.检查用一次性医用材料费
     */
    @TableField("D31")
    private Double d31;

    /**
     * 22.治疗用一次性医用材料费
     */
    @TableField("D32")
    private Double d32;

    /**
     * 23.手术用一次性医用材料费
     */
    @TableField("D33")
    private Double d33;

    /**
     * 24.其他费
     */
    @TableField("D34")
    private Double d34;

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
