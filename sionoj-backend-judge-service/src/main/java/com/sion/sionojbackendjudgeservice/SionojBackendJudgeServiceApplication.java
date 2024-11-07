package com.sion.sionojbackendjudgeservice;

import com.sion.sionojbackendjudgeservice.rabbitmq.InitRabbitMq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

//  如需开启 Redis，须移除 exclude 中的内容
@SpringBootApplication()
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.sion")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.sion.sionojbackendserviceclient.service"})
public class SionojBackendJudgeServiceApplication {
    public static void main(String[] args) {
        //项目启动前 初始化 RabbitMQ
        InitRabbitMq.doInit();
        SpringApplication.run(SionojBackendJudgeServiceApplication.class, args);
    }

}
