package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int ind = 1; ind <= finish; ind++) {
           if (CheckPrimeNumber.check(ind)) {
               count += 1;
           }
        }
        return count;
    }
}
