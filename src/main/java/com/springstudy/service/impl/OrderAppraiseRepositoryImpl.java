package com.springstudy.service.impl;

import com.springstudy.domain.OrderAppraiseDO;
import com.springstudy.mapper.OrderAppraiseMapper;
import com.springstudy.service.IOrderAppraiseRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单评价表 服务实现类
 * </p>
 *
 * @author xiewenyan
 * @since 2023-09-12
 */
@Service
public class OrderAppraiseRepositoryImpl extends ServiceImpl<OrderAppraiseMapper, OrderAppraiseDO> implements IOrderAppraiseRepository {

}
