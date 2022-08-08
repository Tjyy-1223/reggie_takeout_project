package com.tjyy.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.tjyy.reggie.common.R;
import com.tjyy.reggie.entity.User;
import com.tjyy.reggie.service.UserService;
import com.tjyy.reggie.utils.ValidateCodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/sendMsg")
    public R<String> sendMsg(@RequestBody User user){
        // 获取手机号
        String phone = user.getPhone();

        if (StringUtils.isNotEmpty(phone)){
            String code = ValidateCodeUtils.generateValidateCode(4).toString();
            log.info("code={}",code);

            //需要将生成的验证码保存到Session
            return R.success("验证码发送成功");
        }
        return R.error("验证码发送失败");
    }


    @PostMapping("/login")
    public R<User> login(@RequestBody User myUser, HttpSession session){
        String phone2 = myUser.getPhone();
        log.info("验证接受号码:{}",phone2);

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getPhone,phone2);
        User user = userService.getOne(queryWrapper);

        if(user == null){
            // 判断当前手机号对应的用户是否为新用户，如果是新用户就自动完成注册
            user = new User();
            user.setPhone(phone2);
            user.setStatus(1);
            userService.save(user);
        }

        log.info(user.getId().toString());
        session.setAttribute("user",user.getId());
        return R.success(user);
    }
}
