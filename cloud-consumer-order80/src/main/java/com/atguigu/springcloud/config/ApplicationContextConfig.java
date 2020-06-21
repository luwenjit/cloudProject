package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 注入rest template进入spring boot
 */
@Configuration
public class ApplicationContextConfig {

    //注入
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
