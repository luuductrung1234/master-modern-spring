package com.learning.mastermodernspring;

import com.learning.mastermodernspring.scope.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ScopeDemoApplication {
    private static Logger logger = LoggerFactory.getLogger(ScopeDemoApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                ScopeDemoApplication.class)) {
            PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
            logger.info("{}", personDAO1);

            PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
            logger.info("{}", personDAO2);
        }
    }
}