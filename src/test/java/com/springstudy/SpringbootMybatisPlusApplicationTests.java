package com.springstudy;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springstudy.Dao.UserDao;
import com.springstudy.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSave() {
        User user = new User();
        user.setAddr("上海");
        user.setGender("男");
        user.setPassword("2222");
        user.setUsername("小白");
        userDao.insert(user);
    }

    @Test
    void testDelete() {
        userDao.deleteById(1552841829267689474L);
    }

    @Test
    void testUpdate() {
        User user = new User();
        user.setAddr("上海");
        user.setUsername("小黑");
        user.setId(1L);
        System.out.println(user);
        userDao.updateById(user);
    }


    @Test
    void testGetById() {
        User user = userDao.selectById(2L);
        System.out.println(user);
    }

    @Test
    void testGetAll() {
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.lambda().eq(1 == 1, User::getGender, '男');
        List<User> users = userDao.selectList(wrapper);
        users.forEach(System.out::println);
    }

    @Test
    void testGetPageList() {
        IPage page = new Page(1, 2);
        IPage<User> userIPage = userDao.selectPage(page, null);
        System.out.println("当前页码值：" + userIPage.getCurrent());
        System.out.println("每页显示数：" + userIPage.getSize());
        System.out.println("一共多少页：" + userIPage.getPages());
        System.out.println("一共多少条数据：" + userIPage.getTotal());
        System.out.println("数据：" + userIPage.getRecords());
    }


    @Test
    void testArray() {
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            String temp = it.next();
            if ("2".equals(temp)) {
                it.remove();
            }
        }
        System.out.println(a);
    }
}
