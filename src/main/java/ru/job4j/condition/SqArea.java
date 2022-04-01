package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
      double h = p / (2 * (k + 1));
      double i = h * k;
      return  i * h;
    }

    public static void main(String[] args) {
        double p1 = 4;
        double k1 = 1;
        System.out.print("p = " + p1 + ", k = " + k1 + ", s = 1, real = ");
        double result1 = SqArea.square(p1++, k1++);
        p1++;
        double result2 = SqArea.square(p1, k1);
        System.out.println(result1);
        System.out.print("p = " + p1 + ", k = " + k1 + ", s = 2, real = ");
        System.out.println(result2);

    }
}
