package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas2Then3() {
        int[] data = {5, 4, 3, 2};
        int el = 2;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {0, 15, 11, 5};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas3InIntervalThen2() {
        int[] data = {3, 4, 3, 2, 7, 15, 22};
        int el = 3;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot15InIntervalThenMinus1() {
        int[] data = {5, 4, 3, 2, 7, 15, 22};
        int el = 15;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}