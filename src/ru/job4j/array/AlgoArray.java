package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {

        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        boolean wasChange = true;

        while (wasChange) {
            wasChange = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                wasChange = true;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
