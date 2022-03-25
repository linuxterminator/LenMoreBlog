package com.huqingshan.LenMore;

import com.huqingshan.LenMore.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class LenMoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LenMoreApplication.class, args);
	}

}
