package com.learning.junitbasic;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ListTest {

    @Test
    public void testSize() {
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.size()).thenReturn(10);
        Assertions.assertEquals(10, mockList.size());
        Assertions.assertEquals(10, mockList.size());
    }

    @Test
    public void testSize_MultipleReturns() {
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.size()).thenReturn(10).thenReturn(20);
        Assertions.assertEquals(10, mockList.size());
        Assertions.assertEquals(20, mockList.size());
        Assertions.assertEquals(20, mockList.size());
    }

    @Test
    public void testGet_SpecificParameter() {
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.get(0)).thenReturn("some value");
        Assertions.assertEquals("some value", mockList.get(0));
        Assertions.assertEquals(null, mockList.get(1));
    }

    @Test
    public void testGet_GenericParameter() {
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.get(Mockito.anyInt())).thenReturn("some value");
        Assertions.assertEquals("some value", mockList.get(0));
        Assertions.assertEquals("some value", mockList.get(1));
    }
}