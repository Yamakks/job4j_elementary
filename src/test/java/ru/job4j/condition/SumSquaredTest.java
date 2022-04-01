package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SumSquaredTest {

    @Test
    public void whenA1B1C1X1then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int result = SumSquared.calc(a, b, c, x);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenA0B1C1X1then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int result = SumSquared.calc(a, b, c, x);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenA1B1C0X1then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int result = SumSquared.calc(a, b, c, x);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenA1B1C1X0then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int result = SumSquared.calc(a, b, c, x);
        Assert.assertEquals(expected, result);
    }
}