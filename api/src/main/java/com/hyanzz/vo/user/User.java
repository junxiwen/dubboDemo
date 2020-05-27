package com.hyanzz.vo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description
 * @auther ywy
 * @create 2020-05-27 15:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  implements Serializable {
    private Integer id;
    private String name;
    private String pass;
    private Integer age;

    public User(String name,Integer age){
        this.name = name;
        this.age = age;
    }
}
