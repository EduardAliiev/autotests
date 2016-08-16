package com.eduardaliiev.utils.arrays.enigma;

import java.util.Scanner;

public class InputMethodeEnigma {

    public static String inputMethodeEnigma() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter words: ");
        String inputStringEnigma = scanner.nextLine();

        labelOfExit:
        while (true) {
            System.out.println(
                    "\n 1 - Encode" +
                            "\n 2 - Decode\n" +
                            "\n 0 - Exit");

            int numberOfExempls = (int) scanner.nextDouble();
            switch (numberOfExempls) {
                case 0:
                    System.out.println("Starting program: " + "Exit");
                    break labelOfExit;
                case 1:
                    System.out.print("Encode words Enigma: ");
                    EnigmaEncodeMethod enigmaEncodeMethod = new EnigmaEncodeMethod();              //Вызываем метод шифрования
                    enigmaEncodeMethod.encodeMethod(inputStringEnigma);
                    break;
                case 2:
                    System.out.print("Encode words Enigma: ");
                    EnigmaDecodeMethod enigmaDecodeMethod = new EnigmaDecodeMethod();              //Вызываем метод Дешифрования
                    enigmaDecodeMethod.decodeMethod(inputStringEnigma);
                default:
                    System.out.println("Exit");
                    break;
            }
        }
        return inputStringEnigma;
    }
}