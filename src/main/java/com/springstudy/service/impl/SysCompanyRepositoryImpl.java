package com.springstudy.service.impl;

import com.springstudy.domain.SysCompanyDO;
import com.springstudy.mapper.SysCompanyMapper;
import com.springstudy.service.ISysCompanyRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司表 服务实现类
 * </p>
 *
 * @author xiewenyan
 * @since 2024-03-25
 */
@Service
public class SysCompanyRepositoryImpl extends ServiceImpl<SysCompanyMapper, SysCompanyDO> implements ISysCompanyRepository {

}
