package com.learning.junitbasic;

public class MockDataServiceImpl implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] { 4, 6, 15, 10 };
    }

}