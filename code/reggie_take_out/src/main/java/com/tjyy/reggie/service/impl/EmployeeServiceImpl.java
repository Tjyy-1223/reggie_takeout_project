package com.tjyy.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tjyy.reggie.entity.Employee;
import com.tjyy.reggie.mapper.EmployeeMapper;
import com.tjyy.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
