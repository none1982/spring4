package com.spring4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring4.pojo.HelloWorld;
import com.spring4.pojo.impl.HelloWorldImpl;

@Configuration
public class HelloWorldConfig {
 
    @Bean(name="helloWorldBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
 
}