package com.hyanzz;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @auther ywy
 * @create 2020-05-27 15:13
 */
@SpringBootApplication
// 开启基于注解的dubbo功能（主要是包扫描@DubboComponentScan）
@EnableDubbo
public class MyProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProviderApplication.class,args);
    }
}
