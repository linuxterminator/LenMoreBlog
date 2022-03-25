package com.huqingshan.LenMore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static com.huqingshan.LenMore.model.constant.LenMoreConstant.*;

/**
 * 在3.0中，显式删除了@EnableSwagger2注解
 * Swagger2的配置
 * 静态变量被配置在其他地方
 */
@Configuration
//@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket DocketConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .build();
    }

    /**
     * 设置api的详细信息
     */
    public ApiInfo getApiInfo(){
        return new ApiInfoBuilder()
                .title(TITLE)
                .version(VERSION)
                .description(DESCRIPTION)
                .build();
    }
}
