package com.learning.mastermodernspring;

import com.learning.mastermodernspring.scope.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScopeDemoApplication {
    private static Logger logger = LoggerFactory.getLogger(ScopeDemoApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ScopeDemoApplication.class, args);

        PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
        logger.info("{}", personDAO1);

        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
        logger.info("{}", personDAO2);
    }
}