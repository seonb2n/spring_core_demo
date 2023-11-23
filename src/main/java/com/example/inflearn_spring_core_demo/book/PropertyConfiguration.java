package com.example.inflearn_spring_core_demo.book;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
public class PropertyConfiguration {
}
