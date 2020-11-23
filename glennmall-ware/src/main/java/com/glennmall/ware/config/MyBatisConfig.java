package com.glennmall.ware.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.glennmall.ware.dao")
public class MyBatisConfig {
}
