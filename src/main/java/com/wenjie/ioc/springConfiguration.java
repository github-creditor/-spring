package com.wenjie.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration   //用于指定当前类是一个 Spring 配置类，当创建容器时会从该类上加载注解
@ComponentScan(basePackages = "com.wenjie.ioc")         //用于指定 Spring 在初始化容器时要扫描的包。
                                                        // 相当于<context:component-scan base-package="cn.ykf"/>
public class springConfiguration {

    @Bean("id")
    @Scope("prototype")
    public int takeint(){       //当我们使用该注解配置方法时，
                                // 如果方法有参数，那么 Spring 框架会去容器中查找有没有可用的 Bean 对象。
                                //查找的方式和 @Autowired 一样
        return 1;

    }




}
