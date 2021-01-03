package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int indexOfO(int[] data, int el, int start, int finish) {
        int res = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                res = i;
            }
        }
        return  res;
    }
}
