package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
    /**
     * 创建Docket类型对象，并使用spring容器管理、
     * Docket是Swagger中的全局配置对象
     * @return
     */
    @Bean
    public Docket docket(){
        Docket docket=new Docket(DocumentationType.OAS_30);
        //api文档配置信息
        ApiInfo apiInfo=new ApiInfoBuilder()
                .title("Swagger-UI接口使用文档") //标题
                .description("用于帮助广大前后端分离的开发者对接的问题！") //描述
                .version("v1.0") //版本
                .contact(new Contact("Swagger-UI开发",//网络标题
                        "http://localhost:8080/swagger-ui/index.html", //地址
                        "chengfuse@outlook.com")) //发送邮件
                .build();
        docket.apiInfo(apiInfo);
        docket=docket.select()
                .apis(RequestHandlerSelectors.basePackage("com.example.controller"))
                .paths(PathSelectors.regex("/swagger/.*"))
                .build();
        return docket;
    }


}
