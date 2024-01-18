package com.springstudy.service.impl;

import com.springstudy.domain.SysDepartmentDO;
import com.springstudy.mapper.SysDepartmentMapper;
import com.springstudy.service.ISysDepartmentRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门管理 服务实现类
 * </p>
 *
 * @author xiewenyan
 * @since 2023-11-27
 */
@Service
public class SysDepartmentRepositoryImpl extends ServiceImpl<SysDepartmentMapper, SysDepartmentDO> implements ISysDepartmentRepository {

}
