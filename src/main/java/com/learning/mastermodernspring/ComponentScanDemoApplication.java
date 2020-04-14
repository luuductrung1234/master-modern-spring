package com.learning.mastermodernspring;

import com.learning.componentscan.ProductService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.learning.componentscan")
public class ComponentScanDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(ComponentScanDemoApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ComponentScanDemoApplication.class,
                args);

        ProductService productService = applicationContext.getBean(ProductService.class);
        logger.info("{}", productService);
    }
}