package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - " + name);
        }
        if ("tanks".equals(name)) {
        System.out.println("Start - " + name);
        }
        if ("tetris".equals(name)) {
            System.out.println("Start - " + name);

            }
    }

    public static void main(String[] args) {

        menu("tanks");
        menu("tetris");
        menu("super mario");
    }

}
