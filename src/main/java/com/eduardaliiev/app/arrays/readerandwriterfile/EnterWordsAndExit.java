package com.eduardaliiev.app.arrays.readerandwriterfile;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EnterWordsAndExit {

    public static void createFileAndWrite() throws IOException {
        Scanner scanner = new Scanner(System.in);                   // считываем введенное название файла
        System.out.print("Please, enter a file name: ");
        String inputString = scanner.nextLine().toLowerCase();

        File newFile = new File(inputString);                   // создаем файл
        if (newFile.createNewFile()) {
            System.out.println("\nNew file name is \'" + inputString + "\'");
        } else {
            System.out.println("The file is already created, it is used for writing");
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // наполняем temp

        FileWriter writer = new FileWriter(inputString);

        System.out.println("\nPlease, enter the text and upon completion enter \'exit\'");

        ArrayList<String> list = new ArrayList<String>();

        while (true) {                              // ввод данных до ввода проверочного слова "exit"
            String inputWords = reader.readLine();
            list.add(inputWords + "\n");
            if (inputWords.equals("exit")) {
                for (String writingWords : list) {
                    writer.write(writingWords);
                }
                break;
            }
        }
        writer.close();
    }
}
