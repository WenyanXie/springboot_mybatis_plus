package com.springstudy.mapper;

import com.springstudy.domain.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiewenyan
 * @since 2022-08-03
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
