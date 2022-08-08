package com.tjyy.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tjyy.reggie.entity.Orders;

public interface OrderService extends IService<Orders> {
    void submit(Orders orders);
}
