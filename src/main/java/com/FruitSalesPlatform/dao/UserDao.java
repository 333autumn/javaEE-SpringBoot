package com.FruitSalesPlatform.dao;

import com.FruitSalesPlatform.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    User selectById(@Param("userid") String userid);

    User selectByUserName(@Param("username") String username);

    void deleteById(@Param("userid") String userid);

    void insertOne(User user);

    void updateById(User user);

    List<User> findList();
}
