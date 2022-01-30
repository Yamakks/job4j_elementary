package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1to2do2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax3to2do3() {
        int left = 3;
        int right = 2;
        int expected = 3;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax5to5do5() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }
}