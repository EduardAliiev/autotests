package com.eduardaliiev.app.utils.input;

import java.util.Scanner;

public class InputCharsOfKeyboard {

    public String inputCharsOfKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter any char of the arrays by a semicolon (;): ");
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(";");
        System.out.println("Entered values: " + inputString + "\nthrough delimiter \";\"");
        return inputString;
    }
}
