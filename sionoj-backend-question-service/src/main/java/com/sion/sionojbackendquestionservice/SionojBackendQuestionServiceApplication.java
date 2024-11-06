package com.sion.sionojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

//  如需开启 Redis，须移除 exclude 中的内容
@SpringBootApplication()
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.sion")
@MapperScan("com.sion.sionojbackendquestionservice.mapper")
@EnableScheduling
@EnableFeignClients(basePackages = {"com.sion.sionojbackendserviceclient.service"})
public class SionojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SionojBackendQuestionServiceApplication.class, args);
    }

}
