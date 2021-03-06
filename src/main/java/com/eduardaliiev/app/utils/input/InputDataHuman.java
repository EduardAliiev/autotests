package com.eduardaliiev.app.utils.input;

import com.eduardaliiev.app.methods.objectorientedparadigm.Human;

import java.util.Scanner;

public class InputDataHuman {

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        Human human = new Human();
        System.out.print("\nPlease, enter name human: ");
        String nameHuman = scanner.nextLine();
        human.setName(nameHuman);                                       // возвращаем имя с класса Human
        System.out.println("Human name is " + human.getName() + "!");

        System.out.print("\nPlease, enter age human ");
        String ageHuman = scanner.nextLine();
        Integer ageNumber = Integer.valueOf(ageHuman);              // введенное значение 'String' переводим в 'int'
        human.setAge(ageNumber);
    }
}