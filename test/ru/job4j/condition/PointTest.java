package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when0050() {
        double distance = Point.distance(0, 0, 5, 0);
        double expected = 5;
        double delta = 0.01;
        Assert.assertEquals(expected, distance, delta);
    }

    @Test
    public void when0034() {
        double distance = Point.distance(0, 0, 3, 4);
        double expected = 5;
        double delta = 0.01;
        Assert.assertEquals(expected, distance, delta);
    }

    @Test
    public void when1356() {
        double distance = Point.distance(1, 3, 5, 6);
        double expected = 5;
        double delta = 0.01;
        Assert.assertEquals(expected, distance, delta);
    }
}