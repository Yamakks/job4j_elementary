package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double res = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return res;
    }

    public  static void main(String[] args) {
        double result = Point.distance(0, 1, 2, 3);
        double result2 = Point.distance(5, 3, 4, 9);
        System.out.println(result + " is result for (0, 1) to (2, 3)");
        System.out.println(result2 + " is result for (5, 3) to (4, 9)");
    }
}
