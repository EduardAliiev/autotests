package com.eduardaliiev.app.methods.stringbuildersarray;

import com.eduardaliiev.app.utils.input.InputCharsOfKeyboard;

public class ArrayOfCharDataWithDelimiter {

    public static void stringBuilders() {

        InputCharsOfKeyboard inputCharsOfKeyboard = new InputCharsOfKeyboard();              //Вызываем метод ввода значений
        String inputString = inputCharsOfKeyboard.inputCharsOfKeyboard();

        System.out.println("Entered values: -> " + outputOnlyCharacters(inputString));
    }

    private static String outputOnlyCharacters(String inputString) {
        StringBuilder onlyChar = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetter(inputString.charAt(i)))               // вывод только букв (isLetter), isLetterOrDigit - вывод только букв и цифр
                onlyChar.append(inputString.charAt(i));
        }
        return onlyChar.toString();
    }
}



