package com.hyanzz.userService;

import com.alibaba.dubbo.config.annotation.Service;
import com.hyanzz.vo.user.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description mock类的名字 必须是接口名+Mock 且在同一个文件夹下
 * @auther ywy
 * @create 2020-05-27 17:10
 */
@Service
public class IUserServiceMock implements IUserService {
    @Override
    public List<User> getUserList() {
        System.out.println("熔断=======");
        return new ArrayList<>();
    }
}
