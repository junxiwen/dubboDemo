package com.hyanzz.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hyanzz.userService.IUserService;
import com.hyanzz.vo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @auther ywy
 * @create 2020-05-27 15:20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(check = false,version = "1.1.1",mock = "true")
    private IUserService userService;

    @GetMapping("/getList")
    public List<User> getList(){
        return userService.getUserList();
    }
}
