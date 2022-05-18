package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(2, 1);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And2And3Then3() {
        int result = Max.max(1, 2, 3);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3And1And8And4Then8() {
        int result = Max.max(3, 1, 8, 4);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }
}