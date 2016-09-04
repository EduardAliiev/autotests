package com.eduardaliiev.utils.arrays.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class WordsSorterGenerics<K extends Number> {

    public static void genericsCreate() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> myList = new ArrayList<>();
        HashSet<String> sortHashSet = new HashSet<>();

        System.out.println("Enter words: ");
        while (true) {
            String enterWords = String.valueOf(scanner.nextLine());         //присваиваем введенное слово

            myList.add(enterWords);                     // добавляем следующее введенное слово

            if (enterWords.equals("")) {              // прокерка на слово-маркер для выхода
                for (String words : myList) {
                    sortHashSet.add(words);             //  проверка порядка элементов (сортировка)
                    sortHashSet.remove("");             // удаляем слово-маркер для выхода
                }
                System.out.println("Array words:\n" + sortHashSet);
                break;
            }
        }
    }
}
