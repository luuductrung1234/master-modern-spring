package com.learning.mastermodernspring.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch implements Search {

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    @Autowired
    public BinarySearch() {
        super();
        System.out.println(String.format("New Binary Search's bean created %s", this.toString()));
    }

    @Override
    public int search(int[] numbers, int numberToSearchFor) {
        System.out.println("Running Binary Search . . .");
        sortAlgorithm.sort(numbers);
        return 0;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Running Binary Search post contruct . . .");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Running Binary Search pre destroy . . .");
    }
}