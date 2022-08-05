package com.springstudy.service.impl;

import com.springstudy.domain.Book;
import com.springstudy.mapper.BookMapper;
import com.springstudy.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiewenyan
 * @since 2022-08-03
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
