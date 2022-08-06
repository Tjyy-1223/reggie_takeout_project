package com.tjyy.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tjyy.reggie.dto.DishDto;
import com.tjyy.reggie.entity.DishFlavor;
import com.tjyy.reggie.mapper.DishFlavorMapper;
import com.tjyy.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
