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
 * 患者基本信息
 * </p>
 *
 * @author cmx
 * @since 2021-01-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("PATIENT")
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;

    /**
     * 医疗机构在国家直报系统中的12位编码（如：520000000001）
     */
    @TableField("CLINIC_ORGAN_CODE")
    private String clinicOrganCode;

    @TableField("CLINIC_ORGAN_NAME")
    private String clinicOrganName;

    /**
     * 就诊机构代码+患者本地 ID
     */
    @TableField("PATIENT_LOCAL_ID")
    private String patientLocalId;

    /**
     * 城乡居民个人健康档案的编号
     */
    @TableField("HEALTH_FILE_NO")
    private String healthFileNo;

    /**
     * 患者的注册证件上的唯一法定标识符
     */
    @TableField("IDCARD")
    private String idcard;

    /**
     * 在【CV02.01.101 身份证件类别代码】范围内CV02.01.101
     */
    @TableField("IDCARD_CODE")
    private String idcardCode;

    /**
     * 患者持有的全国统一的居民健康卡的编号
     */
    @TableField("HEALTH_CARD_NO")
    private String healthCardNo;

    @TableField("CARTE_VITAL_ID")
    private String carteVitalId;

    /**
     * CV02.01.204
     */
    @TableField("INSURANCE_CODE")
    private String insuranceCode;

    /**
     * 患者本人在公安户籍管理部门正式登记注册的姓氏和名称。
     */
    @TableField("NAME")
    private String name;

    /**
     * 患者出生当日的公元纪年日期的完整描述
     */
    @TableField("BIRTH_DATE")
    private LocalDateTime birthDate;

    /**
     * 患者生理性别在特定编码体系中的代码RC001
     */
    @TableField("GENDER_CODE")
    private String genderCode;

    @TableField("GENDERNAME")
    private String gendername;

    /**
     * RC038
     */
    @TableField("NATIONALITY_CODE")
    private String nationalityCode;

    @TableField("NATIONALITYNAME")
    private String nationalityname;

    /**
     * 患者祖居地或原籍所在地的省、自治区或直辖市名称
     */
    @TableField("HOMETOWN_PROVINCE")
    private String hometownProvince;

    /**
     * 患者祖居地或原籍所在地的市、地区或州的名称
     */
    @TableField("HOMETOWN_CITY")
    private String hometownCity;

    /**
     * 患者出生时所在地点的省、自治区或直辖市名称
     */
    @TableField("BIRTH_PROVINCE")
    private String birthProvince;

    /**
     * 患者出生时所在地点的市、地区或州的名称
     */
    @TableField("BIRTH_CITY")
    private String birthCity;

    /**
     * 患者出生时所在地点的县(区)的名称
     */
    @TableField("BIRTH_COUNTRY")
    private String birthCountry;

    /**
     * 患者所属民族在特定编码体系中的代码RC035
     */
    @TableField("NATION")
    private String nation;

    @TableField("NATION_NAME")
    private String nationName;

    /**
     * 患者当前婚姻状况在特定编码体系中的代码RC002
     */
    @TableField("MARRIAGE_CODE")
    private String marriageCode;

    /**
     * 患者当前婚姻状况名称
     */
    @TableField("MARRIAGE_NAME")
    private String marriageName;

    /**
     * 个人基本信息GB/T4658-2006
     */
    @TableField("EDUCATION")
    private String education;

    /**
     * 个人基本信息
     */
    @TableField("EDUCATIONNAME")
    private String educationname;

    /**
     * 患者当前从事的职业的类别RC003
     */
    @TableField("OCCUPATION_CODE")
    private String occupationCode;

    @TableField("OCCUPATION_NAME")
    private String occupationName;

    /**
     * 患者本人的电话号码，包括国际、国内区号和分机号
     */
    @TableField("PHONE_NUMBER")
    private String phoneNumber;

    /**
     * 个人基本信息
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 患者来院前近期的常住地址的省、自治区或直辖市名称
     */
    @TableField("PAPROVINCE")
    private String paprovince;

    /**
     * 患者来院前近期的常住地址的市、地区或州的名称
     */
    @TableField("PACITY")
    private String pacity;

    /**
     * 患者来院前近期的常住地址的县(区)的名称
     */
    @TableField("PACOUNTY")
    private String pacounty;

    /**
     * 患者来院前近期的常住地址的乡、镇或城市的街道办事处名称
     */
    @TableField("PATOWN_SHIP")
    private String patownShip;

    /**
     * 患者来院前近期的常住地址的村或城市的街、路、里、弄等名称
     */
    @TableField("PASTREET")
    private String pastreet;

    /**
     * 患者来院前近期的常住地址的门牌号码
     */
    @TableField("PAHOUSE_NUMBER")
    private String pahouseNumber;

    /**
     * 患者来院前近期的常住地址的邮政编码
     */
    @TableField("PAPOST_CODE")
    private String papostCode;

    /**
     * 地址信息
     */
    @TableField("PDETAIL")
    private String pdetail;

    /**
     * 患者户籍登记所在地址的省、自治区或直辖市名称
     */
    @TableField("HRPROVINCE")
    private String hrprovince;

    /**
     * 患者户籍登记所在地址的市、地区或州的名称
     */
    @TableField("HRCITY")
    private String hrcity;

    /**
     * 患者户籍登记所在地址的县(区)的名称
     */
    @TableField("HRCOUNTY")
    private String hrcounty;

    /**
     * 患者户籍登记所在地址的乡、镇或城市的街道办事处名称
     */
    @TableField("HRTOWN_SHIP")
    private String hrtownShip;

    /**
     * 患者户籍登记所在地址的村或城市的街、路、里、弄等名称
     */
    @TableField("HRSTREET")
    private String hrstreet;

    /**
     * 患者户籍登记所在地址的门牌号码
     */
    @TableField("HRHOUSE_NUMBER")
    private String hrhouseNumber;

    /**
     * 患者户籍登记所在地址的邮政编码
     */
    @TableField("HRPOST_CODE")
    private String hrpostCode;

    /**
     * 地址信息
     */
    @TableField("HDETAIL")
    private String hdetail;

    /**
     * 患者当前所在的工作单位的名称
     */
    @TableField("UNIT_NAME")
    private String unitName;

    /**
     * 患者当前所在的工作单位地址的省、自治区或直辖市名称
     */
    @TableField("UAPROVINCE")
    private String uaprovince;

    /**
     * 患者当前所在的工作单位地址的市、地区或州的名称
     */
    @TableField("UACITY")
    private String uacity;

    /**
     * 患者当前所在的工作单位地址的县(区)的名称
     */
    @TableField("UACOUNTY")
    private String uacounty;

    /**
     * 患者当前所在的工作单位地址的乡、镇或城市的街道办事处名称
     */
    @TableField("UATOWN_SHIP")
    private String uatownShip;

    /**
     * 患者当前所在的工作单位地址的村或城市的街、路、里、弄等名称
     */
    @TableField("UASTREET")
    private String uastreet;

    /**
     * 患者当前所在的工作单位地址的门牌号码
     */
    @TableField("UAHOUSE_NUMBER")
    private String uahouseNumber;

    /**
     * 患者当前所在的工作单位地址的邮政编码
     */
    @TableField("UNIT_POST_CODE")
    private String unitPostCode;

    /**
     * 地址信息
     */
    @TableField("UDETAIL")
    private String udetail;

    /**
     * 患者当前所在的工作单位的电话号码，包括国际、国内区号和分机号
     */
    @TableField("UNIT_PHONE")
    private String unitPhone;

    /**
     * 联系人在公安户籍管理部门正式登记注册的姓氏和名称
     */
    @TableField("CONTACT_NAME")
    private String contactName;

    /**
     * 联系人与患者之间的关系类别代码RC033
     */
    @TableField("CONTACT_RELATION_CODE")
    private String contactRelationCode;

    /**
     * 联系人与患者之间的关系类别名称
     */
    @TableField("CONTACT_RELATION_NAME")
    private String contactRelationName;

    /**
     * 联系人当前常住地址或工作单位地址的省、自治区或直辖市名称
     */
    @TableField("CAPROVINCE")
    private String caprovince;

    /**
     * 联系人当前常住地址或工作单位地址的市、地区或州的名称
     */
    @TableField("CACITY")
    private String cacity;

    /**
     * 联系人当前常住地址或工作单位地址的县(区)的名称
     */
    @TableField("CACOUNTY")
    private String cacounty;

    /**
     * 联系人当前常住地址或工作单位地址的乡、镇或城市的街道办事处名称
     */
    @TableField("CATOWN_SHIP")
    private String catownShip;

    /**
     * 联系人当前常住地址或工作单位地址的村或城市的街、路、里、弄等名称
     */
    @TableField("CASTREET")
    private String castreet;

    /**
     * 联系人当前常住地址或工作单位地址的门牌号码
     */
    @TableField("CAHOUSE_NUMBER")
    private String cahouseNumber;

    /**
     * 联系人当前地址的邮政编码
     */
    @TableField("CA_POST_CODE")
    private String caPostCode;

    /**
     * 地址信息
     */
    @TableField("CDETAIL")
    private String cdetail;

    /**
     * 联系人的电话号码，包括国际、国内区号和分机号
     */
    @TableField("CONTACT_PHONE")
    private String contactPhone;

    /**
     * 患者电子病历初次建档完成时的公元纪年日期和时间的完整描述
     */
    @TableField("INPUT_DATE")
    private LocalDateTime inputDate;

    /**
     * 建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码
     */
    @TableField("INPUT_ORGAN_CODE")
    private String inputOrganCode;

    /**
     * 建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的名称
     */
    @TableField("INPUT_ORGAN_NAME")
    private String inputOrganName;

    /**
     * 首次为患者建立电子病历的人员在公安户籍管理部门正式登记注册的姓氏和名称
     */
    @TableField("INPUT_NAME")
    private String inputName;

    /**
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    @TableField("DEATHDATE")
    private LocalDateTime deathdate;

    /**
     * 条件必填：当为新生儿，没有姓名时，此字段填写。新生儿相关字段
     */
    @TableField("MOTHERNAME")
    private String mothername;

    /**
     * 条件必填：当为新生儿，没有姓名时，此字段填写。新生儿相关字段
     */
    @TableField("MOTHER_IDCARD")
    private String motherIdcard;

    /**
     * 新生儿相关字段
     */
    @TableField("PARITY")
    private String parity;

    /**
     * 新生儿相关字段RC016
     */
    @TableField("MULTIBIRTHIDEN")
    private String multibirthiden;

    /**
     * 新生儿相关字段RC016
     */
    @TableField("ISBABY")
    private String isbaby;

    /**
     * 新生儿相关字段
     */
    @TableField("BIRTHORDER")
    private String birthorder;

    /**
     * 贫困人口建档立卡。当值为“1”时，注册证件号码填写身份证号码，注册证件类型代码填写“01”。RC016
     */
    @TableField("IS_FILING_CARD_POOR")
    private String isFilingCardPoor;

    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    @TableField("UPDATE_DATE")
    private LocalDateTime updateDate;

    @TableField("UPLOAD_TIME")
    private LocalDateTime uploadTime;

    /**
     * 有效标识：1：新增；2：更新；3：删除。
     */
    @TableField("ESTATUS")
    private Integer estatus;


}
