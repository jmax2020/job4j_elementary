package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double res = SqArea.square(6, 2);
        double delta = 0.01;
        double expected = 2;
        Assert.assertEquals(expected, res, delta);
    }

    @Test
    public void whenP24K5Then20() {
        double res = SqArea.square(24, 5);
        double delta = 0.01;
        double expected = 20;
        Assert.assertEquals(expected, res, delta);
    }
}