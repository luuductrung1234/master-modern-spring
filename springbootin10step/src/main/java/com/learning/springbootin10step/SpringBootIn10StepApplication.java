package com.learning.springbootin10step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootIn10StepApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringBootIn10StepApplication.class);

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringBootIn10StepApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            logger.info("-> {}", beanName);
        }
    }
}
