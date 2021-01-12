package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] mass = new int[size][size];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                mass[i][j] = (i + 1) * (j + 1);
            }
        }
        return mass;
    }
}
