package com.glennmall.product.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.glennmall.product.dao")
public class MyBatisConfig {
}
