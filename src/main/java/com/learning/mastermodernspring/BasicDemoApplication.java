package com.learning.mastermodernspring;

import com.learning.mastermodernspring.basic.BinarySearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasicDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(BasicDemoApplication.class, args);

        BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);
        binarySearch1.search(new int[] {}, 1);

        BinarySearch binarySearch2 = applicationContext.getBean(BinarySearch.class);
        binarySearch2.search(new int[] {}, 1);
    }

}
