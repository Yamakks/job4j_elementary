package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTenToTwentyFiveThenOneHundredThirtySix() {
        int start = 10;
        int finish = 25;
        int result = Counter.sumByEven(start, finish);
        int expected = 136;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromFiftyToFiftyEightThenTwoHundredAndSeventy() {
        int start = 50;
        int finish = 58;
        int result = Counter.sumByEven(start, finish);
        int expected = 270;
        Assert.assertEquals(expected, result);
    }
}