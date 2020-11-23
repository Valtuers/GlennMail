package com.glennmall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//开启服务注册与发现功能
@EnableDiscoveryClient
@SpringBootApplication
public class GlennmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlennmallOrderApplication.class, args);
    }

}
