package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

import java.nio.channels.AcceptPendingException;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(140);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(180);
        Assert.assertEquals(expected, out);
    }
}