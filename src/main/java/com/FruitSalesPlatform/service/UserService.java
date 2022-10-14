package com.FruitSalesPlatform.service;

import com.FruitSalesPlatform.entity.User;

import java.util.List;

public interface UserService {

    User selectById(String userid);

    User selectByUserName(String username);

    void deleteById(String userid);

    void insertOne(User user);

    void updateById(User user);

    List<User> findList();
}
