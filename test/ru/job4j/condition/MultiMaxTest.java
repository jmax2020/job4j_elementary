package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(11, 34, 22);
        assertThat(result, is(34));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(111, 34, 22);
        assertThat(result, is(111));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(111, 34, 222);
        assertThat(result, is(222));
    }
}