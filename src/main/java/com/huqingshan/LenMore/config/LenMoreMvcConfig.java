package com.huqingshan.LenMore.config;

import com.huqingshan.LenMore.config.converter.EnumConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 添加跨域
 * 添加静态资源处理，调用外部文件
 * 添加自定义额converter
 */
@Configuration
public class LenMoreMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET","POST","DELETE","PUT");
    }

    @Override
    public void addFormatters(FormatterRegistry registry){
        registry.addConverter(new EnumConverter());
    }

}
