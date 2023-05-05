package com.springstudy.service.impl;

import com.springstudy.domain.Museum;
import com.springstudy.mapper.MuseumMapper;
import com.springstudy.service.IMuseumService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博物馆 服务实现类
 * </p>
 *
 * @author xiewenyan
 * @since 2023-05-04
 */
@Service
public class MuseumServiceImpl extends ServiceImpl<MuseumMapper, Museum> implements IMuseumService {

}
