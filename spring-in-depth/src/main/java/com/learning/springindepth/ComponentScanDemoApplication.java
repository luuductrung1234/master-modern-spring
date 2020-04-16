package com.learning.springindepth;

import com.learning.componentscan.ProductService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@ComponentScan("com.learning.componentscan")
public class ComponentScanDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(ComponentScanDemoApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                ComponentScanDemoApplication.class)) {
            ProductService productService = applicationContext.getBean(ProductService.class);
            logger.info("{}", productService);
        }
    }
}