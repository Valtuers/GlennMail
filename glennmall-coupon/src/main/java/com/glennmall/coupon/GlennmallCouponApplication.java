package com.glennmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//开启服务注册与发现功能
@EnableDiscoveryClient
//开启远程调用功能
@EnableFeignClients(basePackages = "com.glennmall.coupon.feign")
@SpringBootApplication
public class GlennmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlennmallCouponApplication.class, args);
    }

}
