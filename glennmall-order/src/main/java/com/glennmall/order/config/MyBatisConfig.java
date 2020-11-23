package com.glennmall.order.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.glennmall.order.dao")
public class MyBatisConfig {
}
