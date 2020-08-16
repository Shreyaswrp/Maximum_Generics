package com.MaximumGeneric;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenMaxNumber_In1stPosition_ShouldReurn_SameNumber() {
        Maximum maximum = new Maximum();
        Integer maxInt = maximum.getMaxInt(new Integer[]{ 3, 2, 1 });
        Assert.assertEquals(3, (int) maxInt);
    }

    @Test
    public void givenMaxNumber_In2ndtPosition_ShouldReurn_SameNumber() {
        Maximum maximum = new Maximum();
        Integer maxInt = maximum.getMaxInt(new Integer[]{ 2, 3, 1 });
        Assert.assertEquals(3, (int) maxInt);
    }

    @Test
    public void givenMaxNumber_In3rdtPosition_ShouldReurn_SameNumber() {
        Maximum maximum = new Maximum();
        Integer maxInt = maximum.getMaxInt(new Integer[]{ 1, 2, 3 });
        Assert.assertEquals(3, (int) maxInt);
    }
    @Test
    public void givenMaxFloat_In1stPosition_ShouldReurn_SameNumber() {
        Maximum maximum = new Maximum();
        Float maxFloat = maximum.getMaxFloat(new Float[]{ 3.3f, 2.2f, 1.1f });
        Assert.assertEquals(3.3f, maxFloat, 0.0);
    }

    @Test
    public void givenMaxFloat_In2ndPosition_ShouldReurn_SameNumber() {
        Maximum maximum = new Maximum();
        Float maxFloat = maximum.getMaxFloat(new Float[]{ 2.2f, 3.3f, 1.1f });
        Assert.assertEquals(3.3f, maxFloat, 0.0);
    }

    @Test
    public void givenMaxFloat_In3rdPosition_ShouldReurn_SameNumber() {
        Maximum maximum = new Maximum();
        Float maxFloat = maximum.getMaxFloat(new Float[]{ 1.1f, 2.2f, 3.3f });
        Assert.assertEquals(3.3f, maxFloat, 0.0);
    }
}
