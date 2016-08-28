package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.arrays.readerandwriterfile.EnterWordsAndExit;
import com.eduardaliiev.utils.arrays.readerandwriterfile.PolindromeReadToWrite;
import com.eduardaliiev.utils.arrays.utils.output.WriteToFileOnlyNumbers;

import java.io.IOException;
import java.util.Scanner;

public class ReaderAndWriterMenuHomeTask10 {
    public static void runnerReaderWreater() throws IOException {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            while (true) {
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Reading numbers and sort from smaller to bigger" +
                        "\n 2 - Verifying the words on the \'polymorphism\'" +
                        "\n 3 - Create a new file, fill it up and enter verification word: \'exit\'\n" +


                        "\n 0 - Exit");
                int numberOfChoice;
                if (scanner.hasNextInt()) {                    // проверка на вводимое целое число
                    numberOfChoice = scanner.nextInt();
                    switch (numberOfChoice) {
                        case 0:
                            System.out.println("Starting program: " + "Exit");
                            break labelOfExit;
                        case 1:
                            System.out.println("Starting program: " + "Reading numbers and sort from smaller to bigger");
                            WriteToFileOnlyNumbers.writeToFile(WriteToFileOnlyNumbers.getOutputPath());
                            break;
                        case 2:
                            System.out.println("Starting program: " + "Verifying the words on the \'polymorphism\'");
                            PolindromeReadToWrite.readFromFile();
                            break;
                        case 3:
                            System.out.println("Starting program: " + "Create a new file, fill it up and enter verification word: \'exit\'");
                            EnterWordsAndExit.createFileAndWrite();
                            break;
                        default:
                            System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                            break;           //break labelOfExit;           // для выхода из цикла
                    }
                } else {
                    System.out.println("Sorry!! But you have entered isn't an integer number! Please try again.");
                    break;                              // без 'break' программа зацикливается
                }
                System.out.println("\n Oh-yeah!! Program has processed your choice! Good luck!!");
                try {
                    Thread.sleep(2500);              // вариант от идэешки)) задержка при выводе результата на 2,5 сек
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}







