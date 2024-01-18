package com.springstudy.service.impl;

import com.springstudy.domain.SysDepartmentUserDO;
import com.springstudy.mapper.SysDepartmentUserMapper;
import com.springstudy.service.ISysDepartmentUserRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门用户关联表 服务实现类
 * </p>
 *
 * @author xiewenyan
 * @since 2023-11-27
 */
@Service
public class SysDepartmentUserRepositoryImpl extends ServiceImpl<SysDepartmentUserMapper, SysDepartmentUserDO> implements ISysDepartmentUserRepository {

}
