package com.lxg.config;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lxg.MD_SUPERVISION.entity.AdmissionAssessment;
import com.lxg.MD_SUPERVISION.mapper.AdmissionAssessmentMapper;

/**
 * @Author:jinboxaing
 * @date:2021/1/12 17:31
 */
public enum OracleMapper {;


    private Object className;
    private BaseMapper baseMapper;

    OracleMapper(final Object className, final BaseMapper baseMapper) {
        this.className = className;
        this.baseMapper = baseMapper;
    }

    public Object getClassName() {
        return className;
    }

    public BaseMapper getBaseMapper() {
        return baseMapper;
    }}
