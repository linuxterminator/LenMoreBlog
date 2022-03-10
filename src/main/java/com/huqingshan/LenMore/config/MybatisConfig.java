package com.huqingshan.LenMore.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 用来设置mybatis的一些设置
 * 配置自动扫描mapper，不需要手动给每个Mapper接口添加@Mapper注解
 */

@Configuration
@MapperScan(value = {"com.huqingshan.LenMore.repository.dao"})
public class MybatisConfig {
}
