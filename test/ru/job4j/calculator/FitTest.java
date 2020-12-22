package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan190Then103(){
        short manWeight = 190;
        double res = Fit.manWeight(manWeight);
        double expected = 103.5;
        double delta = 0.01;
        Assert.assertEquals(expected, res, delta);
    }

    @Test
    public void whenWoman160Then57() {
        short womanWeight = 160;
        double res = Fit.womanWeight(womanWeight);
        double expected = 57.5;
        double delta = 0.01;
        Assert.assertEquals(expected, res, delta);
    }
}