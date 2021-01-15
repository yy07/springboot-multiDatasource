package com.lxg.MD_SUPERVISION.service.impl;

import com.lxg.MD_SUPERVISION.entity.Patient;
import com.lxg.MD_SUPERVISION.mapper.PatientMapper;
import com.lxg.MD_SUPERVISION.service.PatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 患者基本信息 服务实现类
 * </p>
 *
 * @author cmx
 * @since 2021-01-08
 */
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements PatientService {

}
