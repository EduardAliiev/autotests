package com.eduardaliiev.utils.arrays.objectorientedparadigm;

import java.util.Scanner;

public class InputDataCompany {

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);

        WhiteCollar whiteCollar = new WhiteCollar("", 4, "");
        System.out.print("Please, enter company name ");
        String nameCompany = scanner.nextLine();
        whiteCollar.setCompany(nameCompany);
    }
}