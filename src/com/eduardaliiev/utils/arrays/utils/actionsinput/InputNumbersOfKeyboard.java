package com.eduardaliiev.utils.arrays.utils.actionswitharray;

import java.util.Arrays;
import java.util.Scanner;

public class InputNumbersOfKeyboard {

    public int[] inputNumbersOfKeyboard() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter number of the array by a semicolon(;): ");

        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(";");
        int[] arraysNumber = new int[splittedStringArray.length];
        for (int i = 0; i < splittedStringArray.length; i++)
            arraysNumber[i] = Integer.valueOf(splittedStringArray[i]);

        System.out.print("\n" + " Entered array is " + Arrays.toString(arraysNumber).replace(",", ";") +
                " \n ===================================== \n");


        return arraysNumber;

    }
}
