package com.eduardaliiev.utils.arrays.utils.actionsoutput;


public class OutputOnlyCharacters {

    private static String outputOnlyCharacters(String inputString) {
        StringBuilder onlyChar = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetter(inputString.charAt(i)))               // вывод только букв (isLetter)
                onlyChar.append(inputString.charAt(i));
        }
        // System.out.println("Entered values: ->" + onlyChar);
        return onlyChar.toString();
    }
}