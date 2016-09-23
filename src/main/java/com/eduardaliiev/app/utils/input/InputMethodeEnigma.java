package com.eduardaliiev.app.utils.input;

import com.eduardaliiev.app.methods.arrays.enigma.EnigmaDecodeMethod;
import com.eduardaliiev.app.methods.arrays.enigma.EnigmaEncodeMethod;

import java.util.Scanner;

public class InputMethodeEnigma {

    public static void inputMethodeEnigma() {
        Scanner scanner = new Scanner(System.in);

        String inputStringEnigma;
        labelOfExit:
        while (true) {

            System.out.println(
                    "\n 1 - Encode" +
                            "\n 2 - Decode\n" +
                            "\n 0 - Exit");
            int numberOfExempls = Integer.valueOf(scanner.nextLine());
            switch (numberOfExempls) {
                case 0:
                    System.out.println("Starting program: " + "Exit");
                    break labelOfExit;
                case 1:
                    inputStringEnigma = getWord(scanner);
                    System.out.print("\nEncode words Enigma: ");
                    EnigmaEncodeMethod enigmaEncodeMethod = new EnigmaEncodeMethod();              //Вызываем метод шифрования
                    enigmaEncodeMethod.encodeMethod(inputStringEnigma);
                    break;
                case 2:
                    inputStringEnigma = getWord(scanner);
                    System.out.print("\nEncode words Enigma: ");
                    EnigmaDecodeMethod enigmaDecodeMethod = new EnigmaDecodeMethod();              //Вызываем метод Дешифрования
                    enigmaDecodeMethod.decodeMethod(inputStringEnigma);
                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
        }
    }

    private static String getWord(Scanner scanner) {
        System.out.print("Enter words: ");
        return scanner.nextLine();
    }

}
