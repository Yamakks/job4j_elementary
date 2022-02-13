package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double result = amount;
        while (result >= 0) {
            amount = result * percent / 100;
            result = result + amount - salary;
            year++;
        }
        return year;
    }
}
