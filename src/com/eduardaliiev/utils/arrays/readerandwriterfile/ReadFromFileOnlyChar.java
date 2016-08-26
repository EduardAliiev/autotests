package com.eduardaliiev.utils.arrays.utils.input;

import com.eduardaliiev.utils.arrays.readerandwriterfile.ReaderAndWriterPath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileOnlyChar extends ReaderAndWriterPath {

    public static void readFromFile(String inputPath)
            throws IOException {
        ReadFromFileOnlyChar.inputPath = inputPath;             //передаем путь для чтения с файла

        BufferedReader reader = new BufferedReader(new FileReader(getInputPath()));
        StringBuilder stringToLine = new StringBuilder();               // считываем данные с файла
        String line = "";
        int i = 0;
        while ((line = reader.readLine()) != null) {                       //считываем кол-во строк с файла
            line = line.toLowerCase();
            i++;
            String[] tempLine = new String[i];
            System.out.print("\nData from the file: " + line);
            System.out.print("\n");
            // наполняем считанными строками массив
            String stringFromLine = line;
            for (int j = 0; j < tempLine.length; j++) {
                stringFromLine = stringFromLine.toLowerCase();
                tempLine[j] = stringFromLine;
            }                                                           // перебираем массив по символьно
            String[] stringToArray = stringFromLine.toString().split(" ");
            for (String string : stringToArray) {
                char[] charArrays = stringToArray[0].toCharArray();
                for (char simvol : charArrays) {
                    System.out.print(simvol);
                }
            }                                                                                // проверяем слово на "полиндромность"
            String palindromeTwo = String.valueOf(stringFromLine);
            String palindromeTwoNew = new StringBuffer(palindromeTwo).reverse().toString();   // "отзеркаливаем" введенное слово
            if (palindromeTwo.toLowerCase().equals(palindromeTwoNew.toLowerCase())) {               // сравниваем два слова (String)
                System.out.println(" - it's a Palindrome!");
            } else {
                System.out.println(" - not a Palindrome :(");
            }
            // return stringToLine;
        }
        reader.close();
    }
}
