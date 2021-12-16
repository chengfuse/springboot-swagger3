package com.example.springbootswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@ComponentScan("com.example.*")
/**
 * 开启swagger  Swagger2： @EnableSwagger2
 * swagger3  访问  http://ip:端口/swagger-ui/index.html
 * swagger2  访问  http://ip:端口/swagger-ui.html
 * */
@EnableOpenApi
public class SpringBootSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSwaggerApplication.class, args);
    }

}
