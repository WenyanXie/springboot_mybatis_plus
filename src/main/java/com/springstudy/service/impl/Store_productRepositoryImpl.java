package com.springstudy.service.impl;

import com.springstudy.domain.Store_productDO;
import com.springstudy.mapper.Store_productMapper;
import com.springstudy.service.IStore_productRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author xiewenyan
 * @since 2023-07-19
 */
@Service
public class Store_productRepositoryImpl extends ServiceImpl<Store_productMapper, Store_productDO> implements IStore_productRepository {

}
