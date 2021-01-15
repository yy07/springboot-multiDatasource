package com.lxg.mapper.emr;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author:jinboxaing
 * @date:2021/1/7 15:59
 */
@Mapper
public interface PrInpatientMapper {
    @Select("select * from pr_inpatient_info limit 10")
    public List<Map> getALL();


    @Select("select his_name from his_view.drug_control where parent_id='drugTable'")
    public List<String> getTable();


}
