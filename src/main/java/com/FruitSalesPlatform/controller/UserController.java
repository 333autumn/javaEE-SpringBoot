package com.FruitSalesPlatform.controller;

import com.FruitSalesPlatform.entity.User;
import com.FruitSalesPlatform.service.impl.UserServiceImpl;
import com.FruitSalesPlatform.utils.R;
import com.FruitSalesPlatform.utils.ResultCodeEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping("/login")
    public R login(@RequestBody User user){
        String username = user.getUsername();
        User selectUser = userService.selectByUserName(username);
        if (Objects.isNull(selectUser)){//用户不存在
            return R.error(ResultCodeEnum.USERNAME_NOT_EXIST);
        }else if (!selectUser.getPassword().equals(user.getPassword())){//密码错误
            return R.error(ResultCodeEnum.PASSWORD_ERROR);
        }else {
            return R.success().put(selectUser);
        }
    }

    @PostMapping("/register")
    public R register(@RequestBody User user){
        String username = user.getUsername();
        User selectUser = userService.selectByUserName(username);
        if (Objects.nonNull(selectUser)){//用户名重复
            return R.error(ResultCodeEnum.USERNAME_REPEAT);
        }
        userService.insertOne(user);
        return R.success();
    }

}
