package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean rsl = false;
        if (!name.isEmpty() && Character.isLowerCase(name.charAt(0))) {
            for (int i = 0; i < name.length(); i++) {
                if (!isSpecialSymbol(name.charAt(i))
                        || !isUpperLatinLetter(name.charAt(i))
                        || !isLowerLatinLetter(name.charAt(i))
                    || !Character.isDigit(name.charAt(i))) {
                    rsl = true;
                }
            }

        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 95 || code == 36);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (code >= 65 && code <= 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (code >= 97 && code <= 122);
    }
}
