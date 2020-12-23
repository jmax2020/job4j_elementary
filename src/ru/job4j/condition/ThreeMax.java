package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        //int result = first;
        int result = third;
        if (first >= second && first >= third) {
            //result = second;
            result = first;
        }
        if (second >= first && second >= third) {
            //result = third;
            result = second;
        }
        return result;
    }
}
