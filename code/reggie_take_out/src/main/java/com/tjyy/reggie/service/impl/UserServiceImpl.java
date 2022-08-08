package com.tjyy.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tjyy.reggie.entity.User;
import com.tjyy.reggie.mapper.UserMapper;
import com.tjyy.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
