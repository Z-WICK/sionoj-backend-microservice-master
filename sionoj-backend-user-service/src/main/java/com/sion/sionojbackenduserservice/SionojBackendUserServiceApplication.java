package com.sion.sionojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

//  如需开启 Redis，须移除 exclude 中的内容
@SpringBootApplication()
@MapperScan("com.sion.sionojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.sion")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.sion.sionojbackendserviceclient.service"})
public class SionojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SionojBackendUserServiceApplication.class, args);
    }

}
