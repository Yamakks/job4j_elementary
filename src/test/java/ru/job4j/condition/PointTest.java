package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenx10y11x22y23then2point82() {
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 3;
        double expected = 2.82;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void whenx15y11x22y23then3point6() {
        int x1 = 5;
        int y1 = 1;
        int x2 = 2;
        int y2 = 3;
        double expected = 3.6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenx15y13x24y29then6point08() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 4;
        int y2 = 9;
        double expected = 6.08;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.005);
    }
    }