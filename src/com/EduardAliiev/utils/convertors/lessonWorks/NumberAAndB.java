package com.EduardAliiev.utils.convertors.lessonWorks;


import com.EduardAliiev.utils.convertors.menus.CalculateMenu;

import java.util.Scanner;

public class NumberAAndB {

    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        int intA = (int) scanner.nextDouble();
        int intB = (int) scanner.nextDouble();

        if (intA <= intB) {

            do{
                System.out.println("\n" + " A1 = " + intA + " B1 = " + intB);
                intA = intA - 1;
            } while (intA > intB);

        } else {
        }
        System.out.println("\n" + " A2 = " + intA + " B2 = " + intB);
    }
}
