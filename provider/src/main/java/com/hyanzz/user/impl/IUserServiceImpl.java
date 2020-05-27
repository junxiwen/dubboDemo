package com.hyanzz.user.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.collect.Lists;
import com.hyanzz.userService.IUserService;
import com.hyanzz.vo.user.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description
 * @auther ywy
 * @create 2020-05-27 15:16
 */
@Service(version = "1.1.1")
@Component
public class IUserServiceImpl implements IUserService  {

    @Override
    public List<User> getUserList() {
        User user1 = new User("andy",28);
        User user2 = new User("hyanzz",27);
        User user3 = new User("baby",1);
        int a = 1/0;
        return Lists.newArrayList(user1,user2,user3);
    }
}
