    package ru.job4j.array;

    public class Merge {
        public static int[] merge(int[] left, int[] right) {
            int[] rsl = new int[left.length + right.length];
            int pos1 = 0, pos2 = 0;
            for (int i = 0; i < rsl.length; i++) {
                if (pos1 == left.length) {
                    rsl[i] = right[pos2];
                    pos2++;
                } else if (pos2 == right.length) {
                    rsl[i] = left[pos1];
                    pos1++;
                } else if (left[pos1] < right[pos2]) {
                    rsl[i] = left[pos1];
                    pos1++;
                } else {
                    rsl[i] = right[pos2];
                    pos2++;
                }
            }
            return rsl;
        }
    }

