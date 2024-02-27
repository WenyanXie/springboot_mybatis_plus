package com.springstudy.service.impl;

import com.springstudy.domain.ExpertServiceDO;
import com.springstudy.mapper.ExpertServiceMapper;
import com.springstudy.service.IExpertServiceRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 专家服务 服务实现类
 * </p>
 *
 * @author xiewenyan
 * @since 2024-01-18
 */
@Service
public class ExpertServiceRepositoryImpl extends ServiceImpl<ExpertServiceMapper, ExpertServiceDO> implements IExpertServiceRepository {

}
