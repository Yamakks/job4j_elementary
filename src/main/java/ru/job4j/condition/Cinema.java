package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("The age of the customer is: " + age);

        if (age >= 21) {

            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("This is not for you.");
        }
    }

        public static void main(String[] args) {
        access(21);
        access(20);
        access(22);
    }
}
