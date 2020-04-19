package com.learning.databasedemo;

import java.util.Date;

import com.learning.databasedemo.entity.Person;
import com.learning.databasedemo.springdata.SpringDataPersonRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(SpringDataDemoApplication.class);

    @Autowired
    SpringDataPersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All Users: {}", personRepository.findAll());

        logger.info("User with id 10002: {}", personRepository.findById(10002));

        logger.info("Delete User with id 10001");
        personRepository.deleteById(10001);

        Person newPerson = new Person(10004, "Trung", "HCM", new Date());
        logger.info("Insert new User - Inserted User {}", personRepository.save(newPerson));

        Person updatedPerson = new Person(10003, "Pieter (updated)", "Amsterdam", new Date());
        logger.info("Update User with id 10003 - Update User {}", personRepository.save(updatedPerson));
    }
}
