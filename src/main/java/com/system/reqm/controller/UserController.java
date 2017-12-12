package com.system.reqm.controller;

import com.system.reqm.entity.User;
import com.system.reqm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") int userId){
        return userMapper.selectByPrimaryKey(userId);
    }
}
