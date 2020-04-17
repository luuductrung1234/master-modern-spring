package com.learning.springindepth.cdi;

import com.learning.springindepth.CdiDemoApplication;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = CdiDemoApplication.class)
public class SomeCdiBusinessTest {
    @InjectMocks
    SomeCdiBusiness someCdiBusiness;

    @Mock
    SomeCdiDAO someCdiDAO;

    @Test
    public void findGreatestTest() {
        Mockito.when(someCdiDAO.getData()).thenReturn(new int[] { 234, 2, 44 });
        int actualResult = someCdiBusiness.findGreatest();
        Assert.assertEquals(234, actualResult);
    }
}