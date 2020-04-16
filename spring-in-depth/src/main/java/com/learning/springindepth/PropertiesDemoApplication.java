package com.learning.springindepth;

import com.learning.springindepth.properties.ProductExternalService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(PropertiesDemoApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                PropertiesDemoApplication.class)) {
            ProductExternalService productExternalService = applicationContext.getBean(ProductExternalService.class);
            logger.info("{}", productExternalService);
            logger.info("{}", productExternalService.getUrl());
        }
    }
}