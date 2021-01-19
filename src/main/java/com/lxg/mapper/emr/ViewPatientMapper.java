package com.lxg.mapper.emr;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author:jinboxaing
 * @date:2021/1/9 11:03
 */
public interface ViewPatientMapper {
    @Select("select * from aa_songtao.patient ")
    public List<Map> getPatientALL();

    @Select("select * from aa_songtao.staff_info ")
    public List<Map> getStaffInfo();
    @Select("select * from aa_songtao.MEDICAL_STAFF_INFO ")
    public List<Map> getMedicalStaffInfo();


    public List<Map> getMedicalStaffInfo(String tableName);
    @Select("select * from ${tableName}  WHERE (TO_DAYS(NOW())-TO_DAYS(CREATE_DATE))>0 and  (TO_DAYS(NOW())-TO_DAYS(CREATE_DATE))<=${days}")
    public List<Map> getdata(String tableName,String days);
}
