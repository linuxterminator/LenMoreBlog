package com.huqingshan.LenMore.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 应用配置
 */
@Data
@ConfigurationProperties(prefix = "lenmore")
@EnableConfigurationProperties(ApplicationConfig.class)
public class ApplicationConfig {

    private String workdir;

}
