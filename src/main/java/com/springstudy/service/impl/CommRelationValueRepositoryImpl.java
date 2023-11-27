package com.springstudy.service.impl;

import com.springstudy.domain.CommRelationValueDO;
import com.springstudy.mapper.CommRelationValueMapper;
import com.springstudy.service.ICommRelationValueRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 多值表 服务实现类
 * </p>
 *
 * @author xiewenyan
 * @since 2023-09-12
 */
@Service
public class CommRelationValueRepositoryImpl extends ServiceImpl<CommRelationValueMapper, CommRelationValueDO> implements ICommRelationValueRepository {

}
