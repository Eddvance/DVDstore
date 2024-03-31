package com.mycompany.dvdstore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvdstore.controller"})
@ComponentScan(basePackages = {"com.mycompany.dvdstore.service"})
@ComponentScan(basePackages = {"com.mycompany.dvdstore.repository.file"})
@PropertySource("classpath:application.properties")
public class AppConfig {
}
