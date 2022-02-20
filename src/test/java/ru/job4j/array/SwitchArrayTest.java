package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapHalfMinus1ToHalf() {
        int[] input = {11, 56, 3, 4, 7, 12};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {11, 56, 4, 3, 7, 12};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapHalfToHalfMinus1() {
        int[] input = {11, 56, 3, 4, 7, 12, 13, 1};
        int source = 4;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {11, 56, 3, 7, 4, 12, 13, 1};
        Assert.assertArrayEquals(expected, result);
    }
}