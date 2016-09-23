package com.eduardaliiev.app.utils.input;

import com.eduardaliiev.app.methods.objectorientedparadigm.WhiteCollar;

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