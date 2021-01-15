package com.lxg.controllerMapper;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lxg.MD_SUPERVISION.entity.*;
import com.lxg.MD_SUPERVISION.mapper.*;
import com.lxg.mapper.emr.PrInpatientMapper;
import com.lxg.mapper.emr.ViewPatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author:jinboxaing
 * @date:2020/12/28 15:25
 */
@RestController
public class DRUGDataUploadController {
    //入院评估
    @Autowired
    AdmissionAssessmentMapper admissionAssessmentMapper;
    //入院记录
    @Autowired
    AdmissionRecordMapper admissionRecordMapper;
    //护理计划
    @Autowired
    CarePlanMapper carePlanMapper;
    //中药处方
    @Autowired
    ChinesePrescriptionMapper chinesePrescriptionMapper;
    //住院诊疗临床路径记录
    @Autowired
    ClinicalPathwayRecordMapper clinicalPathwayRecordMapper;
    //住院病程记录-会诊记录
    @Autowired
    ConsultationRecordMapper consultationRecordMapper;
    //住院病程记录-日常病程记录
    @Autowired
    DailyCourseRecordMapper dailyCourseRecordMapper;
    //科室信息表
    @Autowired
    DeptInfoMapper deptInfoMapper;
    //固定资产分类表
    @Autowired
    DictEquiKindMapper dictEquiKindMapper;
    //医院感染记录
    @Autowired
    DiHicInfectionInfoMapper diHicInfectionInfoMapper;
    //传染病报告
    @Autowired
    DiIdnIndnotInfoMapper diIdnIndnotInfoMapper;
    //转诊记录
    @Autowired
    DiRefProregInfoMapper diRefProregInfoMapper;
    //床位使用情况统计
    @Autowired
    DiRsgBedsInfoMapper diRsgBedsInfoMapper;
    //药品出入库
    @Autowired
    DiRsgDrugalterInfoMapper diRsgDrugalterInfoMapper;
    //出院小结
    @Autowired
    DischargeAbstractMapper dischargeAbstractMapper;
    //出院评估与指导
    @Autowired
    DischargeAssessmentMapper dischargeAssessmentMapper;
    //住院病程记录-出院记录
    @Autowired
    DischargeRecordMapper dischargeRecordMapper;
    //药品调价历史
    @Autowired
    DrugAdjHisMapper drugAdjHisMapper;
    //药品基本信息表
    @Autowired
    DrugDetailInfoMapper drugDetailInfoMapper;
    //药品库存信息表
    @Autowired
    DrugInventoryInfoMapper drugInventoryInfoMapper;
    //药品采购信息明细
    @Autowired
    DrugPurDetailMapper drugPurDetailMapper;
    //药品供应商信息表
    @Autowired
    DrugSupplierInfoMapper drugSupplierInfoMapper;
    //住院病程记录-首次病程记录
    @Autowired
    FirstCourseRecordMapper firstCourseRecordMapper;
    //一般护理记录
    @Autowired
    GeneralCareRecordMapper generalCareRecordMapper;
    //24H内入出院记录
    @Autowired
    H24AdmissionDischargeRecordMapper h24AdmissionDischargeRecordMapper;
    //住院病程记录-交接班记录
    @Autowired
    HandoverRecordMapper handoverRecordMapper;
    //医疗机构信息
    @Autowired
    HospitalInfoMapper hospitalInfoMapper;
    //入院诊断
    @Autowired
    HospitalizedDiagnosisMapper hospitalizedDiagnosisMapper;
    //住院发药记录
    @Autowired
    HospitalizedDispenseDetailMapper hospitalizedDispenseDetailMapper;
    //住院费用明细
    @Autowired
    HospitalizedExpsetDetailMapper hospitalizedExpsetDetailMapper;
    //住院医嘱
    @Autowired
    HospitalizedOrderMapper hospitalizedOrderMapper;
    //住院结算
    @Autowired
    HospitalizedSettlementMapper hospitalizedSettlementMapper;
    //24H内入院死亡记录
    @Autowired
    Hours24AdmissionDeathRecordMapper hours24AdmissionDeathRecordMapper;
    //住院病案首页
    @Autowired
    InpatientMedicalRecordMapper inpatientMedicalRecordMapper;
    //中医病案首页
    @Autowired
    InpatientTcmRecordMapper inpatientTcmRecordMapper;
    //检查记录
    @Autowired
    InspectionRecordMapper inspectionRecordMapper;
    //出入量记录用药明细
    @Autowired
    IntakeOutputDurgDetailMapper intakeOutputDurgDetailMapper;
    //出入量记录
    @Autowired
    IntakeOutputRecordMapper intakeOutputRecordMapper;
    //疑难病例讨论记录
    @Autowired
    IntractableDiscussrecordMapper intractableDiscussrecordMapper;
    //医护人员信息表
    @Autowired
    MedicalStaffInfoMapper medicalStaffInfoMapper;
    //生命体征测量明细记录
    @Autowired
    MonitorVitalSignsDetailMapper monitorVitalSignsDetailMapper;
    //生命体征测量记录
    @Autowired
    MonitorVitalSignsRecordMapper monitorVitalSignsRecordMapper;
    //手术护理记录
    @Autowired
    OperationCareRecordMapper operationCareRecordMapper;
    //门(急)诊发药记录
    @Autowired
    OutpatientDispenseRecordMapper outpatientDispenseRecordMapper;
    //门(急)诊结算记录
    @Autowired
    OutpatientEmergSettlementMapper outpatientEmergSettlementMapper;
    //患者基本信息
    @Autowired
    PatientMapper patientMapper;
    //收费项目目录表
    @Autowired
    PayItemsMapper payItemsMapper;
    //住院病程记录-阶段小结
    @Autowired
    PhaseSummaryMapper phaseSummaryMapper;
    //住院病程记录-术后首次病程记录
    @Autowired
    PostoperatFirstCourseMapper postoperatFirstCourseMapper;
    //高值耗材使用记录表
    @Autowired
    PreciousConsumUsageRecordMapper preciousConsumUsageRecordMapper;
    //住院病程记录-术前讨论
    @Autowired
    PreOperationDiscussionMapper preOperationDiscussionMapper;
    //住院病程记录-术前小结
    @Autowired
    PreOperationSummaryMapper preOperationSummaryMapper;
    //门(急)诊挂号表
    @Autowired
    RegistrationRecordMapper registrationRecordMapper;
    @Autowired
    OutpatientEmergencyRecordMapper outpatientEmergencyRecordMapper;
    //住院病程记录-抢救记录
    @Autowired
    SalvageRecrodMapper salvageRecrodMapper;
    //职工信息表
    @Autowired
    StaffInfoMapper staffInfoMapper;
    //住院病程记录-上级医师查房记录
    @Autowired
    SuperiorDoctorWardroundMapper superiorDoctorWardroundMapper;
    //检验记录
    @Autowired
    SurveyRecordMapper surveyRecordMapper;
    //住院病程记录-转科记录
    @Autowired
    TransferenceRecordMapper transferenceRecordMapper;
    //西药处方
    @Autowired
    WesternPrescriptionMapper westernPrescriptionMapper;
    //病重(病危)护理记录
    @Autowired
    WorsePatientCareRecordMapper worsePatientCareRecordMapper;
    @Autowired
    ViewPatientMapper viewPatientMapper;
    @Value("${days}")
    String days;
    @RequestMapping("drugUpload")
    public void drugUpload() throws IllegalAccessException, InstantiationException {
        //职工信息表
        List<Map> staffInfo = viewPatientMapper.getdata("STAFF_INFO",days);
        drugUpload(staffInfo,StaffInfo.class,staffInfoMapper);
        //医护人员信息表
        List<Map> medicalStaffInfo = viewPatientMapper.getdata("MEDICAL_STAFF_INFO",days);
        drugUpload(medicalStaffInfo,MedicalStaffInfo.class,medicalStaffInfoMapper);
        //收费项目目录表
        List<Map> payItems = viewPatientMapper.getdata("PAY_ITEMS",days);
        drugUpload(payItems,PayItems.class,payItemsMapper);
        //床位使用情况统计
        List<Map> diRsgBedsInfo = viewPatientMapper.getdata("DI_RSG_BEDS_INFO",days);
        drugUpload(diRsgBedsInfo,DiRsgBedsInfo.class,diRsgBedsInfoMapper);
        //科室信息表
        List<Map> deptInfo = viewPatientMapper.getdata("DEPT_INFO",days);
        drugUpload(deptInfo,DeptInfo.class,deptInfoMapper);
        //药品基本信息表
        List<Map> drugDetailInfo = viewPatientMapper.getdata("DRUG_DETAIL_INFO",days);
        drugUpload(drugDetailInfo,DrugDetailInfo.class,drugDetailInfoMapper);
        //药品供应商信息表
        List<Map> drugSupplierInfo = viewPatientMapper.getdata("DRUG_SUPPLIER_INFO",days);
        drugUpload(drugSupplierInfo,DrugSupplierInfo.class,drugSupplierInfoMapper);
        //药品出入库
        List<Map> diRsgDrugalterInfo = viewPatientMapper.getdata("DI_RSG_DRUGALTER_INFO",days);
        drugUpload(diRsgDrugalterInfo,DiRsgDrugalterInfo.class,diRsgDrugalterInfoMapper);
        //药品库存信息表
        List<Map> drugInventoryInfo = viewPatientMapper.getdata("DRUG_INVENTORY_INFO", days);
        drugUpload(drugInventoryInfo,DrugInventoryInfo.class,drugInventoryInfoMapper);
        //药品采购信息明细
        List<Map> drugPurDetail = viewPatientMapper.getdata("DRUG_PUR_DETAIL", days);
        drugUpload(drugPurDetail,DrugPurDetail.class,drugPurDetailMapper);
        //药品调价历史
        List<Map> drugAdjHis = viewPatientMapper.getdata("DRUG_ADJ_HIS", days);
        drugUpload(drugAdjHis,DrugAdjHis.class,drugAdjHisMapper);
        //患者基本信息
        List<Map> patient = viewPatientMapper.getdata("PATIENT", days);
        drugUpload(patient,Patient.class,patientMapper);
        //门(急)诊挂号表
        List<Map> registrationRecord = viewPatientMapper.getdata("REGISTRATION_RECORD", days);
        drugUpload(registrationRecord,RegistrationRecord.class,registrationRecordMapper);
        //门(急)诊病历
        List<Map> outpatientEmergencyRecord = viewPatientMapper.getdata("OUTPATIENT_EMERGENCY_RECORD", days);
        drugUpload(outpatientEmergencyRecord,OutpatientEmergencyRecord.class,outpatientEmergencyRecordMapper);
        //西药处方
        List<Map> westernPrescription = viewPatientMapper.getdata("WESTERN_PRESCRIPTION", days);
        drugUpload(westernPrescription,WesternPrescription.class,westernPrescriptionMapper);
        //门(急)诊结算记录
        List<Map> outpatientEmergSettlement = viewPatientMapper.getdata("OUTPATIENT_EMERG_SETTLEMENT", days);
        drugUpload(outpatientEmergSettlement,OutpatientEmergSettlement.class,outpatientEmergSettlementMapper);
        //门(急)诊发药记录
        List<Map> outpatientDispenseRecord = viewPatientMapper.getdata("OUTPATIENT_DISPENSE_RECORD", days);
        drugUpload(outpatientDispenseRecord,OutpatientDispenseRecord.class,outpatientDispenseRecordMapper);
        //入院记录
        List<Map> admissionRecord = viewPatientMapper.getdata("ADMISSION_RECORD", days);
        drugUpload(admissionRecord,AdmissionRecord.class,admissionRecordMapper);
        //入院诊断
        List<Map> hospitalizedDiagnosis = viewPatientMapper.getdata("HOSPITALIZED_DIAGNOSIS", days);
        drugUpload(hospitalizedDiagnosis,HospitalizedDiagnosis.class,hospitalizedDiagnosisMapper);
        //住院医嘱
        List<Map> hospitalizedOrder = viewPatientMapper.getdata("HOSPITALIZED_ORDER", days);
        drugUpload(hospitalizedOrder,HospitalizedOrder.class,hospitalizedOrderMapper);
        //住院发药记录
        List<Map> hospitalizedDispenseDetail = viewPatientMapper.getdata("HOSPITALIZED_DISPENSE_DETAIL", days);
        drugUpload(hospitalizedDispenseDetail,HospitalizedDispenseDetail.class,hospitalizedDispenseDetailMapper);
        //住院费用明细
        List<Map> hospitalizedExpsetDetail = viewPatientMapper.getdata("HOSPITALIZED_EXPSET_DETAIL", days);
        drugUpload(hospitalizedExpsetDetail,HospitalizedExpsetDetail.class,hospitalizedExpsetDetailMapper);
        //住院结算
        List<Map> hospitalizedSettlement = viewPatientMapper.getdata("HOSPITALIZED_SETTLEMENT", days);
        drugUpload(hospitalizedSettlement,HospitalizedSettlement.class,hospitalizedSettlementMapper);
        //出院小结
        List<Map> dischargeAbstract = viewPatientMapper.getdata("DISCHARGE_ABSTRACT", days);
        drugUpload(dischargeAbstract,DischargeAbstract.class,dischargeAbstractMapper);
        //住院病案首页
        List<Map> inpatientMedicalRecord = viewPatientMapper.getdata("INPATIENT_MEDICAL_RECORD", days);
        drugUpload(inpatientMedicalRecord,InpatientMedicalRecord.class,inpatientMedicalRecordMapper);
        //检查记录
        List<Map> inspectionRecord = viewPatientMapper.getdata("INSPECTION_RECORD", days);
        drugUpload(inspectionRecord,InspectionRecord.class,inspectionRecordMapper);
        //检验记录
        List<Map> surveyRecord = viewPatientMapper.getdata("SURVEY_RECORD", days);
        drugUpload(surveyRecord,SurveyRecord.class,surveyRecordMapper);
        //入院评估
        List<Map> admissionAssessment = viewPatientMapper.getdata("ADMISSION_ASSESSMENT", days);
        drugUpload(admissionAssessment,AdmissionAssessment.class,admissionAssessmentMapper);
        //一般护理记录
        List<Map> generalCareRecord = viewPatientMapper.getdata("GENERAL_CARE_RECORD", days);
        drugUpload(generalCareRecord,GeneralCareRecord.class,generalCareRecordMapper);
        //出入量记录
        List<Map> intakeOutputRecord = viewPatientMapper.getdata("INTAKE_OUTPUT_RECORD", days);
        drugUpload(intakeOutputRecord,IntakeOutputRecord.class,intakeOutputRecordMapper);
        //出入量记录用药明细
        List<Map> intakeOutputDurgDetail = viewPatientMapper.getdata("INTAKE_OUTPUT_DURG_DETAIL", days);
        drugUpload(intakeOutputDurgDetail,IntakeOutputDurgDetail.class,intakeOutputDurgDetailMapper);
        //生命体征测量记录
        List<Map> monitorVitalSignsRecord = viewPatientMapper.getdata("MONITOR_VITAL_SIGNS_RECORD", days);
        drugUpload(monitorVitalSignsRecord,MonitorVitalSignsRecord.class,monitorVitalSignsRecordMapper);
        //生命体征测量明细记录
        List<Map> monitorVitalSignsDetail = viewPatientMapper.getdata("MONITOR_VITAL_SIGNS_DETAIL", days);
        drugUpload(monitorVitalSignsDetail,MonitorVitalSignsDetail.class,monitorVitalSignsDetailMapper);
        //24H内入出院记录
        List<Map> h24AdmissionDischargeRecord = viewPatientMapper.getdata("H24_ADMISSION_DISCHARGE_RECORD", days);
        drugUpload(h24AdmissionDischargeRecord,H24AdmissionDischargeRecord.class,h24AdmissionDischargeRecordMapper);
        //住院病程记录-首次病程记录
        List<Map> firstCourseRecord = viewPatientMapper.getdata("FIRST_COURSE_RECORD", days);
        drugUpload(firstCourseRecord,FirstCourseRecord.class,firstCourseRecordMapper);
        //住院病程记录-日常病程记录
        List<Map> dailyCourseRecord = viewPatientMapper.getdata("DAILY_COURSE_RECORD", days);
        drugUpload(dailyCourseRecord,DailyCourseRecord.class,dailyCourseRecordMapper);
        //住院病程记录-上级医师查房记录
        List<Map> superiorDoctorWardround = viewPatientMapper.getdata("superior_doctor_wardround", days);
        drugUpload(superiorDoctorWardround,SuperiorDoctorWardround.class,superiorDoctorWardroundMapper);
        //疑难病例讨论记录
        List<Map> intractableDiscussrecord = viewPatientMapper.getdata("intractable_discussrecord", days);
        drugUpload(intractableDiscussrecord,IntractableDiscussrecord.class,intractableDiscussrecordMapper);
        //中药处方
        List<Map> chinesePrescription = viewPatientMapper.getdata("CHINESE_PRESCRIPTION", days);
        drugUpload(chinesePrescription,ChinesePrescription.class,chinesePrescriptionMapper);
        //中医病案首页
        List<Map> inpatientTcmRecord = viewPatientMapper.getdata("INPATIENT_TCM_RECORD", days);
        drugUpload(inpatientTcmRecord,InpatientTcmRecord.class,inpatientTcmRecordMapper);
        //中医诊疗记录
//        List<Map> chineseDiagRecord = viewPatientMapper.getdata("CHINESE_DIAG_RECORD", days);
//        drugUpload(chineseDiagRecord,chineseDiagRecord.class,chineseDiagRecord);
    }

    public void drugUpload(List<Map> maps, Class Class1, BaseMapper baseMapper) {
        maps.forEach(s -> {
            int insert=0;
            Object object = JSONObject.parseObject(JSONObject.toJSONString(s), Class1);
            System.out.println(JSONObject.toJSONString(object));
            try {
//                insert = baseMapper.insert(object);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("插入结果：" + (insert > 0));
        });

    }


}
