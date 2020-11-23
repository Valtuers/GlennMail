package com.glennmall.member.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.glennmall.member.dao")
public class MyBatisConfig {
}
