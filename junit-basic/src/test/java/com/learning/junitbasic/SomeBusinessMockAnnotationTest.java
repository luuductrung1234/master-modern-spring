package com.learning.junitbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SomeBusinessMockAnnotationTest {

    @Mock
    DataService mockDataService;

    @InjectMocks
    SomeBusinessImpl businessImpl;

    @Test
    public void testFindTheGreatestFromAllData_WithMockito() {
        Mockito.when(mockDataService.retrieveAllData()).thenReturn(new int[] { 1, 10, 27, 24 });

        int result = businessImpl.findTheGreatestFromAllData();
        Assertions.assertEquals(27, result, "");
    }
}