package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan187then100dot05() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.005);
    }

    @Test
    public void whenWomen187then88dot55() {
        short in = 187;
        double expected = 88.55;
        double result = Fit.womanWeight(in);
        Assert.assertEquals(expected, result, 0.01);
    }
}