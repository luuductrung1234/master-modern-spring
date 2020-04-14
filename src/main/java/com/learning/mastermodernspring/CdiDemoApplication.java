package com.learning.mastermodernspring;

import com.learning.mastermodernspring.cdi.SomeCdiBusiness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CdiDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(CdiDemoApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(CdiDemoApplication.class, args);

        SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
        logger.info("{}", someCdiBusiness);
    }
}