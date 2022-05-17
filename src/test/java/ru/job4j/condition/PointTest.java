package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to24then2dot82() {
        double expected = 2.82;
        Point first = new Point(1, 2);
        Point second = new Point(3, 4);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then0() {
        double expected = 0;
        Point first = new Point(1, 1);
        Point second = new Point(1, 1);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to50then7dot07() {
        double expected = 7.07;
        Point first = new Point(0, 5);
        Point second = new Point(5, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}