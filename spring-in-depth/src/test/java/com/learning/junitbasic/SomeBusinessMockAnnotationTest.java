package com.learning.junitbasic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = JunitBasicApplication.class)
public class SomeBusinessMockAnnotationTest {

    @Mock
    DataService mockDataService;

    @InjectMocks
    SomeBusinessImpl businessImpl;

    @Test
    public void testFindTheGreatestFromAllData_WithMockito() {
        Mockito.when(mockDataService.retrieveAllData()).thenReturn(new int[] { 1, 10, 27, 24 });

        int result = businessImpl.findTheGreatestFromAllData();
        Assert.assertEquals(27, result);
    }
}