package com.learning.springaop;

import com.learning.springaop.business.FirstBusiness;
import com.learning.springaop.business.SecondBusiness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(SpringAopApplication.class);

    @Autowired
    FirstBusiness firstBusiness;

    @Autowired
    SecondBusiness secondBusiness;

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String firstResult = firstBusiness.calculateSomething();
        logger.info("{}", firstResult);
        String secondResult = secondBusiness.calculateSomething();
        logger.info("{}", secondResult);
    }

}
