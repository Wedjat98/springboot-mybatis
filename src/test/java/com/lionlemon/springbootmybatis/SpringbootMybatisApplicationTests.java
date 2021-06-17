package com.lionlemon.springbootmybatis;

import com.lionlemon.springbootmybatis.domain.User;
import com.lionlemon.springbootmybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootMybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserMapper userXMLMapper;

    @Test
    void contextLoads() {
        List<User> list = userMapper.findAll();
        System.out.println(list);
    }
    @Test
    void contextLoads2() {
        List<User> list = userXMLMapper.findAll();
        System.out.println(list);
    }

}
