package com.eduardaliiev.utils.arrays.utils.input;

import com.eduardaliiev.utils.arrays.objectorientedparadigm.WhiteCollar;

import java.util.Scanner;

public class InputDataWhiteCollar {

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);

        WhiteCollar whiteCollar = new WhiteCollar();
        System.out.print("\nPlease, enter company name: ");
        String nameCompany = scanner.nextLine();
        whiteCollar.setCompany(nameCompany);
    }
}