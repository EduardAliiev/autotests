package com.eduardaliiev.utils.arrays.utils.input;

import com.eduardaliiev.utils.arrays.readerandwriterfile.ReaderAndWriterPath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileOnlyNumbers extends ReaderAndWriterPath {


    public int[] readFromFile(String inputPath)
            throws IOException {
        ReadFromFileOnlyNumbers.inputPath = inputPath;             //передаем путь для чтения с файла

        BufferedReader reader = new BufferedReader(new FileReader(getInputPath()));
        StringBuilder stringToLine = new StringBuilder();               // считываем данные с файла
        String line = "";
            while((line = reader.readLine())!= null) {
                stringToLine.append(line).append(", ");
            }
        System.out.print("\nData from the file: " + stringToLine);

        String[] stringToArray = stringToLine.toString().split(", ");
        int numberToArray [] =  new int[stringToArray.length];
        for (int i = 0; i < stringToArray.length; i++) {                //переводим полученные значения со String в Arrays
            numberToArray[i] = Integer.parseInt(stringToArray[i]);
        }
        reader.close();
        return numberToArray;
    }
}
