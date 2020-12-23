package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int res = 0;
        if (((x2 - x1) == (y2 - y1)) && x2 != x1) {
            res = Math.abs(x2 - x1);
        }
        return res;
    }
}
