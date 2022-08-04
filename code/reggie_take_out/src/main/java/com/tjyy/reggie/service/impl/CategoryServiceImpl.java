package com.tjyy.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tjyy.reggie.common.CustomException;
import com.tjyy.reggie.entity.Category;
import com.tjyy.reggie.entity.Dish;
import com.tjyy.reggie.entity.Setmeal;
import com.tjyy.reggie.mapper.CategoryMapper;
import com.tjyy.reggie.service.CategoryService;
import com.tjyy.reggie.service.DishService;
import com.tjyy.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    /**
     * 根据id删除分类 提前进行判断
     * @param id
     */
    @Override
    public void remove(Long id) {
        //添加查询条件，根据分类id进行查询菜品数据
        LambdaQueryWrapper<Dish> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Dish::getCategoryId,id);
        int count1 = dishService.count(queryWrapper);

        //如果已经关联，抛出一个业务异常
        if (count1 > 0){
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }

        LambdaQueryWrapper<Setmeal> queryWrapper2 = new LambdaQueryWrapper<>();
        queryWrapper2.eq(Setmeal::getCategoryId,id);
        int count2 = setmealService.count(queryWrapper2);

        if (count2 > 0){
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }

        //正常删除分类
        super.removeById(id);
    }
}
