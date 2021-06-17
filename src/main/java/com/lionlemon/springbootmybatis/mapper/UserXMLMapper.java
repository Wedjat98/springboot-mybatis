package com.lionlemon.springbootmybatis.mapper;

import com.lionlemon.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserXMLMapper {//不加注解就说明要xml
    public List<User> findAll();
}
