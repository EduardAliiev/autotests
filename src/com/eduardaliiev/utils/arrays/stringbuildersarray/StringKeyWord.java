package com.eduardaliiev.utils.arrays.stringbuildersarray;

import java.util.Scanner;

public class StringKeyWord {
    public static void stringBuilders() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Please, enter a keyword in the string: ");
        String inputKeywordString = scanner.nextLine();
        System.out.println(inputString.replaceAll(inputKeywordString, "\n"));    // удаляем ключевое слово из строки
        // .replaceAll("\\s{2,}", " "));                             // строка для удаления 2х пробелов
    }
}


