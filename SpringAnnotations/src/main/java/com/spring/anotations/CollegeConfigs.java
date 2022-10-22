package com.spring.anotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.anotations")
@PropertySource("college-info.properties")
public class CollegeConfigs {

}
