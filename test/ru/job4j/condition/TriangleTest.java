package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenTrue() {
        boolean res = Triangle.exist(3.8, 5.9, 9);
        assertThat(res, is(true));
    }

    @Test
    public void whenFalse() {
        boolean res = Triangle.exist(3.8, 5.9, 50);
        assertThat(res, is(false));
    }
}