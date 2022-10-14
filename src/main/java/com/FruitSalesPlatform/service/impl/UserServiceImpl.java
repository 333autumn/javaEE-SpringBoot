package com.FruitSalesPlatform.service.impl;

import com.FruitSalesPlatform.dao.UserDao;
import com.FruitSalesPlatform.entity.User;
import com.FruitSalesPlatform.service.UserService;
import com.FruitSalesPlatform.utils.IDUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public User selectById(String userid) {
        return userDao.selectById(userid);
    }

    @Override
    public User selectByUserName(String username) {
        return userDao.selectByUserName(username);
    }

    @Override
    public void deleteById(String userid) {
        userDao.deleteById(userid);
    }

    @Override
    public void insertOne(User user) {
        user.setUserid(IDUtil.getId());
        userDao.insertOne(user);
    }

    @Override
    public void updateById(User user) {
        userDao.updateById(user);
    }

    @Override
    public List<User> findList() {
        return userDao.findList();
    }

}
