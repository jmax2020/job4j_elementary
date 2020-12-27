package ru.job4j.condition;

public class Game {
//    public static void menu(String name) {
//        if (name.equals("super mario")) {
//            System.out.println("Start - super mario");
//        }
//        if (name.equals("tanks")) {
//            System.out.println("Start - tanks");
//        }
//        if (name.equals("tetris")) {
//            System.out.println("Start - tetris");
//        }
//    }

    public static int checkGame(double percent, int prize, int pay) {
       double sum = percent * prize;
       if (sum > pay) {
           return (int) sum - pay;
       } else {
           return 0;
       }
       }
//        return (int) sum > pay ? sum - pay : 0;


//    public static void main(String[] args) {
//        Game.menu("tanks");
//    }
}
