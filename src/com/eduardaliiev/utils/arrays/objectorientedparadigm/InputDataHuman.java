package com.eduardaliiev.utils.arrays.objectorientedparadigm;

import java.util.Scanner;

public class InputDataHuman {

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);

        Human human = new Human();
        System.out.print("Please, enter name human ");
        String nameHuman = scanner.nextLine();
        human.setName(nameHuman);
        System.out.println("Human name is " + human.getName());

        System.out.print("Please, enter age human ");
        String ageHuman = scanner.nextLine();
        Integer ageNumber = Integer.valueOf(ageHuman);              // введенное значение 'String' переводим в 'int'
        human.setAge(ageNumber);
    }
}