package com.learning.springindepth.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BubbleSortAlgorithm implements SortAlgorithm {

    public BubbleSortAlgorithm() {
        super();
        System.out.println(String.format("New Bubble Sort's bean created %s", this.toString()));
    }

    @Override
    public int[] sort(int[] numbers) {
        System.out.println("Running Buble Sort . . .");
        return numbers;
    }

}