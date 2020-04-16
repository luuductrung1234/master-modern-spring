package com.learning.springindepth.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class QuickSortAlgorithm implements SortAlgorithm {

    public QuickSortAlgorithm() {
        super();
        System.out.println(String.format("New Quick Sort's bean created %s", this.toString()));
    }

    @Override
    public int[] sort(int[] numbers) {
        System.out.println("Running Quick Sort . . .");
        return numbers;
    }

}