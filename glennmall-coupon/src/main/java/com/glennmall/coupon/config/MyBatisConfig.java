package com.glennmall.coupon.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.glennmall.coupon.dao")
public class MyBatisConfig {
}
