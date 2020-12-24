package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialFor5Then120() {
        int exp = 120;
        assertThat(Factorial.calc(5), is(exp));
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int exp = 1;
        assertThat(Factorial.calc(0), is(exp));
    }
}