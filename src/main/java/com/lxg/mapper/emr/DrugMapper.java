package com.lxg.mapper.emr;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author:jinboxaing
 * @date:2021/1/12 16:58
 */

public interface DrugMapper {
    @Select("select * from songtao_drgs.staff_info ")
    public List<Map> getStaffInfo();
}
