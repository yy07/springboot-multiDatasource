package com.lxg.MD_SUPERVISION.mapper;

import com.lxg.MD_SUPERVISION.entity.Patient;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 患者基本信息 Mapper 接口
 * </p>
 *
 * @author cmx
 * @since 2021-01-08
 */
public interface PatientMapper extends BaseMapper<Patient> {
    public List<Map> selectALL();
}
