package com.mrh.config;

import com.mrh.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//这个也会被spring容器托管，注册到容器中。因为它本来就是一个@Component，
// @Configuration代表这是一个配置类，就和我们之前看的beans.xml

public class MrhConfig {
    //注册一个bean，就相当于之前的bean标签
    //这个方法名字，就相当于bean标签中的id属性
    // 这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser() {
        return new User();//返回要注入到bean的对象！！
    }
}
