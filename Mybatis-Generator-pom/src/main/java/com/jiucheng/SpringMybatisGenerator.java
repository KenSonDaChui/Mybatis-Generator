package com.jiucheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @功能描述:
 * @Auther: Administrator
 * @Date: 2019/9/15 15:31
 */
@SpringBootApplication
@MapperScan("com.jiucheng.dao")
//@ComponentScan("com.jiucheng.dao")
public class SpringMybatisGenerator {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisGenerator.class,args);
    }
}
