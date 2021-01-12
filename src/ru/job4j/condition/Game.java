package ru.job4j.condition;

public class Game {

    public static int checkGame(double percent, int prize, int pay) {
       double sum = percent * prize;
       if (sum > pay) {
           return (int) sum - pay;
       } else {
           return 0;
       }
    }
}
