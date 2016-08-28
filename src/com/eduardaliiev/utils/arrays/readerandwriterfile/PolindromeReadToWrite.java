package com.eduardaliiev.utils.arrays.readerandwriterfile;

import com.eduardaliiev.utils.arrays.utils.output.WriteToFileOnlyChar;

import java.io.*;


public class PolindromeReadToWrite extends ReaderAndWriterPath {

    public static void readFromFile()
            throws IOException {



        WriteToFileOnlyChar writeToFileOnlyChar = new WriteToFileOnlyChar();



        BufferedReader reader = new BufferedReader(new FileReader(getInputPath()));                     // считываем данные с файла
        BufferedWriter writer = new BufferedWriter(new FileWriter(getOutputPath()));

        String line = "";
        int i = 0;
        String[] tempLine;
        String stringFromLine;
        while ((line = reader.readLine()) != null) {                       //считываем кол-во строк с файла
            line = line.toLowerCase();
            i++;
            tempLine = new String[i];
            System.out.print("\nData from the file: " + line);
            System.out.print("\n");
            // наполняем считанными строками массив
            stringFromLine = line;
            for (int j = 0; j < tempLine.length; j++) {
                stringFromLine = stringFromLine.toLowerCase();
                tempLine[j] = stringFromLine;
            }                                                           // перебираем массив по символьно

            String[] stringToArray = stringFromLine.toString().split(" ");
            for (String string : stringToArray) {
                char[] charArrays = stringToArray[0].toCharArray();
                for (char simvol : charArrays) {
                }
            }

            // проверяем слово на "полиндромность"
            String palindrome = String.valueOf(stringFromLine);
            String palindromeNew = new StringBuffer(palindrome).reverse().toString();

            if (palindrome.toLowerCase().equals(palindromeNew.toLowerCase())) {               // сравниваем два слова (String)
                System.out.println(palindrome + " - it's a Palindrome!");
                writer.append(palindrome).append(" - it's a Palindrome!");
                writer.newLine();
            } else {
                System.out.println(palindrome + " - not a Palindrome :(");
                writer.append(palindrome).append(" - not a Palindrome :(");
                writer.newLine();
            }
        }
        reader.close();
        writer.close();
    }
}