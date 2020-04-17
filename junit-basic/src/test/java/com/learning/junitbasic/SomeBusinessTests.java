package com.learning.junitbasic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.AfterTestMethod;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

@SpringBootTest
class SomeBusinessTests {

    @BeforeTestClass
    public void beforeTestClass() {
        System.out.println("Before Test Class");
    }

    @BeforeTestMethod
    public void beforeTestMethod() {
        System.out.println("Before Test Method");
    }

    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new MockDataServiceImpl());
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(15, result, "");
    }

    @Test
    public void testFindTheGreatestFromAllData_WithMockito() {
        DataService mockDataService = mock(DataService.class);
        when(mockDataService.retrieveAllData()).thenReturn(new int[] { 1, 10, 27, 24 });

        SomeBusinessImpl businessImpl = new SomeBusinessImpl(mockDataService);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(27, result, "");
    }

    @AfterTestMethod
    public void afterTestMethod() {
        System.out.println("After Test Method");
    }

    @AfterTestClass
    public void afterTestClass() {
        System.out.println("After Test Class");
    }
}
