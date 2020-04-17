package com.learning.springindepth.basic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchXmlConfigurationTest {
    @Autowired
    BinarySearch binarySearch;

    @Test
    public void testBasicScenario() {
        int acctualResult = binarySearch.search(new int[] {}, 5);
        Assert.assertEquals(0, acctualResult);
    }
}