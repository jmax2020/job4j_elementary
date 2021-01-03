package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {-555, 4, 77, -99, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-555, -99, 0, 4, 77};
        assertThat(result, is(expect));
    }
}