package com.learning.springindepth;

import com.learning.springindepth.basic.BinarySearch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BasicDemoApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                BasicDemoApplication.class)) {
            BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);
            binarySearch1.search(new int[] {}, 1);

            BinarySearch binarySearch2 = applicationContext.getBean(BinarySearch.class);
            binarySearch2.search(new int[] {}, 1);

            // after try-catch, the application context will automatically close
        }
    }

}
