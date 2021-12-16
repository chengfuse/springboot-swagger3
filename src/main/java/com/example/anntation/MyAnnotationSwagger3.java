package com.example.anntation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Target -描述当前注解可以定义在什么资源上
 * 属性 value
 * -定义具体的资源 包括:
 *  ElementType.METHOD    可以定义在方法上
 *  ElementType.TYPE      可以定义在类型上
 *  ElementType.FIELD     可以定义在属性上
 *  ElementType.PARAMETER 可以定义在方法参数上
 * @Retention 当前注解在什么时候有效
 * 属性 value
 *  定义具体的生效标记
 *  Retention.RUNTIME 运行时有效
 *  Retention.SOURCE  源码中有效
 *  Retention.CLASS   字节码有效
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotationSwagger3 {
    //自定义注解中的属性。  示例: MyAnnotationSwagger3(value="")
    String value() default "";
}
