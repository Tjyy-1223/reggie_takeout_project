package com.tjyy.reggie.dto;


import com.tjyy.reggie.entity.Setmeal;
import com.tjyy.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
