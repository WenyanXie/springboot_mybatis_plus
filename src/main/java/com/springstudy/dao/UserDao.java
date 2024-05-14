package com.springstudy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springstudy.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Author: XieWenyan
 * @Date: 2022/7/28 17:37
 * @Version：1.0
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
