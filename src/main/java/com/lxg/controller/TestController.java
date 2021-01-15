package com.lxg.controller;

import com.alibaba.fastjson.JSONObject;
import com.lxg.MD_SUPERVISION.entity.Patient;
import com.lxg.MD_SUPERVISION.mapper.PatientMapper;
import com.lxg.MD_SUPERVISION.service.impl.PatientServiceImpl;
import com.lxg.mapper.emr.DrugMapper;
import com.lxg.mapper.emr.ViewPatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author:jinboxaing
 * @date:2021/1/7 17:33
 */
@RestController
public class TestController {
    @Autowired
    public PatientServiceImpl patientService;
    @Autowired
    PatientMapper patientMapper;
    @Autowired
    ViewPatientMapper viewPatientMapper;
    @Autowired
    DrugMapper drugMapper;

    @RequestMapping("drugtest")
    public void test1() {
        List<Patient> patients = patientMapper.selectList(null);
        patients.forEach(System.out::println);
    }

    @RequestMapping("drugtest2")
    public void test2() {
        List<Map> maps = patientMapper.selectALL();
        maps.forEach(System.out::println);
    }

    @RequestMapping("drugtest3")
    public void test3() {
        List<Map> maps = viewPatientMapper.getPatientALL();
//        maps.forEach(System.out::println);
        maps.forEach(s -> {
            Patient patient = JSONObject.parseObject(JSONObject.toJSONString(s), Patient.class);
            System.out.println(patient);
            try {
                int insert = patientMapper.insert(patient);
                System.out.println("插入结果：" + (insert > 0));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @RequestMapping("drugtest4")
    public void test4() {
        List<Map> maps = drugMapper.getStaffInfo();

    }

    public void saveOracle(List<Map> maps,Class class1) {

    }

}
