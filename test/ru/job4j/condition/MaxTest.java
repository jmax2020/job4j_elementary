package ru.job4j.condition;

//import org.junit.Assert;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when5And9Then9() {
    int max = Max.max(5, 9);
    assertThat(max, is(9));
    }

    @Test
    public void when13And20Then20() {
        int max = Max.max(13, 20);
        assertThat(max, is(20));
    }
}