package com.sion.sionojbackendjudgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

//  如需开启 Redis，须移除 exclude 中的内容
@SpringBootApplication()
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.sion")
public class SionojBackendJudgeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SionojBackendJudgeServiceApplication.class, args);
    }

}
