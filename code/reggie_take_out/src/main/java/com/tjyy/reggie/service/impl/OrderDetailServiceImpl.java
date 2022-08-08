package com.tjyy.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tjyy.reggie.entity.OrderDetail;
import com.tjyy.reggie.mapper.OrderDetailMapper;
import com.tjyy.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl
        extends ServiceImpl<OrderDetailMapper,OrderDetail>
        implements OrderDetailService{
}
