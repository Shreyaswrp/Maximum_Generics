package com.MaximumGeneric;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenMaxNumber_In1stPosition_ShouldReturn_SameNumber() {
        Maximum maximum = new Maximum(3, 2, 1);
        Integer maxInt = (Integer) maximum.getMax();
        Assert.assertEquals(3, (int) maxInt);
    }

    @Test
    public void givenMaxNumber_In2ndtPosition_ShouldReturn_SameNumber() {
        Maximum maximum = new Maximum(2, 3, 1);
        Integer maxInt = (Integer) maximum.getMax();
        Assert.assertEquals(3, (int) maxInt);
    }

    @Test
    public void givenMaxNumber_In3rdtPosition_ShouldReturn_SameNumber() {
        Maximum maximum = new Maximum(1, 2, 3);
        Integer maxInt = (Integer) maximum.getMax();
        Assert.assertEquals(3, (int) maxInt);
    }

    @Test
    public void givenMaxFloat_In1stPosition_ShouldReturn_SameFloat() {
        Maximum maximum = new Maximum(3.3f, 2.2f, 1.1f);
        Float maxFloat = (Float) maximum.getMax();
        Assert.assertEquals(3.3f, maxFloat, 0.0);
    }

    @Test
    public void givenMaxFloat_In2ndPosition_ShouldReturn_SameFloat() {
        Maximum maximum = new Maximum(2.2f, 3.3f, 1.1f);
        Float maxFloat = (Float) maximum.getMax();
        Assert.assertEquals(3.3f, maxFloat, 0.0);
    }

    @Test
    public void givenMaxFloat_In3rdPosition_ShouldReturn_SameFloat() {
        Maximum maximum = new Maximum(1.1f, 2.2f, 3.3f);
        Float maxFloat = (Float) maximum.getMax();
        Assert.assertEquals(3.3f, maxFloat, 0.0);
    }

    @Test
    public void givenMaxString_In1stPosition_ShouldReturn_SameString() {
        Maximum maximum = new Maximum("orange", "banana", "apple");
        String maxString = (String) maximum.getMax();
        Assert.assertEquals("orange", maxString);
    }

    @Test
    public void givenMaxString_In2ndPosition_ShouldReturn_SameString() {
        Maximum maximum = new Maximum("apple", "orange", "banana");
        String maxString = (String) maximum.getMax();
        Assert.assertEquals("orange", maxString);
    }

    @Test
    public void givenMaxString_In3rdPosition_ShouldReturn_SameString() {
        Maximum maximum = new Maximum("apple", "banana", "orange");
        String maxString = (String) maximum.getMax();
        Assert.assertEquals("orange", maxString);
    }
}
