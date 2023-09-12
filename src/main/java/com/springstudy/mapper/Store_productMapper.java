package com.springstudy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springstudy.domain.Store_productDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author xiewenyan
 * @since 2023-07-19
 */
@Mapper
public interface Store_productMapper extends BaseMapper<Store_productDO> {

}
