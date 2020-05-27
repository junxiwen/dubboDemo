package com.hyanzz.userService;

import com.hyanzz.vo.user.User;

import java.util.List;

/**
 * @Description
 * @auther ywy
 * @create 2020-05-27 15:09
 */
public interface IUserService {
    /***
     * 获取用户列表
     * @return
     */
    public List<User> getUserList();
}
