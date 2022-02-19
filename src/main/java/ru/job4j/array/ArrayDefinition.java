package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Maxim";
        names[1] = "Alex";
        names[2] = "Sergey";
        names[3] = "Pavel";
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surname равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        for (int index = 0; index <= 3; index++) {
            System.out.println(names[index]);
        }

        }
    }

