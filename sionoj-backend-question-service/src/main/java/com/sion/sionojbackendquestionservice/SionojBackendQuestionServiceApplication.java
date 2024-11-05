package com.sion.sionojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

//  如需开启 Redis，须移除 exclude 中的内容
@SpringBootApplication()
@MapperScan("com.sion.sionojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.sion")
public class SionojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SionojBackendQuestionServiceApplication.class, args);
    }

}
