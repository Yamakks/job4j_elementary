package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;

    }

     public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {

        float rubles = 238;
        float euro = Converter.rubleToEuro(rubles);
        float dollar = Converter.rubleToDollar(rubles);
        System.out.println(rubles + " rubles are " + euro + " euro.");
        System.out.println(rubles + " rubles are " + dollar + " dollars.");
        float in = 350;
        float expected = in / 70;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(in + " rubles are " + expected + " Euros. Test result : " + passed);
        expected = in / 60;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println(in + " rubles are " + expected + " Dollars. Test result : " + passed);
    }
}
