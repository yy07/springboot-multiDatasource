package com.lxg.mapper.oracle;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author:jinboxaing
 * @date:2020/12/28 16:00
 */
@Mapper
public interface TestMapper {
    @Select("select table_name from all_tables where owner='MD_SUPERVISION'")
    List<String> getTable();
}