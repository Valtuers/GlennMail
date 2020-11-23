package com.glennmall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//开启服务注册与发现功能
@EnableDiscoveryClient
@SpringBootApplication
public class GlennmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlennmallWareApplication.class, args);
    }

}
