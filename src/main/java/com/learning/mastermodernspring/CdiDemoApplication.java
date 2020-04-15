package com.learning.mastermodernspring;

import com.learning.mastermodernspring.cdi.SomeCdiBusiness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CdiDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(CdiDemoApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                CdiDemoApplication.class)) {
            SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
            logger.info("{}", someCdiBusiness);
        }
    }
}