package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return   Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point one = new Point(0, 0);
        Point two = new Point(3, 4);
      double result = one.distance(two);
        System.out.println("distance (0,0) to (3,4) " + result);
    }
}
