package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.arrays.readerandwriterfile.EnterWordsAndExit;
import com.eduardaliiev.utils.arrays.readerandwriterfile.PolindromeReadToWrite;
import com.eduardaliiev.utils.arrays.utils.enums.EnumNumbersOfMenus;
import com.eduardaliiev.utils.arrays.utils.output.WriteToFileOnlyNumbers;

import java.io.IOException;
import java.util.Scanner;

public class ReaderAndWriterMenuHomeTask10 {
    public static void runnerReaderWreater() throws IOException {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            EnumNumbersOfMenus selectedValue = null;
            while (true) {
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Reading numbers and sort from smaller to bigger" +
                        "\n 2 - Verifying the words on the \'polymorphism\'" +
                        "\n 3 - Create a new file, fill it up and enter verification word: \'exit\'\n" +
                        "\n 0 - Exit");
                try {
                    String numberOfChoice = String.valueOf(scanner.nextInt());
                    for (EnumNumbersOfMenus value1 : EnumNumbersOfMenus.values()) {
                        if (numberOfChoice.equals(value1.getValue())) {
                            selectedValue = value1;
                            break;
                        }
                    }
                    switch (selectedValue) {
                        case EXIT:
                            System.out.println("Starting program: " + "Exit");
                            break labelOfExit;
                        case FIRST:
                            System.out.println("Starting program: " + "Reading numbers and sort from smaller to bigger");
                            WriteToFileOnlyNumbers.writeToFile(WriteToFileOnlyNumbers.getOutputPath());
                            break;
                        case SECOND:
                            System.out.println("Starting program: " + "Verifying the words on the \'polymorphism\'");
                            PolindromeReadToWrite.readFromFile();
                            break;
                        case THIRD:
                            System.out.println("Starting program: " + "Create a new file, fill it up and enter verification word: \'exit\'");
                            EnterWordsAndExit.createFileAndWrite();
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid is entered number of choice :(");
                } catch (NullPointerException e) {
                    System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                }
            }
        }
        System.out.println("\n Oh-yeah!! Program has processed your choice! Good luck!!");
    }
}







