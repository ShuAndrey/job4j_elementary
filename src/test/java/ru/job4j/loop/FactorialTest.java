package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialFor5Then120() {
        int in = 5;
        int expect = 120;
        int result = Factorial.calc(in);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int in = 0;
        int expect = 1;
        int result = Factorial.calc(in);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenCalculateFactorialFor10Then3628800() {
        int in = 10;
        int expect = 3628800;
        int result = Factorial.calc(in);
        Assert.assertEquals(expect, result);
    }
}