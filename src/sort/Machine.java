package sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int i = 0; i < 4; i++) {
            while (change - coins[i] >= 0) {
                rsl[size] = coins[i];
                change -= coins[i];
                size += 1;
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}
