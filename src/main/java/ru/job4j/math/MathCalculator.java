package ru.job4j.math;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double difAnDdiv(double first, double second) {
        return MathFunction.difference(first, second)
                + MathFunction.division(first, second);
    }

    public  static double totalSum(double first, double second) {
        return MathFunction.division(first, second)
                + MathFunction.difference(first, second)
                + MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат MathFunction.sum + MathFunction.multiply расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат MathFunction.difference + MathFunction.division расчета равен: " + difAnDdiv(10, 20));
        System.out.println("Результат расчета равен суммы методов класса MathFunction равен: " + totalSum(10, 20));
    }
}
